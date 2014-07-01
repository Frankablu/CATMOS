//
//  luascripts.cpp
//  catmos
//
//  Created by Frank on 26/04/2013.
//  Copyright (c) 2013 __MyCompanyName__. All rights reserved.
//

//Lua - Script Integration

#include <iostream>
#include <vector>

#ifndef LUASCRIPT_HEADER
#define LUASCRIPT_HEADER

extern "C" {
#include "lua.h"
#include "lualib.h"
#include "lauxlib.h"
}

extern int getMeasure(lua_State *L);
extern int getGlobalMeasure(lua_State *L);
extern int getScenarioMeasure(lua_State *L);
extern int countComponent(lua_State *L);
extern int getAllMeasures(lua_State *L);
extern int getCapability(lua_State *L);
extern int canUseCapability(lua_State *L);

class luascripts
{
private:
    lua_State *L;
    
public:
    
    luascripts()
    {
        L = luaL_newstate();
        
        luaopen_io(L); // provides io.*
        luaopen_base(L);
        luaopen_table(L);
        luaopen_string(L);
        luaopen_math(L);
        luaL_openlibs(L);
        
        lua_register(L, "getMeasure", getMeasure);
        lua_register(L, "getGlobalMeasure", getGlobalMeasure);
        lua_register(L, "getScenarioMeasure", getScenarioMeasure);
        lua_register(L, "countComponent", countComponent);
        lua_register(L, "getAllMeasures", getAllMeasures);
        lua_register(L, "getCapability", getCapability);
        lua_register(L, "canUseCapability", canUseCapability);
    }
    
    std::string run(std::string script)
    {
        //std::cout << "Send " << script << std::endl;
        
        int sa = luaL_dostring(L,"");
        
        if ( sa==0 ) {
            // execute Lua program
            sa = lua_pcall(L, 0, LUA_MULTRET, 0);
        }
        
        int sb = luaL_dostring(L,"output = \"ERROR\"");
        
        if ( sb==0 ) {
            // execute Lua program
            sb = lua_pcall(L, 0, LUA_MULTRET, 0);
        }
        
        int s = luaL_dostring(L,script.c_str());
        
        if ( s==0 ) {
            // execute Lua program
            s = lua_pcall(L, 0, LUA_MULTRET, 0);
        }
        
        lua_getglobal(L, "output");
        
        std::string outputs;
        std::string copiedString;
        
        if (lua_isstring(L,-1))
        {
            outputs = lua_tostring(L,-1);
            
            //Copy String
            for (int i = 0; i < outputs.size(); i++)
            {
                copiedString.push_back(outputs.at(i));
            }
            
            lua_pop(L,1); //Release The Memory In Lua
        }
        //std::cout << "Retrieve" << outputs << std::endl;
        
        return copiedString;
    }
    
    ~luascripts()
    {
        lua_close(L);
    }
    
};

#endif




