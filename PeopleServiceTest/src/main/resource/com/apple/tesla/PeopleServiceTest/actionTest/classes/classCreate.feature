Feature: Class Create

@Smoke
Scenario Outline: Valid JSON
	Given I create a person "<instructorName>" as "Instructor"
	And I create a person "<studentName>" as "Student"
	When I create class with course name "<coursename>"
	Then The response of create class should be validated with responsecode and responseMessage
	Examples:
	|instructorName|studentName|coursename|
	|John Connor|Kyle Reese|Artifical Testing|
	|Snape Dark|Hermoine Granger|Super Magic Testing|
	
	
	
@Smoke
Scenario Outline: Invalid JSON for create class
	Given I create a person "InstructorFirst InstructorLast" as "Instructor"
	And I create a person "StudentFirst StudentLast" as "Student"
	When I send create class for "<description>" with request json as "<json>" 
	Then Asserting the class response with responsecode "<expectedResCode>" and responseMessage "<expectedResMsg>"
	Examples:
	|description|json|expectedResCode|expectedResMsg|
	|Invalid json with no data|{ }|400|INVALID_INPUT|
	
	
