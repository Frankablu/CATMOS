//
//  scheduler.cpp
//  catmosschedule
//
//  Created by Frank on 29/04/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <algorithm>
#include <iostream>
#include <vector>
#include <set>
#include "scheduleObject.cpp"
#include "scheduleCapability.cpp"
#include "scheduleComponent.cpp"
#include "scheduleCost.cpp"
#include "scheduleIncome.cpp"
#include "capability.cpp"
#include "component.cpp"
#include <sstream>

#ifndef schedulerCode
#define schedulerCode

class scheduler
{
public:
    std::vector<scheduleObject*> schedulingObjects;
    std::vector<scheduleCapability*> schedulingCapabilities;
    std::vector<scheduleCapabilityProvision*> schedulingCapabilityProvisions;
    std::vector<scheduleComponent*> existingComponents;
    std::vector<scheduleComponent*> acquirableComponents;
    
    std::vector<scheduleCapability*> linkCap;
    std::vector<scheduleCapabilityProvision*> linkCapProv;
    std::vector<scheduleCost*> costs;
    
    scheduler()
    {
        
    }
    
    void addScheduleObject(scheduleCapability* scheduleObject)
    {
       schedulingCapabilities.push_back(scheduleObject);
    }
    
    void addScheduleObject(scheduleComponent* scheduleComponent)
    {
        //std::cout << scheduleComponent << std::endl;
        
        if (scheduleComponent->existing == true)
        {
            existingComponents.push_back(scheduleComponent);
        }
        else
        {
            acquirableComponents.push_back(scheduleComponent);
        }
    }
    
    void addScheduleObject(scheduleIncome* scheduleIncome)
    {
        ourBudget->addIncome(scheduleIncome);
    }
    
    void addScheduleObject(scheduleCost* cost)
    {
        schedulingObjects.push_back(cost);
        costs.push_back(cost);
    }
    
    void addScheduleObject(scheduleCapabilityProvision* capProv)
    {
        schedulingObjects.push_back(capProv);
        schedulingCapabilityProvisions.push_back(capProv);
    }
    
    //void addScheduleObject(scheduleObject* scheduleObject)
    //{
    //    schedulingObjects.push_back(scheduleObject);
    //}
    
    void addLink(scheduleCapability *cap, scheduleCapabilityProvision *capProv)
    {
        if (cap == NULL || capProv == NULL)
        {
            return;
        }
        
        linkCap.push_back(cap);
        linkCapProv.push_back(capProv);
    }
    
    void resetLink()
    {
        //Remove Links
        linkCap.clear();
        linkCapProv.clear();
        
        //Remove Upgrade Created Links
        std::vector<scheduleCapability*> cleanSchedulingCapabilities;
        std::vector<scheduleCapabilityProvision*> cleanSchedulingCapabilityProvisions;
        
        for (int i = 0; i < schedulingCapabilities.size(); i++)
        {
            if (schedulingCapabilities.at(i)->temp == false)
            {
                cleanSchedulingCapabilities.push_back(schedulingCapabilities.at(i));
            }
        }
        
        schedulingCapabilities.clear();
        schedulingCapabilities = cleanSchedulingCapabilities;
        
        for (int i = 0; i < schedulingCapabilityProvisions.size(); i++)
        {
            if (schedulingCapabilityProvisions.at(i)->temp == false)
            {
                cleanSchedulingCapabilityProvisions.push_back(schedulingCapabilityProvisions.at(i));
            }
        }
        
        schedulingCapabilityProvisions.clear();
        schedulingCapabilityProvisions = cleanSchedulingCapabilityProvisions;
        
        //Need to reset the schedule for components as well
        for (int i = 0; i < acquirableComponents.size(); i++)
        {
            scheduleComponent *ourComponent = acquirableComponents.at(i);
            ourComponent->notYetScheduled = true;
            ourComponent->startTime = -1;
            ourComponent->stopTime = -1;
        }
        
        //And capabilities that are dependencies
        for (int i = 0; i < schedulingCapabilities.size(); i++)
        {
            scheduleCapability *ourCapability = schedulingCapabilities.at(i);
            if (ourCapability->reset)
            {
                ourCapability->startTime = -1;
                ourCapability->stopTime = -1;
                ourCapability->notYetScheduled = true;
            }
            ourCapability->satisfiedBy.clear();
        }
        
        //Capability Provisions
        for (int i = 0; i < schedulingCapabilityProvisions.size(); i++)
        {
            scheduleCapabilityProvision *ourCapability = schedulingCapabilityProvisions.at(i);
            ourCapability->satisfies.clear();
        }
        
        //Reset The Budget
        ourBudget->reset();
        
    }
    
    void run()
    {
        
        //To Complete A Schedule
        //For every Component, we need its Start and Stop times
        //That is all
        //We know when each Component satisfies a Capability
        
        //Okay we are going to go through the Capabilities one by one
        std::sort(schedulingCapabilities.begin(), schedulingCapabilities.end());
        
        for (int i = 0; i < schedulingCapabilities.size(); i++)
        {
            schedulingCapabilities.at(i)->satisfiedBy.clear();
        }
        
        for (int i = 0; i < linkCap.size(); i++)
        {
            linkCapProv.at(i)->satisfies.push_back(linkCap.at(i));
            linkCap.at(i)->satisfiedBy.push_back(linkCapProv.at(i));
        }
        
        for (int capNo = 0; capNo < schedulingCapabilities.size(); capNo++)
        {
            scheduleCapability *currentCap = schedulingCapabilities.at(capNo);
            
            if (currentCap->linkedTo == NULL)
            {
            //Sort Capability Provisions In Order Of Preference - Todo
            //Sorting by startTime, earlier startTimes first
            //Done automatically now
                
                std::vector<long int> gaps = currentCap->getGaps();
                std::vector<long int> gapsStop = currentCap->getGapsStop();
                
                bool accumulation = false;
                
                if (currentCap->relatesTo != NULL)
                {
                    accumulation = (((Capability*)currentCap->relatesTo)->accumulation != NULL);
                }
                
                for (int gapNo = 0; gapNo < gaps.size(); gapNo++)
                {
                    //Select First Avaliable Capability To Fill Cap
                    for (int capProvNo = 0; capProvNo < currentCap->satisfiedBy.size(); capProvNo++)
                    {
                        scheduleCapabilityProvision *capProv = currentCap->satisfiedBy.at(capProvNo);
                        scheduleComponent *currentComponent = (scheduleComponent*)capProv->belongsTo;
                        
                        long int getEarly = currentComponent->getEarliestWorking();
                        
                        if (currentComponent->existing == false && currentComponent->notYetScheduled == true)
                        {
                            long int scheduleAt = gaps.at(gapNo);
                            if (getEarly > gaps.at(gapNo))
                            {
                                scheduleAt = getEarly;
                            }
                            
                            currentComponent->schedule(scheduleAt);
                            
                            //Is Gap Covered?
                            if (currentComponent->stopTime >= gapsStop.at(gapNo))
                            {

                                if (accumulation == false) //Don't stop scheduling once met
                                {
                                    gapNo--; //There is 1 less gap in the list now
                                    break;
                                }
                            }
                        }
                    }
                    
                    //Re Generate Gaps
                    gaps = currentCap->getGaps();
                    gapsStop = currentCap->getGapsStop();
                    
                }
            }
        }
    }
    
    //Returns loaded schedule as a vector of strings
    std::vector<std::string> getSchedule()
    {
        std::vector<std::string> currentSchedule;
        currentSchedule.push_back("Schedule Capabilities");
        
        for (int compNo = 0; compNo < schedulingCapabilities.size(); compNo++)
        {
            scheduleCapability* ourComponent = schedulingCapabilities.at(compNo);
            if (ourComponent->temp == false)
            {
                currentSchedule.push_back(ourComponent->name);
                currentSchedule.push_back(numberToString(ourComponent->startTime));
                currentSchedule.push_back(numberToString(ourComponent->stopTime));
            }
        }
        
        currentSchedule.push_back("Schedule Components");
        
        for (int compNo = 0; compNo < existingComponents.size(); compNo++)
        {
            scheduleComponent* ourComponent = existingComponents.at(compNo);
            currentSchedule.push_back(ourComponent->name);
            currentSchedule.push_back(numberToString(ourComponent->startTime));
            currentSchedule.push_back(numberToString(ourComponent->stopTime));
        }
        
        for (int compNo = 0; compNo < acquirableComponents.size(); compNo++)
        {
            scheduleComponent* ourComponent = acquirableComponents.at(compNo);
            currentSchedule.push_back(ourComponent->name);
            currentSchedule.push_back(numberToString(ourComponent->startTime));
            currentSchedule.push_back(numberToString(ourComponent->stopTime));
        }
        
        return currentSchedule;
    }
    
    void outputSchedule()
    {
        for (int compNo = 0; compNo < existingComponents.size(); compNo++)
        {
            scheduleComponent* ourComponent = existingComponents.at(compNo);
            std::cout << ourComponent->name << std::endl;
            std::cout << ourComponent->startTime << " " << ourComponent->stopTime << std::endl;
        }
        
        for (int compNo = 0; compNo < acquirableComponents.size(); compNo++)
        {
            scheduleComponent* ourComponent = acquirableComponents.at(compNo);
            std::cout << ourComponent->name << std::endl;
            std::cout << ourComponent->startTime << " " << ourComponent->stopTime << std::endl;
        }
    }
    
    std::set<long int> getAllTimes() //Gets all times of interest where something changes
    {
        std::set<long int> timeList;
        std::set<long int>::iterator it;
        
        timeList.insert(ourBudget->startTime);
        timeList.insert(ourBudget->stopTime-1);
        
        for (int capNo = 0; capNo < schedulingCapabilities.size(); capNo++)
        {
            scheduleCapability* ourComponent = schedulingCapabilities.at(capNo);
            if (ourComponent->startTime > ourBudget->startTime && ourComponent->startTime < ourBudget->stopTime)
            {
                timeList.insert(ourComponent->startTime);
            }
            if (ourComponent->stopTime > ourBudget->startTime && ourComponent->stopTime < ourBudget->stopTime)
            {
                timeList.insert(ourComponent->stopTime);
            }
        }
        
        for (int compNo = 0; compNo < existingComponents.size(); compNo++)
        {
            scheduleComponent* ourComponent = existingComponents.at(compNo);
            if (ourComponent->startTime > ourBudget->startTime && ourComponent->startTime < ourBudget->stopTime)
            {
                timeList.insert(ourComponent->startTime);
            }
            if (ourComponent->stopTime > ourBudget->startTime && ourComponent->stopTime < ourBudget->stopTime)
            {
                timeList.insert(ourComponent->stopTime);
            }
        }
        
        for (int compNo = 0; compNo < acquirableComponents.size(); compNo++)
        {
            scheduleComponent* ourComponent = acquirableComponents.at(compNo);
            if (ourComponent->startTime > ourBudget->startTime && ourComponent->startTime < ourBudget->stopTime)
            {
                timeList.insert(ourComponent->startTime);
            }
            if (ourComponent->stopTime > ourBudget->startTime && ourComponent->stopTime < ourBudget->stopTime)
            {
                timeList.insert(ourComponent->stopTime);
            }
        }
        
        for (it = timeList.begin(); it != timeList.end(); ++it)
        {
            //std::cout << *it << std::endl;
        }
        
        return timeList;
    }
    
    void removeSchedule()
    {
        for (int i = 0; i < existingComponents.size(); i++)
        {
            scheduleComponent* ourComponent = existingComponents.at(i);
            ourComponent->relatesTo->enabled = true;
        }
        
        for (int i = 0; i < acquirableComponents.size(); i++)
        {
            scheduleComponent* ourComponent = acquirableComponents.at(i);
            ourComponent->relatesTo->enabled = true;
        }
    }
    
    void setToTime(long int time)
    {
        for (int i = 0; i < existingComponents.size(); i++)
        {
            scheduleComponent* ourComponent = existingComponents.at(i);
            if (ourComponent->startTime <= time && ourComponent->stopTime > time && ourComponent->startTime != -1)
            {
                ourComponent->relatesTo->enabled = true;
                
                for (int j = 0; j < ((Component*)ourComponent->relatesTo)->provides.size(); j++)
                {
                    CapabilityProvision *myCapProv = ((Component*)ourComponent->relatesTo)->provides.at(j);
                    myCapProv->enabled = true;
                    
                    for (int k = 0; k < myCapProv->measuredBy.size(); k++)
                    {
                        Measurement *myMeasurement = myCapProv->measuredBy.at(k);
                        myMeasurement->enabled = true;
                    }
                }
            }
            else
            {
                ourComponent->relatesTo->enabled = false;
                
                for (int j = 0; j < ((Component*)ourComponent->relatesTo)->provides.size(); j++)
                {
                    CapabilityProvision *myCapProv = ((Component*)ourComponent->relatesTo)->provides.at(j);
                    myCapProv->enabled = false;
                    
                    for (int k = 0; k < myCapProv->measuredBy.size(); k++)
                    {
                        Measurement *myMeasurement = myCapProv->measuredBy.at(k);
                        myMeasurement->enabled = false;
                    }
                }
            }
        }
        
        for (int i = 0; i < acquirableComponents.size(); i++)
        {
            scheduleComponent* ourComponent = acquirableComponents.at(i);
            if (ourComponent->startTime <= time && ourComponent->stopTime > time && ourComponent->startTime != -1)
            {
                ourComponent->relatesTo->enabled = true;
                
                Component *myComponent = ((Component*)ourComponent->relatesTo);
                
                for (int j = 0; j < myComponent->provides.size(); j++)
                {
                    CapabilityProvision *myCapProv = myComponent->provides.at(j);
                    myCapProv->enabled = true;
                    
                    for (int k = 0; k < myCapProv->measuredBy.size(); k++)
                    {
                        Measurement *myMeasurement = myCapProv->measuredBy.at(k);
                        myMeasurement->enabled = true;
                    }
                }
            }
            else
            {
                ourComponent->relatesTo->enabled = false;
                Component *myComponent = ((Component*)ourComponent->relatesTo);
                
                for (int j = 0; j < myComponent->provides.size(); j++)
                {
                    CapabilityProvision *myCapProv = myComponent->provides.at(j);
                    myCapProv->enabled = false;
                    
                    for (int k = 0; k < myCapProv->measuredBy.size(); k++)
                    {
                        Measurement *myMeasurement = myCapProv->measuredBy.at(k);
                        myMeasurement->enabled = false;
                    }
                }
            }
        }
        
    }
    
    void createScheduleLink(std::string source, std::string cap, std::string target)
    {
        scheduleComponent *sourceComponent = NULL;
        scheduleCapabilityProvision *sourceCapability = NULL;
        scheduleCapability *targetCapability = NULL;
        scheduleComponent *targetComponent = NULL;
        
        //std::cout << "Create Scheduler Link" << std::endl;
        //std::cout << source << " " << cap << " " << target << std::endl;
        
        for (int objectNo = 0; objectNo < existingComponents.size(); objectNo++)
        {
            if (existingComponents.at(objectNo)->name == source)
            {
                sourceComponent = existingComponents.at(objectNo);
                break;
            }
        }
        
        if (sourceComponent == NULL)
        {
            for (int objectNo = 0; objectNo < acquirableComponents.size(); objectNo++)
            {
                if (acquirableComponents.at(objectNo)->name == source)
                {
                    sourceComponent = acquirableComponents.at(objectNo);
                    break;
                }
            }
        }
        
        for (int objectNo = 0; objectNo < sourceComponent->provisions.size(); objectNo++)
        {
            if (sourceComponent->provisions.at(objectNo)->name == cap)
            {
                sourceCapability = sourceComponent->provisions.at(objectNo);
            }
        }
        
        if (target != std::string("scenario"))
        {
            
            for (int objectNo = 0; objectNo < existingComponents.size(); objectNo++)
            {
                if (existingComponents.at(objectNo)->name == target)
                {
                    targetComponent = existingComponents.at(objectNo);
                    break;
                }
            }
            
            if (targetComponent == NULL)
            {
                for (int objectNo = 0; objectNo < acquirableComponents.size(); objectNo++)
                {
                    if (acquirableComponents.at(objectNo)->name == target)
                    {
                        targetComponent = acquirableComponents.at(objectNo);
                        break;
                    }
                }
            }
            
            for (int objectNo = 0; objectNo < targetComponent->dependencies.size(); objectNo++)
            {
                if (targetComponent->dependencies.at(objectNo)->name == cap)
                {
                    targetCapability = targetComponent->dependencies.at(objectNo);
                    break;
                }
            }
            
            for (int objectNo = 0; objectNo < targetComponent->seqDependencies.size(); objectNo++)
            {
                if (targetComponent->seqDependencies.at(objectNo)->name == cap)
                {
                    targetCapability = targetComponent->seqDependencies.at(objectNo);
                    break;
                }
            }
        }
        else
        {
            for (int objectNo = 0; objectNo < schedulingCapabilities.size(); objectNo++)
            {
                if (schedulingCapabilities.at(objectNo)->name == cap && schedulingCapabilities.at(objectNo)->linkedTo == NULL)
                {
                    targetCapability = schedulingCapabilities.at(objectNo);
                    break;
                }
            }
        }
        
        if (sourceCapability == NULL) //Capability Upgrade
        {
            sourceCapability = new scheduleCapabilityProvision(cap);
            sourceCapability->temp = true;
            
            sourceComponent->addProvision(sourceCapability);
            addScheduleObject(sourceCapability);
            
            if (target != "scenario")
            {
                targetComponent->addDependencies(targetCapability);
                targetCapability = new scheduleCapability(cap, false);
                addScheduleObject(targetCapability);
            }
        }
        
        //std::cout << "Schedule Linker" << std::endl;
        //std::cout << targetCapability->name << std::endl;
        //std::cout << sourceCapability->name << std::endl;
        //std::cout << "Are now linked" << std::endl;
        
        addLink(targetCapability, sourceCapability);
        //targetCapability->addSatisfiedBy(sourceCapability);
    }
    
    void createScheduleUpgrade(std::string source, std::string upgrade, std::string target)
    {
        scheduleComponent *sourceComponent = NULL;
        scheduleComponent *targetComponent = NULL;
        
        for (int objectNo = 0; objectNo < existingComponents.size(); objectNo++)
        {
            if (existingComponents.at(objectNo)->name == source)
            {
                sourceComponent = existingComponents.at(objectNo);
                break;
            }
        }
        
        if (sourceComponent == NULL)
        {
            for (int objectNo = 0; objectNo < acquirableComponents.size(); objectNo++)
            {
                if (acquirableComponents.at(objectNo)->name == source)
                {
                    sourceComponent = acquirableComponents.at(objectNo);
                    break;
                }
            }
        }
        
        for (int objectNo = 0; objectNo < existingComponents.size(); objectNo++)
        {
            if (existingComponents.at(objectNo)->name == target)
            {
                targetComponent = existingComponents.at(objectNo);
                break;
            }
        }
        
        if (targetComponent == NULL)
        {
            for (int objectNo = 0; objectNo < acquirableComponents.size(); objectNo++)
            {
                if (acquirableComponents.at(objectNo)->name == target)
                {
                    targetComponent = acquirableComponents.at(objectNo);
                    break;
                }
            }
        }
        
        //Virtual Connection Between The Two Components
        scheduleCapabilityProvision *newCapProv = new scheduleCapabilityProvision(upgrade);
        scheduleCapability *newCap = new scheduleCapability(upgrade, false);
        
        newCapProv->temp = true;
        newCap->temp = true;
        
        sourceComponent->addProvision(newCapProv);
        targetComponent->addDependencies(newCap);
        
        addScheduleObject(newCapProv);
        addScheduleObject(newCap);
        
        createScheduleLink(source, upgrade, target);
        
    }

    std::string numberToString(long int number)
    {
        string R;
        ostringstream c;
        c << number;
        return c.str();
    }
};

#endif


