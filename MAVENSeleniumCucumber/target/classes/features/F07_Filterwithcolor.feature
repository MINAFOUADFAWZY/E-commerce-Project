@regression
Feature: user make filter successfully

  Scenario: user can filter with color

    Given user can login with his user valid data
    When user open a category
    Then user can choose different color