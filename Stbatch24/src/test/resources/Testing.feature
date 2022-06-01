@Savagefamtesting
Feature: Verify total  price including shipping 
Scenario: User able to verify second highest dress and see total price 
	Given User go to Automation site 
	When User click on the dresses tab 
	And User capture all dresses price from resulttab 
	When User add to cart the second highest price dress 
	Then User verify total price including shipping