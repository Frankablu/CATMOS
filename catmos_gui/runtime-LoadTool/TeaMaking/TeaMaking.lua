
--Tea Rating Function - Domain Specific Knowledge of "Good Tea"
function TeaRating()
	--Get Measurements From Completed Goal Model
	temperature = getScenarioMeasure("Temperature")
	flavour = getScenarioMeasure("Flavour")
	insulation = getScenarioMeasure("Insulation")
	
	score = 0.0
	
	--Temperature over 75 degrees doesn't help
	if (temperature > 70.0) then temperature = 70.0 end
	
	--Score based on Temperature
	score = temperature / 70.0 * 3.0
	
	--If Flavour Is Excellent Add 1 To Score
	for a,b in pairs(flavour) do
		if (b == "Excellent") then
			score = score + 1.0
		end
	end
	
	--If in Insulated Cup Add 1 To Score
	for a,b in pairs(insulation) do
		if (b == "Good") then
			score = score + 1.0
		end
	end
	
	--If any of the Tea, Water or Container is missing Score 0.
	if (canUseCapability("Tea") == 0 or canUseCapability("Water") == 0 or canUseCapability("Container") == 0) then
		score = 0.0
	end
	
	return score
end
