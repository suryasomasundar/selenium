Feature: Textbox Validation

@smoke
Scenario Outline: quoteTextbox validation with field length check and autoformatting
	Given User navigates to the Website
	Then User inputs quoteTextbox "<input>"
	Then User checks the quoteTextbox "<expected>"
	Then User close the browser
	
	Examples:
	|input|expected|
	|123.456.758|123.456|
	|123.456.758.213|123.456|
	|1234567891234567|123456789123456|
	|abcd#4ufdeh|abcd#4ufdeh|
	|123,456,789|123,456,789|
	|1,6,87,6544|16,876,544|
	|1,687.54,6|1,687.54,6|
	|1,6,76.5.43|1,676.5|
	
@smoke
Scenario Outline: baseTextbox validation with field length check and autoformatting
	Given User navigates to the Website
	Then User inputs baseTextbox "<input>"
	Then User checks the baseTextbox "<expected>"
	Then User close the browser
	
	Examples:
	|input|expected|
	|123.456.758|123.456|
	|123.456.758.213|123.456|
	|1234567891234567|123456789123456|
	|abcd#4ufdeh|abcd#4ufdeh|
	|123,456,789|123,456,789|
	|1,6,87,6544|16,876,544|
	|1,687.54,6|1,687.54,6|
	|1,6,76.5.43|1,676.5|
	
	@smoke
Scenario Outline: Validating baseTextbox Value based on quoteTextbox
	Given User navigates to the Website
	Then User reads input from excel "1"
	Then User inputs quoteCurrency
	Then User inputs baseCurrency
	Then User inputs Date
	Then User inputs baseTextbox "<input>"
	Then User checks the quoteTextbox "<expected>"
	Then User close the browser
	
	Examples:
	|input|expected|
	|999999999999999|1,114,590,000,000,000|
	|0|0.00000|
	|0.0000000000001|0.00000|
	|0.00001|0.00001|
	|0.000jh|-|
	|abhghg|-|
	|-100|88.7256|
	|$100|-|
	|empty|0.00000|
	
		@smoke
Scenario Outline: Validating quoteTextbox Value based on baseTextbox
	Given User navigates to the Website
	Then User reads input from excel "1"
	Then User inputs quoteCurrency
	Then User inputs baseCurrency
	Then User inputs Date
	Then User inputs quoteTextbox "<input>"
	Then User checks the baseTextbox "<expected>"
	Then User close the browser
	
	Examples:
	|input|expected|
	|999999999999999|1,114,590,000,000,000|
	|0|0.00000|
	|0.0000000000001|0.00000|
	|0.00001|0.00001|
	|0.000jh|-|
	|abhghg|-|
	|-100|88.7256|
	|$100|-|
	|54 76|-|
	|empty|0.00000|
