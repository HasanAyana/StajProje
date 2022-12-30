Feature: Departments Feature

  Background:
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly
    And Naviagate to Departments Categories
  @Regression
  Scenario Outline:Create Name in Departments Categories with Outline
    When User add "<name>","<code>" in Departments Categories
    Then Success message should be displayed

    When User add "<name>","<code>" in Departments Categories
    Then already exists message should be displayed departments

    When User edit "<EditName>"departments
    Then Success message should be displayed

    When User delete the "<EditName>"departments
    Then Success message should be displayed

    Examples:
      | name |  | EditName |  | code |
      | AAAa |  | AliW     |  | 78956132  |


