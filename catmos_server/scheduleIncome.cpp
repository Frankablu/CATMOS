//
//  scheduleIncome.cpp
//  catmosschedule
//
//  Created by Frank on 29/04/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>
#include "scheduleCost.cpp"

#ifndef scheduleIncomeCode
#define scheduleIncomeCode

//Basically its cost with a negative sign!
class scheduleIncome : public scheduleCost
{
public:
    scheduleIncome(std::string ourName, double ourAmount)
    {
        name = ourName;
        amount = ourAmount;
        startTime = 0;
        repeatTime = 0; 
        stopTime = 0;
        temp = false;
    }
    
    scheduleIncome(std::string ourName, double ourAmount, long int start)
    {
        name = ourName;
        amount = ourAmount;
        startTime = start;
        repeatTime = 0; 
        stopTime = start;
        temp = false;
    }
    
    scheduleIncome(std::string ourName, double ourAmount, long int start, long int repeat)
    {
        name = ourName;
        amount = ourAmount;
        startTime = start;
        repeatTime = repeat; 
        stopTime = start - 1;
        temp = false;
    }
    
    scheduleIncome(std::string ourName, double ourAmount, long int start, long int repeat, long int stop)
    {
        name = ourName;
        amount = ourAmount;
        startTime = start;
        repeatTime = repeat; 
        stopTime = stop;
        temp = false;
    }
};

#endif


