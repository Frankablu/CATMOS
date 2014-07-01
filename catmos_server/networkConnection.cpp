//
//  networkConnection.cpp
//  catmos
//
//  Created by Frank on 15/05/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

#ifndef NETWORKCONNECTION_HEADER
#define NETWORKCONNECTION_HEADER

//This class is designed to manage a connection to another catmos instance

#include <iostream>
#include <sstream>
#include <boost/array.hpp>
#include <boost/asio.hpp>
#include "genotype.cpp"

using boost::asio::ip::tcp;

class networkConnection
{
public:
    std::string address;
    std::string port;
    std::vector<std::string> commands;
	tcp::socket *ourSocket;
	tcp::resolver::iterator *endPoint;
	boost::asio::io_service io_service;

    bool recording;
    
    genoType* ourGenoType;
    
    networkConnection()
    {
        commands.clear();
        recording = true;
        ourGenoType = NULL;
        ready = false;
		ourSocket = NULL;
    }
    
    void connectToInstance(std::string ourAddress, std::string ourPort)
    {
        address = ourAddress;
        port = ourPort;
        
        std::cout << "Connecting to client" << std::endl;
        std::cout << ourAddress << std::endl;
        std::cout << ourPort << std::endl;

        tcp::resolver resolver(io_service);
        tcp::resolver::query query(address,port);
		endPoint = new tcp::resolver::iterator(resolver.resolve(query));
		ourSocket = new tcp::socket(io_service);
        boost::asio::connect(*ourSocket, *endPoint);
        
        std::cout << "Successful" << std::endl;
    }
    
    void reset()
    {

    }
    
    void addCommand(std::string command)
    {
        std::string filteredCommand;
        
        for (int i = 0; i < command.size(); i++)
        {
            if (command.c_str()[i] != '\x04')
            {
                filteredCommand.push_back(command.c_str()[i]);
            }
        }
        
        if (recording == true)
        {
            commands.push_back(filteredCommand);
        }
    }
    
    void addCommandDirect(std::string command)
    {
        std::string commandNL(command);
        commandNL.append("\n");
        commands.push_back(commandNL);
    }
    
    void sendCommands()
    {
		std::string fullmessage;
		commands.insert(commands.begin(),"\n");
        commands.insert(commands.begin(), "client\n");

        //Send all commands
        for (int i = 0; i < commands.size(); i++)
        {
            std::string message = commands.at(i);
			for (int j = 0; j < message.size(); j++)
			{
				fullmessage.push_back(message.at(j));
			}
		}
            boost::system::error_code ignored_error;

			try
			{
				boost::asio::write(*ourSocket, boost::asio::buffer(fullmessage), ignored_error);
				//std::cout << "Sending Data" << std::endl;
				//std::cout << fullmessage;
			}
			catch (std::exception& e)
			{
				std::cerr << e.what() << std::endl;
			}
        
        commands.clear();
    }
    
    void requestCreateSolution(int n)
    {
        addCommandDirect("createInitialSolutions");
        addCommandDirect(numberToString(n));
        sendCommands();
    }
    
    std::vector<genoType*> requestInitialSolutions()
    {
        //std::cout << "????" << std::endl;
        
        std::vector<genoType*> initialSolutions;
        
        //Request Information
        std::string message = "\ngetInitialSolutions\n";

		boost::system::error_code error;
        boost::system::error_code ignored_error;
		
        boost::asio::write(*ourSocket, boost::asio::buffer(message), ignored_error);
        
        genoType *requestedSolution = NULL;
        
        //Frank's better data reader!
        std::string rawIncomingData;
        std::string last4characters;
        
        //std::cout << "Collecting All Data!" << std::endl;
        
        bool reading = true;
        
        while (reading)
        {
            boost::array<char, 256> buf;
            size_t len = ourSocket->read_some(boost::asio::buffer(buf), error);
            for (int copy = 0; copy < len; copy++)
            {
                rawIncomingData.push_back(buf.data()[copy]);
                last4characters.push_back(buf.data()[copy]);
                if (last4characters.size() > 4)
                {
                    last4characters.erase(last4characters.begin());
                }
                
                if (last4characters == "Done")
                {
                    reading = false;
                }
            }
        }
        
        //std::cout << "Full Data Stream" << std::endl;
        //std::cout << rawIncomingData << std::endl;
        
        //std::cout << "Tokening" << std::endl;
        std::vector<std::string> tokenStream;
        std::string currentToken;
        
        for (int i = 0; i < rawIncomingData.size(); i++)
        {
            char currentChar = rawIncomingData.at(i);
            if (currentChar != '\n' && currentChar != '\r' && currentChar != '\0')
            {
                currentToken.push_back(currentChar);
            }
            if (currentChar == '\n')
            {
                tokenStream.push_back(currentToken);
                currentToken = "";
            }
        }
        tokenStream.push_back(currentToken); //The Done Hopefully
        
        //std::cout << "Displaying Token Stream" << std::endl;
        //for (int i = 0; i < tokenStream.size(); i++)
        //{
        //    std::cout << tokenStream.at(i) << std::endl;
        //}
        
        //std::cout << "Okay creating now" << std::endl;
        int mode = 0;
        int place = 0;
        
        for (int tokenNo = 0; tokenNo < tokenStream.size(); tokenNo++)
        {
            std::string myMessageString = tokenStream.at(tokenNo);
            
            if (myMessageString == "Done")
            {
                initialSolutions.push_back(requestedSolution); //Last one
                
                reading = false;
                break;
            }
            
            if (myMessageString == "link" || myMessageString == "upgrade")
            {
                mode = 0;
            }
            
            if (mode == 1)
            {
                place++;
                
                if (place == 1)
                {
                    requestedSolution->upgradeSourceComponent.push_back(myMessageString);
                }
                
                if (place == 2)
                {
                    requestedSolution->upgradeName.push_back(myMessageString);
                }
                
                if (place == 3)
                {
                    requestedSolution->upgradeTargetComponent.push_back(myMessageString);
                }
                
                if (place == 4)
                {
                    requestedSolution->upgradeGaNumber.push_back(string_to_double(myMessageString));
                    place = 0;
                }
            }
            
            if (myMessageString == "upgrade")
            {
                if (requestedSolution != NULL)
                {
                    initialSolutions.push_back(requestedSolution);
                }
                
                mode = 1;
                requestedSolution = new genoType();
                place = 0;
            }
            
            if (mode == 2)
            {
                place++;
                
                if (place == 1)
                {
                    requestedSolution->sourceComponent.push_back(myMessageString);
                }
                
                if (place == 2)
                {
                    requestedSolution->capability.push_back(myMessageString);
                }
                
                if (place == 3)
                {
                    requestedSolution->targetComponent.push_back(myMessageString);
                }
                
                if (place == 4)
                {
                    requestedSolution->componentGaNumber.push_back(string_to_double(myMessageString));
                    place = 0;
                }
                
            }
            
            if (myMessageString == "link")
            {
                mode = 2;
                place = 0;
            }

        }
        
        return initialSolutions;
    }
    
    std::vector<std::string> socketCommands;
    void addCommandSocket(std::string command)
    {
        std::string commandNL(command);
        commandNL.append("\n");
        socketCommands.push_back(commandNL);
    }
    
    void sendCommandSocket()
    {
        //Send all commands
        for (int i = 0; i < socketCommands.size(); i++)
        {
            std::string message = socketCommands.at(i);
            boost::system::error_code ignored_error;
            boost::asio::write(*ourSocket, boost::asio::buffer(message), ignored_error);
        }
        
        socketCommands.clear();
    }
    
    void evaluateSolution(genoType *solution)
    {
        ourGenoType = solution;
        
        //We need to send our genotype over to the evaluator
        addCommandSocket("reset");
        
        //Add All Upgrades
        for (int i = 0; i < solution->upgradeSourceComponent.size(); i++)
        {
            addCommandSocket("upgrade");
            addCommandSocket(solution->upgradeSourceComponent.at(i));
            addCommandSocket(solution->upgradeName.at(i));
            addCommandSocket(solution->upgradeTargetComponent.at(i));
        }
        
        //Add All Links
        for (int i = 0; i < solution->sourceComponent.size(); i++)
        {
            addCommandSocket("link");
            addCommandSocket(solution->sourceComponent.at(i));
            addCommandSocket(solution->capability.at(i));
            addCommandSocket(solution->targetComponent.at(i));
        }
        
        addCommandSocket("remoteEvaluate");
        sendCommandSocket();
    }
    
private:
    bool ready;
public:
    
    void retrieveEvaluation()
    {
        //Request Information
        addCommandSocket("remoteEvaluateResult");
        sendCommandSocket();
        
        //Frank's better data reader!
        std::string rawIncomingData;
        std::string last4characters;
        
        boost::system::error_code error;
        
        //std::cout << "Collecting All Data!" << std::endl;
        
        bool reading = true;
        
        while (reading)
        {
            boost::array<char, 256> buf;
            size_t len = ourSocket->read_some(boost::asio::buffer(buf), error);
            for (int copy = 0; copy < len; copy++)
            {
                rawIncomingData.push_back(buf.data()[copy]);
                last4characters.push_back(buf.data()[copy]);
                if (last4characters.size() > 4)
                {
                    last4characters.erase(last4characters.begin());
                }
                
                if (last4characters == "Done")
                {
                    reading = false;
                }
            }
        }
        
        //std::cout << "Full Data Stream" << std::endl;
        //std::cout << rawIncomingData << std::endl;
        
        //std::cout << "Tokening" << std::endl;
        std::vector<std::string> tokenStream;
        std::string currentToken;
        
        for (int i = 0; i < rawIncomingData.size(); i++)
        {
            char currentChar = rawIncomingData.at(i);
            if (currentChar != '\n' && currentChar != '\r' && currentChar != '\0')
            {
                currentToken.push_back(currentChar);
            }
            if (currentChar == '\n')
            {
                tokenStream.push_back(currentToken);
                currentToken = "";
            }
        }
        tokenStream.push_back(currentToken); //Hopefully pushing back "Done"
        
        bool start = false;
        for (int i = 0; i < tokenStream.size(); i++)
        {
            std::string token = tokenStream.at(i);
            
            if (start)
            {
                ourGenoType->scores.push_back(string_to_double(token));
            }
            
            if (token == "Remote Evaluation Scores")
            {
                start = true;
            }
            
            if (token == "Done")
            {
                start = false;
                break;
            }
        }
    }
    
    std::string numberToString(int number)
    {
        std::string result;
        std::ostringstream convert;
        convert << number;
        result = convert.str();
        return result;
    }
    
    double string_to_double( const std::string& s )
    {
        std::istringstream i(s);
        double x;
        if (!(i >> x))
            return 0;
        return x;
    }
};

#endif

