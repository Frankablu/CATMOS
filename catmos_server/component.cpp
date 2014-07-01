//
//  component.cpp
//  catmos
//
//  Created by Frank on 11/03/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#ifndef COMPONENT_HEADER
#define COMPONENT_HEADER

#include <iostream>
#include "mobject.cpp"
#include "capability.cpp"
#include "capabilityprovision.cpp"
#include "cost.cpp"
#include <vector>

class Component : public mObject
{
public:
    std::vector<CapabilityProvision*> provides;
    std::vector<CapabilityProvision*> originalProvides;
    std::vector<Capability*> requires;
    std::vector<Cost*> costs;
    std::vector<mObject*> originalDepends;
    
    std::vector<mObject*> upgrades;
    bool existing;
    
    Component(std::string setName)
    {
        name = setName;
        status = 0.0;
        typeString = std::string("Component");
        existing = false;
    }
    
    void addProvides(CapabilityProvision *capProvision)
    {
        provides.insert(provides.end(), capProvision);
        originalProvides.insert(originalProvides.end(), capProvision);
        capProvision->dependsOn.insert(capProvision->dependsOn.end(),this);
    }
    
    void addUpgrades(mObject *capUpgrade)
    {
        upgrades.insert(upgrades.end(), capUpgrade);
        capUpgrade->dependsOn.insert(capUpgrade->dependsOn.end(),this);
    }
    
    void addRequires(Capability *cap)
    {
        requires.insert(requires.end(), cap);
        dependsOn.insert(dependsOn.end(), cap);
        originalDepends.insert(originalDepends.end(), cap);
        cap->requiredByComponent = true;
    }
    
    void addCost(Cost *newCost)
    {
        costs.push_back(newCost);
    }
    
    //Undo any changes caused by upgrades
    void reset()
    {
        provides.clear();
        
        for (int i = 0; i < originalProvides.size(); i++)
        {
            provides.push_back(originalProvides.at(i));
        }
        
        dependsOn.clear();
        
        for (int i = 0; i < originalDepends.size(); i++)
        {
            dependsOn.push_back(originalDepends.at(i));
        }
    }
    
    
};

#endif

