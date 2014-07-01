//
//  capability.cpp
//  catmos
//
//  Created by Frank on 11/03/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.

#ifndef CAPABILITY_HEADER
#define CAPABILITY_HEADER

#include <iostream>
#include "mobject.cpp"
#include "capabilityprovision.cpp"
#include "measurement.cpp"

class Capability : public mObject
{
public:
    bool searchObjective;
    bool requiredByComponent;
    bool standAlone;
    
    std::vector<CapabilityProvision*> satisfiedBy;
    std::vector<Capability*> decomposes;
    std::vector<Measurement*> measuredBy;
    Measurement* accumulation;
    
    double tempStatus; //Used for through life calculations
    long int startTime;
    long int stopTime;
    
    Capability(std::string setName)
    {
        name = setName;
        status = 0.0;
        searchObjective = false;
        typeString = std::string("Capability");
        accumulation = NULL;
        requiredByComponent = false;
        standAlone = false;
        component = NULL;
    }
    
    void addDecomposes(Capability *toCapability)
    {
        decomposes.insert(decomposes.end(), toCapability);
        dependsOn.insert(dependsOn.end(), toCapability);
    }
    
    void addSatisfiedBy(CapabilityProvision *capProvision)
    {
        if (this == NULL)
        {
            return;
        }
        satisfiedBy.insert(satisfiedBy.end(), capProvision);
        dependsOn.insert(dependsOn.end(), capProvision);
        
        capProvision->satisfies.insert(capProvision->satisfies.end(), this);
    }
    
    void addMeasurement(Measurement *measurement)
    {
        measuredBy.push_back(measurement);
        measurement->capability = this;
    }
    
    void makeAccumulation(Measurement *measurement)
    {
        accumulation = measurement;
    }
    
};

#endif

