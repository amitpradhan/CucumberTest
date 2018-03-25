Feature: Free CRM Login Feature
#
#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#	Given user is already on Login Page
#	When title of login page is Free CRM
#	Then user enters "amitpradhan2011" and "Test@1234"
#	Then user clicks on login button
#	Then user is on home page
#	
	
	
	
	
##With Examples Keyword
Scenario Outline: Free CRM Login Test Scenario
	Given user is already on Login Page
	When title of login page is Free CRM
	Then user enters "<username>" and "<password>"
	Then user clicks on login button
	Then user is on home page
	Then user close the browser
	
Examples:
	|username		|password  |
	|amitpradhan2011|Test@1234 |
	|amitpradhan2011|Test@12342|
	
	
	
	
	