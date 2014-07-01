//
//  scheduleCapability.cpp
//  catmosschedule
//
//  Created by Frank on 29/04/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>
#include <vector>
#include <algorithm>

#include "scheduleObject.cpp"
#include "scheduleCapabilityProvision.cpp"
#include "scheduleBudget.cpp"

#include "capability.cpp"

#ifndef scheduleCap
#define scheduleCap

extern scheduleBudget* ourBudget;

class scheduleCapability : public scheduleObject
{
public:
    std::vector<scheduleCapabilityProvision*> satisfiedBy;
    bool searchObjective;
    bool notYetScheduled;
    bool reset;
    
    scheduleObject *linkedTo; //Scenario - NULL / Otherwise Component Object We Came From
    
    scheduleCapability(std::string ourName, bool setSearchObjective)
    {
        name = ourName;
        searchObjective = setSearchObjective;
        
        startTime = -1;
        stopTime = -1;
        
        if (searchObjective)
        {
            startTime = ourBudget->startTime;
            stopTime = ourBudget->stopTime;
        }
        
        reset = true;
        notYetScheduled = true;
        temp = false;
        
        linkedTo = NULL;
        relatesTo = NULL;
    }
    
    scheduleCapability(std::string ourName, long int start, long int stop)
    {
        name = ourName;
        startTime = start;
        stopTime = stop;
        searchObjective = true;
        reset = false;
        
        temp = false;
        
        linkedTo = NULL;
        relatesTo = NULL;
    }
    
    std::vector<long int> getGaps()
    {
        std::vector<long int> gaps;
        bool inGap = false;
        
        if (relatesTo != NULL)
        {
            if (relatesTo->typeString.compare("Capability") == 0)
            {
                if (((Capability*)relatesTo)->accumulation != NULL)
                {
                    gaps.push_back(startTime);
                    return gaps;
                }
            }
        }
        
        for (long int searching = startTime; searching < stopTime; searching++)
        {
            //Do any of our scheduled provisions cover this time?
            bool covered = false;
            
            for (int satBy = 0; satBy < satisfiedBy.size(); satBy++)
            {
                scheduleCapabilityProvision *capProv = satisfiedBy.at(satBy);
                if (capProv->getStartTime() <= searching && capProv->getStopTime() >= searching)
                {
                    covered = true;
                    //startTime = capProv->stopTime() + 1;
                    inGap = false;
                    break;
                }
            }
            
            if (covered == false && inGap == false)
            {
                gaps.push_back(searching);
                inGap = true;
            }
            
        }
        return gaps;
    }
    
    std::vector<long int> getGapsStop()
    {
        std::vector<long int> gaps;
        bool inGap = false;
        bool covered = false;
        
        if (relatesTo != NULL)
        {
            if (relatesTo->typeString.compare("Capability") == 0)
            {
                if (((Capability*)relatesTo)->accumulation != NULL)
                {
                    gaps.push_back(stopTime);
                    return gaps;
                }
            }
        }
        
        for (long int searching = startTime; searching < stopTime; searching++)
        {
            //Do any of our scheduled provisions cover this time?
            covered = false;
            
            for (int satBy = 0; satBy < satisfiedBy.size(); satBy++)
            {
                scheduleCapabilityProvision *capProv = satisfiedBy.at(satBy);
                if (capProv->getStartTime() <= searching && capProv->getStopTime() >= searching)
                {
                    covered = true;
                    //startTime = capProv->stopTime() + 1;
                    //std::cout << "Hello World" << std::endl;
                    if (inGap)
                    {
                        gaps.push_back(searching - 1);
                    }
                    inGap = false;
                    break;
                }
            }
            
            if (covered == false && inGap == false)
            {
                inGap = true;
            }
        }
        
        if (covered == false)
        {
            gaps.push_back(stopTime);
        }
        
        return gaps;
    }
    
    void addSatisfiedBy(scheduleCapabilityProvision* capProv)
    {
        satisfiedBy.push_back(capProv);
        capProv->satisfies.push_back(this);
        
        std::sort(satisfiedBy.begin(),satisfiedBy.end());
    }
    
    bool operator < (scheduleCapability* other)
    {
        if (this->startTime < other->startTime || (this->startTime == other->startTime && this->stopTime < other->stopTime))
        {
            return true;
        }
        return false;
    }
    
    long int getEarliestCanSchedule()
    {
        long int earliest = 0;
        
        for (int costNo = 0; costNo < satisfiedBy.size(); costNo++)
        {
            long int time = satisfiedBy.at(costNo)->getEarliestCanSchedule();
            if (time > earliest)
            {
                earliest = time;
            }
        }
        
        return earliest;
    }
    
   long int getEarliestWorking()
    {
        long int earliest = 0;
        for (int dependNo = 0; dependNo < satisfiedBy.size(); dependNo++)
        {
            long int time;
            time = satisfiedBy.at(dependNo)->getEarliestWorking();
            if (time > earliest)
            {
                earliest = time;
            }
        }
        return earliest;
    }
    
    void schedule(long int time)
    {
        if (searchObjective == false && (time < startTime || notYetScheduled == true))
        {
            notYetScheduled = false;
            
            //startTime = time;
            //stopTime = time + lifeSpan;
            
            
            for (int dependNo = 0; dependNo < satisfiedBy.size(); dependNo++)
            {
                satisfiedBy.at(dependNo)->schedule(time);
            }
            
        }
    }
    
    void scheduleReadyFor(long int time)
    {
        if (searchObjective == false && (time < startTime || notYetScheduled == true))
        {
            notYetScheduled = false;
            
            //startTime = time;
            //stopTime = time + lifeSpan;
            
            
            for (int dependNo = 0; dependNo < satisfiedBy.size(); dependNo++)
            {
                satisfiedBy.at(dependNo)->scheduleReadyFor(time);
            }
            
        }
    }
    
};

#endif

