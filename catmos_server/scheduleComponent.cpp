//
//  scheduleComponent.cpp
//  catmosschedule
//
//  Created by Frank on 29/04/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//
#include <iostream>
#include <vector>

#include "scheduleObject.cpp"
#include "scheduleCost.cpp"
#include "scheduleCapabilityProvision.cpp"
#include "scheduleBudget.cpp"
#include "scheduleCapability.cpp"

#ifndef scheduleComponentCode
#define scheduleComponentCode

extern scheduleBudget *ourBudget;

class scheduleComponent : public scheduleObject
{
public:    
    long int acquisitionTime;
    long int lifeSpan;
    
    bool existing;
    bool notYetScheduled;
    
    std::vector<scheduleCapabilityProvision*> provisions;
    std::vector<scheduleCost*> costs;
    std::vector<scheduleCapability*> dependencies;
    std::vector<scheduleCapability*> seqDependencies; //Sequental, can't be acquired in parallel
    
    scheduleComponent(std::string ourName)
    {
        name = ourName;
        existing = false;
        notYetScheduled = true;
        startTime = -1;
        stopTime = -1;
        acquisitionTime = 0;
        temp = false;
    }
    
    void addProvision(scheduleCapabilityProvision* provision)
    {
        provisions.push_back(provision);
        provision->belongsTo = (scheduleObject*)this;
    }
    
    void addDependencies(scheduleCapability* dependency)
    {
        dependencies.push_back(dependency);
    }
    
    void addSeqDependencies(scheduleCapability* dependency)
    {
        seqDependencies.push_back(dependency);
    }
    
    void addCost(scheduleCost *cost)
    {
        costs.push_back(cost);
    }
    
    long int getEarliestWorking()
    {
        if (existing)
        {
            return startTime;
        }
        return getEarliestCanSchedule() + acquisitionTime;
    }
    
    long int getEarliestCanSchedule()
    {
        if (existing)
        {
            return startTime;
        }
        long int earliest = getEarliestCanScheduleInner();
        ourBudget->wipeTempCosts();
        return earliest;
    }
    
    long int getEarliestCanScheduleInner()
    {
        if (existing)
        {
            return startTime;
        }
        
        long int earliest = 0;
        
        for (int costNo = 0; costNo < costs.size(); costNo++)
        {
            long int time = ourBudget->earliestCanSchedule(costs.at(costNo));
            ourBudget->addTempCost(costs.at(costNo), time);
            if (time > earliest)
            {
                earliest = time;
            }
        }
        
        for (int dependNo = 0; dependNo < dependencies.size(); dependNo++)
        {
            long int time = dependencies.at(dependNo)->getEarliestWorking();
            if (time - acquisitionTime > earliest)
            {
                earliest = time;
            }
        }
        
        for (int dependNo = 0; dependNo < seqDependencies.size(); dependNo++)
        {
            long int time = seqDependencies.at(dependNo)->getEarliestWorking();
            if (time > earliest)
            {
                earliest = time;
            }
        }
        
        return earliest;
    }
    
    void scheduleReadyFor(long int time)
    {
        schedule(time - acquisitionTime);
    }
    
    void schedule(long int time)
    {
        if (existing || time > ourBudget->stopTime)
        {
            return;
        }
        
        if (time < startTime || notYetScheduled == true)
        {
            notYetScheduled = false;
            startTime = time - acquisitionTime;
            
            if (startTime < ourBudget->startTime)
            {
                startTime = ourBudget->startTime;
            }
            
            stopTime = startTime + lifeSpan;
            
            if (lifeSpan == 0) //Doesn't Expire
            {
                stopTime = ourBudget->stopTime;
            }
            
            for (int costNo = 0; costNo < costs.size(); costNo++)
            {
                scheduleCost* ourCost = costs.at(costNo);
                ourCost->acquireTime = time;
                ourBudget->addCost(ourCost, time);
            }
            
            for (int dependNo = 0; dependNo < dependencies.size(); dependNo++)
            {
                dependencies.at(dependNo)->schedule(time);
            }
            
            for (int dependNo = 0; dependNo < seqDependencies.size(); dependNo++)
            {
                seqDependencies.at(dependNo)->schedule(startTime);
            }
        }
    }
    
    
};

#endif

