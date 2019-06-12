
@version: CarnivalTest

Feature:Cruise search in Home Page

    Scenario: Selection of destination
    Given I am in the homepage
    When I select cruises to Bahamas
    Then I can check the options sorted by price

    Scenario: Check itinerary and book cruise
    Given I am in the homepage
    When I select cruises to Bahamas
    Then I can see the itinerary and book the cruise