//
//  scheduleCost.cpp
//  catmosschedule
//
//  Created by Frank on 29/04/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>
#include "scheduleObject.cpp"

#ifndef scheduleCostCode
#define scheduleCostCode

class scheduleCost : public scheduleObject
{
public:
    double amount;
    
    //Budget Variable
    long int acquireTime;
    //End
    
    long int repeatTime; //If not 0 then repeat every X days until end
    
    scheduleCost()
    {
        temp = false;
    }
    
    scheduleCost(std::string ourName, double ourAmount)
    {
        name = ourName;
        amount = ourAmount;
        startTime = 0;
        repeatTime = 0; 
        stopTime = 0;
    }
    
    scheduleCost(std::string ourName, double ourAmount, long int start)
    {
        name = ourName;
        amount = ourAmount;
        startTime = start;
        repeatTime = 0;
        stopTime = start;
    }
    
    scheduleCost(std::string ourName, double ourAmount, long int start, long int repeat)
    {
        name = ourName;
        amount = ourAmount;
        startTime = start;
        repeatTime = repeat; 
        stopTime = start - 1;
    }
    
    scheduleCost(std::string ourName, double ourAmount, long int start, long int repeat, long int stop)
    {
        name = ourName;
        amount = ourAmount;
        startTime = start;
        repeatTime = repeat; 
        stopTime = stop;
    }
};

#endif



