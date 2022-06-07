Feature: Careers page

  @Test
  Scenario Outline: Verify that user can navigate to career page
    Given I navigate to Bjss site
    When I choose navigate to the <PageName> page
    Then I should see the <PageName> page displayed

    Examples:
      |PageName|
      |careers |