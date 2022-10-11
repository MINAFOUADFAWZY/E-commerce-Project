@regression
Feature:user should be able to search a product successfully

  Scenario: user enters valid search data
    Given user can open login page
    And user log in successfully
    When user enters valid search data
    Then user redirected to his search successfully