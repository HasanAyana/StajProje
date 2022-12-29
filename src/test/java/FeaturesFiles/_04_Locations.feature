Feature: School Setup Locations

  Background:
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly
    And Naviagate to Locations under School Setup
  @Regression
    Scenario: Locations
      When User create new locaiton
      Then Success message should be displayed

      When User delete item from Dialog
      Then Success message should be displayed

