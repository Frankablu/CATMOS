//
//  capabilityupgrade.cpp
//  catmos
//
//  Created by Frank on 27/04/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#ifndef CAPABILITYUPGRADE_HEADER
#define CAPABILITYUPGRADE_HEADER

#include <iostream>
#include "mobject.cpp"
#include "capability.cpp"
#include "component.cpp"
#include <vector>

class CapabilityUpgrade : public mObject
{
public:
    CapabilityUpgrade(std::string setName)
    {
        name = setName;
        typeString = "CapabilityUpgrade";
        status = 0.0;
    }
    
    std::string targetComponent;
    
    std::vector<CapabilityProvision*> add;
    std::vector<CapabilityProvision*> modify;
    std::vector<CapabilityProvision*> del;
    
    void addCapability(CapabilityProvision* addCap)
    {
        add.push_back(addCap);
    }
    
    void modifyCapability(CapabilityProvision* modifyCap)
    {
        modify.push_back(modifyCap);
    }
    
    void delCapability(CapabilityProvision* delCap)
    {
        del.push_back(delCap);
    }
    
    void applyToComponent(Component* applyTo)
    {
        for (int i = 0; i < add.size(); i++)
        {
            add.at(i)->enabled = true;
            add.at(i)->dependsOn.clear();
            add.at(i)->dependsOn.push_back(applyTo);
            
            applyTo->provides.push_back(add.at(i));
        }
        
        for (int i = 0; i < modify.size(); i++)
        {
            for (int j = 0; j < applyTo->provides.size(); j++)
            {
                if (applyTo->provides.at(j)->name == modify.at(i)->name) //Delete Existing Object
                {
                    applyTo->provides.erase(applyTo->provides.begin()+j);
                    break;
                }
            }
            
            modify.at(i)->enabled = true;
            modify.at(i)->dependsOn.clear();
            modify.at(i)->dependsOn.push_back(applyTo);
            applyTo->provides.push_back(modify.at(i));
        }
        
        for (int i = 0; i < del.size(); i++)
        {
            for (int j = 0; j < applyTo->provides.size(); j++)
            {
                if (applyTo->provides.at(j)->name == del.at(i)->name)
                {
                    applyTo->provides.erase(applyTo->provides.begin()+j);
                    j--;
                }
            }
        }
        
        applyTo->dependsOn.push_back(this);
    }
    
};

#endif

