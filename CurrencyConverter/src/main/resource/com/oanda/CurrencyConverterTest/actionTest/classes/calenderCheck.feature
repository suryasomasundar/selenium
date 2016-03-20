Feature: Alerts Check

@smoke
Scenario Outline: Validating whether User is able to select date from calender
	Given User navigates to the Website
	Then User selects date
	Then User clicks on calender icon
	Then User checks whether navigation between years works
	Then User checks whether navigation between months works
	Then User close the browser
	
	Examples:
	|quoteCurrency|
	|Malagasy Franc|
	



