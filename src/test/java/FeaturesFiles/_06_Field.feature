Feature: Datatable Functionality

  Background:
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly
  @Regression
  Scenario: Create Fields
    And Click on the element in left nav
      | setupOne   |
      | parameters |
      | fields |

    And Click on the element in the Dialog
      | addButton2 |

    And User sending the keys in Dialog content
      | nameInput | karhan25 |
      | codeInput | 251127     |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from DialogContent
      | karhan25 |

    Then Success message should be displayed
