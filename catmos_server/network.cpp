//
//  network.cpp
//  catmos
//
//  Created by Frank on 26/04/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#ifndef NETWORK_HEADER
#define NETWORK_HEADER

#include <iostream>
#include <boost/array.hpp>
#include <boost/asio.hpp>

#include "evaluator.cpp"
#include "scheduler.cpp"
#include "geneticAlgorithm.h"
#include "networkConnection.cpp"

extern int listeningPortNumber;
extern scheduleBudget* ourBudget;
extern luascripts* myLuaScripts;
extern std::vector<Measurement*> measurements;
extern Component* currentComponent;
extern Evaluator *globalEvaluation;

using boost::asio::ip::tcp;

class network
{
public:
    Evaluator *evaluation;
    tcp::socket *ourSocket;
    
    scheduler *ourScheduler;
    
    scheduleCapability *lastCap;
    scheduleComponent *lastComp;
    
    Capability *lastCapability;
    CapabilityProvision *lastCapabilityProvision;
    
    bool capFlag;
    bool throughLife;
    bool client;
    
    int assignCapProvMode;
    
    Component *lastComponent;
    CapabilityUpgrade *lastCapabilityUpgrade;
    
    geneticAlgorithm *ourGa;
    std::vector<genoType*> paretoFront;
    std::vector<genoType*> initialSolutions;
    
    std::vector<networkConnection*> connections;
	ofstream myoutputfile;
    
    void listeningServer()
    {
        try
        {
        boost::asio::io_service io_service;
        tcp::acceptor acceptor(io_service, tcp::endpoint(tcp::v4(), listeningPortNumber));
        
        tcp::socket socket(io_service);
        acceptor.accept(socket);
        ourSocket = &socket;
        
		std::string filename;
        filename.append("networkDebug");
        filename.append(numberToString(listeningPortNumber));
        filename.append(".txt");
		
        myoutputfile.open(filename.c_str());

        client = false;
        
        std::string message = "CATMOS Evaluation Server\n";
        boost::system::error_code ignored_error;
        boost::asio::write(socket, boost::asio::buffer(message), ignored_error);
        
        while(true)
        {
            std::string myMessageString = readLineFromNetwork();
            
            if (myMessageString == std::string("DISCONNECTED\n"))
            {
                acceptor.accept(socket);
            }
            
            //Interpet Commands
            if (messageIs(myMessageString,"reset"))
            {
                //std::cout << "Reset" << std::endl;
				if (evaluation != NULL)
				{
					evaluation->reset();
				}
                
                if (throughLife && ourScheduler != NULL)
                {
                    ourScheduler->resetLink();
                }
            }
            
            
            //Network Gentic Algorithm Stuff
            if (messageIs(myMessageString,"connectTo") && client == false)
            {
                networkConnection *newNetworkConnection = new networkConnection();
                std::string address = readLineFromNetworkCleaned();
                std::string port = readLineFromNetworkCleaned();
                newNetworkConnection->connectToInstance(address, port);
                
                connections.push_back(newNetworkConnection);
            }
            
            if (messageIs(myMessageString,"client"))
            {
                client = true;
            }
            
            if (messageIs(myMessageString,"server"))
            {
                client = false;
            }
            
            if (messageIs(myMessageString,"mirror"))
            {
                for (int i = 0; i < connections.size(); i++)
                {
                    connections.at(i)->sendCommands();
                }
            }
            
            if (messageIs(myMessageString,"createInitialSolutions"))
            {
                std::string number = readLineFromNetworkCleaned();
                
                std::cout << "Creating " << number << " initial solutions" << std::endl;
                
                ourGa = new geneticAlgorithm();
                ourGa->evaluation = evaluation;
                ourGa->ourScheduler = ourScheduler;
                ourGa->throughLife = throughLife;
                
                initialSolutions.clear();
                
                for (int i = 0; i < string_to_double(number); i++)
                {
                    genoType* solution = ourGa->getInitialPopulationMember();
                    initialSolutions.push_back(solution);
                }
                
                std::cout << "Done" << std::endl;

            }
            
            if (messageIs(myMessageString,"getInitialSolutions"))
            {
                std::cout << "Returning Initial Solutions" << std::endl;
                
                for (int i = 0; i < initialSolutions.size(); i++)
                {
                    genoType *currentGenoType = initialSolutions.at(i);
                    
                    std::string message = "upgrade\n";
                    boost::system::error_code ignored_error;
                    boost::asio::write(socket, boost::asio::buffer(message), ignored_error);
                    
                    for (int upgradeNo = 0; upgradeNo < currentGenoType->upgradeSourceComponent.size(); upgradeNo++)
                    {                        
                        std::ostringstream o1;
                        std::ostringstream o2;
                        std::ostringstream o3;
                        std::ostringstream o4;
                        o1 << currentGenoType->upgradeSourceComponent.at(upgradeNo) << std::endl;
                        o2 << currentGenoType->upgradeName.at(upgradeNo) << std::endl;
                        o3 << currentGenoType->upgradeTargetComponent.at(upgradeNo) << std::endl;
                        o4 << currentGenoType->upgradeGaNumber.at(upgradeNo) << std::endl;
                        std::string reply1(o1.str());
                        boost::asio::write(socket, boost::asio::buffer(reply1), ignored_error);
                        std::string reply2(o2.str());
                        boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                        std::string reply3(o3.str());
                        boost::asio::write(socket, boost::asio::buffer(reply3), ignored_error);
                        std::string reply4(o4.str());
                        boost::asio::write(socket, boost::asio::buffer(reply4), ignored_error);
                    }
                    
                    std::string message2 = "link\n";
                    boost::asio::write(socket, boost::asio::buffer(message2), ignored_error);
                    
                    for (int linkNo = 0; linkNo < currentGenoType->sourceComponent.size(); linkNo++)
                    {                        
                        std::ostringstream o1;
                        std::ostringstream o2;
                        std::ostringstream o3;
                        std::ostringstream o4;
                        
                        o1 << currentGenoType->sourceComponent.at(linkNo) << std::endl;
                        o2 << currentGenoType->capability.at(linkNo) << std::endl;
                        o3 << currentGenoType->targetComponent.at(linkNo) << std::endl;
                        o4 << currentGenoType->componentGaNumber.at(linkNo) << std::endl;
                        
                        std::string reply1(o1.str());
                        boost::asio::write(socket, boost::asio::buffer(reply1), ignored_error);
                        std::string reply2(o2.str());
                        boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                        std::string reply3(o3.str());
                        boost::asio::write(socket, boost::asio::buffer(reply3), ignored_error);
                        std::string reply4(o4.str());
                        boost::asio::write(socket, boost::asio::buffer(reply4), ignored_error);
                        
                    }
                }
                
                std::string done = "Done\n";
                boost::asio::write(socket, boost::asio::buffer(done), ignored_error);
            }
            
            //Scenario Loading Protocol
            if (messageIs(myMessageString,"createCapabilityUpgrade"))
            {
                std::string name = readLineFromNetworkCleaned();
                std::string targetComponent = readLineFromNetworkCleaned();
                
                lastCapabilityUpgrade = new CapabilityUpgrade(name);
                lastCapabilityUpgrade->targetComponent = targetComponent;
                
                evaluation->addObject(lastCapabilityUpgrade);
                lastComponent->addUpgrades(lastCapabilityUpgrade);
                
                //Upgrade Concept Does Not Exist In Scheduler Use Capability Provision Instead
                if (throughLife)
                {
                    scheduleCapabilityProvision *newCapProv = new scheduleCapabilityProvision(name);
                    
                    ourScheduler->addScheduleObject(newCapProv);
                    lastComp->addProvision(newCapProv);
                    
                    newCapProv->relatesTo = lastCapabilityUpgrade;
                }
            }
            
            if (messageIs(myMessageString,"createCapability") || messageIs(myMessageString,"createCapabilitySeq"))
            {
                std::string name = readLineFromNetworkCleaned();
                std::string standAlone = readLineFromNetworkCleaned();
                lastCapability = new Capability(name);
                lastCapability->component = lastComponent;
                if (standAlone == "true")
                {
                    lastCapability->standAlone = true;
                }
                lastCapability->searchObjective = false;
                evaluation->addObject(lastCapability);
                if (lastComponent != NULL)
                {
                    lastComponent->addRequires(lastCapability);
                }
                capFlag = false;
                
                if (throughLife)
                {
                    lastCap = new scheduleCapability(name, false);
                    
                    if (lastComp != NULL)
                    {
                        if (messageIs(myMessageString,"createCapabilitySeq"))
                        {
                            lastComp->addSeqDependencies(lastCap);
                        }
                        else
                        {
                            lastComp->addDependencies(lastCap);
                        }
                    }
                    lastCap->linkedTo = lastComp;
                    lastCap->relatesTo = lastCapability;
                    
                    ourScheduler->addScheduleObject(lastCap);
                }
            }
            
            if (messageIs(myMessageString,"createCapabilitySO") || messageIs(myMessageString,"createScenarioCapability"))
            {
                std::string name = readLineFromNetworkCleaned();
                std::string standAlone = readLineFromNetworkCleaned();
                lastCapability = new Capability(name);
                
                if (messageIs(myMessageString,"createCapabilitySO"))
                {
                    lastCapability->searchObjective = true;
                }
                else
                {
                    lastCapability->searchObjective = false;
                }
                
                if (standAlone == "true")
                {
                    lastCapability->standAlone = true;
                }
                
                evaluation->addObject(lastCapability);
                if (lastComponent != NULL)
                {
                    lastComponent->addRequires(lastCapability);
                }
                capFlag = false;
                
                if (throughLife)
                {
                    double start = string_to_double(readLineFromNetworkCleaned());
                    double stop = string_to_double(readLineFromNetworkCleaned());
                    lastCap = new scheduleCapability(name, start, stop);
                    lastCap->linkedTo = NULL;
                    ourScheduler->addScheduleObject(lastCap);
                    lastCap->relatesTo = lastCapability;
                    lastCapability->startTime = start;
                    lastCapability->stopTime = stop;
                }
            }
            
            if (messageIs(myMessageString,"talkToLua"))
            {
                std::cout << "Insert Lua Command" << std::endl;
                std::string command = readLineFromNetworkCleaned();
                std::cout << command << std::endl;
                std::cout << "Lua: " << myLuaScripts->run(command) << std::endl;
            }
            
            if (messageIs(myMessageString,"createExistingComponent"))
            {
                //Existing Component, Already Scheduled
                std::string name = readLineFromNetworkCleaned();
                
                if (throughLife)
                {
                
                double start = string_to_double(readLineFromNetworkCleaned());
                double stop = string_to_double(readLineFromNetworkCleaned());
                
                lastComp = new scheduleComponent(name);
                
                lastComp->existing = true;
                lastComp->startTime = start;
                lastComp->stopTime = stop;
                
                ourScheduler->addScheduleObject(lastComp);
                    
                }
                
                lastComponent = new Component(name);
                lastComponent->existing = true;
                evaluation->addObject(lastComponent);
                
                if (throughLife)
                {
                lastComp->relatesTo = lastComponent;
                }
                
                std::cout << "Created " << name << std::endl;
            }
            
            if (messageIs(myMessageString,"createAcquirableComponent"))
            {
                //Acquirable Component, Needs Scheduling
                std::string name = readLineFromNetworkCleaned();
                std::cout << name << std::endl;
                
                if (throughLife)
                {
                    
                double acquisitionTime = string_to_double(readLineFromNetworkCleaned());
                double lifeSpan = string_to_double(readLineFromNetworkCleaned());
                
                lastComp = new scheduleComponent(name);
                
                lastComp->existing = false;
                lastComp->acquisitionTime = acquisitionTime;
                lastComp->lifeSpan = lifeSpan;
                
                ourScheduler->addScheduleObject(lastComp);
                
                }
                lastComponent = new Component(name);
                evaluation->addObject(lastComponent);
                
                if (throughLife)
                {
                lastComp->relatesTo = lastComponent;
                }
                
                std::cout << "Created " << name << std::endl;
            }
            
            Measurement *newMeasurement = NULL;
            
            if (messageIs(myMessageString,"createMeasure") || messageIs(myMessageString,"createMeasureAcc"))            
            {
                std::string name = readLineFromNetworkCleaned();
                std::string critical = readLineFromNetworkCleaned();
                std::string benchmark = readLineFromNetworkCleaned();
                std::string provided = readLineFromNetworkCleaned();
                std::string script = readLineFromNetworkCleaned();
                
                newMeasurement = new Measurement(name);
                
                std::cout << "Measurement Type" << std::endl;
                std::cout << name << std::endl;
                
                //Is Critical A Number?
                if (is_number(critical) || is_number(provided)) //Quantitive
                {
                    std::cout << "Number" << std::endl;
                    newMeasurement->criticalValue = string_to_double(critical);
                    newMeasurement->benchmarkValue = string_to_double(benchmark);
                    newMeasurement->providedValue = string_to_double(provided);
                    
                    std::cout << newMeasurement->criticalValue << std::endl;
                    std::cout << newMeasurement->benchmarkValue << std::endl;
                    std::cout << newMeasurement->providedValue << std::endl;
                }
                else //Qualititive
                {
                    std::cout << "String" << std::endl;
                    newMeasurement->qualitative = true;
                    
                    //Expecting Comma Seperated Values
                    newMeasurement->criticalValues = csvSplit(critical);
                    newMeasurement->benchmarkValues = csvSplit(benchmark);
                    newMeasurement->providedValues = csvSplit(provided);
                }
                
                newMeasurement->script = script;
                std::cout << "Adding Script" << newMeasurement->script << std::endl;
                if (lastComponent != NULL)
                {
                    newMeasurement->component = lastComponent;
                }
                
                if (capFlag == false)
                {
                    lastCapability->addMeasurement(newMeasurement);
                }
                else
                {
                    lastCapabilityProvision->addMeasurement(newMeasurement);
                }
                evaluation->addObject(newMeasurement);
            }
            
            if (messageIs(myMessageString,"createMeasureAcc"))
            {
                lastCapability->makeAccumulation(newMeasurement);
            }
            
            if (messageIs(myMessageString,"createCapabilityProvision"))
            {
                std::string name = readLineFromNetworkCleaned();
                double reuse = string_to_double(readLineFromNetworkCleaned());
                lastCapabilityProvision = new CapabilityProvision(name);
                lastCapabilityProvision->reuse = reuse;
                evaluation->addObject(lastCapabilityProvision);
                lastCapabilityProvision->component = lastComponent;
                
                if (assignCapProvMode == 0)
                {
                    lastComponent->addProvides(lastCapabilityProvision);
                }
                if (assignCapProvMode == 1)
                {
                    lastCapabilityUpgrade->addCapability(lastCapabilityProvision);
                }
                if (assignCapProvMode == 2)
                {
                    lastCapabilityUpgrade->modifyCapability(lastCapabilityProvision);
                }
                if (assignCapProvMode == 3)
                {
                    lastCapabilityUpgrade->delCapability(lastCapabilityProvision);
                }
                
                capFlag = true;
                
                if (throughLife)
                {
                    scheduleCapabilityProvision *newCapProv = new scheduleCapabilityProvision(name);
                    
                    ourScheduler->addScheduleObject(newCapProv);
                    lastComp->addProvision(newCapProv);
                    
                    newCapProv->relatesTo = lastCapabilityProvision;
                }
            }
            
            if (messageIs(myMessageString,"createCost"))
            {
                std::string name = readLineFromNetworkCleaned();
                double amount = string_to_double(readLineFromNetworkCleaned());
                Cost *newCost = new Cost(name);
                newCost->amount = amount;
                lastComponent->addCost(newCost);
                evaluation->costs.push_back(newCost); //Manual, since we are creating the component
                evaluation->costDesires.insert ( std::pair<std::string, int>(name,0) );
                
                if (throughLife)
                {
                    double timeFromStart = string_to_double(readLineFromNetworkCleaned());
                    double repeatTime = string_to_double(readLineFromNetworkCleaned());
                    double stopTime = string_to_double(readLineFromNetworkCleaned());
                    
                    scheduleCost *newScheduleCost = new scheduleCost(name,amount,timeFromStart,repeatTime,stopTime);
                
                    ourScheduler->addScheduleObject(newScheduleCost);
                    lastComp->addCost(newScheduleCost);

                    newScheduleCost->relatesTo = newCost;
                }
            }
            
            if (messageIs(myMessageString,"addQVD"))
            {
                std::string first = readLineFromNetworkCleaned();
                std::string second = readLineFromNetworkCleaned();
                evaluation->ourQVD->addGreaterThan(first,second);
            }
            
            //These attach Capability Provisions to the Upgrade instead of a Component
            if (messageIs(myMessageString,"add"))
            {
                assignCapProvMode = 1;
            }
            
            if (messageIs(myMessageString,"mod"))
            {
                assignCapProvMode = 2;
            }
            
            if (messageIs(myMessageString,"del"))
            {
                assignCapProvMode = 3;
            }
            
            if (messageIs(myMessageString,"end"))
            {
                assignCapProvMode = 0;
            }
            
            
            if (messageIs(myMessageString,"start"))
            {
                lastCap = NULL;
                lastComp = NULL;
                assignCapProvMode = 0;
                evaluation = new Evaluator;
                globalEvaluation = evaluation;
                evaluation->ourQVD = new qvd();
                throughLife = false;
                
                ourScheduler = NULL;
                lastCapability = NULL;
                lastCapabilityProvision = NULL;
                capFlag = false;
                lastComponent = NULL;
                lastCapabilityUpgrade = NULL;
                ourGa = NULL;
                ourBudget = NULL;
                measurements.clear();
                myLuaScripts = new luascripts();
                currentComponent = NULL;
                paretoFront.clear();
                
                //Sort out any connected clients
                for (int i = 0; i < connections.size(); i++)
                {
                    connections.at(i)->reset();
                    connections.at(i)->recording = true;
                    //connections.at(i)->addCommand("start\n");
                }
            }
            
            if (messageIs(myMessageString,"throughlife"))
            {
                std::cout << "Open Scheduler" << std::endl;
                double start = string_to_double(readLineFromNetworkCleaned());
                double stop = string_to_double(readLineFromNetworkCleaned());
                ourScheduler = new scheduler();
                ourBudget = new scheduleBudget(start,stop);
                throughLife = true;
            }
            
            if (messageIs(myMessageString,"createIncome"))
            {
                //New Income Source
                std::string name = readLineFromNetworkCleaned();
                double amount = string_to_double(readLineFromNetworkCleaned());
                double timeFromStart = string_to_double(readLineFromNetworkCleaned());
                double repeatTime = string_to_double(readLineFromNetworkCleaned());
                double stopTime = string_to_double(readLineFromNetworkCleaned());
                
                scheduleIncome *newIncome = new scheduleIncome(name,amount,timeFromStart,repeatTime,stopTime);
                ourScheduler->addScheduleObject(newIncome);
                
                std::cout << "Income Registered" << std::endl;
            }
            
            if (messageIs(myMessageString, "desireHigh"))
            {
                std::string name = readLineFromNetworkCleaned();
                evaluation->costDesires.erase (name); 
                evaluation->costDesires.insert ( std::pair<std::string, int>(name,1) );
            }
            
            if (messageIs(myMessageString, "desireLow"))
            {
                std::string name = readLineFromNetworkCleaned();
                evaluation->costDesires.erase (name); 
                evaluation->costDesires.insert ( std::pair<std::string, int>(name,-1) );
            }
            
            if (messageIs(myMessageString, "runSchedule"))
            {
                ourScheduler->run();
                ourScheduler->outputSchedule();
                ourScheduler->getAllTimes();
                
            }
            
            if (messageIs(myMessageString,"link"))
            {
                //std::cout << "Link" << std::endl;
                //Need to read in 3 values
                std::string source = readLineFromNetworkCleaned();
                std::string cap = readLineFromNetworkCleaned();
                std::string target = readLineFromNetworkCleaned();
                
                //std::cout << "Source: " << source << std::endl;
                //std::cout << "Cap: " << cap << std::endl;
                //std::cout << "Target: " << target << std::endl;
                
                evaluation->createLink(source,cap,target);
                
                if (throughLife)
                {
                    ourScheduler->createScheduleLink(source,cap,target);
                }
            }
            
            if (messageIs(myMessageString,"upgrade"))
            {
                //std::cout << "Link" << std::endl;
                //Need to read in 3 values
                std::string source = readLineFromNetworkCleaned();
                std::string upgrade = readLineFromNetworkCleaned();
                std::string target = readLineFromNetworkCleaned();
                
                //std::cout << "Source: " << source << std::endl;
                //std::cout << "Cap: " << upgrade << std::endl;
                //std::cout << "Target: " << target << std::endl;
                
                evaluation->setUpgrade(source, upgrade, target);
                
                if (throughLife)
                {
                    ourScheduler->createScheduleUpgrade(source, upgrade, target);
                }
            }
            
            if (messageIs(myMessageString,"remoteEvaluate"))
            {
                //std::cout << "Remote Start" << std::endl;
                
                if (throughLife == false)
                {
                    evaluation->evaluate();
                }
                else
                {
                    ourScheduler->run();
                    
                    //Read To Evaluate
                    evaluation->evaluate();
                    
                    //Through Life Evaluation - Capability Status Over Time
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
                    
                    for (int i = 0; i < timeSorted.size(); i++)
                    {
                        std::cout << timeSorted.at(i) << std::endl;
                        ourScheduler->setToTime(timeSorted.at(i));
                        evaluation->evaluate();
                        
                        long int timePassed = 0;
                        if (i != 0)
                        {
                            timePassed = timeSorted.at(i-1) - timeSorted.at(i);
                        }
                        
                        for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                        {
                            if ((*capIt)->startTime <= timeSorted.at(i) && (*capIt)->stopTime >= timeSorted.at(i))
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
            }
            
            if (messageIs(myMessageString,"remoteEvaluateResult"))
            {
                //std::cout << "Remote Retrieve" << std::endl;
                
                std::string start = "Remote Evaluation Scores\n";
                boost::asio::write(socket, boost::asio::buffer(start), ignored_error);
                
                if (throughLife == false)
                {
                //Read In Results
                vector<Capability*>::iterator capIt;
                vector<Capability*> myCapabilitySet = evaluation->getAllSearchObjectiveCapabilitiesPtr();
                
                //Capabilities
                for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                {
                    std::ostringstream o;
                    o << (*capIt)->status << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                //Costs
                set<string>::iterator it;
                set<string> mySet = evaluation->getAllCosts();
                
                for (it = mySet.begin(); it != mySet.end(); it++)
                {
                    double score = evaluation->getCost(*it);
                    score *= evaluation->costDesires.find(*it)->second;
                    
                    std::ostringstream o;
                    o << score << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                std::string done = "Done\n";
                boost::asio::write(socket, boost::asio::buffer(done), ignored_error);
                }
                else
                {
                    std::set<long int>::iterator it;
                    
                    vector<Capability*>::iterator capIt;
                    vector<Capability*> myCapabilitySet = evaluation->getAllSearchObjectiveCapabilitiesPtr();
                    
                    //Capabilities
                    for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                    {
                        double score = (*capIt)->tempStatus;
                        std::ostringstream o;
                        o << score << std::endl;
                        std::string reply(o.str());
                        boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                        
                    }
                    
                    //Costs
                    set<string>::iterator its;
                    set<string> mySet = evaluation->getAllCosts();
                    
                    for (its = mySet.begin(); its != mySet.end(); its++)
                    {
                        double score = evaluation->getCost(*its);
                        score *= evaluation->costDesires.find(*its)->second;
                        
                        std::ostringstream o;
                        o << score << std::endl;
                        std::string reply(o.str());
                        boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                    }
                    
                    std::string done = "Done\n";
                    boost::asio::write(socket, boost::asio::buffer(done), ignored_error);
                }
            }
            
            if (messageIs(myMessageString,"evaluate"))
            {
                std::cout << "Evaluate" << std::endl;
                evaluation->evaluate();
                
                //Output
                //cout << "Output" << endl;
                
                vector<Capability>::iterator capIt;
                vector<Capability> myCapabilitySet = evaluation->getAllSearchObjectiveCapabilities();
                
                std::string reply2 = "Evaluation Results\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                reply2 = "Capability\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                {
                    std::ostringstream o;
                    o << ((*capIt).name) << std::endl << (*capIt).status << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                reply2 = "Costs\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                set<string>::iterator it;
                set<string> mySet = evaluation->getAllCosts();
                
                for (it = mySet.begin(); it != mySet.end(); it++)
                {
                    std::ostringstream o;
                    o << *it << std::endl << evaluation->getCost(*it) << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                std::string done = "Done\n";
                boost::asio::write(socket, boost::asio::buffer(done), ignored_error);
            }
            
            if (messageIs(myMessageString,"evaluateAtTime"))
            {
                std::cout << "Evaluate At Time" << std::endl;
                double time = string_to_double(readLineFromNetworkCleaned());
                ourScheduler->setToTime(time);
                
                evaluation->evaluate();
                
                //Output
                //cout << "Output" << endl;
                
                vector<Capability>::iterator capIt;
                vector<Capability> myCapabilitySet = evaluation->getAllSearchObjectiveCapabilities();
                
                std::string reply2 = "Evaluation Results\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                reply2 = "Capability\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                {
                    std::ostringstream o;
                    o << ((*capIt).name) << std::endl << (*capIt).status << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                reply2 = "Costs\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                set<string>::iterator it;
                set<string> mySet = evaluation->getAllCosts();
                
                for (it = mySet.begin(); it != mySet.end(); it++)
                {
                    std::ostringstream o;
                    o << *it << std::endl << evaluation->getCost(*it) << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                std::string done = "Done\n";
                boost::asio::write(socket, boost::asio::buffer(done), ignored_error);
            }
            
            if (messageIs(myMessageString,"evaluateTL"))
            {
                std::cout << "EvaluateTL" << std::endl;
                
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
                
                for (int i = 0; i < timeSorted.size(); i++)
                {
                    std::cout << timeSorted.at(i) << std::endl;
                    ourScheduler->setToTime(timeSorted.at(i));
                    evaluation->evaluate();
                    
                    long int timePassed = 0;
                    if (i != 0)
                    {
                        timePassed = timeSorted.at(i-1) - timeSorted.at(i);
                    }
                    
                    for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                    {
                        if ((*capIt)->startTime <= timeSorted.at(i) && (*capIt)->stopTime >= timeSorted.at(i))
                        {
                            (*capIt)->tempStatus = (*capIt)->tempStatus + (double)((double)timePassed*((*capIt)->status));
                        }
                    }
                }
                
                for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                {
                    (*capIt)->tempStatus = (*capIt)->tempStatus / (double)((*capIt)->stopTime - (*capIt)->startTime);
                }
                
                //Output
                //cout << "Output" << endl;
                
                std::string reply2 = "Evaluation Results\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                reply2 = "Capability\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                {
                    std::ostringstream o;
                    o << ((*capIt)->name) << std::endl << (*capIt)->tempStatus << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                reply2 = "Costs\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                set<string>::iterator myIt;
                set<string> mySet = evaluation->getAllCosts();
                
                for (myIt = mySet.begin(); myIt != mySet.end(); myIt++)
                {
                    std::ostringstream o;
                    o << *myIt << std::endl << evaluation->getCost(*myIt) << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                std::string done = "Done\n";
                boost::asio::write(socket, boost::asio::buffer(done), ignored_error);
            }
            
            
            if (messageIs(myMessageString,"full"))
            {
                std::cout << "Full Evaluation" << std::endl;
                evaluation->evaluate();
                
                vector<Capability>::iterator capIt;
                vector<Capability> myCapabilitySet = evaluation->getAllCapabilities();
                
                std::string reply2 = "Evaluation Results\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                reply2 = "Capability\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                {
                    std::ostringstream o;
                    o << ((*capIt).name) << std::endl << (*capIt).status << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                reply2 = "Costs\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                set<string>::iterator it;
                set<string> mySet = evaluation->getAllCosts();
                
                for (it = mySet.begin(); it != mySet.end(); it++)
                {
                    std::ostringstream o;
                    o << *it << std::endl << evaluation->getCost(*it) << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                reply2 = "Measurements\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                vector<Measurement> myMeasurementSet = evaluation->getAllMeasurements();
                vector<Measurement>::iterator measureIt;
                
                for (measureIt = myMeasurementSet.begin(); measureIt != myMeasurementSet.end(); measureIt++)
                {
                    std::ostringstream o;
                    
                    o << "Start" << endl;
                    
                    if (measureIt->qualitative == false)
                    {
                        o << measureIt->name << std::endl << measureIt->providedValue << std::endl;
                    }
                    else
                    {
                        o << measureIt->name << std::endl;
                        for (int j = 0; j < measureIt->providedValues.size(); j++)
                        {
                            o << measureIt->providedValues.at(j) << std::endl;
                        }
                    }
                    
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                    o.str() = std::string("");
                }
                
                
                std::string done = "Done\n";
                boost::asio::write(socket, boost::asio::buffer(done), ignored_error);

                
                
            }
            
            if (messageIs(myMessageString,"fullTL"))
            {
                std::cout << "Through Life Full Evaluation" << std::endl;
                
                std::set<long int> times = ourScheduler->getAllTimes();
                std::set<long int>::iterator timeIt;
                
                vector<long int> timeSorted;
                
                for (timeIt = times.begin(); timeIt != times.end(); ++timeIt)
                {
                    timeSorted.push_back(*timeIt);
                }
                
                std::sort(timeSorted.begin(),timeSorted.end());
                
                for (int timeNo = 0; timeNo < timeSorted.size(); timeNo++)
                {
                    long int currentTime = timeSorted.at(timeNo);
                    ourScheduler->setToTime(currentTime);
                    evaluation->evaluate();
                    
                    vector<Capability>::iterator capIt;
                    vector<Capability> myCapabilitySet = evaluation->getAllCapabilities();
                    
                    std::string reply2 = "Evaluation Results\n";
                    boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                    
                    //Send time
                    std::ostringstream n;
                    n << currentTime << std::endl;
                    
                    std::string reply3 = std::string(n.str());
                    boost::asio::write(socket, boost::asio::buffer(reply3), ignored_error);
                    
                    reply2 = "Capability\n";
                    boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                    
                    for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                    {
                        std::ostringstream o;
                        o << ((*capIt).name) << std::endl << (*capIt).status << std::endl;
                        std::string reply(o.str());
                        boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                    }
                    
                    reply2 = "Costs\n";
                    boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                    
                    set<string>::iterator it;
                    set<string> mySet = evaluation->getAllCosts();
                    
                    for (it = mySet.begin(); it != mySet.end(); it++)
                    {
                        std::ostringstream o;
                        o << *it << std::endl << evaluation->getCost(*it) << std::endl;
                        std::string reply(o.str());
                        boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                    }
                    
                    reply2 = "Measurements\n";
                    boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                    
                    vector<Measurement> myMeasurementSet = evaluation->getAllMeasurements();
                    vector<Measurement>::iterator measureIt;
                    
                    for (measureIt = myMeasurementSet.begin(); measureIt != myMeasurementSet.end(); measureIt++)
                    {
                        std::ostringstream o;
                        
                        o << "Start" << endl;
                        
                        if (measureIt->qualitative == false)
                        {
                            o << measureIt->name << std::endl << measureIt->providedValue << std::endl;
                        }
                        else
                        {
                            o << measureIt->name << std::endl;
                            for (int j = 0; j < measureIt->providedValues.size(); j++)
                            {
                                o << measureIt->providedValues.at(j) << std::endl;
                            }
                        }
                        
                        std::string reply(o.str());
                        boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                        o.str() = std::string("");
                    }
                    
                    
                    std::string done = "Done\n";
                    boost::asio::write(socket, boost::asio::buffer(done), ignored_error);

                    
                }
            }
            
            if (messageIs(myMessageString,"startGA") && client == false)
            {
                //Sort out any connected clients
                for (int i = 0; i < connections.size(); i++)
                {
                    connections.at(i)->sendCommands();
                    connections.at(i)->recording = false;
                }
                
                std::cout << "Genetic Algorithm Start" << std::endl;
                double populationSize = string_to_double(readLineFromNetworkCleaned());
                double generationCount = string_to_double(readLineFromNetworkCleaned());
                
                ourGa = new geneticAlgorithm(populationSize, generationCount);
                ourGa->evaluation = evaluation;
                ourGa->ourScheduler = ourScheduler;
                ourGa->throughLife = throughLife;
                ourGa->setConnections(connections);
                ourGa->createInitialPopulation();
                
                int genCount = (int)generationCount;
                
                for (int i = 0; i < genCount; i++)
                {
                    std::cout << "Performing GA Round " << i << std::endl;
                    ourGa->performGARound();
                }
                
                std::cout << "Genetic Algorithm Done" << std::endl;
                
                paretoFront = ourGa->getParetoFront(); //Save Pareto Front For Later Access
            }
            
            if (messageIs(myMessageString,"showParetoFront"))
            {
                std::cout << "Show Pareto Front" << std::endl;
                
                std::ostringstream o;
                for (int i = 0; i < paretoFront.size(); i++)
                {
                    o << i;
                    for (int j = 0; j < paretoFront.at(i)->scores.size(); j++)
                    {
                        o << "," << paretoFront.at(i)->scores.at(j);
                    }
                    o << std::endl;
                    
                }
                
                std::string reply(o.str());
                boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
            }
            
            if (messageIs(myMessageString,"getParetoFront"))
            {
                std::cout << "Get Pareto Front" << std::endl;
                
                std::ostringstream o;
                for (int i = 0; i < paretoFront.size(); i++)
                {
                    o << i;
                    for (int j = 0; j < paretoFront.at(i)->scores.size(); j++)
                    {
                        o << "," << paretoFront.at(i)->scores.at(j);
                    }
                    o << std::endl;
                    
                }
                
                std::string reply(o.str());
                boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                
                std::string done = "Done\n";
                boost::asio::write(socket, boost::asio::buffer(done), ignored_error);
            }
            
            if (messageIs(myMessageString,"getParetoFrontSize"))
            {
                std::cout << "Pareto Front Size " << paretoFront.size() << std::endl;
                
                std::ostringstream o;
                o << paretoFront.size() << std::endl;
                std::string reply(o.str());
                boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
            }
            
            if (messageIs(myMessageString,"getParetoFrontAt"))
            {
                double place = string_to_double(readLineFromNetworkCleaned());
                
                std::cout << "Getting Pareto Front At " << place << std::endl;
                
                int n = (int)place;
                
                    genoType *solution = paretoFront.at(n);
                    
                    //Reset State
                    evaluation->reset();
                    
                    std::string upgradeStart = "upgrade\n";
                    boost::asio::write(socket, boost::asio::buffer(upgradeStart), ignored_error);
                    
                    //Add All Upgrades
                    for (int i = 0; i < solution->upgradeSourceComponent.size(); i++)
                    {
                        evaluation->setUpgrade(solution->upgradeSourceComponent.at(i),solution->upgradeName.at(i),solution->upgradeTargetComponent.at(i));
                        
                        std::string upgrade1 = solution->upgradeSourceComponent.at(i);
                        std::string upgrade2 = solution->upgradeName.at(i);
                        std::string upgrade3 = solution->upgradeTargetComponent.at(i);
                        
                        upgrade1.append("\n");
                        upgrade2.append("\n");
                        upgrade3.append("\n");
                        
                        boost::asio::write(socket, boost::asio::buffer(upgrade1), ignored_error);
                        boost::asio::write(socket, boost::asio::buffer(upgrade2), ignored_error);
                        boost::asio::write(socket, boost::asio::buffer(upgrade3), ignored_error);
                        
                    }
                    
                    std::string solutionStart = "link\n";
                    boost::asio::write(socket, boost::asio::buffer(solutionStart), ignored_error);
                    
                    //Add All Links
                    for (int i = 0; i < solution->sourceComponent.size(); i++)
                    {
                        evaluation->createLink(solution->sourceComponent.at(i),solution->capability.at(i),solution->targetComponent.at(i));
                        
                        std::string link1 = solution->sourceComponent.at(i);
                        std::string link2 = solution->capability.at(i);
                        std::string link3 = solution->targetComponent.at(i);
                        
                        link1.append("\n");
                        link2.append("\n");
                        link3.append("\n");
                        
                        boost::asio::write(socket, boost::asio::buffer(link1), ignored_error);
                        boost::asio::write(socket, boost::asio::buffer(link2), ignored_error);
                        boost::asio::write(socket, boost::asio::buffer(link3), ignored_error);
                    }
                    
                    //Read To Evaluate
                    evaluation->evaluate();
                    
                    vector<Capability>::iterator capIt;
                    vector<Capability> myCapabilitySet = evaluation->getAllCapabilities();
                    
                    std::string reply2 = "Evaluation Results\n";
                    boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                    
                    reply2 = "Capability\n";
                    boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                    
                    for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                    {
                        std::ostringstream o;
                        o << ((*capIt).name) << std::endl << (*capIt).status << std::endl;
                        std::string reply(o.str());
                        boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                    }
                    
                    reply2 = "Costs\n";
                    boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                    
                    set<string>::iterator it;
                    set<string> mySet = evaluation->getAllCosts();
                    
                    for (it = mySet.begin(); it != mySet.end(); it++)
                    {
                        std::ostringstream o;
                        o << *it << std::endl << evaluation->getCost(*it) << std::endl;
                        std::string reply(o.str());
                        boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                    }
                    
                    reply2 = "Measurements\n";
                    boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                    
                    vector<Measurement> myMeasurementSet = evaluation->getAllMeasurements();
                    vector<Measurement>::iterator measureIt;
                    
                    for (measureIt = myMeasurementSet.begin(); measureIt != myMeasurementSet.end(); measureIt++)
                    {
                        std::ostringstream o;
                        
                        o << "Start" << endl;
                        
                        if (measureIt->qualitative == false)
                        {
                            o << measureIt->name << std::endl << measureIt->providedValue << std::endl;
                        }
                        else
                        {
                            o << measureIt->name << std::endl;
                            for (int j = 0; j < measureIt->providedValues.size(); j++)
                            {
                                o << measureIt->providedValues.at(j) << std::endl;
                            }
                        }
                        
                        std::string reply(o.str());
                        boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                        o.str() = std::string("");
                    }
                
                std::string done = "Done\n";
                boost::asio::write(socket, boost::asio::buffer(done), ignored_error);
            }
            
            if (messageIs(myMessageString,"getParetoFrontAtTL"))
            {
                double place = string_to_double(readLineFromNetworkCleaned());
                
                std::cout << "Getting Pareto Front At " << place << std::endl;
                
                int n = (int)place;
                
                genoType *solution = paretoFront.at(n);
                
                //Reset State
                evaluation->reset();
                ourScheduler->resetLink();
                
                std::string upgradeStart = "upgrade\n";
                boost::asio::write(socket, boost::asio::buffer(upgradeStart), ignored_error);
                
                //Add All Upgrades
                for (int i = 0; i < solution->upgradeSourceComponent.size(); i++)
                {
                    evaluation->setUpgrade(solution->upgradeSourceComponent.at(i),solution->upgradeName.at(i),solution->upgradeTargetComponent.at(i));
                    
                    ourScheduler->createScheduleUpgrade(solution->upgradeSourceComponent.at(i),solution->upgradeName.at(i),solution->upgradeTargetComponent.at(i));
                    
                    std::string upgrade1 = solution->upgradeSourceComponent.at(i);
                    std::string upgrade2 = solution->upgradeName.at(i);
                    std::string upgrade3 = solution->upgradeTargetComponent.at(i);
                    
                    upgrade1.append("\n");
                    upgrade2.append("\n");
                    upgrade3.append("\n");
                    
                    boost::asio::write(socket, boost::asio::buffer(upgrade1), ignored_error);
                    boost::asio::write(socket, boost::asio::buffer(upgrade2), ignored_error);
                    boost::asio::write(socket, boost::asio::buffer(upgrade3), ignored_error);
                    
                }
                
                std::string solutionStart = "link\n";
                boost::asio::write(socket, boost::asio::buffer(solutionStart), ignored_error);
                
                //Add All Links
                for (int i = 0; i < solution->sourceComponent.size(); i++)
                {
                    evaluation->createLink(solution->sourceComponent.at(i),solution->capability.at(i),solution->targetComponent.at(i));
                    
                    ourScheduler->createScheduleLink(solution->sourceComponent.at(i),solution->capability.at(i),solution->targetComponent.at(i));
                    
                    std::string link1 = solution->sourceComponent.at(i);
                    std::string link2 = solution->capability.at(i);
                    std::string link3 = solution->targetComponent.at(i);
                    
                    link1.append("\n");
                    link2.append("\n");
                    link3.append("\n");
                    
                    boost::asio::write(socket, boost::asio::buffer(link1), ignored_error);
                    boost::asio::write(socket, boost::asio::buffer(link2), ignored_error);
                    boost::asio::write(socket, boost::asio::buffer(link3), ignored_error);
                }
                
                //For Through Life Schedule Everything
                ourScheduler->run();
                
                //Output Schedule
                std::cout << "Outputting Schedule" << std::endl;
                std::vector<std::string> schedule = ourScheduler->getSchedule();
                
                for (int i = 0; i < schedule.size(); i++)
                {
                    std::string line = schedule.at(i);
                    line.append("\n");
                    
                    boost::asio::write(socket, boost::asio::buffer(line), ignored_error);
                }
                
                //Average Result First For Creating Initial Plan
                std::cout << "EvaluateTL" << std::endl;
                
                std::set<long int> times = ourScheduler->getAllTimes();
                std::set<long int>::iterator it;
                
                vector<Capability*>::iterator capIt;
                vector<Capability*> myCapabilitySet = evaluation->getAllSearchObjectiveCapabilitiesPtr();
                
                for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                {
                    (*capIt)->tempStatus = 0.0;
                }
                
                vector<long int> timeSorted;
                
                for (it = times.begin(); it != times.end(); it++)
                {
                    timeSorted.push_back(*it);
                }
                
                std::sort(timeSorted.begin(),timeSorted.end());
                
                for (int i = 0; i < timeSorted.size(); i++)
                {
                    std::cout << timeSorted.at(i) << std::endl;
                    ourScheduler->setToTime(timeSorted.at(i));
                    evaluation->evaluate();
                    
                    long int timePassed = 0;
                    if (i != 0)
                    {
                        timePassed = timeSorted.at(i-1) - timeSorted.at(i);
                    }
                    
                    for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                    {
                        if ((*capIt)->startTime <= timeSorted.at(i) && (*capIt)->stopTime >= timeSorted.at(i))
                        {
                            (*capIt)->tempStatus = (*capIt)->tempStatus + (double)((double)timePassed*((*capIt)->status));
                        }
                    }
                }
                
                for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                {
                    (*capIt)->tempStatus = (*capIt)->tempStatus / (double)((*capIt)->stopTime - (*capIt)->startTime);
                }
                
                std::string reply2 = "Evaluation Results\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                reply2 = "Capability\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                {
                    std::ostringstream o;
                    o << ((*capIt)->name) << std::endl << (*capIt)->tempStatus << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                reply2 = "Costs\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                set<string>::iterator myIt;
                set<string> mySet = evaluation->getAllCosts();
                
                for (myIt = mySet.begin(); myIt != mySet.end(); myIt++)
                {
                    std::ostringstream o;
                    o << *myIt << std::endl << evaluation->getCost(*myIt) << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                reply2 = "Evaluation Results\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                reply2 = "Capability\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                {
                    std::ostringstream o;
                    o << ((*capIt)->name) << std::endl << (*capIt)->tempStatus << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                reply2 = "Costs\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                mySet = evaluation->getAllCosts();
                
                for (myIt = mySet.begin(); myIt != mySet.end(); myIt++)
                {
                    std::ostringstream o;
                    o << *myIt << std::endl << evaluation->getCost(*myIt) << std::endl;
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                }
                
                //Want To Output Measurements As Well - No Averaging Support
                ourScheduler->removeSchedule();
                evaluation->evaluate();
                
                reply2 = "Measurements\n";
                boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                
                vector<Measurement> myMeasurementSet = evaluation->getAllMeasurements();
                vector<Measurement>::iterator measureIt;
                
                for (measureIt = myMeasurementSet.begin(); measureIt != myMeasurementSet.end(); measureIt++)
                {
                    std::ostringstream o;
                    
                    o << "Start" << endl;
                    
                    if (measureIt->qualitative == false)
                    {
                        o << measureIt->name << std::endl << measureIt->providedValue << std::endl;
                    }
                    else
                    {
                        o << measureIt->name << std::endl;
                        for (int j = 0; j < measureIt->providedValues.size(); j++)
                        {
                            o << measureIt->providedValues.at(j) << std::endl;
                        }
                    }
                    
                    std::string reply(o.str());
                    boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                    o.str() = std::string("");
                }
                
                //Lastly Capability Over Time
                
                std::cout << "Through Life Full Evaluation" << std::endl;
                std::set<long int>::iterator timeIt;
                
                timeSorted.clear();
                
                for (timeIt = times.begin(); timeIt != times.end(); ++timeIt)
                {
                    timeSorted.push_back(*timeIt);
                }
                
                std::sort(timeSorted.begin(),timeSorted.end());
                
                for (int timeNo = 0; timeNo < timeSorted.size(); timeNo++)
                {
                    long int currentTime = timeSorted.at(timeNo);
                    ourScheduler->setToTime(currentTime);
                    evaluation->evaluate();
                    
                    vector<Capability>::iterator capIt;
                    vector<Capability> myCapabilitySet = evaluation->getAllCapabilities();
                    
                    std::string reply2 = "Evaluation Results Through Life\n";
                    boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                    
                    //Send time
                    std::ostringstream n;
                    n << currentTime << std::endl;
                    
                    std::string reply3 = std::string(n.str());
                    boost::asio::write(socket, boost::asio::buffer(reply3), ignored_error);
                    
                    reply2 = "Capability\n";
                    boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                    
                    for (capIt = myCapabilitySet.begin(); capIt != myCapabilitySet.end(); capIt++)
                    {
                        std::ostringstream o;
                        o << ((*capIt).name) << std::endl << (*capIt).status << std::endl;
                        std::string reply(o.str());
                        boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                    }
                    
                    reply2 = "Costs\n";
                    boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                    
                    set<string>::iterator it;
                    set<string> mySet = evaluation->getAllCosts();
                    
                    for (it = mySet.begin(); it != mySet.end(); it++)
                    {
                        std::ostringstream o;
                        o << *it << std::endl << evaluation->getCost(*it) << std::endl;
                        std::string reply(o.str());
                        boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                    }
                    
                    reply2 = "Measurements\n";
                    boost::asio::write(socket, boost::asio::buffer(reply2), ignored_error);
                    
                    vector<Measurement> myMeasurementSet = evaluation->getAllMeasurements();
                    vector<Measurement>::iterator measureIt;
                    
                    for (measureIt = myMeasurementSet.begin(); measureIt != myMeasurementSet.end(); measureIt++)
                    {
                        std::ostringstream o;
                        
                        o << "Start" << endl;
                        
                        if (measureIt->qualitative == false)
                        {
                            o << measureIt->name << std::endl << measureIt->providedValue << std::endl;
                        }
                        else
                        {
                            o << measureIt->name << std::endl;
                            for (int j = 0; j < measureIt->providedValues.size(); j++)
                            {
                                o << measureIt->providedValues.at(j) << std::endl;
                            }
                        }
                        
                        std::string reply(o.str());
                        boost::asio::write(socket, boost::asio::buffer(reply), ignored_error);
                        o.str() = std::string("");
                    }
                }
                
                std::string done = "Done\n";
                boost::asio::write(socket, boost::asio::buffer(done), ignored_error);
            }
            }
        }
        catch (std::exception& e)
        {
            std::cerr << e.what() << std::endl;
        }
    }
    
    bool messageIs(std::string message, std::string command)
    {
        std::string filteredMessage;
        for (int pos = 0; pos < message.size(); pos++)
        {
            //Letters and basic symbols only
            if (message.c_str()[pos] > 64 && message.c_str()[pos] < 123)
            {
                filteredMessage.push_back(message.c_str()[pos]);
            }
        }
        
        return (filteredMessage == command);
    }
    
    std::string incomingData;
    
    std::string readLineFromNetwork()
    {
        boost::array<char, 256> buf;
        boost::system::error_code error;
        bool lineReady;
        
        lineReady = false;
        for (int pos = 0; pos < incomingData.size(); pos++)
        {
            if (incomingData.at(pos) == '\n')
            {
                lineReady = true;
            }
        }
        
        size_t len = 0;
        
        if (lineReady == false || incomingData.size() == 0)
        {
        
        len = ourSocket->read_some(boost::asio::buffer(buf), error);
        if (len == 0 || error == boost::asio::error::eof)
        {
            ourSocket->close();
            //std::cout << "Client Closed" << std::endl;
            return std::string("DISCONNECTED\n");
        }
		myoutputfile << std::string(buf.data(),len);

            for (int i = 0; i < connections.size(); i++)
            {
                connections.at(i)->addCommand(std::string(buf.data(),len));
            }
            
        //Read Everything To Buffer
        for (int copy = 0; copy < len; copy++)
        {
            incomingData.push_back(buf.data()[copy]);
        }
        }
        
        //Read One Line From Buffer
        std::string myMessageString;
        while (incomingData.size() > 0)
        {
            char readChar = incomingData.at(0);
            
            //if (readChar != '\n' && readChar != '\r')
            myMessageString.push_back(readChar);
            incomingData.erase(incomingData.begin());
            
            if (readChar == '\n')
            {
                break;
            }
        }
        
        //for (int i = 0; i < connections.size(); i++)
        //{
        //    connections.at(i)->addCommand(myMessageString);
        //}
        
        //std::cout << "Command: " << myMessageString << std::endl;
        
        return myMessageString;
    }
    
    std::string readLineFromNetworkCleaned()
    {
        //std::cout << "Reading in a parameter" << std::endl;
        
        boost::array<char, 8192> buf;
        boost::system::error_code error;
        
        bool lineReady = false;
        for (int pos = 0; pos < incomingData.size(); pos++)
        {
            if (incomingData.at(pos) == '\n')
            {
                lineReady = true;
            }
        }
        
        size_t len;
        
        if (lineReady == false)
        {
            len = ourSocket->read_some(boost::asio::buffer(buf), error);
            
            if (len == 0 || error == boost::asio::error::eof)
            {
                //ourSocket->close();
                //return std::string("DISCONNECTED\n");
            }

			myoutputfile << std::string(buf.data(),len);
            
            for (int i = 0; i < connections.size(); i++)
            {
                connections.at(i)->addCommand(std::string(buf.data(),len));
            }
            
            //Read Everything To Buffer
            for (int copy = 0; copy < len; copy++)
            {
                incomingData.push_back(buf.data()[copy]);
            }
        }
        
        //Read One Line From Buffer
        std::string myMessageString;
        bool reading = true;
        
        while (reading)
        {
        while (incomingData.size() > 0)
        {
            char readChar = incomingData.at(0);
            
            if (readChar != '\n' && readChar != '\r')
            {
                myMessageString.push_back(readChar);
            }
            incomingData.erase(incomingData.begin());
            
            if (readChar == '\n')
            {
                reading = false;
                
                //for (int i = 0; i < connections.size(); i++)
                //{
                //    std::string fixMessage(myMessageString);
                //    fixMessage.append("\n");
                //    connections.at(i)->addCommand(fixMessage);
                //}
                
                break;
            }
        }
            if (reading)
            {
                //Read some more new line symbol not found (Very large parameter such as a script)
                len = ourSocket->read_some(boost::asio::buffer(buf), error);
                
                if (len == 0 || error == boost::asio::error::eof)
                {
                    ourSocket->close();
                    return std::string("DISCONNECTED\n");
                }
                
                //Read Everything To Buffer
                for (int copy = 0; copy < len; copy++)
                {
                    incomingData.push_back(buf.data()[copy]);
                }
            }
        }
        
        //std::cout << "Parameter: " << myMessageString << std::endl;
        
        return myMessageString;
    }
    
    std::vector<std::string> csvSplit(std::string input)
    {
        std::vector<std::string> output;
        std::istringstream f(input);
        std::string entry;
        
        while (std::getline(f, entry, ',')) {
            output.push_back(entry);
        }
        
        return output;
    }
    
    //Copied Code - Standard string to double
    double string_to_double( const std::string& s )
    {
        std::istringstream i(s);
        double x;
        if (!(i >> x))
            return 0;
        return x;
    }
    
    //Copied Code - Detect Number
    bool is_number(const std::string& s)
    {
        std::string::const_iterator it = s.begin();
        while (it != s.end() && (std::isdigit(*it) || *it == '.')) ++it;
        return !s.empty() && it == s.end();
    }
    
    //Copied Code - Number To String
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
    


