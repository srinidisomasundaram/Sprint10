package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.Constant_account_settings;
import com.dometic.MTC.qa.Pages.Constant_settings;
import com.dometic.MTC.qa.util.Baseclass;
import cucumber.api.java.en.Then;

public class AccountSettings extends Baseclass {
    Constant_settings constant_settings;
    Constant_account_settings constant_account_settings;

    @Then("I verify if subscription option is available")
    public void iVerifyIfSubscriptionOptionIsAvailable() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if subscription option is available");
        iselementdisplayedaccessabilityId(constant_account_settings.Subscription_text);
    }

    @Then("I verify if navigation button is available beside subscription option")
    public void iVerifyIfNavigationButtonIsAvailableBesideSubscriptionOption() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if navigation button is available beside subscription option");
        iselementdisplayedaccessabilityId(constant_account_settings.Subscription_navigation_button);
    }

    @Then("I verify if user is able to tap on subscription navigation button")
    public void iVerifyIfUserIsAbleToTapOnSubscriptionNavigationButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if user is able to tap on subscription navigation button");
        TaponbuttonaccessabilityID(constant_account_settings.Subscription_navigation_button);

    }

    @Then("I verify if subscription option is clickable")
    public void iVerifyIfSubscriptionOptionIsClickable() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if subscription option is clickable");
        TaponbuttonaccessabilityID(constant_account_settings.Subscription_navigation_button);
    }

    @Then("I verify if subscription web page is displayed after selecting it")
    public void iVerifyIfSubscriptionWebPageIsDisplayedAfterSelectingIt() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if subscription web page is displayed after selecting it");
        iselementdisplayed(constant_account_settings.Subscription_webpage_xpath);
    }

    @Then("I verify if subscription title is displayed")
    public void iVerifyIfSubscriptionTitleIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if subscription title is displayed");
        iselementdisplayedaccessabilityId(constant_account_settings.Subscription_title);
    }

    @Then("I verify if subscription back button is available")
    public void iVerifyIfSubscriptionBackButtonIsAvailable() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if subscription back button is available");
        iselementdisplayedaccessabilityId(constant_account_settings.Subscription_backbutton);
    }

    @Then("I tap on subscription back button")
    public void iTapOnSubscriptionBackButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on subscription back button");
        TaponbuttonaccessabilityID(constant_account_settings.Subscription_backbutton);
    }
}
