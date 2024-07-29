
Feature: DGMARKT10R-16 - User registration

  @positive
  @registrationForm
  Scenario: DGMARKT10R-T4 (1.0) - User registration with valid data
    Given user is on the main page
    When the user goes to the My account menu
    And goes to the Register tab
    And fills in all fields of the registration form with valid data
    Then clicking on the Continue button brings up a window that says "Your Account Has Been Created!"

  @negative
  @registrationForm
  Scenario Outline: DGMARKT10R-T17 (1.0) - Checking the "Password" field with non-valid data
    Given user is on the main page
    And the user goes to the My account menu
    And goes to the Register tab
    When the user enters in the Password field "<valueInvalidPassword>"
    And press the Continue button
    Then the message under the password field "Password must be between 4 and 20 characters!"
    Examples:
      | valueInvalidPassword                       |
      | P2_                                        |
      | 123456789012345678901234567890121234567890 |
      |                                            |

  @negative
  @registrationForm
  Scenario Outline: DGMARKT10R-T15 (1.0) - Checking the "Telephone" field with non-valid data
    Given user is on the main page
    And the user goes to the My account menu
    And goes to the Register tab
    When the user enters in the Telephone field "<valueInvalidTelephone>"
    And press the Continue button
    Then the message under the Telephone field "Telephone must be between 3 and 32 characters!"
    Examples:
      | valueInvalidTelephone              |
      | 12                                 |
      | ++12345678901234567890123456789012 |
      | <b>data entered for the test</b>   |
      |                                    |

  @negative
  @registrationForm
  Scenario Outline: DGMARKT10R-T12 (1.0) - Checking the "E-Mail" field with non-valid data
    Given user is on the main page
    And the user goes to the My account menu
    And goes to the Register tab
    When the user enters in the E-Mail field "<valueInvalidEMail>"
    And press the Continue button
    Then the message under the E-Mail field "E-Mail Address does not appear to be valid!"
    Examples:
      | valueInvalidEMail                          |
      | @gmail.com                                 |
      | <b>data entered for the test</b>@gmail.com |
      | PetrPetrPetrPetrPetrPetrPetrPetr           |
      |                                            |
      | petr.sdfsd.com                             |
      | @                                          |
      | petr@gmail                                 |
      | petr@.com                                  |
      | petr@____.com                              |

  @negative
  @registrationForm
  Scenario Outline: DGMARKT10R-T8 (1.0) - Checking the "First Name" field with non-valid data
    Given user is on the main page
    And the user goes to the My account menu
    And goes to the Register tab
    When the user enters in the First Name field "<valueInvalidFirstName>"
    And press the Continue button
    Then the message under the First Name field "First Name must be between 1 and 32 characters!"
    Examples:
      | valueInvalidFirstName             |
      | PetrPetrPetrPetrPetrPetrPetrPetrP |
      | <b>data entered for the test</b>; |
      |                                   |

  @negative
  @registrationForm
  Scenario Outline: DGMARKT10R-T10 (1.0) - Checking the "Last Name" field with non-valid data
    Given user is on the main page
    And the user goes to the My account menu
    And goes to the Register tab
    When the user enters in the Last Name field "<valueInvalidLastName>"
    And press the Continue button
    Then the message under the Last Name field "Last Name must be between 1 and 32 characters!"
    Examples:
      | valueInvalidLastName              |
      | PetrPetrPetrPetrPetrPetrPetrPetrP |
      | <b>data entered for the test</b>; |
      |                                   |

  @positive
  @registrationForm
  Scenario: DGMARKT10R-T43 (1.0) - Check if it is possible to go to the "Register Account" form when clicking on the favorites icon
    Given user is on the main page
    And the user goes to the My account menu
    When a user clicks on the heart icon
    And clicks the Continue button on the New Customer form
    Then the new user registration form "Register Account" opens

  @positive
  @registrationForm
  Scenario: DGMARKT10R-T42 (1.0) - Check if it is possible to go to the "Register Account" form the link in the footer
    Given user is on the main page
    When the user clicks the My Account link in the footer
    And clicks the Continue button on the New Customer form
    Then the new user registration form "Register Account" opens