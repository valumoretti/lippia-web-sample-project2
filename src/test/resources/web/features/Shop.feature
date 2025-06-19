@shop @regression
Feature: Shop

  Background:
    Given The client is in landing page

@productCategories
Scenario Outline: Verification of product display when selecting a category from the Shop menu
  When the client clicks on the Shop menu
  And the client clicks on a <productCategory> product category link
  Then only products from that <productCategory> category should be displayed

  Examples:
    | productCategory   |
    | Android           |

  Examples:
    | productCategory   |
    | HTML              |

  Examples:
    | productCategory   |
    | JavaScript        |

  Examples:
    | productCategory   |
    | Selenium          |

@navigateFromShopToOrderConfirmationPage @trabajoFinal
Scenario Outline: Verify that user can navigate to Check Out-Order confirmation page
  When the client clicks on the Shop menu
  And the client clicks the Add to basket button which adds a book
  And the client clicks on Item link with price
  And the client clicks on Proceed to Check out button
  And the client enters "Valeria" in the First Name textbox
  And the client enters "Moretti" in the Last Name textbox
  And the client enters "valumoretti@yahoo.com" in the Email Address textbox
  And the client enters "12345678" in the Phone textbox
  And the client selects "Argentina" in the Country section
  And the client enters "9 de julio 123" in the Address textbox
  And the client enters "Mendoza" in the city textbox
  And the client enters "Mendoza" in the State section
  And the client enters "555" in the Postcode or ZIP textbox
  And the client selects <paymentMethod> in the payment gateway
  And the client clicks on Place Order button
  Then the client can check that the order has been received

  Examples:
    | paymentMethod           |
    | Direct Bank Transfer    |
    | Check Payments          |
    | Cash on Delivery        |
    | PayPal Express Checkout |

@TaxRates @trabajoFinal
Scenario: Verify that tax rate fir indian should be 2% and for abroad it should be 5%
  When the client clicks on the Shop menu
  And the client clicks the Add to basket button which adds a book
  And the client clicks on Item link with price
  And the client clicks on Proceed to Check out button
  And the client selects "Argentina" in the Country section
  And the client selects "India" in the Country section
  Then the client can check tax rate for indian should be '2'%