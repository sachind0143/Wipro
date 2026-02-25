Feature: Login functionality DataDriven

Scenario: Multiple login attempts
  	Given the user is on the SauceDemo login page
  	When the user enters the following credentials
    	| username        | password       |
    	| admin			  | admin	 	   |
    	| user 			  | user		   |
    	|standard_user    |secret_sauce    |
  
  	Then the result should be validated