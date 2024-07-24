Feature: E2E Testing the product purchase process

  @positive @E2E
  Scenario: Checking the product purchase process
    Given user is on the main page
    And user clicks on television category
    And moves the cursor over the product image
    And clicks on the add to cart icon
    And clicks on the cart link in success message
    And user changes the number of item quantity on "2"
    And clicks on the update button
    And user clicks on the coupon link
    And inputs coupon code
    And clicks on apply coupon button
    And user clicks on the estimate shipping link
    And chooses a country and a region
    And inputs a post code
    And clicks on get quotes button
    And chooses flat rate
    And clicks on the shipping estimate apply button
    And user clicks on the checkout button from cart
    And user clicks on the guest checkout button
    And user clicks on the continue button in checkout options
    And user inputs personal details and address
    And clicks on the continue button
    And user writes a comment "Just do it!" in the field
    And clicks on the continue button from delivery method
    And user clicks on checkbox to agree with terms
    And clicks on the continue button from payment method
    When user clicks on the confirm order button
    Then a new message "Your Order Has Been Placed!" appears on the page