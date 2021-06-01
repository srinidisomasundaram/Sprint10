package com.dometic.MTC.stepdefinition;

import com.dometic.MTC.qa.Pages.Constant_BottomLayout_MTC;
import com.dometic.MTC.qa.util.Baseclass;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

public class BottomLayoutMTC extends Baseclass {
    @Then("I Tap on Home option in Bottom layout")
    public void iTapOnHomeOptionInBottomLayout() throws InterruptedException {
        Taponbutton(Constant_BottomLayout_MTC.mtc_BottomLayout_Home_xpath);
        Thread.sleep(1000);
    }

    @Then("I Tap on Areas option in Bottom layout")
    public void iTapOnAreasOptionInBottomLayout() throws InterruptedException {
        Taponbutton(Constant_BottomLayout_MTC.mtc_BottomLayout_Areas_xpath);
        Thread.sleep(1000);
    }

    @Then("I Tap on Proride option in Bottom layout")
    public void iTapOnProrideOptionInBottomLayout() throws InterruptedException {
        Taponbutton(Constant_BottomLayout_MTC.mtc_BottomLayout_Proride_xpath);
        Thread.sleep(1000);
    }

    @Then("I Tap on Switching option in Bottom layout")
    public void iTapOnSwitchingOptionInBottomLayout() throws InterruptedException {
        Taponbutton(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_xpath);
        Thread.sleep(1000);
    }

    @Then("I Tap on Modes option in Bottom layout")
    public void iTapOnModesOptionInBottomLayout() throws InterruptedException {
        Taponbutton(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_xpath);
        Thread.sleep(1000);
    }

    @Then("I Verify Home option in Bottom layout")
    public void iVerifyHomeOptionInBottomLayout() throws Throwable {
        asserttextValidation(Constant_BottomLayout_MTC.mtc_BottomLayout_Home,Constant_BottomLayout_MTC.mtc_BottomLayout_Home_xpath);
    }

    @Then("I Verify Areas option in Bottom layout")
    public void iVerifyAreasOptionInBottomLayout() throws Throwable {
        asserttextValidation(Constant_BottomLayout_MTC.mtc_BottomLayout_Areas,Constant_BottomLayout_MTC.mtc_BottomLayout_Areas_xpath);
    }

    @Then("I Verify Proride option in Bottom layout")
    public void iVerifyProrideOptionInBottomLayout() throws Throwable {
        asserttextValidation(Constant_BottomLayout_MTC.mtc_BottomLayout_Proride,Constant_BottomLayout_MTC.mtc_BottomLayout_Proride_xpath);
    }

    @Then("I Verify Switching option in Bottom layout")
    public void iVerifySwitchingOptionInBottomLayout() throws Throwable {
        asserttextValidation(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching,Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_xpath);
    }

    @Then("I Verify Modes option in Bottom layout")
    public void iVerifyModesOptionInBottomLayout() throws Throwable {
        asserttextValidation(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes,Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_xpath);
    }

    @Then("I Validate Switching option is displayed")
    public void iValidateSwitchingOptionIsDisplayed() {
        if(driver.findElement(By.xpath(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_xpath)).getText().equalsIgnoreCase(driver.findElementByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Switching_Access_Id).getText())){
            System.out.println("Text comparison is Successful");
        }
        else{
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I Validate Modes option is displayed")
    public void iValidateModesOptionIsDisplayed() {
        if(driver.findElement(By.xpath(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_xpath)).getText().equalsIgnoreCase(driver.findElementByAccessibilityId(Constant_BottomLayout_MTC.mtc_BottomLayout_Modes_Access_Id).getText())){
            System.out.println("Text comparison is Successful");
        }
        else{
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }
}
