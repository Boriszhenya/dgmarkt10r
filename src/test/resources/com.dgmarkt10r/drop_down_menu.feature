Feature: Checking of the drop down page functionality

  @positive
  @DropDownMenu
  Scenario: Checking of the cart icon functionality in the upper right corner of the page
    Given user is on the main page
    And user clicks on television category
    And moves the cursor over the product image
    And clicks on the add to cart icon
    When user clicks on the cart icon in the upper right corner of the page
    And clicks on the remove button
    Then the number of products in the upper right corner of the page next to the cart icon are "0"

  @positive
  @DropDownMenu
  Scenario: Checking of the view cart button functionality
    Given user is on the main page
    And user clicks on television category
    And clicks on the product image
    And clicks on the add to cart button
    And user clicks on the cart icon in the upper right corner of the page
    When user clicks on the view cart button
    Then user transfers to the cart page

  @positive
  @DropDownMenu
  Scenario: Checking of the checkout button from drop down menu functionality
    Given user is on the main page
    And user clicks on television category
    And clicks on the product image
    And clicks on the add to cart button
    And user clicks on the cart icon in the upper right corner of the page
    When user clicks on the checkout button from drop down menu
    Then user transfers to the checkout page