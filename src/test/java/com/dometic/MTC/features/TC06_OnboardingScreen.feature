Feature: Testing an Dometic LMC application

  @First @sanity
  Scenario: Verifying application On boarding screen functionality
    Then I entered into On boarding screen
    Then I Wait short period for Page to Load
    Then I Tap on Yes button
    Then I Wait short period for Page to Load
    Then I Tap on the MTC Thing I'd
    Then Landing screen is displayed

