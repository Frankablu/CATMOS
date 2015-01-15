//
//  geneticAlgorithm.cpp
//  catmos
//
//  Created by Frank on 03/05/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include "geneticAlgorithm.h"

#ifndef catmos_geneticAlgorithm
#define catmos_geneticAlgorithm

//Genetic Algorithm Control

geneticAlgorithm::geneticAlgorithm()
{
    populationSize = 0;
    generationCount = 0;
    remoteStart = false;
}

geneticAlgorithm::geneticAlgorithm(int pop, int gen)
{
    populationSize = pop;
    generationCount = gen;
    remoteStart = false;
}

genoType* geneticAlgorithm::getInitialPopulationMember()
{
    //Get GA ready
    if (remoteStart == false)
    {
        searchPopulation.clear();
        initialSolutionCreater.evaluation = evaluation;
        initialSolutionCreater.runOnce = true;
        remoteStart = true;
    }
    
    genoType *solution = initialSolutionCreater.createSolution();
    
    repairSolution(solution);
    ensureValid(solution);
    
    return solution;
}


void geneticAlgorithm::createInitialPopulation()
{
    std::cout << "Genetic Algorithm Creating Initial Population" << std::endl;
    searchPopulation.clear();
    initialSolutionCreater.evaluation = evaluation;
    initialSolutionCreater.runOnce = true;
    
    if (connections.size() == 0)
    {
        for (int i = 0; i < populationSize; i++)
        {
            genoType *solution = initialSolutionCreater.createSolution();
            repairSolution(solution);
            ensureValid(solution);
            evaluateSolution(solution);
            searchPopulation.push_back(solution);
        }
        
        //Add Blank Entry
        genoType *blankSolution = new genoType();
        evaluateSolution(blankSolution);
        searchPopulation.push_back(blankSolution);
    }
    else
    {
        int numberOfConnections = (int)connections.size();
        int currentConnection = 0;
        
        double numberOfSolutionsEach = (double)populationSize / (double)numberOfConnections;
        
        //Request that all connected clients create us initial solutions
        for (int i = 0; i < numberOfConnections; i++)
        {
            connections.at(i)->requestCreateSolution(ceil(numberOfSolutionsEach));
        }
        
        std::vector<genoType*> result;
        
        //Retreve them
        for (int i = 0; i < numberOfConnections; i++)
        {
            result = connections.at(i)->requestInitialSolutions();
            
            for (int j = 0; j < result.size(); j++)
            {
                searchPopulation.push_back(result.at(j));
            }
        }
        
        //Add Blank Entry
        genoType *blankSolution = new genoType();
        searchPopulation.push_back(blankSolution);
        
        int record = 0;
        
        //Still need to evaluate them! Similar code for normal network evaluation
        for (int i = 0; i < searchPopulation.size(); i++)
        {
            genoType *newSolution = searchPopulation.at(i);
            
            //Send request
            connections.at(currentConnection)->evaluateSolution(newSolution);
            currentConnection = (currentConnection + 1) % numberOfConnections;
            record++;
            
            if (currentConnection == 0)
            {
                record = 0;
                for (int j = 0; j < numberOfConnections; j++)
                {
                    //This will wait for the evaluation to be finished
                    connections.at(j)->retrieveEvaluation();
                }
            }
        }
        
        for (int j = 0; j < record; j++)
        {
            //This will wait for the evaluation to be finished
            connections.at(j)->retrieveEvaluation();
        }
        
    }
    
    std::cout << "Initial Population Created" << std::endl;
    
    std::cout << "Performing Gene Sorting!" << std::endl;
    
    for (int i = 0; i < searchPopulation.size(); i++)
    {
        ourGeneIndex.addAll(searchPopulation.at(i));
    }
    
    ourGeneIndex.sortIndex();
    
    //Add Full Entry
    genoType *fullSolution = initialSolutionCreater.createSolution();
    ourGeneIndex.reNumberSolution(fullSolution);
    repairSolution(fullSolution, false); //Include Every Possible Link
    evaluateSolution(fullSolution);
    searchPopulation.push_back(fullSolution);
    
    for (int i = 0; i < searchPopulation.size(); i++)
    {
        ourGeneIndex.reNumberSolution(searchPopulation.at(i));
    }
    
    createParetoFrontScores();
}

void geneticAlgorithm::setConnections(std::vector<networkConnection*> ourConnections)
{
    connections = ourConnections;
}

void geneticAlgorithm::performGARound()
{
    if (connections.size() == 0)
    {
        //Breed new solutions
        for (int i = 0; i < populationSize; i++)
        {
            genoType *newSolution = getBredSolution();
            repairSolution(newSolution);
            ensureValid(newSolution);
            evaluateSolution(newSolution);
            searchPopulation.push_back(newSolution);
        }
    }
    else
    {
        int numberOfConnections = (int)connections.size();
        int currentConnection = 0;
        int record = 0;
        
        for (int i = 0; i < populationSize; i++)
        {
            genoType *newSolution = getBredSolution();
            repairSolution(newSolution);
            ensureValid(newSolution);
            record++;
            
            //Send request
            connections.at(currentConnection)->evaluateSolution(newSolution);
            currentConnection = (currentConnection + 1) % numberOfConnections;
            
            searchPopulation.push_back(newSolution);
            
            if (currentConnection == 0)
            {
                record = 0;
                for (int j = 0; j < numberOfConnections; j++)
                {
                    //This will wait for the evaluation to be finished
                    connections.at(j)->retrieveEvaluation();
                }
            }
        }
        
        for (int j = 0; j < record; j++)
        {
            //This will wait for the evaluation to be finished
            connections.at(j)->retrieveEvaluation();
        }
        
    }
    
    createParetoFrontScores();
    
    //std::cout << "Debug Information" << std::endl;
    //for (int i = 0; i < searchPopulation.size(); i++)
    //{
    //    std::cout << searchPopulation.at(i)->scores.at(0) << " " << searchPopulation.at(i)->scores.at(1) << " " <<searchPopulation.at(i)->paretoFront << std::endl;
    //}
    
    //Now we need to discard the worst half of the population
    
    //Sort in Pareto Front order
    //std::sort(searchPopulation.begin(), searchPopulation.end());
    
    //Calculate Crowding Level
    genoType *ourP;
    
    for (int p = 0; p < searchPopulation.size(); p++)
    {
        ourP = searchPopulation.at(p);
        ourP->otherInPopulation = 0;
        
        for (int q = 0; q < searchPopulation.size(); q++)
        {
            if (p != q)
            {
                genoType *ourQ = searchPopulation.at(q);
                if (ourP->sameAs(ourQ))
                {
                    ourP->otherInPopulation++;
                }
            }
        }
    }
    
    std::vector<genoType*> newSearchPopulation;
    //std::vector<bool> used;
    
    //Mark the population members as unused for freeing
    //for (int save = 0; save < searchPopulation.size(); save++)
    //{
    //    used.push_back(false);
    //}
    
    int copied = 0;
    int currentFront = 1;
    bool someThingOnFront = true;
    
    while (copied < populationSize)
    {
        someThingOnFront = false;
        
        for (int i = 0; i < searchPopulation.size(); i++)
        {
            if (searchPopulation.at(i)->paretoFront == currentFront)
            {
                int repeatCount = 0;
                //Perform check against rest of population
                for (int j = 0; j < searchPopulation.size(); j++)
                {
                    if (searchPopulation.at(i)->sameAs(searchPopulation.at(j)))
                    {
                        repeatCount++;
                    }
                }
                
                if (repeatCount <= 5) //The same entry can't be repeated more than 5 times!
                {
                    newSearchPopulation.push_back(searchPopulation.at(i));
                    //used.at(i) = true; //We have used this member in the new population don't free it!
                    copied++;
                    someThingOnFront = true;
                }
                
                if (copied == populationSize)
                {
                    break;
                }
            }
        }
        
        if (someThingOnFront == false)
        {
            break;
        }
        
        currentFront++;
    }
    
    if (someThingOnFront == false)
    {
        while (newSearchPopulation.size() < populationSize)
        {
            int random = rand() % populationSize;
            newSearchPopulation.push_back(searchPopulation.at(random));
            //used.at(random) = true;
        }
    }
    
    std::vector<genoType*> newSearchPopulationTemp;
    
    //Copy the new population
    for (int i = 0; i < newSearchPopulation.size(); i++)
    {
        genoType *oldMember = newSearchPopulation.at(i);
        genoType *member = new genoType();
        for (int j = 0; j < oldMember->sourceComponent.size(); j++)
        {
            member->sourceComponent.push_back(oldMember->sourceComponent.at(j));
        }
        
        for (int j = 0; j < oldMember->capability.size(); j++)
        {
            member->capability.push_back(oldMember->capability.at(j));
        }
        
        for (int j = 0; j < oldMember->targetComponent.size(); j++)
        {
            member->targetComponent.push_back(oldMember->targetComponent.at(j));
        }
        
        for (int j = 0; j < oldMember->componentGaNumber.size(); j++)
        {
            member->componentGaNumber.push_back(oldMember->componentGaNumber.at(j));
        }
        
        for (int j = 0; j < oldMember->upgradeSourceComponent.size(); j++)
        {
            member->upgradeSourceComponent.push_back(oldMember->upgradeSourceComponent.at(j));
        }
        
        for (int j = 0; j < oldMember->upgradeName.size(); j++)
        {
            member->upgradeName.push_back(oldMember->upgradeName.at(j));
        }
        
        for (int j = 0; j < oldMember->upgradeTargetComponent.size(); j++)
        {
            member->upgradeTargetComponent.push_back(oldMember->upgradeTargetComponent.at(j));
        }
        
        for (int j = 0; j < oldMember->upgradeGaNumber.size(); j++)
        {
            member->upgradeGaNumber.push_back(oldMember->upgradeGaNumber.at(j));
        }
        
        for (int j = 0; j < oldMember->scores.size(); j++)
        {
            member->scores.push_back(oldMember->scores.at(j));
        }
        
        
        member->nonDominatedCount = oldMember->nonDominatedCount;
        member->paretoFront = oldMember->paretoFront;
        
        newSearchPopulationTemp.push_back(member);
    }
    
    //Delete previous search population
    
    //Delete all population members
    for (int i = 0; i < searchPopulation.size(); i++)
    {
        genoType *oldMember = searchPopulation.at(i);
        
        oldMember->sourceComponent.clear();
        oldMember->capability.clear();
        oldMember->targetComponent.clear();
        oldMember->componentGaNumber.clear();
        
        oldMember->upgradeSourceComponent.clear();
        oldMember->upgradeName.clear();
        oldMember->upgradeTargetComponent.clear();
        oldMember->upgradeGaNumber.clear();
        
        oldMember->scores.clear();
        oldMember->dominates.clear();
    }
    
    for (int i = 0; i < searchPopulation.size(); i++)
    {
        genoType *oldMember = searchPopulation.at(i);
        delete oldMember;
        
        for (int j = 0; j < searchPopulation.size(); j++)
        {
            if (oldMember == searchPopulation.at(j))
            {
                searchPopulation.erase(searchPopulation.begin()+j);
            }
        }
    }
    
    searchPopulation.clear();
    searchPopulation = newSearchPopulationTemp;
    
}

genoType* geneticAlgorithm::getBredSolution()
{
    //Tournament Selection For Parents
    int parentA1 = rand() % populationSize;
    int parentA2 = rand() % populationSize;
    int parentB1 = rand() % populationSize;
    int parentB2 = rand() % populationSize;
    
    genoType *parentA;
    genoType *parentB;
    
    if (searchPopulation.at(parentA1)->paretoFront <= searchPopulation.at(parentA2)->paretoFront)
    {
        parentA = searchPopulation.at(parentA1);
    }
    else
    {
        parentA = searchPopulation.at(parentA2);
    }
    
    if (searchPopulation.at(parentB1)->paretoFront <= searchPopulation.at(parentB2)->paretoFront)
    {
        parentB = searchPopulation.at(parentB1);
    }
    else
    {
        parentB = searchPopulation.at(parentB2);
    }
    
    //Crossover
    int maxValue = 0;
    
    for (int i = 0; i < parentA->sourceComponent.size(); i++)
    {
        if (parentA->componentGaNumber.at(i) > maxValue)
        {
            maxValue = parentA->componentGaNumber.at(i);
        }
    }
    
    for (int i = 0; i < parentB->sourceComponent.size(); i++)
    {
        if (parentB->componentGaNumber.at(i) > maxValue)
        {
            maxValue = parentB->componentGaNumber.at(i);
        }
    }
    
    int crossOverPlace = 0;
    if (maxValue > 0)
    {
        crossOverPlace = rand() % maxValue;
    }
    
    genoType* childSolution = new genoType;
    
    //Perform CrossOver - Parent A Donates Existings Components
    for (int i = 0; i < parentA->sourceComponent.size() || i < parentB->sourceComponent.size(); i++)
    {
        if (parentA->sourceComponent.size() > i)
        {
            if (parentA->componentGaNumber.at(i) < crossOverPlace)
            {
                childSolution->sourceComponent.push_back(parentA->sourceComponent.at(i));
                childSolution->capability.push_back(parentA->capability.at(i));
                childSolution->targetComponent.push_back(parentA->targetComponent.at(i));
                childSolution->componentGaNumber.push_back(parentA->componentGaNumber.at(i));
            }
        }
        
        if (parentB->sourceComponent.size() > i)
        {
            if (parentB->componentGaNumber.at(i) >= crossOverPlace)
            {
                childSolution->sourceComponent.push_back(parentB->sourceComponent.at(i));
                childSolution->capability.push_back(parentB->capability.at(i));
                childSolution->targetComponent.push_back(parentB->targetComponent.at(i));
                childSolution->componentGaNumber.push_back(parentB->componentGaNumber.at(i));
            }
        }
    }
    
    //Add corresponding upgrades
    for (int i = 0; i < parentA->upgradeSourceComponent.size(); i++)
    {
        if (parentA->upgradeGaNumber.at(i) <= crossOverPlace)
        {
            childSolution->upgradeSourceComponent.push_back(parentA->upgradeSourceComponent.at(i));
            childSolution->upgradeName.push_back(parentA->upgradeName.at(i));
            childSolution->upgradeTargetComponent.push_back(parentA->upgradeTargetComponent.at(i));
            childSolution->upgradeGaNumber.push_back(parentA->upgradeGaNumber.at(i));
        }
    }
    
    for (int i = 0; i < parentB->upgradeSourceComponent.size(); i++)
    {
        if (parentB->upgradeGaNumber.at(i) > crossOverPlace)
        {
            childSolution->upgradeSourceComponent.push_back(parentB->upgradeSourceComponent.at(i));
            childSolution->upgradeName.push_back(parentB->upgradeName.at(i));
            childSolution->upgradeTargetComponent.push_back(parentB->upgradeTargetComponent.at(i));
            childSolution->upgradeGaNumber.push_back(parentB->upgradeGaNumber.at(i));
        }
    }
    
    //Mutate
    //Fairly Simple Just Delete Some Entries So Smaller Solutions Can Arise
    int problemSize = (int)ourGeneIndex.sourceComponent.size();
    
    if (problemSize < 10)
    {
        problemSize = 10;
    }
    
    int mutation = rand() % (int)(problemSize * 0.2);
    if (mutation > (problemSize * 0.1))
    {
        mutation -= (problemSize * 0.1);
    }
    
    while (mutation > 0 && childSolution->sourceComponent.size() > 0)
    {
        int removeAt = (int)(rand() % childSolution->sourceComponent.size());
        int gaNumber = childSolution->componentGaNumber.at(removeAt);
        
        if (gaNumber > 0) //Existing Components (Marked with Negative Ga Numbers) Can Never Be Deleted
        {
            childSolution->sourceComponent.erase(childSolution->sourceComponent.begin() + removeAt);
            childSolution->capability.erase(childSolution->capability.begin() + removeAt);
            childSolution->targetComponent.erase(childSolution->targetComponent.begin() + removeAt);
            
            childSolution->componentGaNumber.erase(childSolution->componentGaNumber.begin() + removeAt);
            
            for (int i = 0; i < childSolution->upgradeGaNumber.size(); i++)
            {
                if (childSolution->upgradeGaNumber.at(i) == gaNumber)
                {
                    childSolution->upgradeSourceComponent.erase(childSolution->upgradeSourceComponent.begin()+i);
                    childSolution->upgradeName.erase(childSolution->upgradeName.begin()+i);
                    childSolution->upgradeTargetComponent.erase(childSolution->upgradeTargetComponent.begin()+i);
                    childSolution->upgradeGaNumber.erase(childSolution->upgradeGaNumber.begin()+i);
                }
            }
        }
        
        mutation--;
    }
    
    return childSolution;
}

std::vector<genoType*> geneticAlgorithm::getParetoFront()
{
    createParetoFrontScores();
    
    std::vector<genoType*> paretoFront;
    
    for (int i = 0; i < searchPopulation.size(); i++)
    {
        genoType* currentPopulation = searchPopulation.at(i);
        if (currentPopulation->paretoFront == 1) //First Pareto Front
        {
            //Is Unique in Front
            bool newEntry = true;
            
            for (int j = 0; j < paretoFront.size(); j++)
            {
                if (currentPopulation->sameAs(paretoFront.at(j)))
                {
                    newEntry = false;
                }
            }
            
            if (newEntry)
            {
                paretoFront.push_back(currentPopulation);
            }
        }
    }
    
    return paretoFront;
}

//NSGA-II Fast Non Dominated Sort
//This algorithm calculates a Pareto Frontier rating for the population
//Deb 2002 NSGA-II Algorithm
//http://sci2s.ugr.es/docencia/doctobio/2002-6-2-DEB-NSGA-II.pdf
void geneticAlgorithm::createParetoFrontScores()
{
    std::vector<genoType*> *currentFront;
    std::vector<genoType*> *nextFront;
    
    currentFront = new std::vector<genoType*>;
    nextFront = new std::vector<genoType*>;
    
    //Clear Variables Before Usage
    for (int p = 0; p < searchPopulation.size(); p++)
    {
        genoType *ourP = searchPopulation.at(p);
        ourP->nonDominatedCount = 0;
        ourP->dominates.clear();
        ourP->paretoFront = 0;
    }
    
    //searchPopulation .at(X) ->scores
    for (int p = 0; p < searchPopulation.size(); p++)
    {
        genoType *ourP = searchPopulation.at(p);
        //ourP->nonDominatedCount = 0;
        //ourP->dominates.clear();
        
        for (int q = 0; q < searchPopulation.size(); q++)
        {
            if (p != q)
            {
                
                genoType *ourQ = searchPopulation.at(q);
                
                //Determine if non dominated
                bool dominates = true;
                bool betterThanDraw = false;
                
                for (int n = 0; n < ourP->scores.size(); n++)
                {
                    while (ourQ->scores.size() < ourP->scores.size()) //If cost is excluded
                    {
                        ourQ->scores.push_back(0.0);
                    }
                    
                    if (ourP->scores.at(n) < ourQ->scores.at(n))
                    {
                        dominates = false;
                    }
                    
                    if (ourP->scores.at(n) > ourQ->scores.at(n))
                    {
                        betterThanDraw = true;
                    }
                }
                
                if (betterThanDraw == false)
                {
                    dominates = false;
                }
                
                if (dominates)
                {
                    ourP->dominates.push_back(ourQ);
                }
                
                //Determine if dominated by
                dominates = true;
                betterThanDraw = false;
                
                for (int n = 0; n < ourQ->scores.size(); n++)
                {
                    if (ourQ->scores.at(n) < ourP->scores.at(n))
                    {
                        dominates = false;
                    }
                    
                    if (ourQ->scores.at(n) > ourP->scores.at(n))
                    {
                        betterThanDraw = true;
                    }
                }
                
                if (betterThanDraw == false)
                {
                    dominates = false;
                }
                
                if (dominates)
                {
                    ourP->nonDominatedCount++;
                }
            }
        }
        
        if (ourP->nonDominatedCount == 0)
        {
            ourP->paretoFront = 1;
            currentFront->push_back(ourP);
        }
    }
    
    int i = 1;
    
    while (currentFront->size() > 0)
    {
        
        for (int p = 0; p < currentFront->size(); p++)
        {
            genoType *ourP = currentFront->at(p);
            
            for (int q = 0; q < ourP->dominates.size(); q++)
            {
                genoType *ourQ = ourP->dominates.at(q);
                ourQ->nonDominatedCount--;
                
                if (ourQ->nonDominatedCount == 0)
                {
                    ourQ->paretoFront = i + 1;
                    nextFront->push_back(ourQ);
                }
            }
            
        }
        
        i++;
        delete currentFront;
        currentFront = nextFront;
        nextFront = new std::vector<genoType*>;
    }
    delete currentFront;
    delete nextFront;
}

//Find the scoring for the solution
void geneticAlgorithm::evaluateSolution(genoType *solution)
{
    //Reset State
    evaluation->reset();
    if (throughLife)
    {
        ourScheduler->resetLink();
    }
    
    //Add All Upgrades
    for (int i = 0; i < solution->upgradeSourceComponent.size(); i++)
    {
        evaluation->setUpgrade(solution->upgradeSourceComponent.at(i),solution->upgradeName.at(i),solution->upgradeTargetComponent.at(i));
        
        if (throughLife)
        {
            ourScheduler->createScheduleUpgrade(solution->upgradeSourceComponent.at(i),solution->upgradeName.at(i),solution->upgradeTargetComponent.at(i));
        }
    }
    
    //Add All Links
    for (int i = 0; i < solution->sourceComponent.size(); i++)
    {
        evaluation->createLink(solution->sourceComponent.at(i),solution->capability.at(i),solution->targetComponent.at(i));
        
        if (throughLife)
        {
            ourScheduler->createScheduleLink(solution->sourceComponent.at(i),solution->capability.at(i),solution->targetComponent.at(i));
        }
    }
    
    //For Through Life Schedule Everything
    if (throughLife)
    {
        ourScheduler->run();
    }
    
    //Read To Evaluate
    evaluation->evaluate();
    
    solution->scores.clear();
    
    //Through Life Evaluation - Capability Status Over Time
    if (throughLife)
    {
        //Work out average capability score over time
        std::set<long int> times = ourScheduler->getAllTimes();
        std::set<long int>::iterator it;
        
        vector<Capability*>::iterator capIt;
        vector<Capability*> myCapabilitySet = evaluation->getAllSearchObjectiveCapabilitiesPtr();
        
        for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
        {
            (*capIt)->tempStatus = 0.0;
        }
        
        vector<long int> timeSorted;
        
        for (it = times.begin(); it != times.end(); ++it)
        {
            timeSorted.push_back(*it);
        }
        
        std::sort(timeSorted.begin(),timeSorted.end());
        
        for (int i = 0; i < timeSorted.size() - 1; i++)
        {
            //std::cout << timeSorted.at(i) << std::endl;
            ourScheduler->setToTime(timeSorted.at(i));
            evaluation->evaluate();
            
            long int timePassed = timeSorted.at(i+1) - timeSorted.at(i);
            for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
            {
                if ((*capIt)->startTime <= timeSorted.at(i) && (*capIt)->stopTime >= timeSorted.at(i+1))
                {
                    (*capIt)->tempStatus = (*capIt)->tempStatus + (double)((double)timePassed*((*capIt)->status));
                }
            }
        }
        
        for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
        {
            (*capIt)->tempStatus = (*capIt)->tempStatus / (double)((*capIt)->stopTime - (*capIt)->startTime);
        }
    }
    
    
    //Read In Results
    vector<Capability*>::iterator capIt;
    vector<Capability*> myCapabilitySet = evaluation->getAllSearchObjectiveCapabilitiesPtr();
    
    //Capabilities
    for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
    {
        if (throughLife == false)
        {
            double score = (*capIt)->status;
            solution->scores.push_back(score);
        }
        else
        {
            double score = (*capIt)->tempStatus;
            solution->scores.push_back(score);
        }
    }
    
    //Costs
    set<string>::iterator it;
    set<string> mySet = evaluation->getAllCosts();
    
    for (it = mySet.begin(); it != mySet.end(); it++)
    {
        double score = evaluation->getCost(*it);
        score *= evaluation->costDesires.find(*it)->second;
        
        solution->scores.push_back(score);
    }
}

void geneticAlgorithm::ensureValid(genoType *solution)
{
    //Remove Duplications
    for (int i = 0; i < solution->sourceComponent.size(); i++)
    {
        for (int j = 0; j < solution->sourceComponent.size(); j++)
        {
            if (i < j && solution->sourceComponent.at(i) == solution->sourceComponent.at(j) && solution->capability.at(i) == solution->capability.at(j) && solution->targetComponent.at(i) == solution->targetComponent.at(j))
            {
                solution->sourceComponent.erase(solution->sourceComponent.begin() + j);
                solution->capability.erase(solution->capability.begin() + j);
                solution->targetComponent.erase(solution->targetComponent.begin() + j);
                solution->componentGaNumber.erase(solution->componentGaNumber.begin() + j);
            }
        }
    }
    
    //Reuse Limit
    for (int i = 0; i < evaluation->evaluateSet.size(); i++)
    {
        mObject *myObject = evaluation->evaluateSet.at(i);
        if (myObject->typeString == "CapabilityProvision")
        {
            CapabilityProvision *myCapProv = (CapabilityProvision*) myObject;
            if (myCapProv->reuse > 0) //Limited Usage
            {
                Component *myComponent = (Component*) myObject->component;
                
                int countReuse = 0;
                for (int j = 0; j < solution->sourceComponent.size(); j++)
                {
                    if (solution->sourceComponent.at(j) == myComponent->name && solution->capability.at(j) == myCapProv->name)
                    {
                        countReuse++;
                        
                        if (countReuse > myCapProv->reuse)
                        {
                            solution->sourceComponent.erase(solution->sourceComponent.begin() + j);
                            solution->capability.erase(solution->capability.begin() + j);
                            solution->targetComponent.erase(solution->targetComponent.begin() + j);
                            solution->componentGaNumber.erase(solution->componentGaNumber.begin() + j);
                            j--;
                        }
                    }
                }
            }
        }
    }
    
}

void geneticAlgorithm::repairSolution(genoType *solution)
{
    geneticAlgorithm::repairSolution(solution, true);
}

//Repairs solutions after crossover and mutation
void geneticAlgorithm::repairSolution(genoType *solution, bool check)
{
    //Reset State
    evaluation->reset();
    
    //Add All Upgrades
    for (int i = 0; i < solution->upgradeSourceComponent.size(); i++)
    {
        evaluation->setUpgrade(solution->upgradeSourceComponent.at(i),solution->upgradeName.at(i),solution->upgradeTargetComponent.at(i));
    }
    
    //Add All Links
    for (int i = 0; i < solution->sourceComponent.size(); i++)
    {
        evaluation->createLink(solution->sourceComponent.at(i),solution->capability.at(i),solution->targetComponent.at(i));
    }
    
    //Check for unsatisfied capabilities
    for (int i = 0; i < evaluation->evaluateSet.size(); i++)
    {
        mObject *currentObject = evaluation->evaluateSet.at(i);
        if (currentObject->typeString.compare("Capability") == 0)
        {
            Capability *ourCapability = (Capability*) currentObject;
            if ((ourCapability->enabled == true or check == false) && (ourCapability->accumulation != NULL or ourCapability->satisfiedBy.size() == 0))
            {
                //Auto-join if possible
                
                for (int j = 0; j < evaluation->evaluateSet.size(); j++)
                {
                    mObject *currentObjectB = evaluation->evaluateSet.at(j);
                    if (ourCapability->name == currentObjectB->name && currentObjectB->typeString.compare("CapabilityProvision") == 0)
                    {
                        CapabilityProvision *ourCapabilityProvision = (CapabilityProvision*) currentObjectB;
                        if (ourCapabilityProvision->satisfies.size() < ourCapabilityProvision->reuse or ourCapabilityProvision->satisfies.size() == 0 or ourCapabilityProvision->reuse == 0)
                        {
                            if (ourCapabilityProvision->component->enabled == true or check == false)
                            {
                                //std::cout << "Suggestion: Join " << ourCapability->name << " to " << ourCapabilityProvision->name << std::endl;
                                
                                std::string sourceComponent = ourCapabilityProvision->component->name;
                                std::string capability = ourCapability->name;
                                std::string targetComponent;
                                
                                solution->sourceComponent.push_back(sourceComponent);
                                solution->capability.push_back(capability);
                                
                                if (ourCapability->component != NULL)
                                {
                                    targetComponent = ourCapability->component->name;
                                }
                                else
                                {
                                    targetComponent = "scenario";
                                }
                                solution->targetComponent.push_back(targetComponent);
                                
                                int gaNumber;
                                gaNumber = ourGeneIndex.getNumber(sourceComponent, capability, targetComponent);
                                
                                solution->componentGaNumber.push_back(gaNumber);
                                
                                ourCapability->satisfiedBy.push_back(ourCapabilityProvision);
                                ourCapabilityProvision->satisfies.push_back(ourCapability);
                                
                                if (ourCapability->accumulation==NULL)
                                {
                                    break; //Once only
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
}

#endif
