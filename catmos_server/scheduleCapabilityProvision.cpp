//
//  scheduleCapabilityProvision.cpp
//  catmosschedule
//
//  Created by Frank on 29/04/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>
#include <vector>
#include "scheduleObject.cpp"

#ifndef scheduleCapProv
#define scheduleCapProv

class scheduleCapabilityProvision : public scheduleObject
{
public:
    scheduleObject *belongsTo;
    std::vector<scheduleObject*> satisfies;
    
    scheduleCapabilityProvision(std::string setName)
    {
        name = setName;
        temp = false;
        startTime = -1;
        stopTime = -1;
    }
    
    long int getStartTime()
    {
        return belongsTo->startTime;
    }
    
    long int getStopTime()
    {
        return belongsTo->stopTime;
    }
    
    long int getEarliestCanSchedule()
    {
       return belongsTo->getEarliestCanSchedule();
    }
    
    long int getEarliestWorking()
    {
        return belongsTo->getEarliestWorking();
    }
    
    void scheduleReadyFor(long int time)
    {
        belongsTo->scheduleReadyFor(time);
    }
    
    void schedule(long int time)
    {
        belongsTo->schedule(time);
    }
    
    bool operator < (scheduleCapabilityProvision* other)
    {
        long int ourEarliestStartTime = getEarliestWorking();
        long int otherEarliestStartTime = other->getEarliestWorking();
        
        if (ourEarliestStartTime < otherEarliestStartTime)
        {
            return true;
        }
        return false;
    }
};

#endif


