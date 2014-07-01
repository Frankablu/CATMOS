//
//  evaluator.cpp
//  catmos
//
//  Created by Frank on 11/03/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>
#include "mobject.cpp"
#include "capabilityprovision.cpp"
#include "capability.cpp"
#include "component.cpp"
#include "qvd.cpp"
#include "cost.cpp"
#include "luascripts.cpp"
#include "capabilityupgrade.cpp"
#include <set>
#include <sstream>

#ifndef EVALUATOR_H
#define EVALUATOR_H

extern std::vector<Measurement*> measurements;
extern luascripts* myLuaScripts;
extern Component* currentComponent;

class Evaluator
{
public:
    
    std::vector<mObject*> evaluateSet;
    std::vector<Cost*> costs;
    std::map<std::string, int> costDesires;
    
    //std::vector<std::string> existingComponents;
    
    Evaluator()
    {
        
    }
    
    qvd *ourQVD;
    
    void addObject(CapabilityProvision *capProvision)
    {
        evaluateSet.insert(evaluateSet.end(),capProvision);
        for (int i = 0; i < capProvision->measuredBy.size(); i++)
        {
            addObject(capProvision->measuredBy.at(i));
        }
    }
    
    void addObject(Capability *cap)
    {
        evaluateSet.insert(evaluateSet.end(),cap);
        for (int i = 0; i < cap->measuredBy.size(); i++)
        {
            addObject(cap->measuredBy.at(i));
        }
    }
    
    void addObjectC(CapabilityProvision *capProvision)
    {
        evaluateSet.insert(evaluateSet.end(),capProvision);
        for (int i = 0; i < capProvision->measuredBy.size(); i++)
        {
            addObject(capProvision->measuredBy.at(i));
        }
    }
    
    void addObjectC(Capability *cap)
    {
        evaluateSet.insert(evaluateSet.end(),cap);
        for (int i = 0; i < cap->measuredBy.size(); i++)
        {
            addObject(cap->measuredBy.at(i));
        }
    }
    
    void addObject(Component *component)
    {
        evaluateSet.insert(evaluateSet.end(),component);
        
        //if (component->existing == true)
        //{
        //    existingComponents.push_back(component->name);
        //}
        
        for (int i = 0; i < component->provides.size(); i++)
        {
            component->provides.at(i)->component = component;
            addObjectC(component->provides.at(i));
        }
        for (int i = 0; i < component->requires.size(); i++)
        {
            component->requires.at(i)->component = component;
            addObjectC(component->requires.at(i));
        }
        for (int i = 0; i < component->upgrades.size(); i++)
        {
            addObject((CapabilityUpgrade*)component->upgrades.at(i));
        }
        for (int i = 0; i < component->costs.size(); i++)
        {
            costs.push_back(component->costs.at(i));
        }
    }
    
    void addObject(CapabilityUpgrade *capUpgrade)
    {
        evaluateSet.insert(evaluateSet.end(),capUpgrade);
        for (int i = 0; i < capUpgrade->add.size(); i++)
        {
            addObjectC(capUpgrade->add.at(i));
        }
        for (int i = 0; i < capUpgrade->modify.size(); i++)
        {
            addObjectC(capUpgrade->modify.at(i));
        }
    }
    
    void addObject(Measurement *measurement)
    {
        evaluateSet.push_back(measurement);
        measurements.push_back(measurement);
    }
    
    //void addObject(mObject addedObject)
    //{
    //    evaluateSet.insert(evaluateSet.end(),addedObject);
    //}
    
    void setQVD(qvd *qvd)
    {
        ourQVD = qvd;
    }
    
    
    //Reset Evaluator Ready For Use
    void reset()
    {
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            evaluateSet.at(i)->enabled = false;
            evaluateSet.at(i)->status = 0.0;
            
            if (evaluateSet.at(i)->typeString == "Capability")
            {
                Capability* ourCapability = (Capability*)evaluateSet.at(i);
                ourCapability->satisfiedBy.clear();
                
                if (ourCapability->standAlone == true)
                {
                    ourCapability->enabled = true;
                    for (int j = 0; j < ourCapability->measuredBy.size(); j++)
                    {
                        Measurement *myMeasurement = ourCapability->measuredBy.at(j);
                        myMeasurement->enabled = true;
                        myMeasurement->standAlone = true;
                    }
                }
                
                for (int removing = 0; removing < ourCapability->dependsOn.size(); removing++)
                {
                    if (ourCapability->dependsOn.at(removing)->typeString == "CapabilityProvision")
                    {
                        ourCapability->dependsOn.erase(ourCapability->dependsOn.begin()+removing);
                        removing--; //Everything shuffles left
                    }
                }
                
            }
            
            if (evaluateSet.at(i)->typeString == "Component")
            {
                Component* ourComponent = (Component*)evaluateSet.at(i);
                ourComponent->reset();
            }
            
            if (evaluateSet.at(i)->typeString == "Measurement")
            {
                Measurement *myMeasurement = (Measurement*) evaluateSet.at(i);
                if (myMeasurement->standAlone)
                {
                    myMeasurement->enabled = true;
                }
            }
            
            if (evaluateSet.at(i)->typeString == "CapabilityProvision")
            {
                evaluateSet.at(i)->satisfies.clear();
            }
        }
        
        for (int i = 0; i < costs.size(); i++)
        {
            costs.at(i)->enabled = false;
        }
    }
    
    //Handle Upgrades
    void setUpgrade(std::string sourceComponent, std::string upgrade, std::string targetComponent)
    {
        Component *source = NULL;
        Component *target = NULL;
        CapabilityUpgrade *capupgrade = NULL;
        
        //Find Source Component
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            mObject *checkingObject = evaluateSet.at(i);
            
            if (checkingObject->name == sourceComponent && checkingObject->typeString == "Component")
            {
                source = (Component*) checkingObject;
                checkingObject->enabled = true;
                
                for (int j = 0; j < source->costs.size(); j++)
                {
                    Cost *myCost = source->costs.at(j);
                    myCost->enabled = true;
                }
            }
        }
        
        //Find Upgrade
        for (int i = 0; i < source->upgrades.size(); i++)
        {
            mObject *checkingObject = source->upgrades.at(i);
            if (checkingObject->name == upgrade)
            {
                capupgrade = (CapabilityUpgrade*) checkingObject;
                break;
            }
        }
        
        //Find Target Component
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            mObject *checkingObject = evaluateSet.at(i);
            
            if (checkingObject->name == targetComponent && checkingObject->typeString == "Component")
            {
                target = (Component*) checkingObject;
                checkingObject->enabled = true;
                
                for (int j = 0; j < target->costs.size(); j++)
                {
                    Cost *myCost = target->costs.at(j);
                    myCost->enabled = true;
                }
            }
        }
        
        //Perform Upgrade
        capupgrade->enabled = true;
        capupgrade->applyToComponent(target);
        
    }
    
    //Accepts Link Data! - This is where we take in our solution specific links
    void createLink(std::string sourceComponent, std::string capability, std::string targetComponent)
    {
        Component *source = NULL;
        Capability *cap = NULL;
        CapabilityProvision *capProv = NULL;
        Component *target = NULL;
        
        //Find Target Component
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            mObject *checkingObject = evaluateSet.at(i);
            
            if (checkingObject->name == targetComponent && checkingObject->typeString == "Component")
            {
                target = (Component*) checkingObject;
                checkingObject->enabled = true;
                
                for (int j = 0; j < target->costs.size(); j++)
                {
                    Cost *myCost = target->costs.at(j);
                    myCost->enabled = true;
                }
                
                for (int j = 0; j < target->provides.size(); j++)
                {
                    CapabilityProvision *myCapProv = target->provides.at(j);
                    myCapProv->enabled = true;
                    
                    for (int k = 0; k < myCapProv->measuredBy.size(); k++)
                    {
                        Measurement *myMeasurement = myCapProv->measuredBy.at(k);
                        myMeasurement->enabled = true;
                    }
                }
            }
        }
        
        //Determine The Capability We Are Linking To
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            mObject *checkingObject = evaluateSet.at(i);
            Capability *temp;
            
            if (checkingObject->name == capability && target == NULL && checkingObject->typeString == "Capability")
            {
                temp = (Capability*)checkingObject;
                if (temp->requiredByComponent == false)
                {
                    cap = temp;
                    checkingObject->enabled = true;
                    
                    for (int j = 0; j < cap->measuredBy.size(); j++)
                    {
                        Measurement *myMeasurement = cap->measuredBy.at(j);
                        myMeasurement->enabled = true;
                    }
                }
            }
            
            if (checkingObject->name == capability && target != NULL)
            {
                for (int j = 0; j < target->requires.size(); j++)
                {
                    Capability *requiresCap = target->requires.at(j);
                    if (requiresCap == checkingObject)
                    {
                        cap = (Capability*)checkingObject;
                        cap->enabled = true;
                        
                        for (int k = 0; k < cap->measuredBy.size(); k++)
                        {
                            Measurement *myMeasurement = cap->measuredBy.at(k);
                            myMeasurement->enabled = true;
                        }
                        
                        break;
                    }
                }
            }
        }
        
        //Find Source Component
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            mObject *checkingObject = evaluateSet.at(i);
            
            if (checkingObject->name == sourceComponent && checkingObject->typeString == "Component")
            {
                source = (Component*) checkingObject;
                checkingObject->enabled = true;
                
                for (int j = 0; j < source->costs.size(); j++)
                {
                    Cost *myCost = source->costs.at(j);
                    myCost->enabled = true;
                }
                
                for (int j = 0; j < source->provides.size(); j++)
                {
                    CapabilityProvision *myCapProv = source->provides.at(j);
                    myCapProv->enabled = true;
                    
                    for (int k = 0; k < myCapProv->measuredBy.size(); k++)
                    {
                        Measurement *myMeasurement = myCapProv->measuredBy.at(k);
                        myMeasurement->enabled = true;
                    }
                }
            }
        }
        
        //Find Capability Provision
        for (int i = 0; i < source->provides.size(); i++)
        {
            mObject *checkingObject = source->provides.at(i);
            
            if (checkingObject->name == capability)
            {
                capProv = (CapabilityProvision*) checkingObject;
                checkingObject->enabled = true;
                
                for (int j = 0; j < capProv->measuredBy.size(); j++)
                {
                    Measurement *myMeasurement = capProv->measuredBy.at(j);
                    myMeasurement->enabled = true;
                }
            }
        }
        
        //Link
        if (capProv != NULL)
        {
            cap->addSatisfiedBy(capProv);
        }
    }
    
    void correctMeasurements()
    {
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            //For Each Object Check Dependencies
            mObject *checkingObject = evaluateSet.at(i);
            
            if (checkingObject->enabled && checkingObject->getType() == std::string("Capability"))
            {
                Capability *currentCap = (Capability*)checkingObject;
                
                for (int j = 0; j < currentCap->measuredBy.size(); j++)
                {
                    Measurement *myMeasurement = currentCap->measuredBy.at(j);
                    myMeasurement->enabled = true;
                }
            }
        }
        
        //Enable & Disable Components Provisions
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            mObject *checkingObject = evaluateSet.at(i);
            
            //Ensure getAllMeasures only returns all live measurements and only live measurements
            if (checkingObject->getType() == std::string("Component"))
            {
                Component *currentComponent = (Component*)checkingObject;
                
                for (int i = 0; i < currentComponent->provides.size(); i++)
                {
                    CapabilityProvision *currentCap = (CapabilityProvision*)currentComponent->provides.at(i);
                    currentCap->enabled = checkingObject->enabled;
                    
                    for (int j = 0; j < currentCap->measuredBy.size(); j++)
                    {
                        Measurement *myMeasurement = currentCap->measuredBy.at(j);
                        myMeasurement->enabled = checkingObject->enabled;
                    }
                    
                }
            }
        }
        
        //Fix Capability Provisions To Match Source
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            mObject *checkingObject = evaluateSet.at(i);
            
            if (checkingObject->getType() == std::string("CapabilityProvision"))
            {
                CapabilityProvision *currentCap = (CapabilityProvision*)checkingObject;
                currentCap->status = 0.0;
                
                for (int j = 0; j < currentCap->measuredBy.size(); j++)
                {
                    Measurement *myMeasurement = currentCap->measuredBy.at(j);
                    myMeasurement->enabled = currentCap->enabled;
                }
            }
        }
    }
    
    void evaluate()
    {   
        correctMeasurements();
        
        //Todo Find Tree Depth First And Loop Only That Many Times
        
        for (int looping = 0; looping < 10; looping++)
        {
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            //For Each Object Check Dependencies
            mObject *checkingObject = evaluateSet.at(i);
            
            if (checkingObject->enabled)
            {
            
            //std::cout << checkingObject->name << std::endl;
            //std::cout << checkingObject->getType() << std::endl;
            //std::cout << checkingObject->status << std::endl;
            //std::cout << (int)checkingObject->enabled << std::endl;
            //std::cout << checkingObject->dependsOn.size() << std::endl;
            
            if (checkingObject->getType() == std::string("Capability"))
            {
                Capability *capabilityCast = (Capability*)checkingObject;
                
                //Check It Depends On Something
                if (checkingObject->dependsOn.size() > 0 || capabilityCast->standAlone == true)
                {
                    checkingObject->status = 2.0;
                    
                    //Check For Measurements
                    if (capabilityCast->measuredBy.size() > 0)
                    {
                        bool criticalFailure = false;
                        double totalvalue = 0.0;
                        
                        //Perform accumulation logic
                        Measurement *accumulationMeasurement = NULL;
                        
                        if (capabilityCast->accumulation != NULL)
                        {
                            accumulationMeasurement = (Measurement*)capabilityCast->accumulation;
                            accumulationMeasurement->providedValue = 0.0;
                            accumulationMeasurement->accumulation = true;
                        }
                        
                        for (int m = 0; m < capabilityCast->measuredBy.size(); m++)
                        {
                            Measurement *measurementCast;
                            measurementCast = (Measurement*)capabilityCast->measuredBy.at(m);
                            
                            if (accumulationMeasurement != measurementCast)
                            {
                                measurementCast->providedValue = 0.0; //Two different provisions can help!
                            }
                            
                            //Script Overrides Normal Value Transfer
                            //Run Script
                            if (measurementCast->script.size() > 0)
                            {
                                measurementCast->providedValues.clear();
                                currentComponent = (Component*)measurementCast->component;
                                
                                //Run Script
                                std::string scriptResult = myLuaScripts->run(measurementCast->script);
                                
                                if (scriptResult.size() > 0 && ((isDouble(scriptResult) == true && string_to_double(scriptResult) != 0)||isDouble(scriptResult) == false))
                                {
                                    measurementCast->providedValues.push_back(scriptResult);
                                    measurementCast->providedValue = string_to_double(scriptResult);
                                }
                            }
                            else
                            {
                            
                            //Update the measurement
                            string measurementName = measurementCast->name;
                            
                            for (int r = 0; r < capabilityCast->satisfiedBy.size(); r++)
                            {
                                CapabilityProvision *capProvision = capabilityCast->satisfiedBy.at(r);
                                
                                for (int s = 0; s < capProvision->measuredBy.size(); s++)
                                {
                                    if (capProvision->measuredBy.at(s)->name == measurementName && capProvision->status > 0.0 && capProvision->enabled == true)
                                    {
                                        
                                        Measurement* myMeasurement = capProvision->measuredBy.at(s);
                                        
                                        //Run Script
                                        if (myMeasurement->script.size() > 0)
                                        {
                                            myMeasurement->providedValues.clear();
                                            currentComponent = (Component*)myMeasurement->component;
                                            
                                            //Run Script
                                            std::string scriptResult = myLuaScripts->run(myMeasurement->script);
                                            
                                            if (scriptResult.size() > 0 && ((isDouble(scriptResult) == true && string_to_double(scriptResult) != 0)||isDouble(scriptResult) == false))
                                            {
                                                myMeasurement->providedValues.push_back(scriptResult);
                                                myMeasurement->providedValue = string_to_double(scriptResult);
                                            }
                                        }
                                        
                                        if (accumulationMeasurement == measurementCast)
                                        {
                                            measurementCast->providedValue += capProvision->measuredBy.at(s)->providedValue * capProvision->reuse;
                                        }
                                        else
                                        {
                                            measurementCast->providedValue = capProvision->measuredBy.at(s)->providedValue;
                                        }

                                        
                                        //Expand Provisions
                                        set<string> providedValuesSet;
                                        
                                        for (int a = 0; a < capProvision->measuredBy.at(s)->providedValues.size(); a++)
                                        {
                                            vector<string> greaterThan = ourQVD->greaterThan(capProvision->measuredBy.at(s)->providedValues.at(a));
                                            
                                            providedValuesSet.insert(providedValuesSet.begin(), capProvision->measuredBy.at(s)->providedValues.at(a));
                                            
                                            for (int b = 0; b < greaterThan.size(); b++)
                                            {
                                                providedValuesSet.insert(providedValuesSet.end(),greaterThan.at(b));
                                            }
                                        }
                                        
                                        capProvision->measuredBy.at(s)->providedValues = vector<string>(providedValuesSet.begin(), providedValuesSet.end());
                                        
                                        measurementCast->providedValues = capProvision->measuredBy.at(s)->providedValues;
                                        
                                    }
                                }
                            }
                            }
                            
                            measurementCast->setStatus();
                            
                            if (measurementCast->status < 1.0) //Red
                            {
                                criticalFailure = true;
                                totalvalue = totalvalue + measurementCast->status;
                            }
                            else //Yellow - Green
                            {
                                totalvalue = totalvalue + measurementCast->status - 1.0;
                            }
                        }
                        totalvalue = totalvalue / (double)capabilityCast->measuredBy.size();
                        
                        checkingObject->status = totalvalue;
                        if (criticalFailure == false)
                        {
                            checkingObject->status += 1.0;
                        }
                        
                        //Over Provisioned
                        if (checkingObject->status > 2.0)
                        {
                            checkingObject->status = 2.0;
                        }
                    }
                    
                    //Check something that it depends on is actually working
                    bool somethingWorking = false;
                    
                    for (int capProv = 0; capProv < capabilityCast->satisfiedBy.size(); capProv++)
                    {
                        if (capabilityCast->satisfiedBy.at(capProv)->status > 0 && capabilityCast->satisfiedBy.at(capProv)->enabled == true)
                        {
                            somethingWorking = true;
                        }
                    }
                    
                    if (somethingWorking == false && capabilityCast->standAlone == false)
                    {
                        checkingObject->status = 0.0;
                    }
                    
                }
                else
                {
                    checkingObject->status = 0.0;
                }
            }
            
            if (checkingObject->getType() == std::string("Component"))
            {
                //If it depends on nothing than it is always Green
                if (checkingObject->dependsOn.size() == 0)
                {
                    checkingObject->status = 2.0;
                }
                else
                {
                    //If it depends on other things than it is the same as the min of the things it depends on
                    checkingObject->status = 2.0;
                    
                    for (int j = 0; j < checkingObject->dependsOn.size(); j++)
                    {
                        if (checkingObject->dependsOn.at(j)->status < checkingObject->status)
                        {
                            checkingObject->status = checkingObject->dependsOn.at(j)->status;
                        }
                    }
                    
                }
            }
            
            if (checkingObject->getType() == std::string("CapabilityProvision"))
            {
                //Really Easy - Look At The Component
                if (checkingObject->dependsOn.at(0)->enabled)
                {
                    checkingObject->status = checkingObject->dependsOn.at(0)->status;
                }
                else
                {
                    checkingObject->status = 0.0;
                }
            }
                
                if (checkingObject->getType() == std::string("CapabilityUpgrade"))
                {
                    //Really Easy - Look At The Component
                    if (checkingObject->dependsOn.at(0)->enabled)
                    {
                        checkingObject->status = checkingObject->dependsOn.at(0)->status;
                    }
                    else
                    {
                        checkingObject->status = 0.0;
                    }
                }
            
            if (checkingObject->getType() == std::string("Measurement") && checkingObject->dependsOn.size() == 1)
            {
                checkingObject->status = checkingObject->dependsOn.at(0)->status;
                
                Measurement *myMeasurement = (Measurement*)checkingObject;
                //std::cout << myMeasurement->providedValue << std::endl;
                
                //Run Script
                if (myMeasurement->script.size() > 0)
                {
                    myMeasurement->providedValues.clear();
                    
                    //Run Script
                    currentComponent = (Component*)myMeasurement->component;
                    
                    std::string scriptResult = myLuaScripts->run(myMeasurement->script);
                    
                    if (scriptResult.size() > 0 && ((isDouble(scriptResult) == true && string_to_double(scriptResult) != 0)||isDouble(scriptResult) == false))
                    {
                        myMeasurement->providedValues.push_back(scriptResult);
                        myMeasurement->providedValue = string_to_double(scriptResult);
                    }
                }
            }
        }
    }
    }
    }
    
    set<string> getAllCosts()
    {
        set<string> costTypes;
        for (int i = 0; i < costs.size(); i++)
        {
            costTypes.insert(costs.at(i)->name);
        }
        return costTypes;
    }
    
    double getCost(string name)
    {
        double sum = 0.0;
        for (int i = 0; i < costs.size(); i++)
        {
            Cost *currentCost = costs.at(i);
            if (currentCost->name == name && currentCost->enabled)
            {
                sum += currentCost->amount;
            }
        }
        return sum;
    }
    
    vector<Capability> getAllSearchObjectiveCapabilities()
    {
        vector<Capability> capabilities;
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            if (evaluateSet.at(i)->getType() == string("Capability"))
            {
                Capability *lookingAtCapability = (Capability*)evaluateSet.at(i);
                if (lookingAtCapability->searchObjective == true)
                {
                    capabilities.push_back(*lookingAtCapability);
                }
            }
        }
        return capabilities;
    }
    
    vector<Capability*> getAllSearchObjectiveCapabilitiesPtr()
    {
        vector<Capability*> capabilities;
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            if (evaluateSet.at(i)->getType() == string("Capability"))
            {
                Capability *lookingAtCapability = (Capability*)evaluateSet.at(i);
                if (lookingAtCapability->searchObjective == true)
                {
                    capabilities.push_back(lookingAtCapability);
                }
            }
        }
        return capabilities;
    }
    
    vector<Capability> getAllCapabilities()
    {
        vector<Capability> capabilities;
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            if (evaluateSet.at(i)->getType() == string("Capability") && evaluateSet.at(i)->enabled)
            {
                Capability *lookingAtCapability = (Capability*)evaluateSet.at(i);
                capabilities.push_back(*lookingAtCapability);
            }
        }
        return capabilities;
    }
    
    vector<Capability*> getAllDesiredCapabilities()
    {
        vector<Capability*> capabilities;
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            if (evaluateSet.at(i)->getType() == string("Capability"))
            {
                Capability *lookingAtCapability = (Capability*)evaluateSet.at(i);
                if (lookingAtCapability->requiredByComponent == false && lookingAtCapability->standAlone == false)
                {
                    capabilities.push_back(lookingAtCapability);
                }
            }
        }
        return capabilities;
    }
    
    vector<std::string> getAllExistingComponents()
    {
        vector<std::string> existingComponents;
        
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            if (evaluateSet.at(i)->getType() == string("Component"))
            {
                Component *ourComponent = (Component*)evaluateSet.at(i);
                if (ourComponent->existing)
                {
                    existingComponents.push_back(ourComponent->name);
                }
            }
        }
        
        return existingComponents;
    }
    
    vector<Component*> getAllComponents()
    {
        vector<Component*> components;
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            if (evaluateSet.at(i)->getType() == string("Component"))
            {
                Component *ourComponent = (Component*)evaluateSet.at(i);
                components.push_back(ourComponent);
            }
        }
        return components;
    }
    
    vector<Measurement> getAllMeasurements()
    {
        vector<Measurement> measurements;
        for (int i = 0; i < evaluateSet.size(); i++)
        {
            if (evaluateSet.at(i)->getType() == string("Measurement") && evaluateSet.at(i)->enabled)
            {
                Measurement *lookingAtMeasurement = (Measurement*)evaluateSet.at(i);
                
                if (lookingAtMeasurement->criticalValue != lookingAtMeasurement->benchmarkValue || lookingAtMeasurement->criticalValues.size() > 0)
                {
                    measurements.push_back(*lookingAtMeasurement);
                }
            }
        }
        return measurements;
    }
    
    //Copied Code - Standard string to double
    double string_to_double( const std::string& s )
    {
        std::istringstream i(s);
        double x;
        if (!(i >> x))
            return 0;
        return x;
    } 
    
    bool isDouble( const std::string& s )
    {
        std::istringstream i(s);
        double x;
        if (!(i >> x))
            return false;
        return true;
    } 

    
    
};

#endif
