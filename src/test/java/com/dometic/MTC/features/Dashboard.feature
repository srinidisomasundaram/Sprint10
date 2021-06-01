# new feature
# Tags: optional

Feature: New dashboard changes

  @First
  Scenario: New dashboard feature without tile
    Given I Launch the application
    Then I Wait short period for Page to Load
    Then I Tap on Allow button in Permission popup in Login Page
    Then I Wait short period for Page to Load
    Then I Wait short period for Page to Load
    Then I enter a user email which has not been onboarded
    Then I enter Valid Password for that user
    Then I Tap on Login button in Login Page
    Then I Wait short period for Page to Load
    Then I Tap on Allow popup
    Then I verify if user has navigated to the homescreen
    Then I verify if an empty homescreen is displayed
    Then I Tap on Hamburger menu
    Then I Tap on logout option in settings screen

  Scenario: New dashboard with tile
    Then I enter Valid Email in Login Page
    Then I enter Valid Password in Login Page
    Then I Tap on Login button in Login Page
    Then I Wait short period for Page to Load
    #Then I Tap on Allow popup
    Then I verify if home screen is displayed
    Then I verify if already onboarded tile is displayed in home screen
    Then I Tap on Marine tile in home screen
    Then I Wait short period for Page to Load
    Then I Tap on Hamburger menu
    Then I Tap on Home option
    Then I Tap on logout option in settings screen

  Scenario: New dashboard with multiple tiles
    Then I enter an email onboarded with SDB and marine
    Then I enter Valid Password
    Then I Tap on Login button in Login Page
    Then I Wait short period for Page to Load
    #Then I Tap on Allow popup
    Then I verify if home screen is displayed
    Then I verify if SDB tile is displayed in home screen
    Then I verify if MTC tile is displayed in home screen
    Then I Tap on Hamburger menu
    Then I Tap on logout option in settings screen




