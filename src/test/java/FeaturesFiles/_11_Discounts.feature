Feature: Discounts Feature

  Background: Login Functionalitiy
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly

  Scenario:User should be able to add a discount
    When Click on the element in left nav
      | setupOne   |
      | parameters |
      | discounts  |
    And Click on the element in the Dialog
      | addButton |
    Then User sending the keys in Dialog content
      | description     | indirim ayarlamasi |
      | integrationCode | 46TR               |
      | priority        | 1                  |
    And Click on the element in the Dialog
      | toggleBar  |
      | saveButton |
    Then Success message should be displayed

  Scenario: User should be able to edit a discount

    When Click on the element in left nav
      | setupOne   |
      | parameters |
      | discounts  |
    And User sending the keys in Dialog content
      | searchDescription | indirim ayarlamasi |
    And Click on the element in the Dialog
      | searchButton |
      | editButton   |
    And User sending the keys in Dialog content
      | description | yeni ayarlama |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: User should be able to delete a discount

    When Click on the element in left nav
      | setupOne   |
      | parameters |
      | discounts  |
    And User delete item from DialogContent by place
      | searchDescription | yeni ayarlama |
    And Success message should be displayed