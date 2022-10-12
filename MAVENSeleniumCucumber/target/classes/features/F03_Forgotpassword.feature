@regression
Feature: user should change his password successfully

  Scenario: user enters valid mail address
    Given user open login page
    And user click on frogot password button
    When user enters valid mail
    Then user could change his password successfully
