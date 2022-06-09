Feature: NavigateToPages

  @Test
  Scenario: I want to be able to navigate to the different Pages of the BJSS site
    Given I navigate to the BJSS site
    And I navigate to the  below pages by clicking the tabs
      |PageName|
      |About |
      |Insights|
      |Your Industry|
      |Contact|
      |careers|
    Then the career page should be displayed
