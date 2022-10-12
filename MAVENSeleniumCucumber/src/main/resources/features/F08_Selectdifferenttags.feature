@regression
Feature: user should checkout successfully

  Scenario: user can filter with color

    Given user can login with his user mail and password
    When user open a category page
    Then user can choose different tags