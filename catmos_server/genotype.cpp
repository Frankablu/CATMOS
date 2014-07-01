//
//  genotype.cpp
//  catmos
//
//  Created by Frank on 03/05/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>
#include <vector>

#ifndef genoTypeCode
#define genoTypeCode

//Stores the minimal information for a solution configuration
class genoType
{
public:
    std::vector<std::string> sourceComponent;
    std::vector<std::string> capability;
    std::vector<std::string> targetComponent;
    std::vector<int> componentGaNumber;
   
    std::vector<std::string> upgradeSourceComponent;
    std::vector<std::string> upgradeName;
    std::vector<std::string> upgradeTargetComponent;
    std::vector<int> upgradeGaNumber;
    
    //For evaluation purposes
    std::vector<double> scores;
    
    std::vector<genoType*> dominates;
    int nonDominatedCount;
    int paretoFront;
    
    //Are we the same as another genoType?
    bool sameAs(genoType *other)
    {
        //Check the scores only
        for (int i = 0; i < scores.size(); i++)
        {
            if (scores.at(i) != other->scores.at(i))
            {
                return false;
            }
        }
        
        return true;
    }
    
    int otherInPopulation;
};

#endif

