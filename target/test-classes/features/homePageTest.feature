
@version: CarnivalTest

Feature:As a user
        I want to search cruises to The Bahamas with duration
        between 6 and 9 days so that
        I will visualize all the options to choose
        one. Right now, I don’t care about departure port.

    Scenario: Selection of destination
    Given I am in the homepage
    When I select cruises to Bahamas
    Then I can check the options sorted by price