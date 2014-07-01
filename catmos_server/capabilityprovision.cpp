//
//  capabilityprovision.cpp
//  catmos
//
//  Created by Frank on 11/03/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#ifndef CAPABILITYPROV_HEADER
#define CAPABILITYPROV_HEADER

#include <iostream>
#include "mobject.cpp"
#include "measurement.cpp"

class CapabilityProvision : public mObject
{
public:
    bool searchObjective;
    std::vector<Measurement*> measuredBy;
    int reuse;
    
    CapabilityProvision(std::string setName)
    {
        name = setName;
        typeString = std::string("CapabilityProvision");
        reuse = 0;
        component = NULL;
    }
    
    void addMeasurement(Measurement *measurement)
    {
        measuredBy.push_back(measurement);
        measurement->dependsOn.push_back(this);
    }
};

#endif
