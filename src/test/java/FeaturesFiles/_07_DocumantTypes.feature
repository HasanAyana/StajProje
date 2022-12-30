Feature: Documant Types functionaliitiy

  Background: Login Functionalitiy
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly
  @Regression
  Scenario: Add Document Types and save

    And Click on the element in left nav
      | setupOne      |
      | parameters    |
      | documentTypes |
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

  Scenario: Edit Document Types and save

    And Click on the element in left nav
      | setupOne      |
      | parameters    |
      | documentTypes |
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

  Scenario: Delete Document Types

    And Click on the element in left nav
      | setupOne      |
      | parameters    |
      | documentTypes |
    And User delete item from DialogContent
      | ahmet |
    And Success message should be displayed