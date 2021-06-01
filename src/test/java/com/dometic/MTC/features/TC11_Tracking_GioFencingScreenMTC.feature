Feature: Testing an Dometic LMC application

  @First1 @sanity1
  Scenario: Verifying application Tracking(Gio Fencing) screen UI & Functionality
    Then I Tap on Tracking tile
    Then I Wait short period for Page to Load
    Then I Verify Tracking Header title
    Then I Tap on Back Button

