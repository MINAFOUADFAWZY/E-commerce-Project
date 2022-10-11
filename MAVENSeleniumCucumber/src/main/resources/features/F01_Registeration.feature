@regression
Feature: user should be able to register successfully
  Background: user open Browser and navigate to URL
    

  Scenario: user register with valid input data


    Given user navigate to registeration page
    When user enter valid input data
    Then user could register successfully
