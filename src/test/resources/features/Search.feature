Feature: Search

  Scenario: Successful search

    Given selenium documentation page is displayed
    When the "selenium manager" word is searched
    Then the result that includes "selenium_manager" is displayed