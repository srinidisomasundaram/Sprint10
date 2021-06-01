Feature: Testing an Dometic LMC application

  @First1 @sanity1
  Scenario: Verifying application Bottom Layout screen UI
    Then I Wait short period for Page to Load
    Then I Verify Home option in Bottom layout
    Then I Tap on Home option in Bottom layout
    Then I Verify Areas option in Bottom layout
    Then I Tap on Areas option in Bottom layout
    Then I Verify Proride option in Bottom layout
    Then I Tap on Proride option in Bottom layout
    Then I Verify Switching option in Bottom layout
    Then I Tap on Switching option in Bottom layout
    Then I Verify Modes option in Bottom layout
    Then I Tap on Modes option in Bottom layout
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying application Bottom Layout screen UI
    Then I Tap on Home option in Bottom layout
    Then I Tap on Areas option in Bottom layout
    Then I Tap on Proride option in Bottom layout
    Then I Tap on Switching option in Bottom layout
    Then I Validate Switching option is displayed
    Then I Tap on Modes option in Bottom layout
    Then I Validate Modes option is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
