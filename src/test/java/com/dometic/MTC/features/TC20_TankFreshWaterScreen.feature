Feature: Testing an Dometic LMC application

  @First1 @sanity1
  Scenario: Verifying application Tank Fresh Water screen UI
    Then I Tap on Tank Fresh Water in Landing screen
    Then I Wait short period for Page to Load
    Then I Wait short period for Page to Load
    Then I Verify the fresh water level text
#    Then I verify the water pump text
    Then I verify the fresh text on button
#    Then I verify the black text on button
    Then I verify the predictive data in Fresh water text

  @sanity1
  Scenario: Verifying application Tank Fresh Water screen functionality
    Then I verify Tank-progressIndicator in Tank Fresh Water
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Validated Tank-progressIndicator(Fresh Water) percentage is displayed in Landing screen