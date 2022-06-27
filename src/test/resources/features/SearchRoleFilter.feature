Feature: Search Role Filter

  @Search
  Scenario: I should be able to search for role using the Filter feature on the roles page
    Given I am on the search job page via life - explore roles
    And I enter the below searchCriteria
    | Field          | Value         |
    |ByCountry       | United Kingdom|
    |ByCity          | Manchester    |
    |ByTeam          | Development   |
    |ByEmploymentType| Any           |

    When I click on the update results button
    Then the results should be updated
