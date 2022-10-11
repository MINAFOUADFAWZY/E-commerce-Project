@regression
Feature: user should add product to shop card successfully

  Scenario: user add the product to shop card
    Given user can login
    When user click on shop card
    Then user get his product added