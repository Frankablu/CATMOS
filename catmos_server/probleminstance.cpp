//
//  probleminstance.cpp
//  catmos
//
//  Created by Frank on 24/04/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>

#include "evaluator.cpp"

#ifndef PROBLEM_INSTANCE_H
#define PROBLEM_INSTANCE_H

class problemInstance
{
public:
    
    problemInstance()
    {
        
    }
    
    Evaluator *evaluation;
    
    void loadInstance()
    {
        evaluation->setUpgrade("ComponentC", "ourUpgrade", "ComponentB");
        
        evaluation->createLink("ComponentB","ourMainGoal","scenario");
        evaluation->createLink("ComponentC","supportSystem","ComponentB");
    }
    
};


#endif
