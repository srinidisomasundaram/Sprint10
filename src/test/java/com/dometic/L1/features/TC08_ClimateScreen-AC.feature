Feature: Testing an Dometic LMC application

  @sanity
  Scenario: Verifying application Climate screen scroll up to Minimum temperature functionality
    Then I Wait for Page to Load
    Then I scroll minimum temperature in Climate AC
    Then I Wait short period for Page to Load
    Then I verify Apply button is displayed in climate screen
    Then I Tap on Apply button  in climate screen
    Then I Wait for Page to Load
    Then I validate minimum applied temperature is displayed in temperature

  @sanity
  Scenario: Verifying applied Climate Minimum temperature displayed on Ac Mode
    Then I Tap on Ac Mode in Climate screen
    Then I Wait for Page to Load
    Then I validate minimum applied temperature is displayed in Ac Mode
    Then I Tap on Back Button in Ac Mode

  @sanity
  Scenario: Verifying applied Climate Minimum temperature displayed on Ac Fan Speed
    Then I Tap on AC Fan Speed in climate screen
    Then I Wait for Page to Load
    Then I validate minimum applied temperature is displayed in Ac Fan Speed
    Then I Tap on Back Button in Ac Fan Speed

  @sanity
  Scenario: Verifying applied Climate Minimum temperature displayed on Climate Tile
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I validate applied minimum temperature is displayed in Climate Tile
    Then I Wait short period for Page to Load
    Then I Tap on Climate CTA in Landing screen

  @sanity
  Scenario: Verifying application Climate-AC Mode screen functionality
    Then I Wait short period for Page to Load
    Then I Tap on Ac Mode in Climate screen
    Then I verify Back Button displayed in left corner of the AC climate screen
    Then I verify climate title is displayed in AC Climate screen
    Then I verify inside text is displayed in Ac climate screen
    Then I verify inside unit is displayed in Ac climate screen
    Then I verify outside text is displayed in Ac climate screen
    Then I verify outside unit is displayed in Ac climate screen
    Then I verify AcMode-temperature is displayed in Ac climate screen
    Then I verify fan icon is displayed in AC climate screen
    Then I verify fan Speed is displayed in AC climate screen
    Then I verify AC MODE text is displayed in Ac climate screen
    Then I scroll up the screen
    Then I Wait short period for Page to Load
    Then I verify Apply button is displayed in AC climate screen
    Then I Tap on Apply button in AC climate screen
    Then I Wait for Page to Load
    Then I validate Ac Mode value is displayed in AC climate screen

  @sanity
  Scenario: Verifying application Climate-Fan Speed screen functionality
    Then I verify AC Fan Speed in climate screen
    Then I Tap on AC Fan Speed in climate screen
    Then I verify Climate title is displayed in AC Fan Speed in climate screen
    Then I verify inside text is displayed in AC Fan Speed in Ac climate screen
    Then I verify inside unit is displayed in AC Fan Speed in Ac climate screen
    Then I verify outside text is displayed in AC Fan Speed in Ac climate screen
    Then I verify outside unit is displayed in AC Fan Speed in Ac climate screen
    Then I verify Fanspeed-temperature is displayed in Ac climate screen
    Then I verify Fanspeed fan icon is displayed in AC climate screen
    Then I verify fanSpeed-getAcFanSpeed is displayed in AC climate screen
    Then I verify AC FAN SPEED text is displayed in AC climate screen
    Then I scroll up the screen
    Then I Wait short period for Page to Load
    Then I verify apply button is displayed in AC Fan Speed in Ac Climate screen
    Then I Tap on Apply button in AC Fan Speed in Ac Climate screen

  @sanity
  Scenario: Validating updated values Display in AC climate(Climate-Fan Speed) screen
    Then I Wait for Page to Load
    Then I validate Ac Fan Speed value is displayed in AC climate screen
    Then I validate updated value id displayed in AC climate screen

  @sanity
  Scenario: Validating updated values Display in AC Mode(Climate-Fan Speed) screen
    Then I Wait short period for Page to Load
    Then I Tap on Ac Mode in Climate screen
    Then I validate updated value is displayed in AC Mode screen

  @sanity
  Scenario: Validating updated values Display in AC FanSpeed(Climate-Fan Speed) screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in Ac Mode
    Then I Tap on AC Fan Speed in climate screen
    Then I Wait short period for Page to Load
    Then I validate updated value id displayed in AC FanSpeed screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in Ac Fan Speed