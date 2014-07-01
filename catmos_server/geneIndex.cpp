//
//  geneIndex.cpp
//  catmos
//
//  Created by Frank on 12/05/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#ifndef GENEINDEX_HEADER
#define GENEINDEX_HEADER

#include <iostream>
#include <vector>
#include "genotype.cpp"

//Okay this class creates an index of the gene's (sourceComponent, capability, targetComponents)
//and numbers them uniquely so crossover will work correctly and no two genes will compete for the
//same spot - This is a problem when the capability accumulation & reuse features are used

class geneIndex
{
public:
    std::vector<std::string> sourceComponent;
    std::vector<std::string> capability;
    std::vector<std::string> targetComponent;
    std::vector<int> gaNumber;
    
    void addToIndex(std::string source, std::string cap, std::string target, int number)
    {
        if (number >= 0)
        {
            bool alreadyPresent = false;
            
            for (int i = 0; i < sourceComponent.size(); i++)
            {
                if (sourceComponent.at(i).compare(source) == 0 && capability.at(i).compare(cap) == 0 && targetComponent.at(i).compare(target) == 0)
                {
                    alreadyPresent = true;
                }
            }
            
            if (alreadyPresent == false)
            {
                sourceComponent.push_back(source);
                capability.push_back(cap);
                targetComponent.push_back(target);
                gaNumber.push_back(number);
            }
        }
    }
    
    void sortIndex()
    {
        for (int i = 0; i < gaNumber.size(); i++)
        {
            int currentNumber = gaNumber.at(i);
            
            //Move all other numbers out of the way!
            for (int j = 0; j < gaNumber.size(); j++)
            {
                if (i != j)
                {
                    int otherNumber = gaNumber.at(j);
                    if (currentNumber == otherNumber)
                    {
                        gaNumber.at(j)++;
                    }
                }
            }
        }
    }
    
    int getNumber(std::string source, std::string cap, std::string target)
    {
        for (int i = 0; i < sourceComponent.size(); i++)
        {
            if (sourceComponent.at(i).compare(source) == 0 && capability.at(i).compare(cap) == 0 && targetComponent.at(i).compare(target) == 0)
            {
                return gaNumber.at(i);
            }
        }
        
        int maxNumber = 1;
        
        //Find Max Number
        for (int j = 0; j < gaNumber.size(); j++)
        {
            if (gaNumber.at(j) > maxNumber)
            {
                maxNumber = gaNumber.at(j);
            }
        }
        
        addToIndex(source, cap, target, maxNumber + 1);
        return maxNumber + 1;
        
        //std::cout << "Requested Gene Number For None Inserted Gene";
        //return -1; //Error
    }
    
    void addAll(genoType *solution)
    {
        for (int i = 0; i < solution->sourceComponent.size(); i++)
        {
            addToIndex(solution->sourceComponent.at(i), solution->capability.at(i), solution->targetComponent.at(i),solution->componentGaNumber.at(i));
        }
    }
    
    void reNumberSolution(genoType *solution)
    {
        for (int i = 0; i < solution->sourceComponent.size(); i++)
        {
            if (solution->componentGaNumber.at(i) >= 0)
            {
                int oldNumber = solution->componentGaNumber.at(i);
                int newNumber = getNumber(solution->sourceComponent.at(i), solution->capability.at(i), solution->targetComponent.at(i));
                solution->componentGaNumber.at(i) = newNumber;
                
                for (int j = 0; j < solution->upgradeGaNumber.size(); j++)
                {
                    if (solution->upgradeGaNumber.at(j) == oldNumber)
                    {
                        solution->upgradeGaNumber.at(j) = newNumber;
                    }
                }
            }
        }
    }
};

#endif

