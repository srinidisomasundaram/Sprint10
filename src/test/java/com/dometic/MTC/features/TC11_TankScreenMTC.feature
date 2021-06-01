Feature: Testing an Dometic LMC application

  @First1 @sanity1
  Scenario: Verifying application Tank screen UI
    Then I Tap on Tank tile on landing screen
    Then I verify Tank header text
    Then I verify Alert text
    Then I Wait short period for Page to Load
    Then I Tap on Alert toggle if it's already in OFF state
    Then I Scroll up the page
    Then I verify Alert-Tank Level Above Text
    Then I Tap on Alert-Tank Level Above
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I verify the apply button
    Then I Tap on Alert-Tank Level Above
    Then I verify Alert-Set Latency Text
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll the page
    Then I Tap on Alert-Set Latency
    Then I verify Warning text
    Then I Tap on Warnings toggle if it's already in OFF state
    Then I verify Warnings-Tank Level Above Text
    Then I Tap on Warnings-Tank Level Above
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Tank Level Above
    Then I verify Warnings-Set Latency Text
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Alert-Tank Level Above) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Alert-Tank Level Above
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Tank Level Above
    Then I Verify Apply button in Alert-Tank Level Above
    Then I Tap on Apply button in Alert-Tank Level Above
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied percentage in Tank Level Above is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Alert-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Alert-Set Latency
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Set Latency(Tank screen)
    Then I Verify Apply button in Alert-Set Latency(Tank screen)
    Then I Tap on Apply button in Alert-Set Latency(Tank screen)
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Alert-Set Latency(Tank screen) is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Warnings-Tank Level Above) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Tank Level Above
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Tank Level Above
    Then I Verify Apply button in Warnings-Tank Level Above
    Then I Tap on Apply button in Warnings-Tank Level Above
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Tank Level Above is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Tank screen(Warnings-Set Latency) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Tank tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Set Latency
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I scroll up the screen in Warnings-Set Latency(Tank screen)
    Then I Verify Apply button in Warnings-Set Latency(Tank screen)
    Then I Tap on Apply button in Warnings-Set Latency(Tank screen)
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Set Latency(Tank screen) is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button