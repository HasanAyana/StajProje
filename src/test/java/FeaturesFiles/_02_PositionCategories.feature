Feature: Position Categories

  Background:
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly
    And Naviagate to Position Categories

    @Regression
    Scenario Outline: Create Name in Position Categories with Outline
      When User add "<name>" in Position Categories
      Then Success message should be displayed

      When User edit "<EditName>" in Position Categories
      Then Success message should be displayed

      When User delete the "<EditName>" Position Categories
      Then Success message should be displayed

      Examples:
        | name  | | EditName |
        | omer1 | | omer3    |


