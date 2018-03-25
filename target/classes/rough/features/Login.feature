Feature: Free CRM Login feature with Datadriven approach

Scenario: Free CRM login test using datadriven
		Given user is already on  login page
		When title of page is Free CRM
		Then user enters "amitpradhan2011" and "Test@1234"
		Then user clicks on login button
		And user is on homepage
	
