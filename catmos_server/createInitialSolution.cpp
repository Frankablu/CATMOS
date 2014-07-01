//
//  createInitialSolution.cpp
//  catmos
//
//  Created by Frank on 03/05/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#ifndef INITIAL_HEADER
#define INITIAL_HEADER

#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>
#include <stdlib.h>
#include "genotype.cpp"
#include "evaluator.cpp"

extern int listeningPortNumber;

//This requires prolog
//Prolog to C/C++ interface code is a bad joke
//Hence we are calling through the shell

class createInitialSolution
{
public:
    Evaluator *evaluation;
    bool runOnce;
    
    createInitialSolution()
    {
        runOnce = true;
    }
    
    genoType* createSolution()
    {
        
        std::string filename;
        filename.append("union");
        filename.append(numberToString(listeningPortNumber));
        filename.append(".pl");
        
        //Only need to create the prolog script once for each problem
        if (runOnce)
        {
            runOnce = false;
        
        //Output Prolog File
        ofstream myoutputfile;
        myoutputfile.open(filename.c_str());
        
        //First Need To Output The Desired Capabilities
        myoutputfile << "desiredCapabilities([";
        
            
        std::vector<Capability*> desiredCapabilities = evaluation->getAllDesiredCapabilities();
            
        for (int i = 0; i < desiredCapabilities.size(); i++)
        {
            Capability *currentCap = desiredCapabilities.at(i);
            int repeat = 1;
            
            if (currentCap->accumulation != NULL)
            {
                repeat = 2;
            //    repeat = currentCap->accumulation->benchmarkValue;
            }
            
            for (int j = 0; j < repeat; j++)
            {
                myoutputfile << "\'";
                myoutputfile << currentCap->name;
                myoutputfile << "\'";
                if (i < desiredCapabilities.size() - 1 || j < repeat - 1)
                {
                    myoutputfile << ",";
                }
            }
        }
        
        myoutputfile << "])." << std::endl << std::endl;
        
        myoutputfile << std::endl;
            
        //Capability Decomposes
        myoutputfile << "capabilityDecomposes(\'\',\' \')." << std::endl;
        
        std::vector<Capability> allCapabilities = evaluation->getAllCapabilities();
        for (int i = 0; i < allCapabilities.size(); i++)
        {
            if (allCapabilities.at(i).decomposes.size() > 0)
            {
                myoutputfile << "capabilityDecomposes(\'" << allCapabilities.at(i).name << "\',[";
                
                for (int j = 0; j < allCapabilities.at(i).decomposes.size(); j++)
                {
                    int repeat = 1;
                    
                    if (allCapabilities.at(i).decomposes.at(j)->accumulation != NULL)
                    {
                        repeat = 2;
                    //    repeat = allCapabilities.at(i).decomposes.at(j)->accumulation->benchmarkValue;
                    }
                    
                    for (int k = 0; k < repeat; k++)
                    {
                        myoutputfile << "\'" << allCapabilities.at(i).decomposes.at(j)->name << "\'";
                        if (j < allCapabilities.at(i).decomposes.size()-1 || k < repeat - 1)
                        {
                            myoutputfile << ",";
                        }
                    }
                }
                
                myoutputfile << "])." << std::endl << std::endl;
                
            }
        }
        
        myoutputfile << std::endl;
            
        //List All Component Names
        for (int i = 0; i < evaluation->evaluateSet.size(); i++)
        {
            if (evaluation->evaluateSet.at(i)->typeString == "Component")
            {
                myoutputfile << "component(\'" << evaluation->evaluateSet.at(i)->name << "\')." << std::endl;
            }
        }
        
        myoutputfile << std::endl;
        
        //Provides Capabilities
        for (int i = 0; i < evaluation->evaluateSet.size(); i++)
        {
            if (evaluation->evaluateSet.at(i)->typeString == "Component")
            {
                Component *currentComponent = (Component*)evaluation->evaluateSet.at(i);
                
                myoutputfile << "providesCapability(\'" << currentComponent->name << "\',[";
                
                for (int j = 0; j < currentComponent->provides.size(); j++)
                {
                    myoutputfile << "\'" << currentComponent->provides.at(j)->name << "\'";
                    if (j < currentComponent->provides.size()-1)
                    {
                        myoutputfile << ",";
                    }
                }
                
                myoutputfile << "],\'blank\')." << std::endl;
                
            }
        }
        
        myoutputfile << std::endl;
        
        //Provides Capabilities With Upgrades
        for (int i = 0; i < evaluation->evaluateSet.size(); i++)
        {
            if (evaluation->evaluateSet.at(i)->typeString == "Component")
            {
                Component *currentComponent = (Component*)evaluation->evaluateSet.at(i);
                for (int z = 0; z < currentComponent->upgrades.size(); z++)
                {
                    CapabilityUpgrade *currentCapabilityUpgrade = (CapabilityUpgrade*)currentComponent->upgrades.at(z);
                    
                    myoutputfile << "providesCapability(\'" << currentCapabilityUpgrade->targetComponent << "\',[";
                    
                    for (int j = 0; j < currentCapabilityUpgrade->add.size(); j++)
                    {
                        myoutputfile << "\'" << currentCapabilityUpgrade->add.at(j)->name << "\'";
                        if (j < currentCapabilityUpgrade->add.size()-1 || currentCapabilityUpgrade->modify.size() > 0)
                        {
                            myoutputfile << ",";
                        }
                    }
                    
                    for (int j = 0; j < currentCapabilityUpgrade->modify.size(); j++)
                    {
                        myoutputfile << "\'" << currentCapabilityUpgrade->modify.at(j)->name << "\'";
                        if (j < currentCapabilityUpgrade->modify.size()-1)
                        {
                            myoutputfile << ",";
                        }
                    }
                    
                    myoutputfile << "],";
                    
                    myoutputfile << "[upgrade(\'" << currentCapabilityUpgrade->targetComponent << "\',\'" << currentCapabilityUpgrade->name << "\',\'" << currentComponent->name << "\'),\'" << currentComponent->name << "\'])." << std::endl;
                }
            }
        }
        
        //Requires Capabilities
        for (int i = 0; i < evaluation->evaluateSet.size(); i++)
        {
            if (evaluation->evaluateSet.at(i)->typeString == "Component")
            {
                Component *currentComponent = (Component*)evaluation->evaluateSet.at(i);
                
                myoutputfile << "requiresCapability(\'" << currentComponent->name << "\',[";
                
                for (int j = 0; j < currentComponent->requires.size(); j++)
                {
                    int repeat = 1;
                    if (currentComponent->requires.at(j)->accumulation != NULL)
                    {
                        repeat = 2;
                    //    repeat = currentComponent->requires.at(j)->decomposes.at(j)->accumulation->benchmarkValue;
                    }
                    
                    for (int k = 0; k < repeat; k++)
                    {
                        myoutputfile << "\'" << currentComponent->requires.at(j)->name << "\'";
                        
                        if (j < currentComponent->requires.size()-1 || k < repeat - 1)
                        {
                            myoutputfile << ",";
                        }
                    }
                }
                
                myoutputfile << "])." << std::endl;
                
            }
        }
        
        myoutputfile << std::endl;
        
        myoutputfile
        << "member(X,[X|_]).\n"
        << "member(X,[_|T]) :- member(X,T).\n"
        << "\n"
        << "canProvideCap(Comp,Cap,Acc) :- findall(C,canProvideCapNormal(C,Cap,_),R),random_member(Comp,R),findall(Upgrade,canProvideCapNormal(Comp,Cap,Upgrade),Upgrades),random_member(Upgrade,Upgrades),createUpgrade(Upgrade,Acc).\n"
        << "canProvideCapNormal(Comp,Cap,Upgrade) :- providesCapability(Comp,List,Upgrade), member(Cap,List).\n"
        << "\n"
        << "createUpgrade(\'blank\',[]).\n"
        << "createUpgrade([H,H2|_],Acc) :- assert(H), canSatComp(H2,Acc).\n"
        << "\n"
        << "canSatCap(Cap,Acc) :- canSatCap(Cap,Acc,scenario)."
        << "\n"
        << "canSatCap(Cap,Acc,scenario) :- capabilityDecomposes(Cap,DCaps), canSatCaps(DCaps,Acc,scenario).\n"
        << "canSatCap(Cap,[(DComp,Cap,Comp),AccH|AccT],DComp) :- canProvideCap(Comp,Cap,AccH), canSatComp(Comp,AccT).\n"
        << "\n"
        << "canSatComp(Comp,AccT) :- requiresCapability(Comp,Caps), canSatCaps(Caps,AccT,Comp).\n"
        << "\n"
        << "canSatCaps([],[],_).\n"
        << "canSatCaps([Cap|T],[AccH|AccT],Comp) :- canSatCap(Cap,AccH,Comp), canSatCaps(T,AccT,Comp).\n"
        << "\n"
        << "canMeetScenario(Acc) :- abolish(upgrade/3), dynamic(upgrade/3), desiredCapabilities(X), canSatCaps(X,Acc,scenario).\n"
        << "getUpgrades(R) :- findall((A,B,C),upgrade(A,B,C),R).\n"
        << "\n"
        << "getSolution :- canMeetScenario(X), open('output" << numberToString(listeningPortNumber) << ".txt',write,Stream),write(Stream,X),nl(Stream),getUpgrades(Y),write(Stream,Y),close(Stream),halt.\n";
        myoutputfile.close();
        }
        
        //Create Solution Via Prolog
        std::string prologInvokeString;

		#ifdef _WIN32
            //Windows
			prologInvokeString.append("cmd /C \"\"C:\\Program Files\\swipl\\bin\\swipl.exe\"\" ");
            prologInvokeString.append(" -g getSolution ");
            prologInvokeString.append(filename);
        #else
        #ifdef __APPLE__
            //Mac OS X
			prologInvokeString.append("/opt/local/bin/swipl -l ");
            prologInvokeString.append(filename);
            prologInvokeString.append(" -g getSolution ");
        #else
            //Linux
            prologInvokeString.append("/usr/bin/swipl -l ");
            prologInvokeString.append(filename);
            prologInvokeString.append(" -g getSolution ");
        #endif
		#endif
        
        system(prologInvokeString.c_str());
        
        //This writes out to a file called "output.txt"
        
        //Read in the file output.txt to get a solution
        std::string solution;
        std::string upgrades;
        
        std::string outputfilename;
        outputfilename.append("output");
        outputfilename.append(numberToString(listeningPortNumber));
        outputfilename.append(".txt");
        
        std::ifstream myfile (outputfilename.c_str());
        if (myfile.is_open())
        {
            getline (myfile,solution);
            getline (myfile,upgrades);
        }
        myfile.close();
        
        //Now we clean out all the prolog junk, leaving comma seperates values in sets of three
        for (int cleaning = 0; cleaning < solution.size(); cleaning++)
        {
            if (solution.at(cleaning) == '[' || solution.at(cleaning) == ']' || solution.at(cleaning) == '(' || solution.at(cleaning) == ')' || solution.at(cleaning) == '.' || solution.at(cleaning) == '[') 
            {
                solution.erase(solution.begin()+cleaning);
                cleaning--;
            }
        }
        
        for (int cleaning = 0; cleaning < solution.size(); cleaning++)
        {
            if (cleaning < solution.size() - 1 && solution.at(cleaning) == ',' && solution.at(cleaning+1) == ',')
            {
                solution.erase(solution.begin()+cleaning);
                cleaning--;
            }
        }
        
        for (int cleaning = 0; cleaning < solution.size(); cleaning++)
        {
            if (cleaning < solution.size() - 1 && solution.at(cleaning) == ',' && solution.at(cleaning+1) == ' ')
            {
                solution.erase(solution.begin()+cleaning+1);
                cleaning--;
            }
        }
        
        while (solution.size() > 0 && solution.at(solution.size() -1) == ',')
        {
            solution.erase(solution.begin()+solution.size()-1);
        }
        
        while (solution.size() > 0 && solution.at(0) == ' ')
        {
            solution.erase(solution.begin());
        }
        
        for (int cleaning = 0; cleaning < upgrades.size(); cleaning++)
        {
            if (upgrades.at(cleaning) == '[' || upgrades.at(cleaning) == ']' || upgrades.at(cleaning) == '(' || upgrades.at(cleaning) == ')' || upgrades.at(cleaning) == '.' || upgrades.at(cleaning) == '[') 
            {
                upgrades.erase(upgrades.begin()+cleaning);
                cleaning--;
            }
        }
        
        for (int cleaning = 0; cleaning < upgrades.size(); cleaning++)
        {
            if (cleaning < upgrades.size() - 1 && upgrades.at(cleaning) == ',' && upgrades.at(cleaning+1) == ',')
            {
                upgrades.erase(upgrades.begin()+cleaning);
                cleaning--;
            }
        }
        
        for (int cleaning = 0; cleaning < upgrades.size(); cleaning++)
        {
            if (cleaning < upgrades.size() - 1 && upgrades.at(cleaning) == ',' && upgrades.at(cleaning+1) == ' ')
            {
                upgrades.erase(upgrades.begin()+cleaning+1);
                cleaning--;
            }
        }
        
        while (upgrades.size() > 0 && upgrades.at(upgrades.size() -1) == ',')
        {
            upgrades.erase(upgrades.begin()+upgrades.size()-1);
        }
        
        while (upgrades.size() > 0 && upgrades.at(0) == ' ')
        {
            upgrades.erase(upgrades.begin());
        }
        
        //std::cout << solution << std::endl;
        //std::cout << upgrades << std::endl;
        
        //Comma Seperates Values Are Now In Solution & Upgrades String
        
        genoType *newSolution = new genoType();
        std::vector<std::string> allLinks = csvSplit2(solution);
        std::vector<std::string> allUpgrades = csvSplit2(upgrades);
        
        //Get existing components
        std::vector<std::string> existingComponents = evaluation->getAllExistingComponents();
        int currentExisting = -1;
        int currentAcquirable = 1;
        
        for (int i = 0; i < allLinks.size() && allLinks.size() > 1; i+=3)
        {
            newSolution->sourceComponent.push_back(allLinks.at(i+2));
            newSolution->capability.push_back(allLinks.at(i+1));
            newSolution->targetComponent.push_back(allLinks.at(i));
            
            bool existing = false;
            
            for (int existingComp = 0; existingComp < existingComponents.size(); existingComp++)
            {
                if (allLinks.at(i+2) == existingComponents.at(existingComp))
                {
                    existing = true;
                }
            }
            
            if (false) //Modified Code - Mark All As Acquirable As Far As The GA is Concerned - Old Variable Existing
            {
                newSolution->componentGaNumber.push_back(currentExisting);
                currentExisting--;
            }
            else
            {
                newSolution->componentGaNumber.push_back(currentAcquirable);
                currentAcquirable++;
            }
        }
        
        bool attached;
        
        for (int i = 0; i < allUpgrades.size() && allUpgrades.size() > 1; i+=3)
        {
            newSolution->upgradeSourceComponent.push_back(allUpgrades.at(i+2));
            newSolution->upgradeName.push_back(allUpgrades.at(i+1));
            newSolution->upgradeTargetComponent.push_back(allUpgrades.at(i));
            
            //std::cout << allUpgrades.at(i+2) << " " << allUpgrades.at(i+1) << " " << allUpgrades.at(i) << std::endl;
            
            
            attached = false;
            //Tie upgrades to the providing source component
            for (int j = 0; j < newSolution->sourceComponent.size(); j++)
            {
                //std::cout << newSolution->sourceComponent.at(j) << std::endl;
                if (newSolution->sourceComponent.at(j) == allUpgrades.at(i+2))
                {
                    newSolution->upgradeGaNumber.push_back(newSolution->componentGaNumber.at(j));
                    attached = true;
                    break;
                }
            }
            if (attached == false)
            {
                newSolution->upgradeGaNumber.push_back(currentAcquirable);
                currentAcquirable++;
            }
        }
        
        std::string source;
        std::string capability;
        std::string target;
        
        std::string sourceB;
        std::string capabilityB;
        std::string targetB;
        
        //Reuse Handling - Delete Repeated Links
        for (int i = 0; i < newSolution->sourceComponent.size(); i++)
        {
            source = newSolution->sourceComponent.at(i);
            capability = newSolution->capability.at(i);
            target = newSolution->targetComponent.at(i);
            
            for (int j = 0; j < newSolution->sourceComponent.size(); j++)
            {
                if (i != j)
                {
                    sourceB = newSolution->sourceComponent.at(j);
                    capabilityB = newSolution->capability.at(j);
                    targetB = newSolution->targetComponent.at(j);
                    
                    if (source == sourceB && capability == capabilityB && target == targetB)
                    {
                        newSolution->componentGaNumber.at(j) = 0;
                    }
                }
            }
        }
        
        for (int i = 0; i < newSolution->sourceComponent.size(); i++)
        {
           if (newSolution->componentGaNumber.at(i) == 0)
           {
               newSolution->sourceComponent.erase(newSolution->sourceComponent.begin() + i);
               newSolution->capability.erase(newSolution->capability.begin() + i);
               newSolution->targetComponent.erase(newSolution->targetComponent.begin() + i);
               newSolution->componentGaNumber.erase(newSolution->componentGaNumber.begin() + i);
               i--;
           }
        }
        
        
        return newSolution;
    }
    
    std::vector<std::string> csvSplit2(std::string input)
    {
        std::vector<std::string> output;
        std::istringstream f(input);
        std::string entry;
        
        while (std::getline(f, entry, ',')) {
            output.push_back(entry);
        }
        
        return output;
    }
    
    std::string numberToString(int number)
    {
        string result;
        ostringstream convert;
        convert << number;
        result = convert.str();
        return result;
    }

};

#endif

