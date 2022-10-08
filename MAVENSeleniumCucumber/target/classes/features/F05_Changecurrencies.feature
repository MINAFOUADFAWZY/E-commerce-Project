@regression
Feature: user should be able to change currency successfully

  Scenario: user change the currency

    Given  user log in to the home page
    When user choose the right currency
    Then user change the currency successfully