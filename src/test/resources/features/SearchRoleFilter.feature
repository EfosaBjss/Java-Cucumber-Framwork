Feature: Search Role Filter

  Scenario: I should be able to search for role using the Filter feature on the roles page
    Given I am on the search job page via lifestyle - explore roles
    And I enter the below search criteria
    When I click on the update results button
    Then the results should be updated
