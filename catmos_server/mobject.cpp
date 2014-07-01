//
//  mobject.cpp
//  catmos
//
//  Created by Frank on 11/03/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>
#include <vector>

#ifndef MOBJECT_HEAD
#define MOBJECT_HEAD

//Model Object
//Basic Operations Supported By All Objects in Our "Model"
//We are porting from the MDE mindset

class mObject
{
public:
    std::string name;
    std::string typeString;
    mObject* component;
    
    bool enabled;
    
    double status;
    
    std::string getType()
    {
        return typeString;
    }
    
    std::vector<mObject*> satisfies; //Used in Capability Provision
    
    std::vector<mObject*> dependsOn;
    
};

#endif

