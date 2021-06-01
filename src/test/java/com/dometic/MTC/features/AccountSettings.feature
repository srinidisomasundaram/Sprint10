# new feature
# Tags: optional

Feature: Account Settings screen

  @First
  Scenario: Verify if Subscription option is available in account settings screen
    Given I Launch the application
    Then I Wait short period for Page to Load
    Then I Tap on Allow button in Permission popup in Login Page
    Then I Wait short period for Page to Load
    Then I Wait short period for Page to Load
    Then I enter Valid Email in Login Page
    Then I enter Valid Password in Login Page
    Then I Tap on Login button in Login Page
    Then I Wait short period for Page to Load
    Then I Tap on Allow popup
    Then I Tap on Hamburger menu
    Then I Tap on edit profile
    Then I verify if subscription option is available

  Scenario: Subscription navigation button UI
    Then I verify if navigation button is available beside subscription option

  Scenario: Subscription Navigation button functionality
    Then I verify if user is able to tap on subscription navigation button

  Scenario: Subscription feature functionality
    Then I verify if subscription option is clickable
    Then I Wait short period for Page to Load
    #Then I verify if subscription web page is displayed after selecting it
    Then I verify if subscription title is displayed
    Then I verify if subscription back button is available
    Then I tap on subscription back button