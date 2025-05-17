@home @regression
Feature: Home

    Background:
      Given The client is in landing page

  @only3Sliders
  Scenario: Verifying landing page has only '3' sliders
    Then the client can check that has only '3' sliders

  @only3Arrivals
  Scenario: Verifying landing page has only '3' arrivals
    Then the client can check that has only '3' arrivals

  @arrivalsNavigation
  Scenario Outline: Verifying navigation through an image in the Arrivals section
    When the client clicks on the Shop menu
    And the client clicks on the Home menu
    And the client clicks on <imageName> image in the Arrivals section
    Then the client can verify that it navigates to a page where the book <imageName> can be added to the basket

    @seleniumArrivalNavigation
    Examples:
      | imageName             |
      | Selenium Ruby         |

    @htmlArrivalNavigation
    Examples:
      | imageName             |
      | Thinking in HTML      |

    @javaScriptArrivalNavigation
    Examples:
      | imageName             |
      | Mastering JavaScript  |