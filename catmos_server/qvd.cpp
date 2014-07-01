//
//  qvd.cpp
//  catmos
//
//  Created by Frank on 12/03/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#include <iostream>
#include <map>
#include <vector>
#include <string>

#ifndef QVDCode
#define QVDCode

using namespace std;

//Some explanation
//This class has the job of saying whether a string is greater or less than another string
//This is in some context

class qvd
{
public:
    map<string,vector<string> > stringMap;

    qvd()
    {
        
    }
    
    void addGreaterThan(string greaterThan, string otherString)
    {
        vector<string> newVector;
        newVector.push_back(otherString);
        
        if (stringMap.count(greaterThan) != 0)
        {
            vector<string> oldVector = stringMap.at(greaterThan);
            
            for (int i = 0; i < oldVector.size(); i++)
            {
                newVector.push_back(oldVector.at(i));
            }
        }
        
        stringMap.erase(greaterThan);
        stringMap.insert(pair<string,vector<string> >(greaterThan,newVector));
    }
    
    vector<string> greaterThan(string greaterThan)
    {
        if (stringMap.count(greaterThan) > 0)
        {
            vector<string> newVector(stringMap.at(greaterThan).begin(), stringMap.at(greaterThan).end());
            newVector.push_back(greaterThan);
            return newVector;
        }
        else
        {
            vector<string> singleVector;
            singleVector.push_back(greaterThan);
            return singleVector;
        }
    }
    
};

#endif


