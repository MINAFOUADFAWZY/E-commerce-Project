@regression
Feature: user should be able to login to the system
  Background: user open Browser and navigate to URL

  Scenario: user login with valid username and password


    Given user navigates to login page
    When user enter valid username and password
    Then user could login successfully

