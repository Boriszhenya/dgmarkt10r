
  Feature: Blog functionality

  @positive
  @Blog
  Scenario: DGMARKT10R-T22 checking the transition to a section Blog
    Given user is on the main page
    When the user clicks on Blog button
    Then the title Blog should be displayed


    @positive
  @Blog
  Scenario: DGMARKT10R-T21 inner page - choice of a one post
    Given user is on the main page
    And user is on the Blog page
    When user clicks on first post picture
    Then title post should be displayed "Celebrity Daughter Opens Up About Having Her Eye Color"


    @positive
  @Blog
  Scenario: DGMARKT10R-T75 inner Blog page - carousel
    Given user is on the main page
    And user is on the Blog page
    When user clicks on first post picture
    And user clicks on right arrow
    Then title next right post should be displayed "Lotto Winner Offering Up Money To Any Man That Will Date Her"


    @positive
  @Blog
  Scenario: DGMARKT10R-T78 transition from main page bottom to Blog by pressing post picture
    Given user is on the main page
    And user is in the bottom of main page
    When user clicks on first post picture
    Then title post should be displayed "Celebrity Daughter Opens Up About Having Her Eye Color"


    @positive
  @Blog
  Scenario: DGMARKT10R-T79 transition from main page bottom to Blog by link
    Given user is on the main page
    And user is in the bottom of main page
    When user clicks on first post link
    Then title post should be displayed "Celebrity Daughter Opens Up About Having Her Eye Color"


    @positive
  @Blog
  Scenario: DGMARKT10R-T80 transition from main page bottom to Blog by button "Read More"
    Given user is on the main page
    And user is in the bottom of main page
    When user clicks on first post button Read More
    Then title post should be displayed "Celebrity Daughter Opens Up About Having Her Eye Color"


    @positive
  @Blog
  Scenario: DGMARKT10R-T87 transition from Blog page to post by button "Read More"
    Given user is on the main page
    And user is on the Blog page
    When user clicks on first post button Read More
    Then title post should be displayed "Celebrity Daughter Opens Up About Having Her Eye Color"


    @positive
  @Blog
  Scenario: DGMARKT10R-T86 transition from Blog page to post by pressing post picture
    Given user is on the main page
    And user is on the Blog page
    When user clicks on first post picture
    Then title post should be displayed "Celebrity Daughter Opens Up About Having Her Eye Color"


    @positive
  @Blog
  Scenario: DGMARKT10R-T84 transition from Blog page to category by category name
    Given user is on the main page
    And user is on the Blog page
    When user clicks on category name
    Then title category should be displayed "Fashion"


    @positive
  @Blog
  Scenario: DGMARKT10R-T85 transition from Blog page to post by latest posts
    Given user is on the main page
    And user is on the Blog page
    When user clicks on latest post picture
    Then title latest post should be displayed "People are Willing to Lie When It Comes to Money 4"
