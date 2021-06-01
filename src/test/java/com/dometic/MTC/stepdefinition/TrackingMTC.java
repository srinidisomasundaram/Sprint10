package com.dometic.MTC.stepdefinition;

import com.dometic.MTC.qa.Pages.Constant_Tracking_MTC;
import com.dometic.MTC.qa.util.Baseclass;
import cucumber.api.java.en.Then;

public class TrackingMTC extends Baseclass {
    @Then("I Tap on Tracking tile")
    public void iTapOnTrackingTile() {
        Taponbutton(Constant_Tracking_MTC.mtc_Tracking_Tile_Xpath);
    }

    @Then("I Verify Tracking Header title")
    public void iVerifyTrackingHeaderTitle() throws Throwable {
        asserttextValidationAccessibility(Constant_Tracking_MTC.mtc_Tank,Constant_Tracking_MTC.mtc_Tracking_Title_Access_ID);
    }


}
