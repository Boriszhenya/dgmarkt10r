
Feature: Checking of the checkout page functionality

  Background:
    Given user is on the main page
    And user clicks on television category
    And moves the cursor over the product image
    And clicks on the add to cart icon
    And clicks on the cart link in success message


  @positive
  @Checkout
  Scenario: Checking of the checkout options functionality
    Given user clicks on the checkout button from cart
    When user clicks on the guest checkout button
    And user clicks on the continue button in checkout options
    Then a legend "Your Personal Details" appears

  @positive
  @Checkout
  Scenario: Checking of the billing details functionality
    Given user clicks on the checkout button from cart
    And user clicks on the guest checkout button
    And user clicks on the continue button in checkout options
    When user inputs personal details and address
    And clicks on the continue button
    Then a text "Please select the preferred shipping method to use on this order." appears

  @positive
  @Checkout
  Scenario: Checking of the delivery method functionality
    Given user clicks on the checkout button from cart
    And user clicks on the guest checkout button
    And user clicks on the continue button in checkout options
    And user inputs personal details and address
    And clicks on the continue button
    When user writes a comment "Just do it!" in the field
    And clicks on the continue button from delivery method
    Then a payment method form appears

  @positive
  @Checkout
  Scenario: Checking of the payment method functionality
    Given user clicks on the checkout button from cart
    And user clicks on the guest checkout button
    And user clicks on the continue button in checkout options
    And user inputs personal details and address
    And clicks on the continue button
    And user writes a comment "Just do it!" in the field
    And clicks on the continue button from delivery method
    When user clicks on checkbox to agree with terms
    And clicks on the continue button from payment method
    Then the total price of items is "$110.00"

  @positive
  @Checkout
  Scenario: Checking of the confirm order functionality
    Given user clicks on the checkout button from cart
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