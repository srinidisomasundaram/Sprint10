Feature: Testing Forgot Password page in Dometic LMC application

  @First1 @sanity1
  Scenario: Verifying application Forgot Password Functionality
    Then I verify Forgot your password text is displayedd in Forgot password Page
    Then I verify Forgot your password content text is displayed in Forgot password Page
    Then I verify E-mail (case sensitive) label is displayed
    Then I Verify Forgot Email Input text field is displayed in Login Page
    Then I Verify Send button is displayed in Forgot password Page
    And I enter Email in Login Page
    Then I Wait short period for Page to Load
    Then I Tap on Send button in Forgot Password Page
    Then I Tap on Successfully email send popup
