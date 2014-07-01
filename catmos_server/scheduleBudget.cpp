//
//  scheduleBudget.cpp
//  catmosschedule
//
//  Created by Frank on 29/04/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>
#include <vector>
#include "scheduleCost.cpp"
#include "scheduleIncome.cpp"

#ifndef scheduleBudgetCode
#define scheduleBudgetCode

//Store whether or not the budget is accessable at any one time
class scheduleBudget
{
public:
    std::vector<scheduleCost*> costs;
    std::vector<scheduleIncome*> income;
    
    std::vector<scheduleCost*> tempCosts;
    
    long int startTime;
    long int stopTime;
    
    scheduleBudget(long int start, long int stop)
    {
        startTime = start;
        stopTime = stop;
    }
    
    void addTempCost(scheduleCost* cost, long int atTime)
    {
        cost->acquireTime = atTime;
        
        for (int i = 0; i < tempCosts.size(); i++)
        {
            if (tempCosts.at(i) == cost)
            {
                return;
            }
        }
        
        tempCosts.push_back(cost);
    }
    
    void wipeTempCosts()
    {
        tempCosts.clear();
    }
    
    void addCost(scheduleCost* cost, long int atTime)
    {
        long int scheduleWhen;
        
        for (scheduleWhen = atTime; addCostCheck(cost,scheduleWhen) == false; scheduleWhen++)
        {
            if (scheduleWhen > stopTime)
            {
                break;
            }
        }
        
        cost->acquireTime = scheduleWhen;
        costs.push_back(cost);
        
    }
    
    void addIncome(scheduleIncome* ourIncome)
    {
        income.push_back(ourIncome);
    }
    
    //Sub-optimal Implementation
    long int earliestCanSchedule(scheduleCost* cost)
    {
        for (long int time = startTime; time < stopTime; time++)
        {
            if (addCostCheck(cost,time))
            {
                addTempCost(cost,time);
                return time;
            }
        }
        return stopTime + 1;
    }
    
    bool addCostCheck(scheduleCost* cost, long int atTime)
    {
        if (getAvaliableAtTime(cost,atTime) >= cost->amount)
        {
            return true;
        }
        return false;
    }
    
    double getAvaliableAtTime(scheduleCost* cost, long int atTime)
    {
        double costIncome = 0.0;
        double costSpent = 0.0;
        
        //Gather Income
        for (int incomeNo = 0; incomeNo < income.size(); incomeNo++)
        {
            scheduleIncome *ourIncome = income.at(incomeNo);
            if (cost->name.compare(ourIncome->name) == 0 && ourIncome->startTime <= atTime)
            {
                //Need to work out how much
                //Type first
                if (ourIncome->startTime == ourIncome->stopTime) //One off
                {
                    costIncome += ourIncome->amount;
                }
                
                if (ourIncome->repeatTime > 0 && ourIncome->startTime > ourIncome->stopTime) //Repeat forever
                {
                    long int timepassed = (atTime - ourIncome->startTime);
                    long int repeats = timepassed / ourIncome->repeatTime;
                    repeats++;
                    
                    costIncome += ourIncome->amount * repeats;
                }
                
                if (ourIncome->repeatTime > 0 && ourIncome->startTime < ourIncome->stopTime) //Repeat until time
                {
                    long int timepassed = (atTime - ourIncome->startTime);
                    if (atTime > ourIncome->stopTime)
                    {
                        timepassed = (stopTime - ourIncome->startTime);
                    }
                    
                    long int repeats = timepassed / ourIncome->repeatTime;
                    repeats++;
                    
                    costIncome += ourIncome->amount * repeats;
                }
            }
        }
        
        //Gather expensives
        for (int costNo = 0; costNo < costs.size(); costNo++)
        {
            scheduleCost *ourCost = costs.at(costNo);
            if (cost->name.compare(ourCost->name) == 0 && ourCost->startTime <= atTime)
            {
                //Need to work out how much
                //Type first
                if (ourCost->startTime == ourCost->stopTime) //One off
                {
                    costSpent += ourCost->amount;
                }
                
                if (ourCost->repeatTime > 0 && ourCost->startTime > ourCost->stopTime) //Repeat forever
                {
                    long int timepassed = (atTime - ourCost->startTime);
                    long int repeats = timepassed / ourCost->repeatTime;
                    repeats++;
                    
                    costSpent += ourCost->amount * repeats;
                }
                
                if (ourCost->repeatTime > 0 && ourCost->startTime < ourCost->stopTime) //Repeat until time
                {
                    long int timepassed = (atTime - ourCost->startTime);
                    if (atTime > ourCost->stopTime)
                    {
                        timepassed = (stopTime - ourCost->startTime);
                    }
                    
                    long int repeats = timepassed / ourCost->repeatTime;
                    repeats++;
                    
                    costSpent += ourCost->amount * repeats;
                }
            }
        }
        
        //Gather expensives
        for (int costNo = 0; costNo < tempCosts.size(); costNo++)
        {
            scheduleCost *ourCost = tempCosts.at(costNo);
            if (cost->name.compare(ourCost->name) == 0 && ourCost->startTime <= atTime)
            {
                //Need to work out how much
                //Type first
                if (ourCost->startTime == ourCost->stopTime) //One off
                {
                    costSpent += ourCost->amount;
                }
                
                if (ourCost->repeatTime > 0 && ourCost->startTime > ourCost->stopTime) //Repeat forever
                {
                    long int timepassed = (atTime - ourCost->startTime);
                    long int repeats = timepassed / ourCost->repeatTime;
                    repeats++;
                    
                    costSpent += ourCost->amount * repeats;
                }
                
                if (ourCost->repeatTime > 0 && ourCost->startTime < ourCost->stopTime) //Repeat until time
                {
                    long int timepassed = (atTime - ourCost->startTime);
                    if (atTime > ourCost->stopTime)
                    {
                        timepassed = (stopTime - ourCost->startTime);
                    }
                    
                    long int repeats = timepassed / ourCost->repeatTime;
                    repeats++;
                    
                    costSpent += ourCost->amount * repeats;
                }
            }
        }
        
        return costIncome - costSpent;
    }
    
    void reset()
    {
        costs.clear(); //Wipe costs ready for next time
    }
}
;

#endif


