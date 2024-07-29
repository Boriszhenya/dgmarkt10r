
Feature: DGMARKT10R-42 - Log in - Log out user

  @positive
  @loginlogout
  Scenario: DGMARKT10R-T38 (1.0) - Login to the site with valid data
    Given user is on the main page
    When the user goes to the My account menu
    And goes to the Login tab
    And enter a valid e-mail "petrov@gmail.com" and password "Petr123"
    Then the main page will say "Congratulation! Login Successfully"

  @positive
  @loginlogout
  Scenario: DGMARKT10R-T39 (1.0) - Log out of the registered user account
    Given user is on the main page
    And already authorized
    When the user goes to the My account menu
    And goes to the Logout tab
    Then a pop-up window appears with the name "Account Logout" on it

  @positive
  @loginlogout
  Scenario: DGMARKT10R-T40 (1.0) - Log in with valid credentials using the link in the footer
    Given user is on the main page
    When a user goes to the My Account menu using the link in the footer
    And user authorizes using valid data
    Then the "Account" page opens

  @positive
  @loginlogout
  Scenario: DGMARKT10R-T41 (1.0) - Log out of the account on the "Account" page
    Given user is on the main page
    And already authorized
    When the user goes to the My account menu
    And goes to the My Account
    And clicks on the Logout link
    Then then user exit from My Account to the "Account Logout" page