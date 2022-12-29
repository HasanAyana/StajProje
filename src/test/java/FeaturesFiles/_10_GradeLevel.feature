Feature: Departments Feature

  Background:
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly
    And Naviagate to Grade level Categories

  Scenario Outline:Create Name in Grade level Categories with Outline
    When User add "<name>","<shortName>","<order>" in Grade level  Categories
    Then Success message should be displayed

    When User add "<name>","<shortName>","<order>" in Grade level  Categories
    Then already exists message should be displayed Grade level

    When User edit "<EditName>" Grade Level
    Then Success message should be displayed

    When User delete the "<EditName>"Grade level
    Then Success message should be displayed

    Examples:
      | name |  | EditName |  | shortName |  | order     |
      | AAAa |  | AliW     |  | 78956132  |  | 1 |
