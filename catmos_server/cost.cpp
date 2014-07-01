//
//  cost.cpp
//  catmos
//
//  Created by Frank on 11/03/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#ifndef COST_HEADER
#define COST_HEADER

#include <iostream>
#include <string>
#include "mobject.cpp"

class Cost : public mObject
{
public:
    double amount;
    
    Cost(std::string setName)
    {
        name = setName;
    }
};

#endif

