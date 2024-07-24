Feature: Add to cart functionality

  @positive
  @AddToCart
  Scenario: Test1 the ability adding item to cart
    Given user is on the main page
    When user clicks on television category
    And moves the cursor over the product image
    And clicks on the add to cart icon
    Then a message appears indicating that the item was successfully added to the cart

  @positive
  @AddToCart
  Scenario: Test2 the ability adding item to cart
    Given user is on the main page
    When user clicks on television category
    And clicks on the product image
    And clicks on the add to cart button
    Then a message appears indicating that the item was successfully added to the cart
    And  the added products amount appeared next to the cart icon at the top of the page