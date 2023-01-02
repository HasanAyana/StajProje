Feature: Attestations Feature

  Background:
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly
    And Naviagate to Attestations Categories
  @Regression
  Scenario Outline:Create Name in Attestations Categories with Outline
    When User add "<name>" in Attestations Categories
    Then Success message should be displayed

    When User add "<name>" in Attestations Categories
    Then already exists message should be displayed

    When User search "<name>" edit "<EditName>"
    Then Success message should be displayed

    When User delete the "<EditName>"
    Then Success message should be displayed

    Examples:
      | name |  | EditName |
      | Ali1 |  | AliE     |




