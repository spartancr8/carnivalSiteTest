
@version: CarnivalTest

Feature:Cruise search in Home Page

    Scenario: Selection of destination
    Given I am in the homepage
    When I select cruises to Bahamas
    Then I can check the options sorted by price