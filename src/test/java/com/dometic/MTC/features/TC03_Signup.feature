Feature: Testing Signup page in Dometic LMC application

  @First1 @sanity1
  Scenario: Empty Email and Enter the password and verify password
    Then I Wait short period for Page to Load
    Then I Tap on signup link in login page
    Then I left the Email blank
    Then I enter Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on term and conditions checkbox
    Then I Tap on Signup button

  @sanity1
  Scenario: Enter the Email and Empty password and verify password
    Then I Wait short period for Page to Load
    Then I enter Email in Signup Page
    Then I left the password blank
    And I enter confirm password in Signup Page
    Then I Tap on Signup button

  @sanity1
  Scenario: Enter Valid email valid password and empty verify password
    Then I enter Email in Signup Page
    Then I enter Password in Signup Page
    Then I left the Verify password blank
    Then I Tap on Signup button

  @sanity1
  Scenario: Enter inValid email, password and valid verify password
    Then I enter Invalid Email in Signup Page
    Then I enter Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on Signup button

  @sanity1
  Scenario: Enter Valid email, invalid password and valid verify password
    Then I enter Email in Signup Page
    Then I enter invalid Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on Signup button

  @sanity1
  Scenario: Enter Valid email, password and invalid verify password
    Then I enter Email in Signup Page
    Then I enter Password in Signup Page
    And I enter invalid verify password password in Signup Page
    Then I Tap on Signup button

  @sanity1
  Scenario: Verifying application Signup Functionality
    Then I Wait short period for Page to Load
    Then I Tap on signup link in login page
    Then I Verify Email Inputbox is displayed in Signup Page
    Then I Verify Password Inputbox is displayed in Signup Page
    Then I Verify Confirm Password Inputbox is displayed in Signup Page
    Then I Verify Signup button is displayed in Signup Page
    And I enter Email in Signup Page
    And I enter Password in Signup Page
    And I enter confirm password in Signup Page
    Then I Tap on Send button in Signup Page
    Then I Tap on existing user popup
    Then I Tap on login link in signup page




