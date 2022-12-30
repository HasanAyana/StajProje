Feature: Bank Account functionaliitiy

  Background: Login Functionalitiy
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly
  @Regression
  Scenario: Add Bank Account and save

    And Click on the element in left nav
      | setupOne      |
      | parameters    |
      | bankAccount |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | hasan |
      | ibanInput | TR1234 |
      | integrationCode | Aa |
    And Click on the element in the Dialog
      | currency |
      | trySelect |
      | saveButton |
    And Success message should be displayed

  Scenario: Edit Bank Account and save

    And Click on the element in left nav
      | setupOne      |
      | parameters    |
      | bankAccount |
    And User sending the keys in Dialog content
      | searchInput | hasan |
    And Click on the element in the Dialog
      | searchButton |
      | editButton   |
    And User sending the keys in Dialog content
      | nameInput | ahmet |
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed

  Scenario: Delete Bank Account

    And Click on the element in left nav
      | setupOne      |
      | parameters    |
      | bankAccount |
    And User delete item from DialogContent
      | ahmet |
    And Success message should be displayed