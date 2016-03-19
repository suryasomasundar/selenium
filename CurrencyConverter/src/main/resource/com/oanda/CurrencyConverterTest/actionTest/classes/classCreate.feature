Feature: Class Create

@smoke
Scenario Outline: Valid JSON
	Given User navigates to the Website
	Then User reads input from excel "<rownum>"
	Then User inputs quoteCurrency
	Then User inputs baseCurrency
	Then User inputs Date
	Then User inputs quoteAmount
	Then User checks converted baseCurrency
	Then User close the browser
	
	Examples:
	|rownum|
	|1|
	

	

