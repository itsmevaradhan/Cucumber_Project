@data
Feature: OrangeHrmLoginPage

@hello @knight
Scenario: Valid Login

		And user enter the user name "Admin"
		And user enter the password "admin123"
		And user clicks on login button
		Then user should navigate to the dashboard
		
