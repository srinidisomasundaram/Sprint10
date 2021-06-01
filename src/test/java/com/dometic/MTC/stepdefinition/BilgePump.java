package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_Batteries_MTC;
import com.dometic.MTC.qa.Pages.Constant_BilgePump_MTC;
import com.dometic.MTC.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BilgePump extends Baseclass {
    public static List<String> alertMaxCycleHour,alertMaxDailyCycle,alertContinuous,warningsMaxCycleHour,warningsMaxDailyCycle,warningsContinuous;

    @Then("I Tap on Bilge Pump tile on landing screen")
    public void iTapOnBilgePumpTileOnLandingScreen() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_tile_xpath);
    }

    @Then("I verify Bilge Pump header text")
    public void iVerifyBilgePumpHeaderText() throws Throwable {
        asserttextValidationAccessibility(Constant_BilgePump_MTC.mtc_Bilge_Pump, Constant_BilgePump_MTC.mtc_Bilge_Pump_Title_Access_ID);
    }

    @Then("I verify Bilge Pump status")
    public void iVerifyBilgePumpStatus() {
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_BilgePump_MTC.mtc_Bilge_Pump_status_Access_ID));
    }

    @Then("I verify Run Cycles text")
    public void iVerifyRunCyclesText() throws Throwable {
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Runcycles_text, Constant_BilgePump_MTC.mtc_Bilge_Pump_RunCycles_xpath);
    }

    @Then("I Tap on Run Cycles down arrow")
    public void iTapOnRunCyclesDownArrow() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_RunCyclesGraph_arrow_xpath);
    }

    @Then("I Tap on week in Run Cycles Graph")
    public void iTapOnWeekInRunCyclesGraph() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_WEEKText_xpath);
    }

    @Then("I Tap on month in Run Cycles Graph")
    public void iTapOnYearInRunCyclesGraph() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_MONTHText_xpath);
    }

    @Then("I verify Alert-Max Cycle\\/Hour Text")
    public void iVerifyAlertMaxCycleHourText() throws Throwable {
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour, Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_xpath);
    }

    @Then("I Tap on Alert-Max Cycle\\/Hour")
    public void iTapOnAlertMaxCycleHour() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_xpath);
    }

    @Then("I verify Alert-Max Daily Cycle Text")
    public void iVerifyAlertMaxDailyCycleText() throws Throwable {
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle, Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_xpath);
    }

    @Then("I Tap on Alert-Max Daily Cycle")
    public void iTapOnAlertMaxDailyCycle() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_xpath);
    }

    @Then("I verify Continuous Text")
    public void iVerifyContinuousText() throws Throwable {
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous, Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_xpath);
    }

    @Then("I Tap on Continuous")
    public void iTapOnContinuous() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_xpath);
    }

    @Then("I verify Warnings-Max Daily Cycle Text")
    public void iVerifyWarningsMaxDailyCycleText() throws Throwable {
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour, Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_xpath);
    }

    @Then("I Tap on Warnings-Max Daily Cycle")
    public void iTapOnWarningsMaxDailyCycle() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_xpath);
    }

    @Then("I Tap on Warnings-Max Cycle\\/Hour")
    public void iTapOnWarningsMaxCycleHour() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_xpath);
    }

    @Then("I verify Alert-Max Cycle Hour Text")
    public void iVerifyAlertMaxCycleHourText1() throws Throwable {
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour, Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_xpath);
    }

    @Then("I Tap on Alert-Max Cycle Hour")
    public void iTapOnAlertMaxCycleHour1() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_xpath);
    }

    @Then("I verify Warnings-Max Cycle Hour Text")
    public void iVerifyWarningsMaxCycleHourText() throws Throwable {
        asserttextValidation(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour, Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_xpath);
    }

    @Then("I Tap on Warnings-Max Cycle Hour")
    public void iTapOnWarningsMaxCycleHour1() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_xpath);
    }

    @Then("I Tap on Warnings-Continuous")
    public void iTapOnWarningsContinuous() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_xpath);
    }

    @Then("I scroll up the screen in Alert-Max Cycle Hour")
    public void iScrollUpTheScreenInAlertMaxCycleHour() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Max Cycle Hour");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(500, 1450)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(500, 1350)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Alert-Max Cycle Hour")
    public void iVerifyApplyButtonInAlertMaxCycleHour() {
        /** Globally declared Alert-Max Cycle Hour Values **/
        alertMaxCycleHour = new ArrayList<>();
        alertMaxCycleHour.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_First_Value_Xpath)).getText());
        alertMaxCycleHour.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_SecondValue_xpath)).getText());
        alertMaxCycleHour.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Alert-Max Cycle Hour")
    public void iTapOnApplyButtonInAlertMaxCycleHour() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath);
    }

    @Then("I Validate Applied value in Alert-Max Cycle Hour is displayed")
    public void iValidateAppliedValueInAlertMaxCycleHourIsDisplayed() {
        if (alertMaxCycleHour.get(0).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertMaxCycleHour.get(1).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertMaxCycleHour.get(2).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Alert-Max Daily Cycle")
    public void iScrollUpTheScreenInAlertMaxDailyCycle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Max Daily Cycle");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1600)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1500)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Alert-Max Daily Cycle")
    public void iVerifyApplyButtonInAlertMaxDailyCycle() {
        /** Globally declared Alert-Max Daily Cycle Values **/
        alertMaxDailyCycle=new ArrayList<>();
        alertMaxDailyCycle.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_First_Value_Xpath)).getText());
        alertMaxDailyCycle.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_SecondValue_xpath)).getText());
        alertMaxDailyCycle.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Alert-Max Daily Cycle")
    public void iTapOnApplyButtonInAlertMMaxDailyCycle() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath);
    }

    @Then("I Validate Applied value in Alert-Max Daily Cycle is displayed")
    public void iValidateAppliedValueInAlertMaxDailyCycleIsDisplayed() {
        if (alertMaxDailyCycle.get(0).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertMaxDailyCycle.get(1).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertMaxDailyCycle.get(2).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Alert-Continuous")
    public void iScrollUpTheScreenInAlertContinuous() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Max Daily Cycle");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1750)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1650)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Alert-Continuous")
    public void iVerifyApplyButtonInAlertContinuous() {
        /** Globally declared Alert-Continuous Values **/
        alertContinuous=new ArrayList<>();
        alertContinuous.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_First_Value_Xpath)).getText());
        alertContinuous.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_SecondValue_xpath)).getText());
        alertContinuous.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_ThirdValue_xpath)).getText());

    }

    @Then("I Tap on Apply button in Alert-Continuous")
    public void iTapOnApplyButtonInAlertContinuous() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath);
    }

    @Then("I Validate Applied value in Alert-Continuous is displayed")
    public void iValidateAppliedValueInAlertContinuousIsDisplayed() {
        if (alertContinuous.get(0).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertContinuous.get(1).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertContinuous.get(2).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Continuous_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Warnings-Max Cycle Hour")
    public void iScrollUpTheScreenInWarningsMaxCycleHour() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Warnings-Max Cycle Hour");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1450)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1325)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Warnings-Max Cycle Hour")
    public void iVerifyApplyButtonInWarningsMaxCycleHour() {
        /** Globally declared Warnings-Max Cycle Hour Values **/
        warningsMaxCycleHour=new ArrayList<>();
        warningsMaxCycleHour.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_First_Value_Xpath)).getText());
        warningsMaxCycleHour.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_SecondValue_xpath)).getText());
        warningsMaxCycleHour.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Warnings-Max Cycle Hour")
    public void iTapOnApplyButtonInWarningsMaxCycleHour() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Warnings-Max Cycle Hour is displayed")
    public void iValidateAppliedMinutesInWarningsMaxCycleHourIsDisplayed() {
        if (warningsMaxCycleHour.get(0).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsMaxCycleHour.get(1).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsMaxCycleHour.get(2).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Warnings-Max Daily Cycle")
    public void iScrollUpTheScreenInWarningsMaxDailyCycle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Warnings-Max Daily Cycle");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1575)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1375)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Warnings-Max Daily Cycle")
    public void iVerifyApplyButtonInWarningsMaxDailyCycle() {
        /** Globally declared Warnings-Max Daily Cycle Values **/
        warningsMaxDailyCycle=new ArrayList<>();
        warningsMaxDailyCycle.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_First_Value_Xpath)).getText());
        warningsMaxDailyCycle.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_SecondValue_xpath)).getText());
        warningsMaxDailyCycle.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Warnings-Max Daily Cycle")
    public void iTapOnApplyButtonInWarningsMaxDailyCycle() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Warnings-Max Daily Cycle is displayed")
    public void iValidateAppliedMinutesInWarningsMaxDailyCycleIsDisplayed() {
        if (warningsMaxDailyCycle.get(0).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsMaxDailyCycle.get(1).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsMaxDailyCycle.get(2).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Warnings-Continuous")
    public void iScrollUpTheScreenInWarningsContinuous() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Warnings-Continuous");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1725)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1600)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Warnings-Continuous")
    public void iVerifyApplyButtonInWarningsContinuous() {
        warningsContinuous=new ArrayList<>();
        warningsContinuous.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_First_Value_Xpath)).getText());
        warningsContinuous.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_SecondValue_xpath)).getText());
        warningsContinuous.add(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Warnings-Continuous")
    public void iTapOnApplyButtonInWarningsContinuous() {
        Taponbutton(Constant_BilgePump_MTC.mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Warnings-Continuous is displayed")
    public void iValidateAppliedMinutesInWarningsContinuousIsDisplayed() {
        if (warningsContinuous.get(0).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsContinuous.get(1).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsContinuous.get(2).contains(driver.findElement(By.xpath(Constant_BilgePump_MTC.mtc_Bilge_Pump_Warnings_Continuous_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }
}
