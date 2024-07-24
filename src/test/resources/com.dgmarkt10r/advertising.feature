Feature: Advertising functionality

  @positive
  @Promo
  Scenario: Testing the ability of the image to change
    Given user is on the main page
    When user waits when button read more appears
    Then a button read more has appeared