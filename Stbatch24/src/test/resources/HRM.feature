@Hrmfeature
Feature: User able to login OrangeHRM site 
Scenario: User succesfully login to orange hrm 
	Given User visit OrangeHRM home page 
	When User type Username 
	And User also type Password 
	Then User click on the Login button 
	And User verify Welcome screen