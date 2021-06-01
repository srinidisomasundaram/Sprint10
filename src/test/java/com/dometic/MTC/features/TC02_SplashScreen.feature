Feature: Testing Login page in Dometic LMC application

  @First1 @sanity1 @Device1 @Device2
  Scenario: Verifying application Splash screen Functionality
    Then I Tap on Allow button in Permission popup in Login Page
    Then I Wait short period for Page to Load
    Then I verify Welcome Text is displaying in Login Page
    Then I Verify Page title is displayed in Login Page
    Then I Wait short period for Page to Load



