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

      When User delete the "<name>"
      Then Success message should be displayed

      Examples:
        | name  |
        | omer1 |
        | omer2 |

