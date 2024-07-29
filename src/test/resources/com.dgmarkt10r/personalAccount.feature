
Feature: DGMARKT10R-17 - personal account

  @positive
  @personalAccount
  Scenario: DGMARKT10R-T68 (1.0) - Adding a new entry on the "Address Book" page
    Given user is on the main page
    And already authorized
    When the user goes to the My account menu
    And goes to the My Account
    And goes to the Address Book
    And go to New Address
    And fills in the fields with valid data
      | firstName | lastName | company       | address1   | address2         | city    | postCode | country | regionState |
      | Petr1     | Petrov12 | Roga i kopita | Lenina, 15 | Leipzigerstr, 18 | Oschatz | 04758    | Germany | Sachsen     |
    And click Continue
    Then the Address Book  page will say "Your address has been successfully added"

  @positive
  @personalAccount
  Scenario: DGMARKT10R-T70 (1.0) - Deleting an entry on the "Address Book" page
    Given user is on the main page
    And already authorized
    When the user goes to the My account menu
    And goes to the My Account
    And goes to the Address Book
    And deleted the first record in the table
    Then the Address Book  page will say "Your address has been successfully deleted"

  @positive
  @personalAccount
  Scenario: DGMARKT10R-T72 (1.0) - Changes to the entry on the "Address Book" page
    Given user is on the main page
    And already authorized
    When the user goes to the My account menu
    And goes to the My Account
    And goes to the Address Book
    And changes the LastName field in the last record to "Sidorov1"
    Then the Address Book  page will say "Your address has been successfully updated"

  @positive
  @personalAccount
  Scenario: DGMARKT10R-T66 (1.0) - checking of the password change form in the "Change Password" window when
  an invalid value is entered in the "Password Confirm" field
    Given user is on the main page
    And already authorized
    When the user goes to the My account menu
    And goes to the My Account
    And goes to the Password
    And enters the value "Petr12345" in the Password field
    And enters the value "Petr12345False" in the Password Confirm field
    And click Continue
    Then under the Password Confirm field "Password confirmation does not match password!"

  @positive
  @personalAccount
  Scenario Outline: DGMARKT10R-T63 (1.0) - Testing the form for editing personal data on the "My Account Information" page
    Given user is on the main page
    And already authorized
    When the user goes to the My account menu
    And goes to the My Account
    And goes to the Edit Account
    When user fills in the fields First Name "<firstName>", Last Name "<lastName>",  Telephone "<telephone>"
    And click Continue
    Then the centre page will say "Success: Your account has been successfully updated."
    Examples:
      | firstName | lastName | telephone      |
      | Ivan      | Ivanov   | +3806799911158 |
      | Petr      | Petrov   | +4915112512879 |

  @positive
  @personalAccount
  Scenario: DGMARKT10R-T73 (1.0) - Testing the "My Wish List" page
    Given user is on the main page
    And already authorized
    When the user goes to the My account menu
    And goes to the My Account
    And goes to the My Wish List Book
    Then in the list of products there is an item with the name "Belkin - Network device mounting bracket"

  @positive
  @personalAccount
  Scenario Outline: DGMARKT10R-T50 (1.0) - Checking clicks on links on the left side of the "Account" page
    Given user is on the main page
    And already authorized
    When the user goes to the My account menu
    And goes to the My Account
    When user goes to the "<linkName>"
    Then a page will open up with the name "<pageName>"
    Examples:
      | linkName                              | pageName           |
      | Edit your account information         | Edit Information   |
      | Change your password                  | Change Password    |
      | Modify your address book entries      | Address Book       |
      | Modify your wish list                 | My Wish List       |
      | View your order history               | Order History      |
      | Downloads                             | Downloads          |
      | Your Reward Points                    | Reward Points      |
      | View your return requests             | Product Returns    |
      | Your Transactions                     | Your Transactions  |
      | Recurring payments                    | Recurring Payments |
      | Register for an affiliate account     | Affiliate          |
      | Subscribe / unsubscribe to newsletter | Newsletter         |

  @positive
  @personalAccount
  Scenario Outline: DGMARKT10R-T49 (1.0) - Checking clicks on links in the table on the right side of the "Account" page
    Given user is on the main page
    And already authorized
    When the user goes to the My account menu
    And goes to the My Account
    When user goes to the "<linkName>" in the table
    Then a page will open up with the name "<pageName>"
    Examples:
      | linkName           | pageName           |
      | Edit Account       | Edit Information   |
      | Password           | Change Password    |
      | Address Book       | Address Book       |
      | Wish List          | My Wish List       |
      | Order History      | Order History      |
      | Downloads          | Downloads          |
      | Reward Points      | Reward Points      |
      | Returns            | Product Returns    |
      | Transactions       | Your Transactions  |
      | Recurring Payments | Recurring Payments |
      | Newsletter         | Newsletter         |