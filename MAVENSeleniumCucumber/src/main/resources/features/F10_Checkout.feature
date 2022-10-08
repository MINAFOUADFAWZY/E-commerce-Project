@regression
Feature: user should checkout successfully

  Scenario: user do his checkout

    Given user can login with his user
    When user complete checkout steps
    Then user do checkout successfully