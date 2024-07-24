Feature: Checking of the cart page functionality

  @positive
  @Cart
  Scenario: Checking of the update quantity button and the field of item quantity changing
    Given user is on the main page
    And user clicks on television category
    And moves the cursor over the product image
    And clicks on the add to cart icon
    And user clicks on the cart icon in the upper right corner of the page
    And user clicks on the view cart button
    When user changes the number of item quantity on "2"
    And clicks on the update button
    Then the total price of items changed to "$518.00"
    And a success message appears on the page

  @positive
  @Cart
  Scenario: Checking of the remove item button functionality
    Given user is on the main page
    And user clicks on television category
    And clicks on the product image
    And clicks on the add to cart button
    And user clicks on the cart icon in the upper right corner of the page
    And user clicks on the view cart button
    When user clicks on the remove item button
    Then a message "Your shopping cart is empty!" appears on the page

  @positive
  @Cart
  Scenario: Checking of the applying coupon code functionality
    Given user is on the main page
    And user clicks on television category
    And clicks on the product image
    And clicks on the add to cart button
    And user clicks on the cart icon in the upper right corner of the page
    And user clicks on the view cart button
    When user clicks on the coupon link
    And inputs coupon code
    And clicks on apply coupon button
    Then a new message appears on the page
    And price changed to "$233.10"

  @positive
  @Cart
  Scenario: Checking of the applying gift certificate functionality
    Given user is on the main page
    And user clicks on television category
    And clicks on the product image
    And clicks on the add to cart button
    And clicks on the cart link in success message
    When user clicks on the gift certificate link
    And inputs certificate code
    And clicks on apply certificate button
    Then a new message about gift certificate applying appears on the page

  @positive
  @Cart
  Scenario: Checking of the continue shopping button functionality
    Given user is on the main page
    And user clicks on television category
    And clicks on the product image
    And clicks on the add to cart button
    And clicks on the cart link in success message
    When user clicks on the continue shopping button
    And closes a subscribe window
    Then user transfers to the main page

  @positive
  @Cart
  Scenario: Checking of the delivery estimate functionality
    Given user is on the main page
    And user clicks on television category
    And clicks on the product image
    And clicks on the add to cart button
    And clicks on the cart link in success message
    When user clicks on the estimate shipping link
    And chooses a country and a region
    And inputs a post code
    And clicks on get quotes button
    And chooses flat rate
    And clicks on the shipping estimate apply button
    Then a new message about shipping estimate applying appears on the page

  @positive
  @Cart
  Scenario: Checking of the checkout button from cart functionality
    Given user is on the main page
    And user clicks on television category
    And clicks on the product image
    And clicks on the add to cart button
    And clicks on the cart link in success message
    When user clicks on the checkout button from cart
    Then user transfers to the checkout page