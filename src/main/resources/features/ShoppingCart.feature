Feature: Shopping Cart
  Scenario: user go to shopping cart page
    Given user go to Shopping Cart page

    Scenario: user add item to cart
      Given user select item
      When user go to Shopping Cartpage
      And user select the item
      Then the item selected successfully