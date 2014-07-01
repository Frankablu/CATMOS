//
//  scheduleObject.cpp
//  catmosschedule
//
//  Created by Frank on 29/04/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>
#include "mobject.cpp"

#ifndef scheduleObjectCode
#define scheduleObjectCode

class scheduleObject
{
public:
    std::string name;
    long int startTime;
    long int stopTime;
    
    bool temp;
    
    mObject *relatesTo;
    
    virtual long int getEarliestCanSchedule()
    {
        return -1;
    }
    
    virtual void schedule(long int time)
    {
        std::cout << "Fall Through Warning" << std::endl;
    }
    
    virtual void scheduleReadyFor(long int time)
    {
        std::cout << "Fall Through Warning" << std::endl;
    }
    
    virtual long int getEarliestWorking()
    {
        return -1;
    }
};

#endif


