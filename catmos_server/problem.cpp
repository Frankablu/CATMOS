//
//  problem.cpp
//  catmos
//
//  Created by Frank on 13/03/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>
#include "evaluator.cpp"

#ifndef ProblemCode
#define ProblemCode

class Problem
{
public:
    Problem() {}
    
    Evaluator *evaluation;
    
    void load()
    {
        //Set up a test problem
		Capability *cap0 = new Capability("ourMainGoal");
		cap0->searchObjective = true;
		Measurement *measure0 = new Measurement("satisfactionLevel");
 		measure0->providedValue = 0.0;
 		measure0->benchmarkValue = 10.0;
 		measure0->criticalValue = 1.0;
		cap0->addMeasurement(measure0);
        evaluation->addObject(cap0);
        
        
        Component *comp1 = new Component("ComponentA");
        CapabilityProvision *capProv1x1 = new CapabilityProvision("ourMainGoal");
        comp1->addProvides(capProv1x1);
        Measurement *measure1x1x1 = new Measurement("satisfactionLevel");
        capProv1x1->addMeasurement(measure1x1x1);
        measure1x1x1->providedValue = 0.0;
		measure1x1x1->script = std::string("output = 7");
        Cost *cost1x1 = new Cost("Money");
        cost1x1->amount = 10.0;
        comp1->addCost(cost1x1);
        evaluation->addObject(comp1);
        Component *comp2 = new Component("ComponentB");
        Capability *capDep2x1 = new Capability("supportSystem");
        comp2->addRequires(capDep2x1);
        Measurement *measure2x1x1 = new Measurement("SupportLevel");
        capDep2x1->addMeasurement(measure2x1x1);
        measure2x1x1->qualitative = true;
        measure2x1x1->criticalValues.push_back(string("not good"));
        measure2x1x1->benchmarkValues.push_back(string("good"));
        Cost *cost2x1 = new Cost("Money");
        cost2x1->amount = 15.0;
        comp2->addCost(cost2x1);
        evaluation->addObject(comp2);
        Component *comp3 = new Component("ComponentC");
        CapabilityProvision *capProv3x1 = new CapabilityProvision("supportSystem");
        comp3->addProvides(capProv3x1);
        Measurement *measure3x1x1 = new Measurement("SupportLevel");
        capProv3x1->addMeasurement(measure3x1x1);
        measure3x1x1->providedValue = 1337;
        measure3x1x1->providedValues.push_back(string("not good"));
        
        CapabilityUpgrade *upgrade3x0 = new CapabilityUpgrade("ourUpgrade");
        comp3->addUpgrades(upgrade3x0);
        
        CapabilityProvision *capProv3x1001 = new CapabilityProvision("ourMainGoal");
        upgrade3x0->addCapability(capProv3x1001);
        Measurement *measure3x1001x1 = new Measurement("satisfactionLevel");
        capProv3x1001->addMeasurement(measure3x1001x1);
        measure3x1001x1->providedValue = 15.0;
        Cost *cost3x1 = new Cost("Money");
        cost3x1->amount = 15.0;
        comp3->addCost(cost3x1);
        evaluation->addObject(comp3);
        qvd *ourDictionary = new qvd;
        
        
        evaluation->setQVD(ourDictionary);
        //evaluation->evaluate();
        
    }
};

#endif


