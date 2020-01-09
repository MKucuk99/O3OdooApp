@import_loadFile
Feature: Import
  As user, I should not be able to load file in CRM/Import module with non CSV or Excel format file


  Scenario: Verify that user is not able to load incorrect format file
    Given user is on import submodule
    Then  user loads the file
    And user verifies that "Import preview failed" message is displayed
