@regression
Feature: user could add a product to the whillist successfully

  Scenario: user add a product to the whillist successfully
    Given user login with right data
    When user click on add to whillist
    Then product added successfully to whillist