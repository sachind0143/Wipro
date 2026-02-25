Feature:Login functionality DataDrivern
	scenario:Test Data Table
		Given the user is on the SauceDemo login page
		When the user enters credentials
		 	|	Username		|	password		|
		 	|statndard_user	|	secret_sauce	|
		 	|admin			|	admin		|
		 	|user			|	user			|
		
		Then the user should be redirected to products page