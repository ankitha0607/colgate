
Feature: Prompt alert - colgate

  Scenario: Dealing with prompt alert
    Given I open the colgate main page
    When the email prompt is displayed
    And  I enter the email, click on submit and close the prompt
    Then check display of the main page without the prompt
    And close the browser


