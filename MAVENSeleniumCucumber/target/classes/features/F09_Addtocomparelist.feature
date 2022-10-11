@regression
Feature: user could add his product to comparelist succssfully

  Scenario: user add a product to comparelist
    Given user could login with valid data
    When user click on add to comparelist
    Then product added successfully to comparelist