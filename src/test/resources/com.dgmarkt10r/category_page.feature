
Feature: Category page functionality

@feature/DGMARKT-10R_Andrei_Idt_Storys
@positive

  Scenario: DGMARKT10R-T2 (1.0) "checking the functionality category page"
    Given user is on the main page
    When the user go to a category
    And user checks 4 categories
    And user open a category Health & Beauty
    And user selecting a filter Headphone
    Then user is a headphone page