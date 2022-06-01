@automationPractice
Feature: Verify total price including shippinng 
Scenario: User able to add second highest dress and see total Prices 
	Given user go to automationpractice site 
	When user click on the dress tab 
	And user ccapture all dress price from resultset 
	And user add to the cart the second highest price dress 
	Then user verify the total price including shipping 