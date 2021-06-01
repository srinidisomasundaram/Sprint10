Feature: Testing an Dometic LMC application

  @First1 @sanity1
  Scenario: Verifying application Bilge Pump screen UI
    Then I Tap on Bilge Pump tile on landing screen
    Then I verify Bilge Pump header text
    Then I verify Bilge Pump status
    Then I verify Run Cycles text
    Then I Tap on Run Cycles down arrow
    Then I verify Voltage text
    Then I verify History text
    Then I Scroll up the page
    Then I verify Day text
    Then I verify WEEK text
    Then I verify MONTH text
    Then I Tap on week in Run Cycles Graph
    Then I Wait short period for Page to Load
    Then I Tap on month in Run Cycles Graph
    Then I verify Alerts text
    Then I Wait short period for Page to Load
    Then I Tap on Alert toggle if it's already in OFF state
    Then I Scroll up the page
    Then I verify Alert-Max Cycle Hour Text
    Then I Tap on Alert-Max Cycle Hour
    Then I Wait short period for Page to Load
    Then I verify the apply button
    Then I Tap on Alert-Max Cycle Hour
    Then I verify Alert-Max Daily Cycle Text
    Then I Tap on Alert-Max Daily Cycle
    Then I Wait short period for Page to Load
    Then I verify the apply button
    Then I Tap on Alert-Max Daily Cycle
    Then I verify Continuous Text
    Then I Tap on Continuous
    Then I Wait short period for Page to Load
    Then I verify the apply button
    Then I Tap on Continuous
    Then I verify Warnings text
    Then I Tap on Warnings toggle if it's already in OFF state
    Then I Scroll up the page
    Then I verify Warnings-Max Cycle Hour Text
    Then I Tap on Warnings-Max Cycle Hour
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Max Cycle Hour
    Then I verify Warnings-Max Daily Cycle Text
    Then I Tap on Warnings-Max Daily Cycle
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Warnings-Max Daily Cycle
    Then I verify Continuous Text
    Then I Tap on Warnings-Continuous
    Then I Wait short period for Page to Load
    Then I verify the apply button
    Then I Tap on Warnings-Continuous
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Bilge Pump screen(Alert-Max Cycle Hour) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Bilge Pump tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Alert-Max Cycle Hour
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Max Cycle Hour
    Then I Verify Apply button in Alert-Max Cycle Hour
    Then I Tap on Apply button in Alert-Max Cycle Hour
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied value in Alert-Max Cycle Hour is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Bilge Pump screen(Alert-Max Daily Cycle) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Bilge Pump tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Alert-Max Daily Cycle
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Max Daily Cycle
    Then I Verify Apply button in Alert-Max Daily Cycle
    Then I Tap on Apply button in Alert-Max Daily Cycle
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied value in Alert-Max Daily Cycle is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Bilge Pump screen(Alert-Continuous) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Bilge Pump tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Tap on Continuous
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Alert-Continuous
    Then I Verify Apply button in Alert-Continuous
    Then I Tap on Apply button in Alert-Continuous
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied value in Alert-Continuous is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Bilge Pump screen(Warnings-Max Cycle Hour) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Bilge Pump tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Max Cycle Hour
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Warnings-Max Cycle Hour
    Then I Verify Apply button in Warnings-Max Cycle Hour
    Then I Tap on Apply button in Warnings-Max Cycle Hour
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Max Cycle Hour is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Bilge Pump screen(Warnings-Max Daily Cycle) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Bilge Pump tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Max Daily Cycle
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Warnings-Max Daily Cycle
    Then I Verify Apply button in Warnings-Max Daily Cycle
    Then I Tap on Apply button in Warnings-Max Daily Cycle
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Max Daily Cycle is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Bilge Pump screen(Warnings-Continuous) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Bilge Pump tile on landing screen
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I Tap on Warnings-Continuous
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Warnings-Continuous
    Then I Verify Apply button in Warnings-Continuous
    Then I Tap on Apply button in Warnings-Continuous
    Then I Tap on Ok button
    Then I Wait for Page to Load
    Then I Validate Applied minutes in Warnings-Continuous is displayed
    Then I Wait short period for Page to Load
    Then I Tap on Back Button