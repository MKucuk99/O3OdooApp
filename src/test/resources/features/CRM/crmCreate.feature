
  Feature: Create event in CRM

  As a authorized user i should be able to create an opportunity

    @eventsCrmManager
    Scenario: Create an event in CRM
      Given user is on login page
      Then user logs as an events crmManager
      And user verifies that "Create" button is clickable
      And user should be able to crate a opportunity





