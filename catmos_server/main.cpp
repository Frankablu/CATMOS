// CATMOS Server.cpp : Defines the entry point for the console application.
//

#include <iostream>
#include <vector>
#include "main.h"
#include "mobject.cpp"
#include "capability.cpp"
#include "component.cpp"
#include "cost.cpp"
#include "evaluator.cpp"
#include "measurement.cpp"
#include "qvd.cpp"
#include "problem.cpp"
#include "probleminstance.cpp"
#include "network.cpp"
#include "scheduleBudget.cpp"

int listeningPortNumber;

scheduleBudget *ourBudget;
luascripts* myLuaScripts;

//Lua Intergration
std::vector<Measurement*> measurements;
Component* currentComponent;
Evaluator *globalEvaluation;
std::string dNumberToString(double number);

int getMeasure(lua_State *L);
int getGlobalMeasure(lua_State *L);
int getScenarioMeasure(lua_State *L);
int getAllMeasures(lua_State *L);
int countComponent(lua_State *L);
int getCapability(lua_State *L);
int canUseCapability(lua_State *L);

int getAllMeasures(lua_State *L)
{
    //std::cout << "Received Call To Global Measure" << std::endl;
    int argc = lua_gettop(L);
    
    if (argc == 1)
    {
        //Find the wanted measurement
        std::string wantedMeasurement = lua_tostring(L, 1);
        
        Measurement* searching;
        int k = 0;
        
        //Need to push table of values
        lua_newtable(L);
        
        for (int i = 0; i < measurements.size(); i++)
        {
            searching = measurements.at(i);
            //std::cout << searching->name << std::endl;
            //std::cout << searching->enabled << std::endl;
            //std::cout << searching->typeString << std::endl;
            
            if (searching->name == wantedMeasurement && searching->enabled == true && searching->component != NULL && searching->component->enabled == true)
            {
                //std::cout << searching->providedValue << std::endl;
                
                if (searching->qualitative == false)
                {
                    lua_pushnumber(L,k);
                    lua_pushnumber(L,searching->providedValue);
                    lua_settable(L, -3);
                    
                    k++;
                }
                else
                {
                    for (int j = 0; j < searching->providedValues.size(); j++)
                    {
                        std::string value = searching->providedValues.at(j);
                        
                        lua_pushnumber(L,k);
                        lua_pushstring(L,value.c_str());
                        
                        lua_settable(L, -3);
                        
                        k++;
                    }
                    
                }
                
            }
        }
        
        return 1;
    }
    
    return 0; //Invalid Call
}

int getGlobalMeasure(lua_State *L)
{
    //std::cout << "Received Call To Global Measure" << std::endl;
    int argc = lua_gettop(L);
    
    if (argc == 1)
    {
        //Find the wanted measurement
        std::string wantedMeasurement = lua_tostring(L, 1);
        
        Measurement* searching;
        
        bool sentResult = false;
        
        for (int i = 0; i < measurements.size(); i++)
        {
            searching = measurements.at(i);
            //std::cout << searching->name << std::endl;
            //std::cout << searching->enabled << std::endl;
            //std::cout << searching->typeString << std::endl;
            
            if (searching->name == wantedMeasurement && searching->enabled == true && ((searching->component != NULL && searching->component->enabled == true && searching->component->status > 0.0) || searching->component == NULL) && (searching->capability == NULL || ((Capability*)searching)->status > 0.0))
            {
                //std::cout << searching->providedValue << std::endl;
                
                if (searching->qualitative == false)
                {
                    lua_pushnumber(L,searching->providedValue);
                    sentResult = true;
                }
                else
                {
                    //Need to push table of values
                    lua_newtable(L);
                    
                    for (int j = 0; j < searching->providedValues.size(); j++)
                    {
                        std::string value = searching->providedValues.at(j);
                        
                        lua_pushnumber(L,j);
                        lua_pushstring(L,value.c_str());
                        
                        lua_settable(L, -3);
                    }
                    
                    sentResult = true;
                }
                
                break;
            }
        }
        
        if (sentResult == false)
        {
            lua_pushnumber(L,0); //Most Neutral Value That Can Be Returned
        }
        
        return 1;
    }
    
    return 0; //Invalid Call
}

int getScenarioMeasure(lua_State *L)
{
    //std::cout << "Received Call To Global Measure" << std::endl;
    int argc = lua_gettop(L);
    
    if (argc == 1)
    {
        //Find the wanted measurement
        std::string wantedMeasurement = lua_tostring(L, 1);
        
        Measurement* searching;
        
        bool sentResult = false;
        
        for (int i = 0; i < measurements.size(); i++)
        {
            searching = measurements.at(i);
            //std::cout << searching->name << std::endl;
            //std::cout << searching->enabled << std::endl;
            //std::cout << searching->typeString << std::endl;
            
            if (searching->name == wantedMeasurement && searching->enabled == true && searching->component == NULL && ((Capability*)searching)->status > 0.0)
            {
                //std::cout << searching->providedValue << std::endl;
                
                if (searching->qualitative == false)
                {
                    lua_pushnumber(L,searching->providedValue);
                    sentResult = true;
                }
                else
                {
                    //Need to push table of values
                    lua_newtable(L);
                    
                    for (int j = 0; j < searching->providedValues.size(); j++)
                    {
                        std::string value = searching->providedValues.at(j);
                        
                        lua_pushnumber(L,j);
                        lua_pushstring(L,value.c_str());
                        
                        lua_settable(L, -3);
                    }
                    
                    sentResult = true;
                }
                
                break;
            }
        }
        
        if (sentResult == false)
        {
            lua_pushnumber(L,0); //Most Neutral Value That Can Be Returned
        }
        
        return 1;
    }
    
    return 0; //Invalid Call
}

int getMeasure(lua_State *L)
{
    int argc = lua_gettop(L);
    
    if (argc == 1)
    {
        //Create Local Measurement Table
        std::vector<Measurement*> localMeasurements;
        
        if (currentComponent != NULL && currentComponent->enabled == true) //Go Through Components Provisions and Dependencies
        {
            CapabilityProvision *searchProv;
            for (int i = 0; i < currentComponent->provides.size(); i++)
            {
                searchProv = currentComponent->provides.at(i);
                
                Measurement* addingMeasurement;
                for (int j = 0; j < searchProv->measuredBy.size(); j++)
                {
                    addingMeasurement = searchProv->measuredBy.at(j);
                    localMeasurements.push_back(addingMeasurement);
                }
            }
            
            Capability *searchDep;
            for (int i = 0; i < currentComponent->requires.size(); i++)
            {
                searchDep = currentComponent->requires.at(i);
                
                Measurement* addingMeasurement;
                for (int j = 0; j < searchDep->measuredBy.size(); j++)
                {
                    addingMeasurement = searchDep->measuredBy.at(j);
                    localMeasurements.push_back(addingMeasurement);
                }
            }
        }
        else
        {
            localMeasurements = measurements;
        }
        
        //Find the wanted measurement
        std::string wantedMeasurement = lua_tostring(L, 1);
        Measurement* searching;
        
        //std::cout << "Call Start" << std::endl;
        bool sentResult = false;
        
        for (int i = 0; i < localMeasurements.size(); i++)
        {
            searching = localMeasurements.at(i);
            //std::cout << searching->name << std::endl;
            //std::cout << searching->enabled << std::endl;
            //std::cout << searching->typeString << std::endl;
            if (searching->name == wantedMeasurement && searching->enabled == true)
            {
                if (searching->qualitative == false)
                {
                    //std::cout << searching->typeString << std::endl;
                    lua_pushnumber(L,searching->providedValue);
                    sentResult = true;
                }
                else
                {
                    //Need to push table of values
                    lua_newtable(L);
                    
                    for (int j = 0; j < searching->providedValues.size(); j++)
                    {
                        std::string value = searching->providedValues.at(j);
                        
                        lua_pushnumber(L,j);
                        lua_pushstring(L,value.c_str());
                        
                        lua_settable(L, -3);
                    }
                    
                    sentResult = true;
                }
                
                break;
            }
        }
        
        if (sentResult == false)
        {
            lua_pushnumber(L,0); //Most Neutral Value That Can Be Returned
        }
        
        
        return 1;
    }
    
    return 0; //Invalid Call
}

int countComponent(lua_State *L)
{
    int argc = lua_gettop(L);
    
    if (argc == 1)
    {
        std::string countingComponent = lua_tostring(L, 1);
        int count = 0;
        
        for (int i = 0; i < globalEvaluation->evaluateSet.size(); i++)
        {
            if (globalEvaluation->evaluateSet.at(i)->name == countingComponent && 
                globalEvaluation->evaluateSet.at(i)->enabled == true &&
                globalEvaluation->evaluateSet.at(i)->status > 0.0)
            {
                count++;
            }
        }
        
        lua_pushnumber(L,count);
        
        return 1;
    }
    
    return 0; //Invalid Call
}

int getCapability(lua_State *L)
{
    //std::cout << "Received Call To Global Measure" << std::endl;
    int argc = lua_gettop(L);
    
    if (argc == 1)
    {
        //Find the wanted capability
        std::string wantedCapability = lua_tostring(L, 1);
        
        for (int i = 0; i < globalEvaluation->evaluateSet.size(); i++)
        {
            mObject* currentObject = globalEvaluation->evaluateSet.at(i);
            
            if (currentObject->name.compare(wantedCapability) == 0 && currentObject->typeString.compare("Capability") == 0)
            {
                double statusNumber = currentObject->status - 1.0;
                if (statusNumber < 0.0)
                {
                    statusNumber = 0.0;
                }
                if (statusNumber > 1.0)
                {
                    statusNumber = 1.0;
                }
                if (isnan(statusNumber))
                {
                    statusNumber = 0;
                }
                lua_pushnumber(L,statusNumber);
                return 1;
            }
        }
    }
    
    return 0; //Invalid Call
}

int canUseCapability(lua_State *L)
{
    //std::cout << "Received Call To Global Measure" << std::endl;
    int argc = lua_gettop(L);
    
    if (argc == 1)
    {
        //Find the wanted capability
        std::string wantedCapability = lua_tostring(L, 1);
        
        for (int i = 0; i < globalEvaluation->evaluateSet.size(); i++)
        {
            mObject* currentObject = globalEvaluation->evaluateSet.at(i);
            
            if (currentObject->name.compare(wantedCapability) == 0 && currentObject->typeString.compare("Capability") == 0)
            {
                if (currentObject->status >= 1.0)
                {
                    lua_pushnumber(L,1.0);
                }
                else
                {
                    lua_pushnumber(L,0.0);
                }
                return 1;
            }
        }
    }
    
    return 0; //Invalid Call
}

//Current Goal - Create A Quick Solution Evaluater
using namespace std;

int main(int argc, char** argv)
{
    listeningPortNumber = 11100;
    
    if (argc > 1)
    {
        listeningPortNumber = atoi(argv[1]);
    }
    
    currentComponent = NULL;
    myLuaScripts = new luascripts();
    
    Problem *myProblem = new Problem();
    Evaluator *evaluation = new Evaluator();
    myProblem->evaluation = evaluation;
    
    //myProblem->load();
    
    problemInstance *myProblemInstance = new problemInstance();
    myProblemInstance->evaluation = myProblem->evaluation;
    
    //myProblemInstance->loadInstance();
    
    //myProblemInstance->evaluation->evaluate();
    
    //Lua Test
    //luascripts *myLuaScripts = new luascripts();
    //myLuaScripts->run("print(getGlobalMeasure(\"SupportLevel\")[0])");
    
    cout << "Output" << endl;
    
    vector<Capability>::iterator capIt;
    vector<Capability> myCapabilitySet = evaluation->getAllSearchObjectiveCapabilities();
    
    for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
    {
        std::cout << ((*capIt).name) << std::endl;
        std::cout << (*capIt).status << std::endl;
    }
    
    set<string>::iterator it;
    set<string> mySet = evaluation->getAllCosts();
    
    for (it = mySet.begin(); it != mySet.end(); it++)
    {
        std::cout << *it << std::endl;
        std::cout << evaluation->getCost(*it) << std::endl;
    }
    
    //Networking Code
    network *myNetwork = new network();
    myNetwork->evaluation = evaluation;
    myNetwork->listeningServer();
    
    return 0;
}

std::string dNumberToString(double number)
{
    string result;
    ostringstream convert;
    convert << number;
    result = convert.str();
    return result;
}
