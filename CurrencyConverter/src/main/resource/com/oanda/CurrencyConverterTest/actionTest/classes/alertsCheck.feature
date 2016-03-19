Feature: Alerts Check

@smoke
Scenario Outline: quoteCurrency alert check
	Given User navigates to the Website
	Then User Enters quoteCurrency "<quoteCurrency>"
	Then User checks for quoteAlert
	Then User close the browser
	
	Examples:
	|quoteCurrency|
	|Malagasy Franc|
	

@smoke
Scenario Outline: baseCurrency alert check
	Given User navigates to the Website
	Then User Enters baseCurrency "<baseCurrency>"
	Then User checks for quoteAlert 
	Then User close the browser
	
	Examples:
	|baseCurrency|
	|Malagasy Franc|
	
	@smoke
Scenario Outline: date alert check
	Given User navigates to the Website
	Then User Enters quoteCurrency "<quoteCurrency>"
	Then User Enters Date "<date>"
	Then User checks for dateAlert
	Then User close the browser
	
	Examples:
	|quoteCurrency|date|
	|Malagasy Franc|03/14/1992|	

