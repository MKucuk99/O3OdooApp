Feature: 

	#User Story:
	#An authorized user should be able to login with valid credentials 
	#
	#
	#AC1:
	#Verify that an authorized user should be able to login
	@CT3-156
	Scenario: user should be able to login 
		Feature:  Login
		  As user, I want to be able to login into Brite ERP
		  under different roles with username and password
		  
		  @login_events_crmManager
		  Scenario: Login as "events CRM manager"
		    Given user is on the login page
		    Then user logs in as events CRM manager
		    And user verifies that "Dashboard" page subtitle is displayed
		