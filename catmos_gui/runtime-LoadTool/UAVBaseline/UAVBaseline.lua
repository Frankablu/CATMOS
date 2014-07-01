
function RouteClearance() 
	return 0.25 * getCapability("Ground Fire Power") + 0.25 * getCapability("Hard Target Removal") + 0.25 * getCapability("Mine Clearance Solution") + 0.25 * getCapability("Command and Control")
end

function LightGun()
    return 5.0 * getCapability("Surveillance Static Targets") + 5.0 * getCapability("Surveillance Moving Targets")
end

function MineClearance()
	return 0.8 * getCapability("Mine Clearance Chance of Death") + 0.2 * getCapability("Mine Clearance Per Day")
end

function SupplyForwardBase()
	return 0.34 * getCapability("Supply Water") + 0.33 * getCapability("Supply Fuel") + 0.33 * getCapability("Supply Goods");
end

function Surveillance()
	return 0.5 * getCapability("Surveillance Static Targets") + 0.5 * getCapability("Surveillance Moving Targets");
end

function BaseQuality()
	if getCapability("Supply Goods") > 0.3 then
		return 1.0
	end
	return getCapability("Supply Goods") * 0.3;
end

function DetectEnemyCrossings()
	return getCapability("Surveillance Moving Targets");
end

function StopEnemyCrossings()
	return math.min(getCapability("Ground Fire Power")*7.0, getCapability("Command and Control"));
end

function HoldForwardBase()
	return 0.5 * getCapability("Establish Forward Base") + 0.5 * getCapability("Supply Forward Base");
end

function PreventEnemyCrossings()
	return math.min(DetectEnemyCrossings(), StopEnemyCrossings())
end

function OverallScore()
	return 0.333 * getCapability("Route Clearance") + 0.333 * getCapability("Hold Forward Base") + 0.334 * getCapability("Stopping Enemy Crossings")
end



