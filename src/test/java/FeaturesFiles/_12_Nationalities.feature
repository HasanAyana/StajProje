Feature: Nationalities Feature

  Background: Login Functionalitiy
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly

  Scenario:User should be able to add a nationality
    When Click on the element in left nav
      | setupOne   |
      | parameters |
      | nationalities  |
    And Click on the element in the Dialog
      | addButton |
    Then User sending the keys in Dialog content
      | nameInput     | oilrep_5 |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: User should be able to edit a nationality

    When Click on the element in left nav
      | setupOne   |
      | parameters |
      | nationalities  |
    And User sending the keys in Dialog content
      | searchInput | oilrep_5 |
    And Click on the element in the Dialog
      | searchButton |
    Then Wait untill finding the item
    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | oilrep_55 |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario: User should be able to delete a nationality

    When Click on the element in left nav
      | setupOne   |
      | parameters |
      | nationalities  |
    And User delete item from DialogContent
      | oilrep_55 |
    Then Success message should be displayed