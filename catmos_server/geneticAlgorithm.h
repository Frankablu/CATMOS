//
//  geneticAlgorithm.h
//  catmos
//
//  Created by Frank on 14/05/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#ifndef catmos_geneticAlgorithm_h
#define catmos_geneticAlgorithm_h

#include <iostream>
#include "genotype.cpp"
#include "createInitialSolution.cpp"
#include "evaluator.cpp"
#include "scheduler.cpp"
#include "geneIndex.cpp"
#include "networkConnection.cpp"
#include <cstdlib>
#include <vector>
#include <math.h>

//Genetic Algorithm Control
class geneticAlgorithm
{
public:
    int populationSize;
    int generationCount;
    
    int creatingCount;
    std::vector<networkConnection*> connections;
    
    std::vector<genoType*> searchPopulation;
    
    createInitialSolution initialSolutionCreater;
    bool throughLife;
    scheduler *ourScheduler;
    Evaluator *evaluation;
    
    geneticAlgorithm();
    geneticAlgorithm(int pop, int gen);
    
    geneIndex ourGeneIndex;
    
    int newPopulationMembers;
    void createInitialPopulation();
    void performGARound();
        
    genoType* getBredSolution();
    genoType* getInitialPopulationMember();
    bool remoteStart;
    
    std::vector<genoType*> getParetoFront();
    void createParetoFrontScores();
    
    void evaluateSolution(genoType *solution);
    void ensureValid(genoType *solution);
    void repairSolution(genoType *solution);
    void repairSolution(genoType *solution, bool check);
    
    void setConnections(std::vector<networkConnection*> ourConnections);
    
    void cleanUpMemory();
    
};


#endif
