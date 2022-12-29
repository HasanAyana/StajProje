Feature: Bank Account functionaliitiy

  Background: Login Functionalitiy
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly

  Scenario: Add Bank Account and save
    And Click on the element in left nav
      | setupOne      |
      | parameters    |
      | bankAccount |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | hasan |
    And Click on the element in the Dialog
      | stageSelect        |
      | stageStudentSelect |
    And Escape character
    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed