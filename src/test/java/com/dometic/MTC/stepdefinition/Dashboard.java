package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_Homescreen;
import com.dometic.MTC.qa.Pages.Constant_login;
import com.dometic.MTC.qa.Pages.Constant_settings;
import com.dometic.MTC.qa.util.Baseclass;
import com.google.common.collect.ImmutableMap;
import cucumber.api.java.en.Then;

public class Dashboard extends Baseclass {

    Constant_Homescreen constant_homescreen;
    Constant_login login_obj;
    Constant_settings constant_settings;

    @Then("I verify if home screen is displayed")
    public void iVerifyIfHomeScreenIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if home screen is displayed");

        iselementdisplayedaccessabilityId(constant_homescreen.logo);
    }

    @Then("I verify if already onboarded tile is displayed in home screen")
    public void iVerifyIfAlreadyOnboardedTileIsDisplayedInHomeScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if already onboarded tile is displayed in home screen");

        iselementdisplayed(constant_homescreen.tile_1_xpath);
    }

    @Then("I Tap on Marine tile in home screen")
    public void iTapOnMarineTileInHomeScreen() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Marine tile in home screen");


        Taponbutton(constant_homescreen.tile_1_xpath);
    }

    @Then("I Tap on Hamburger menu")
    public void iTapOnHamburgerMenu() throws Throwable {

        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Hamburger menu");

        TaponbuttonaccessabilityID(constant_homescreen.Hamburger);
    }

    @Then("I Tap on Home option")
    public void iTapOnHomeOption() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Home option");

        TaponbuttonaccessabilityID(constant_homescreen.Home);
    }

    @Then("I Tap on Allow popup")
    public void iTapOnAllowPopup() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Allow popup");
        Taponbutton(constant_homescreen.Allowpopup_xpath);
    }

    @Then("I Tap on logout option in settings screen")
    public void iTapOnLogoutOptionInSettingsScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on logout option in settings screen");
        TaponbuttonaccessabilityID(constant_settings.Logout_button);
    }

    @Then("I enter a user email which has not been onboarded")
    public void iEnterAUserEmailWhichHasNotBeenOnboarded() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a user email which has not been onboarded");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(login_obj.Login_Email);
        Thread.sleep(1000);
        cleartext(login_obj.Login_Email_Xpath);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(login_obj.new_user_email,login_obj.Login_Email);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter Valid Password for that user")
    public void iEnterValidPasswordForThatUser() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter Valid Password for that user");
        //   Taponbutton(login_obj.Login_Password_Xpath);
        TaponbuttonaccessabilityID(login_obj.Login_Password);
        Thread.sleep(1000);
        cleartext(login_obj.Login_Password_Xpath);
        //    entertext(login_obj.Validpassword,login_obj.Login_Password_Xpath);
        entertextaccessabilityId(login_obj.new_user_password,login_obj.Login_Password);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));


    }

    @Then("I verify if user has navigated to the homescreen")
    public void iVerifyIfUserHasNavigatedToTheHomescreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter Valid Password for that user");

        iselementdisplayedaccessabilityId(constant_homescreen.logo);


    }

    @Then("I verify if an empty homescreen is displayed")
    public void iVerifyIfAnEmptyHomescreenIsDisplayed() throws Throwable {

        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if an empty homescreen is displayed");

        iselementdisplayed(constant_homescreen.HomeScreen_background_xpath);
    }

    @Then("I verify if SDB tile is displayed in home screen")
    public void iVerifyIfSDBTileIsDisplayedInHomeScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if SDB tile is displayed in home screen");

        iselementdisplayed(constant_homescreen.tile_1_xpath);


    }

    @Then("I verify if MTC tile is displayed in home screen")
    public void iVerifyIfMTCTileIsDisplayedInHomeScreen() throws Throwable  {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if MTC tile is displayed in home screen");
        iselementdisplayed(constant_homescreen.tile_1_xpath);
    }
}
