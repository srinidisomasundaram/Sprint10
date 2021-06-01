package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_Batteries_MTC;
import com.dometic.MTC.qa.Pages.Constant_Tank;
import com.dometic.MTC.qa.Pages.Constant_Tank_MTC;
import com.dometic.MTC.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TankMTC extends Baseclass {
    public static List<String> alertTankLevelAbove,alertSetLatency,warningsTankLevelAbove,warningsSetLatency;
    @Then("Then I Tap on Tank Fuel tile in Landing Screen")
    public void thenITapOnTankFuelTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Fuel_xpath));
        while(elements.size()==0){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(125, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(400, 1000));
            action.release().perform();
        }
        if(elements.size()!=0){
            Taponbutton(Constant_Tank.MTC_Tank_Fuel_xpath);
        }
    }

    @Then("Then I Tap on Tank Oil tile in Landing Screen")
    public void thenITapOnTankOilTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Oil_xpath));
        while(elements.size()==0){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(125, 1000));
            action.release().perform();
        }
        if(elements.size()!=0){
            Taponbutton(Constant_Tank.MTC_Tank_Oil_xpath);
        }
    }

    @Then("Then I Tap on Tank Fresh tile in Landing Screen")
    public void thenITapOnTankFreshTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Fresh_xpath));
        while(elements.size()==0){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(125, 1000));
            action.release().perform();
        }
        if(elements.size()!=0){
            Taponbutton(Constant_Tank.MTC_Tank_Fresh_xpath);
        }
    }

    @Then("Then I Tap on Tank Grey tile in Landing Screen")
    public void thenITapOnTankGreyTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Grey_xpath));
        while(elements.size()==0){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(125, 1000));
            action.release().perform();
        }
        if(elements.size()!=0){
            Taponbutton(Constant_Tank.MTC_Tank_Grey_xpath);
        }
    }

    @Then("Then I Tap on Tank Black tile in Landing Screen")
    public void thenITapOnTankBlackTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Black_xpath));
        while(elements.size()==0){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(125, 1000));
            action.release().perform();
        }
        if(elements.size()!=0){
            Taponbutton(Constant_Tank.MTC_Tank_Black_xpath);
        }
    }

    @Then("Then I Tap on Tank Live tile in Landing Screen")
    public void thenITapOnTankLiveTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Live_xpath));
        while(elements.size()==0){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(125, 1000));
            action.release().perform();
        }
        if(elements.size()!=0){
            Taponbutton(Constant_Tank.MTC_Tank_Live_xpath);
        }
    }

    @Then("Then I Tap on Tank Bait tile in Landing Screen")
    public void thenITapOnTankBaitTileInLandingScreen() {
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Tank.MTC_Tank_Bait_xpath));
        while(elements.size()==0){
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(400, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(125, 1000));
            action.release().perform();
        }
        if(elements.size()!=0){
            Taponbutton(Constant_Tank.MTC_Tank_Bait_xpath);
        }
    }

    @Then("I verify the Fuel Level text in the Tank screen")
    public void iVerifyTheFuelLevelTextInTheTankScreen() throws Throwable {
        asserttext(Constant_Tank.FUEL_LEVEL,Constant_Tank.FUEL_LEVEL_text_xpath);
    }

    @Then("I Tap on  the OIL option in the Tank screen")
    public void iTapOnTheOILOptionInTheTankScreen() {
        Taponbutton(Constant_Tank.MTC_Tank_Oil_xpath);
    }

    @Then("I verify the OIL Level text in the Tank screen")
    public void iVerifyTheOILLevelTextInTheTankScreen() throws Throwable {
        asserttext(Constant_Tank.oil_LEVEL_text,Constant_Tank.OIL_LEVEL_text_xpath);
    }

    @Then("I swipe the tank option from left to right")
    public void iSwipeTheTankOptionFromLeftToRight() {

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(925, 1300)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(150, 1300));
        action.release().perform();
    }

    @Then("I tap on the Live option in the Tank screen")
    public void iTapOnTheLiveOptionInTheTankScreen() {
        Taponbutton(Constant_Tank.MTC_Tank_Live_xpath);
    }

    @Then("I verify the Live well Level text in the Tank screen")
    public void iVerifyTheLiveWellLevelTextInTheTankScreen() throws Throwable {
        asserttext(Constant_Tank.Live_LEVEL_text,Constant_Tank.Live_LEVEL_text_xpath);
    }

    @Then("I Tap on the BAIT text option in the Tank screen")
    public void iTapOnTheBAITTextOptionInTheTankScreen() {
        Taponbutton(Constant_Tank.MTC_Tank_Bait_xpath);
    }

    @Then("I verify the BAIT WELL LEVEL text in the Tank screen")
    public void iVerifyTheBAITWELLLEVELTextInTheTankScreen() throws Throwable {
        asserttext(Constant_Tank.Bait_LEVEL_text,Constant_Tank.Bait_LEVEL_text_xpath);
    }

    @Then("I Tap on Tank tile on landing screen")
    public void iTapOnTankTileOnLandingScreen() {
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Tile_Xpath);
    }

    @Then("I verify Tank header text")
    public void iVerifyTankHeaderText() throws Throwable {
        asserttextValidationAccessibility(Constant_Tank_MTC.mtc_Tank,Constant_Tank_MTC.mtc_Tank_Title_Access_ID);
    }

    @Then("I Tap on Alert-Tank Level Above")
    public void iTapOnAlertTankLevelAbove() {
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_xpath);
    }

    @Then("I verify Warnings-Tank Level Above Text")
    public void iVerifyWarningsTankLevelAboveText() throws Throwable {
        asserttextValidation(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above,Constant_Tank_MTC.mtc_Tank_Warnings_Tank_Level_Above_xpath);
    }

    @Then("I Tap on Warnings-Tank Level Above")
    public void iTapOnWarningsTankLevelAbove() {
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Warnings_Tank_Level_Above_xpath);
    }

    @Then("I verify Alert text")
    public void iVerifyAlertText() throws Throwable {
        asserttextValidation(Constant_Tank_MTC.mtc_Tank_AlertsText,Constant_Tank_MTC.mtc_Tank_AlertsText_xpath);
    }

    @Then("I verify Warning text")
    public void iVerifyWarningText() throws Throwable {
        asserttextValidation(Constant_Tank_MTC.mtc_Tank_WarningsText,Constant_Tank_MTC.mtc_Tank_WarningsText_xpath);
    }

    @Then("I verify Alert-Tank Level Above Text")
    public void iVerifyAlertTankLevelAboveText() throws Throwable {
        asserttextValidation(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above,Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_xpath);
    }

    @Then("I scroll up the screen in Alert-Tank Level Above")
    public void iScrollUpTheScreenInAlertTankLevelAbove() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Tank Level Above");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1730)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(500, 1600)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Alert-Tank Level Above")
    public void iVerifyApplyButtonInAlertTankLevelAbove() {
        /** Globally declared Tank Level Above Values **/
        alertTankLevelAbove=new ArrayList<>();
        alertTankLevelAbove.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_FirstValue_xpath)).getText());alertTankLevelAbove.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_SecondValue_xpath)).getText());
        alertTankLevelAbove.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Alert-Tank Level Above")
    public void iTapOnApplyButtonInAlertTankLevelAbove() {
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Alerts_Apply_xpath);
    }

    @Then("I Validate Applied percentage in Tank Level Above is displayed")
    public void iValidateAppliedPercentageInTankLevelAboveIsDisplayed() {
        if (alertTankLevelAbove.get(0).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertTankLevelAbove.get(1).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertTankLevelAbove.get(2).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Tank_Level_Above_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Alert-Set Latency\\(Tank screen)")
    public void iScrollUpTheScreenInAlertSetLatencyTankScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Alert-Battery Voltage Below");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1870)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1725)).release().perform();
        System.out.println("Scrolling up the Page");

    }

    @Then("I Verify Apply button in Alert-Set Latency\\(Tank screen)")
    public void iVerifyApplyButtonInAlertSetLatencyTankScreen() {
        /** Globally declared Set Latency Values **/
        alertSetLatency=new ArrayList<>();
        alertSetLatency.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency_FirstValue_xpath)).getText());alertSetLatency.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency_SecondValue_xpath)).getText());
        alertSetLatency.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency_ThirdValue_xpath)).getText());

    }

    @Then("I Tap on Apply button in Alert-Set Latency\\(Tank screen)")
    public void iTapOnApplyButtonInAlertSetLatencyTankScreen() {
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Alerts_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Alert-Set Latency\\(Tank screen) is displayed")
    public void iValidateAppliedMinutesInAlertSetLatencyTankScreenIsDisplayed() {
        if (alertSetLatency.get(0).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertSetLatency.get(1).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (alertSetLatency.get(2).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Tank_Alerts_Set_Latency_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Warnings-Tank Level Above")
    public void iScrollUpTheScreenInWarningsTankLevelAbove() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Warnings-Tank Level Above");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1575)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1450)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Warnings-Tank Level Above")
    public void iVerifyApplyButtonInWarningsTankLevelAbove() {
        /** Globally declared Warnings-Tank Level Above Values **/
        warningsTankLevelAbove=new ArrayList<>();
        warningsTankLevelAbove.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Tank_Level_Above_FirstValue_xpath)).getText());warningsTankLevelAbove.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Tank_Level_Above_SecondValue_xpath)).getText());
        warningsTankLevelAbove.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Tank_Level_Above_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Warnings-Tank Level Above")
    public void iTapOnApplyButtonInWarningsTankLevelAbove() {
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Alerts_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Warnings-Tank Level Above is displayed")
    public void iValidateAppliedMinutesInWarningsTankLevelAboveIsDisplayed() {
        if (warningsTankLevelAbove.get(0).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Tank_Level_Above_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsTankLevelAbove.get(1).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Tank_Level_Above_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsTankLevelAbove.get(2).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Tank_Level_Above_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I scroll up the screen in Warnings-Set Latency\\(Tank screen)")
    public void iScrollUpTheScreenInWarningsSetLatencyTankScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I scroll up the screen in Warnings-Set Latency(Tank screen)");
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(530, 1715)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(530, 1575)).release().perform();
        System.out.println("Scrolling up the Page");
    }

    @Then("I Verify Apply button in Warnings-Set Latency\\(Tank screen)")
    public void iVerifyApplyButtonInWarningsSetLatencyTankScreen() {
        /** Globally declared Warnings-Set Latency Values **/
        warningsSetLatency=new ArrayList<>();
        warningsSetLatency.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Set_Latency_FirstValue_xpath)).getText());warningsSetLatency.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Set_Latency_Below_SecondValue_xpath)).getText());
        warningsSetLatency.add(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Set_Latency_ThirdValue_xpath)).getText());
    }

    @Then("I Tap on Apply button in Warnings-Set Latency\\(Tank screen)")
    public void iTapOnApplyButtonInWarningsSetLatencyTankScreen() {
        Taponbutton(Constant_Tank_MTC.mtc_Tank_Alerts_Apply_xpath);
    }

    @Then("I Validate Applied minutes in Warnings-Set Latency\\(Tank screen) is displayed")
    public void iValidateAppliedMinutesInWarningsSetLatencyTankScreenIsDisplayed() {
        if (warningsSetLatency.get(0).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Set_Latency_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsSetLatency.get(1).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Set_Latency_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else if (warningsSetLatency.get(2).contains(driver.findElement(By.xpath(Constant_Tank_MTC.mtc_Batteries_Warnings_Set_Latency_Updated_Value_xpath)).getText())) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }
}
