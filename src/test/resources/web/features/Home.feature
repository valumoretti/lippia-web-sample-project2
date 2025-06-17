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

  @navigateToPaymentPage
  Scenario: Verify that user can navigate to Check Out-Billing Details page
    When the client clicks on the Shop menu
    And the client clicks on the Home menu
    And the client clicks on Selenium Ruby image in the Arrivals section
    And the client clicks the Add To Basket button
    And the client clicks on Item link with price
    And the client clicks on Proceed to Check out button
    Then the client can see the Billing Details form
    And the client can apply a coupon code
    And the client can see order details where total is greater than subtotal
    And the client can opt any payment like direct bank transfer, check, cash or PayPal

  @navigateToOrderConfirmationPage
  Scenario: Verify that user can navigate to Check Out-Order Confirmation page
    When the client clicks on the Shop menu
    And the client clicks on the Home menu
    And the client clicks on Selenium Ruby image in the Arrivals section
    And the client clicks the Add To Basket button
    And the client clicks on Item link with price
    And the client clicks on Proceed to Check out button
    And the client enters "Valeria" in the First Name textbox
    And the client enters "Moretti" in the Last Name textbox
    And the client enters "valumorettiarias@yahoo.com" in the Email Address textbox
    And the client enters "12345678" in the Phone textbox
    And the client selects Argentina in the Country section
    And the client enters "9 de julio" in the Address textbox
    And the client enters "Mendoza" in the State/Country textbox
    And the client enters "123" in the Postcode/ZIP textbox
    And the client selects <payment> in the payment gateway
    And the client clicks on Place Order button
    Then the client can check that the order has been received