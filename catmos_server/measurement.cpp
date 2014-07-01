//
//  measurement.cpp
//  catmos
//
//  Created by Frank on 12/03/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>
#include <vector>
#include "mobject.cpp"

#ifndef MEASUREMENT_HEADER
#define MEASUREMENT_HEADER

using namespace std;

class Measurement : public mObject
{
public:
    double providedValue;
    double benchmarkValue;
    double criticalValue;
    
    vector<string> providedValues;
    vector<string> benchmarkValues;
    vector<string> criticalValues;
    
    string script;
    bool standAlone;
    mObject *component;
    mObject *capability;
    
    bool accumulation;
    
    bool qualitative;
    
    void setStatus()
    {
        status = 0.0;
        
        if (qualitative)
        {
            //Check Critical First
            bool outerflag = true;
            for (int i = 0; i < criticalValues.size(); i++)
            {
                string currentCriticalValue = criticalValues.at(i);
                bool flag = false;
                
                for (int j = 0; j < providedValues.size(); j++)
                {
                    string currentProvidedValue = providedValues.at(j);
                    if (currentCriticalValue.compare(currentProvidedValue) == 0)
                    {
                        flag = true;
                    }
                }
                
                if (flag == false)
                {
                    outerflag = false;
                }
            }
            
            double benchmarkCount = 0.0;
            double benchmarkCountMet = 0.0;
            
            //Check Benchmark
            for (int i = 0; i < benchmarkValues.size(); i++)
            {
                string currentBenchmarkValue = benchmarkValues.at(i);
                benchmarkCount = benchmarkCount + 1.0;
                
                for (int j = 0; j < providedValues.size(); j++)
                {
                    string currentProvidedValue = providedValues.at(j);
                    if (currentBenchmarkValue.compare(currentProvidedValue) == 0)
                    {
                        benchmarkCountMet = benchmarkCountMet + 1.0;
                    }
                }
            }
            
            if (outerflag)
            {
                if (benchmarkCount > 0.0)
                {
                    status = 1.0 + benchmarkCountMet / benchmarkCount;
                }
                else
                {
                    status = 2.0;
                }
            }
        }
        else //Quantiative
        {            
            if (benchmarkValue > criticalValue)
            {
                status = 1.0 + (providedValue - criticalValue) / (benchmarkValue - criticalValue);
                
                if (providedValue < criticalValue)
                {
                    if (accumulation == false)
                    {
                        status = 0.0;
                    }
                    else
                    {
                        status = (providedValue / benchmarkValue) * 0.01; //Complicated GA related reasons
                    }
                }
            }
            else
            {
                status = 1.0 + 1.0 - (providedValue - benchmarkValue) / (criticalValue - benchmarkValue);
                
                if (providedValue > criticalValue)
                {
                    status = 0.0;
                }
            }
        }
        
        if (status > 2.0)
        {
            status = 2.0;
        }
    }
    
    Measurement(std::string setName)
    {
        name = setName;
        status = 0.0;
        typeString = std::string("Measurement");
        qualitative = false;
        standAlone = false;
        providedValue = 0;
        benchmarkValue = 0;
        criticalValue = 0;
        providedValues.clear();
        benchmarkValues.clear();
        criticalValues.clear();
        component = NULL;
        capability = NULL;
        accumulation = false;
    }
};

#endif


