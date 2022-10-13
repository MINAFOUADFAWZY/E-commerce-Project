@regression
Feature: user should select different tags successfully

  Scenario: user can select different tags

    Given user can login with his user mail and password
    When user open a category page
    Then user can choose different tags
