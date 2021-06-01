Feature: Testing an Dometic LMC application

  @First1 @sanity1
  Scenario:  Verifying application Login Page UI
    Then I verify Welcome! Text is displayed in login screen
    Then I verify Log In Text is displayed in login screen
    Then I verify E-mail label is displayed in login page
    Then I verify Password label is displayed in login page
    Then I verify Forgot password? link is displayed in login page
    Then I verify Don't have an account? text is displayed in login page
    Then I verify Sign Up link is displayed in login page
    Then I verify Login CTA is displayed in login page

  @sanity1
  Scenario: Login with blank email and blank password field
    Then I verify black email in email text field
    Then I verify black password in password text field
    Then I Tap on Login button in Login Page

  @sanity1
  Scenario: Login with Invalid Email with valid password
    Then I enter Invalid Email in Login Page
    Then I enter Valid Password in Login Page
    Then I Tap on Login button in Login Page

  @sanity1
  Scenario: Login with Valid email and invalid password
    Then I enter Valid Email in Login Page
    Then I enter an Invalid Password in Login Page
    Then I Tap on Login button in Login Page

  @sanity1
  Scenario: Login with Valid email and blank password
    Then I enter Valid Email in Login Page
    Then I verify black password in password text field
    Then I Tap on Login button in Login Page

  @sanity1
  Scenario: Login with empty email and valid password
    Then I verify black email in email text field
    Then I enter Valid Password in Login Page
    Then I Tap on Login button in Login Page

  @sanity1
  Scenario:  Verifying application Login Functionality with invalid credentials
    Then I enter Invalid Email in Login Page
    Then I enter an Invalid Password in Login Page
    Then I Tap on Login button in Login Page
    Then Error message is displayed

  @sanity
  Scenario: Verifying application Login Functionality with valid credentials
    Then I enter Valid Email in Login Page
    Then I enter Valid Password in Login Page
    Then I Tap on an Login button in Login Page
    Then  I Wait short period for Page to Load
    Then I verify successfully navigated to On boarding screen
