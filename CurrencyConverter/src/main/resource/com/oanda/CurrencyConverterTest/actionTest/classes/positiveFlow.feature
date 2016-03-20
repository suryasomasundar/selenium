Feature: Currency Conversion

@smoke
Scenario Outline: Checking currency conversion between different countries by giving quote currency and flipping
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
	|2|
	|3|
    |4|
	
	
	@smoke
Scenario Outline: Checking currency conversion between different countries by giving base currency and flipping
	Given User navigates to the Website
	Then User reads input from excel "<rownum>"
	Then User inputs quoteCurrency
	Then User inputs baseCurrency
	Then User inputs Date
	Then User inputs baseAmount
	Then User checks converted quoteCurrency
	Then User close the browser
	
	Examples:
	|rownum|
	|2|
	|3|
    |4|

