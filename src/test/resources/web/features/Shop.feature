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
