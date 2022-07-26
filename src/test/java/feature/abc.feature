Feature: test login fun

Scenario: test login

	Given user shoud be on login page
	When user enter username and password
	And click on login button
	Then user get loged in application