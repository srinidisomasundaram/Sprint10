package com.dometic.L1.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_forgotpassword;
import com.dometic.L1.qa.Pages.Constant_login;
import com.dometic.L1.qa.util.Baseclass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class Forgotpassword extends Baseclass {
    com.dometic.L1.qa.Pages.Constant_forgotpassword forgotpassword_obj;
    @Then("I Verify Forgot Email Input text field is displayed in Login Page")
    public void Forgotpassword_Page_EmailInputbox() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Forgot Email Input textfield is displayed in Login Page");
//        Taponbutton(Constant_login.Login_forgot_password_link_xpath);
        Assert.assertTrue(iselementdisplayedaccessabilityId(forgotpassword_obj.Forgot_password_email));
    }
    @Then("I Verify Send button is displayed in Forgot password Page")
    public void Forgotpassword_Page_PasswordInputbox() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Send button is displayed in Forgot password Page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(forgotpassword_obj.Forgot_password_send));
    }

    @And("I enter Email in Login Page")
    public void Forgotpassword_enter_invalid_credentials() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter Email in Login Page");
        entertextaccessabilityId(forgotpassword_obj.Forgot_password_email1, forgotpassword_obj.Forgot_password_email);
    }
    @Then("I Tap on Send button in Forgot Password Page")
    public void Forgotpassword_enter_credentials_Forgotpassword() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Send button in Forgot Password Page");
        TaponbuttonaccessabilityID(forgotpassword_obj.Forgot_password_send);
    }

    @Then("I verify Forgot your password text is displayed in Forgot password Page")
    public void iVerifyForgotYourPasswordTextIsDisplayeddInForgotPasswordPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Forgot your password text is displayedd in Forgot password Page");
        TaponbuttonaccessabilityID(Constant_login.Login_forgot_password_link_access_id);
        asserttextAccessibility(Constant_forgotpassword.ForgetPassword_page_title_text_expected,Constant_forgotpassword.ForgetPassword_page_title_access_id);

    }

    @Then("I verify Forgot your password content text is displayed in Forgot password Page")
    public void iVerifyForgotYourPasswordContentTextIsDisplayedInForgotPasswordPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Forgot your password content text is displayed in Forgot password Page");
        asserttextAccessibility(Constant_forgotpassword.ForgetPassword_forgot_enterEmail_text_expected,Constant_forgotpassword.ForgetPassword_forgot_enterEmail_access_id);
        asserttextAccessibility(Constant_forgotpassword.ForgetPassword_forgot_createPass_text_expected,Constant_forgotpassword.ForgetPassword_forgot_createPass_access_id);
        asserttextAccessibility(Constant_forgotpassword.ForgetPassword_forgot_emailReceive_expected,Constant_forgotpassword.ForgetPassword_forgot_emailReceive_access_id);
        asserttextAccessibility(Constant_forgotpassword.ForgetPassword_forgot_checkSpam_expected,Constant_forgotpassword.ForgetPassword_forgot_checkSpam_access_id);
        asserttextAccessibility(Constant_forgotpassword.ForgetPassword_forgot_checkInbox_expected,Constant_forgotpassword.ForgetPassword_forgot_checkInbox_access_id);
        asserttextAccessibility(Constant_forgotpassword.ForgetPassword_forgot_checkinMin_expected,Constant_forgotpassword.ForgetPassword_forgot_checkinMin_access_id);
    }

    @Then("I verify E-mail \\(case sensitive) label is displayed")
    public void iVerifyEMailCaseSensitiveLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify E-mail (case sensitive) label is displayed");
        asserttextAccessibility(Constant_forgotpassword.ForgetPassword_forgot_email_label_expected,Constant_forgotpassword.ForgetPassword_forgot_email_label_access_id);
    }
}

