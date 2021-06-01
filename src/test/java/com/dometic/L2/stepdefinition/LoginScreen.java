package com.dometic.L2.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L2.qa.Pages.Constant_OnboardingPage;
import com.dometic.L2.qa.Pages.Constant_login;
import com.dometic.L2.qa.util.Baseclass;
import com.google.common.collect.ImmutableMap;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class LoginScreen extends Baseclass {
    Constant_login login_obj;
    @Then("I enter Invalid Email in Login Page")
    public void iEnterInvalidEmailInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter Invalid Email in Login Page");
        //Taponbutton(login_obj.Login_Email_Xpath);
        TaponbuttonaccessabilityID(login_obj.Login_Email);
        Thread.sleep(1000);
        cleartext(login_obj.Login_Email_Xpath);
        //entertext(login_obj.invaliduser1,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(login_obj.invaliduser1,login_obj.Login_Email);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Invalid Password in Login Page")
    public void iEnterAnInvalidPasswordInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Invalid Password in Login Page");
        //Taponbutton(login_obj.Login_Password_Xpath);
        TaponbuttonaccessabilityID(login_obj.Login_Password);
      //  entertext(login_obj.invalidpassword,login_obj.Login_Password_Xpath);
        Thread.sleep(1000);
        cleartext(login_obj.Login_Password_Xpath);
        entertextaccessabilityId(login_obj.invalidpassword,login_obj.Login_Password);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Tap on Login button in Login Page")
    public void iTapOnLoginButtonInLoginPage() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Login button in Login Page");
        //Taponbutton(login_obj.Login_login_button_xpath);
        TaponbuttonaccessabilityID(login_obj.loginbutton);
    }

    @Then("Error message is displayed")
    public void errorMessageIsDisplayed() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "Error message is displayed");
        List<AndroidElement> errorMessage = driver.findElements(By.xpath("//*[@text='Invalid Login']"));
        if(errorMessage.size()!=0){
            Assert.assertTrue(iselementdisplayed(Constant_login.Login_error_text_xpath));
        }
        //  Assert.assertTrue(iselementdisplayedaccessabilityId(login_obj.Login_welcome_text_access_id));
    }

    @Then("I enter Valid Email in Login Page")
    public void iEnterValidEmailInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter Valid Email in Login Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(login_obj.Login_Email);
        Thread.sleep(1000);
        cleartext(login_obj.Login_Email_Xpath);
      //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(login_obj.ValidUser,login_obj.Login_Email);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter Valid Password in Login Page")
    public void iEnterValidPasswordInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter Valid Password in Login Page");
     //   Taponbutton(login_obj.Login_Password_Xpath);
        TaponbuttonaccessabilityID(login_obj.Login_Password);
        Thread.sleep(1000);
        cleartext(login_obj.Login_Password_Xpath);
    //    entertext(login_obj.Validpassword,login_obj.Login_Password_Xpath);
        entertextaccessabilityId(login_obj.Validpassword,login_obj.Login_Password);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I verify successfully navigated to On boarding screen")
    public void iVerifySuccessfullyNavigatedToOnBoardingScreen() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify successfully navigated to On boarding screen");
        System.out.println("Navigated to onbording screen successfully");

    }

    @Then("I Tap on an Login button in Login Page")
    public void iTapOnAnLoginButtonInLoginPage() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on an Login button in Login Page");
     //   Taponbutton(login_obj.Login_login_button_xpath);
        TaponbuttonaccessabilityID(login_obj.loginbutton);
        Thread.sleep(3000);
            WebDriverWait wait=new WebDriverWait(driver,300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_OnboardingPage.Onboarding_only_this_time_xpath)));
            Thread.sleep(3000);
            Taponbutton(Constant_OnboardingPage.Onboarding_only_this_time_xpath);
    }
    @Then("I verify Welcome Text is displaying in Login Page")
    public void assert_Welcome() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Welcome Text is displaying in Login Page");
        System.out.println("Please change the status into Test Environment");
        Thread.sleep(30000);
        asserttextAccessibility(login_obj.Login_welcome_text_expected, login_obj.Login_pagetitle);
    }

    @Then("I Verify Page title is displayed in Login Page")
    public void Login_Page_Title() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Page title is displayed in Login Page");
        iselementdisplayedaccessabilityId(login_obj.Login_pagetitle);
    }

    @Then("I verify Welcome! Text is displayed in login screen")
    public void iVerifyWelcomeTextIsDisplayedInLoginScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Welcome! Text is displayed in login screen");
        asserttextAccessibility(Constant_login.Login_welcome_text_expected,Constant_login.Login_welcome_text_access_id);
    }

    @Then("I verify Log In Text is displayed in login screen")
    public void iVerifyLogInTextIsDisplayedInLoginScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Log In Text is displayed in login screen");
        asserttextAccessibility(Constant_login.Login_login_text_expected,Constant_login.Login_login_text_access_id);
    }

    @Then("I verify E-mail label is displayed in login page")
    public void iVerifyEMailLabelIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify E-mail label is displayed in login page");
        asserttextAccessibility(Constant_login.Login_email_text_expected,Constant_login.Login_email_text_access_id);
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_login.Login_email_field_access_id));
    }

    @Then("I verify Password label is displayed in login page")
    public void iVerifyPasswordLabelIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Password label is displayed in login page");
        asserttextAccessibility(Constant_login.Login_password_text_expected,Constant_login.Login_password_text_access_id);
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_login.Login_password_field_access_id));
    }

    @Then("I verify Forgot password? link is displayed in login page")
    public void iVerifyForgotPasswordLinkIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Forgot password? link is displayed in login page");
        asserttextAccessibility(Constant_login.Login_forget_password_text_expected,Constant_login.Login_forgot_password_link_access_id);
    }

    @Then("I verify Don't have an account? text is displayed in login page")
    public void iVerifyDonTHaveAnAccountTextIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Don't have an account? text is displayed in login page");
        asserttextAccessibility(Constant_login.Login_Dont_have_an_account_text_expected,Constant_login.Login_Dont_have_an_account_access_id);
    }

    @Then("I verify Sign Up link is displayed in login page")
    public void iVerifySignUpLinkIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Sign Up link is displayed in login page");
        asserttextAccessibility(Constant_login.Login_Sign_Up_text_expected,Constant_login.Login_signup_link_access_id);
    }

    @Then("I verify Login CTA is displayed in login page")
    public void iVerifyLoginCTAIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Login CTA is displayed in login page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_login.Login_login_button_access_id));
        //System.out.println(Constant_login.Login_login_button_access_id);
        asserttextAccessibility(Constant_login.Login_login_text_expected,Constant_login.Login_login_button_text_access_id);
    }

    @Then("I verify black email in email text field")
    public void iVerifyBlackEmailInEmailTextField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify black email in email text field");
        TaponbuttonaccessabilityID(login_obj.Login_Email);
        Thread.sleep(1000);
        cleartext(login_obj.Login_Email_Xpath);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I verify black password in password text field")
    public void iVerifyBlackPasswordInPasswordTextField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify black password in password text field");
        TaponbuttonaccessabilityID(login_obj.Login_Password);
        Thread.sleep(1000);
        cleartext(login_obj.Login_Password_Xpath);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }
}
