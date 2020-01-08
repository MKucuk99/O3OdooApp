@Calendar
Feature: As a user I should be able to see scheduled meetings entering host name

  Scenario: Login as expensesmanager
    Given user is on login page
    Then user enters valid username and password
    And user clicks on sign in button
    Then user clicks on Calendar tab module
    Then user click on Everybody's Calendar checkbox under Attendees
    When user enters name 'Tabriz' on search box
    Then  user should be able to see the meetings hosted by 'Tabriz'