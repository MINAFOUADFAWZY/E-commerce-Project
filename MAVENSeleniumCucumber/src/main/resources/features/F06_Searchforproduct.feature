@regression
Feature: user could search for a product successfully

  Scenario: user search for a product

    Given user log in
    When user write down his search in search bar
    Then user got his search successfully