package com.dometic.L2.qa.Pages;

public class Constant_settings {
    // --------------Accessibility_id-------------------//
    public static final String Settings_Back_Button_access_id="com.dometicapp:id/tiles-backImage";
    public static final String Settings_languageContainer_access_id="com.dometicapp:id/setting-languageContainer";
    public static final String Settings_versionContainer_access_id="com.dometicapp:id/setting-versionContainer";
    public static final String Settings_language_text_access_id="com.dometicapp:id/setting-languageText";
    public static final String Settings_language_text_expected="Sprachen";
    public static final String Settings_language_Spanish_text_expected="Idioma";
    public static final String Settings_temperature_Spanish_text_expected="Unidad de temperatura";
    public static final String Settings_version_Spanish_text_expected="Versión 1.3";
    public static final String Settings_logout_Spanish_text_expected="Cerrar sesión";
    public static final String Settings_language_French_text_expected="Langue";
    public static final String Settings_temperature_French_text_expected="Unité de température";
    public static final String Settings_version_French_text_expected="Version 1.3";
    public static final String Settings_logout_French_text_expected="Déconnexion";
    public static final String Settings_language_selectedName_access_id="com.dometicapp:id/setting-selectedLanguage";
    public static final String Settings_languages_navigation_button_access_id="com.dometicapp:id/setting-languageiconCollapse";
    public static final String Settings_Language_English_tick_access_id="com.dometicapp:id/language-iconTickEnglish";
    public static final String Settings_language_German_access_id="com.dometicapp:id/language-germanText";
    public static final String Settings_Language_German_tick_access_id="com.dometicapp:id/language-iconTickGerman";
    public static final String Settings_Temperature_text_access_id="com.dometicapp:id/setting-temperatureContainer";
    public static final String Settings_Temperature_text_expected="Temperatureinheit";
    public static final String Settings_version_text_access_id="com.dometicapp:id/setting-versionText";
    public static final String Settings_logout_text_access_id="com.dometicapp:id/setting-logOutText";
    public static final String Settings_logout_expected="Abmelden";
    public static final String Settings_fahrenheit_access_id="com.dometicapp:id/setting-fahrenheitText";
    public static final String Settings_Temperature_unit_access_id="com.dometicapp:id/setting-temperatureButtons";
    public static final String Settings_Zone_Management_expected="Zone Management";
    public static final String Settings_Zone_Management_ALL_ZONES_text="ALL ZONES";
    public static final String Settings_Zone_Management_edit_text="Edit";
    public static final String Settings_Zone_Management_LimitedZones_text="Limited to 4 Zones only";
    public static final String Settings_Zone_Management_addZoneIcon_access_id="com.dometicapp:id/zoneManagement-addZoneIcon";
    public static final String Settings_Zone_Management_addZoneIcon_Select_button_access_id="com.dometicapp:id/ZoneNumber-selectButton";
    public static final String Settings_Zone_Management_addZoneIcon_Select_text_access_id="com.dometicapp:id/ZoneNumber-selectZoneText";
    public static final String Settings_Zone_Management_Zone_Name_can_not_be_empty_text="Zone Name can not be empty";
    public static final String Settings_Zone_Management_10_character_text="10/10 character";
    public static final String Settings_Zone_Management_value="Living Room";
    public static final String Settings_Zone_Management_Living_Room="LivingRoom";
    public static final String Settings_Zone_Management_NewZone_Room="StudyRoom";
    public static final String Settings_Zone_Management_deleteZoneAlert_cancelButton_access_id="com.dometicapp:id/zoneManagement-deleteZoneAlert-saveButton";
    public static final String Settings_Zone_Management_deleteZoneAlert_YES_DELETE_ITButton_access_id="com.dometicapp:id/zoneManagement-deleteZoneAlert-cancelButton";
    public static final String Settings_Zone_Management_new_Zone_access_id="com.dometicapp:id/ZoneNumber-dialog-undefined";
    public static final String Settings_Zone_Management_ZoneNumber_dialog_saveButton_access_id="com.dometicapp:id/ZoneNumber-dialog-saveButton";
    public static final String Settings_Zone_Management_ZoneNumber_dialog_cancelButton_access_id="com.dometicapp:id/ZoneNumber-dialog-cancelButton";


    //-------------------Needed Accessibility Id-----------------//
    public static final String Settings_Language_Page_title_access_id="";
    public static final String Settings_language_Back_button_access_id="";
    public static final String Settings_Language_English_access_id="";
    public static final String Settings_back_button_access_id="";
    public static final String Settings_page_title_access_id="";
    public static final String Settings_temperature_unit_C_access_id="";
    public static final String Settings_temperature_unit_F_access_id="";

    // ----------------------xpath-----------------------------//
    public static final String Settings_text_xpath="(//*[@content-desc='com.dometicapp:id/setting-selectedLanguage'])[1]";
    public static final String Settings_Language_select_xpath="(//*[@content-desc='com.dometicapp:id/setting-languageContainer'])[1]";
    public static final String Settings_Temperature_unit_xpath="(//*[@class='android.view.ViewGroup'])[17]";
    public static final String Settings_Upgrade_Firmware_xpath="(//*[@content-desc='com.dometicapp:id/setting-languageContainer'])[2]";
    public static final String Settings_Version_xpath="//*[@content-desc='com.dometicapp:id/setting-versionContainer']";
    public static final String Settings_Logout_xpath="//android.view.ViewGroup[@content-desc='com.dometicapp:id/setting-logOutContainer']/android.view.ViewGroup";
    public static final String Settings_Language_Page_title_xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView";
    public static final String Settings_language_Back_button_xpath="//android.widget.Button[@content-desc=\" , back\"]/android.view.ViewGroup/android.widget.ImageView";
    public static final String Settings_Language_English_xpath="//android.widget.TextView[@content-desc=\"com.dometicapp:id/language-englishContainer\"]";
    public static final String Settings_back_button_xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]";
    public static final String Settings_page_title_xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView";
    public static final String Settings_temperature_unit_C_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/setting-temperatureButtons\"]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView";
    public static final String Settings_temperature_unit_F_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/setting-temperatureButtons\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView\n";
    public static final String Settings_language_Spanish_xpath="//*[@text='Spanish (US)']";
    public static final String Settings_language_French_xpath="//*[@text='French']";
    public static final String Settings_language_xpath="(//*[@content-desc='com.dometicapp:id/setting-languageText'])[1]";
    public static final String Settings_Zone_Management_xpath="(//*[@content-desc='com.dometicapp:id/setting-scrollView']//following::android.widget.TextView)[1]";
    public static final String Settings_Zone_Management_edit_xpath="(//*[@content-desc='com.dometicapp:id/setting-selectedLanguage']//following::android.widget.TextView)[1]";
    public static final String Settings_Zone_Management_LimitedZones_xpath="(//*[@content-desc='com.dometicapp:id/setting-selectedLanguage']//following::android.widget.TextView)[2]";
    public static final String Settings_Zone_Management_Rename_xpath="(//*[@content-desc='com.dometicapp:id/zoneManagement-flatList']//following::android.widget.TextView)[2]";
    public static final String Settings_Zone_Management_Rename_value_xpath="//android.widget.EditText[contains(@content-desc,'com.dometicapp:id/zoneManagement-dialog-')]";
    public static final String Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath="(//*[contains(@content-desc,'com.dometicapp:id/zoneManagement-dialog-')]//following::android.widget.TextView)[1]";
    public static final String Settings_Zone_Management_SAVE_Button_xpath="(//*[contains(@content-desc,'com.dometicapp:id/zoneManagement-dialog-')]//following::android.widget.TextView)[2]";
    public static final String Settings_Zone_Management_CANCEL_Button_xpath="(//*[contains(@content-desc,'com.dometicapp:id/zoneManagement-dialog-')]//following::android.widget.TextView)[2]";
    public static final String Settings_Zone_Management_flatListItem_xpath="(//*[contains(@content-desc,'com.dometicapp:id/zoneManagement-flatListItem-')]//following::android.view.ViewGroup)[2]";
    public static final String Settings_Zone_Management_deleteZoneAlert_description_xpath="//*[@content-desc='com.dometicapp:id/zoneManagement-deleteZoneAlert-description']";
    public static final String Settings_Zone_Management_deleteZone_xpath="//*[@text='YES, DELETE IT']";
    public static final String Settings_Zone_Management_addZoneIcon_Select_button_xpath="//*[@content-desc='com.dometicapp:id/ZoneNumber-selectButton']";
    public static final String Settings_Zone_Management_new_Zone_xpath="//*[@content-desc='com.dometicapp:id/ZoneNumber-dialog-undefined']";
    public static final String Settings_Zone_Management_Zone_name_already_present_xpath="//*[@text='Zone name already present']";
    public static final String Settings_Zone_Management_ZoneNumber_dialog_saveButton_xpath="//*[@content-desc='com.dometicapp:id/ZoneNumber-dialog-saveButton']";
    public static final String Settings_Zone_Management_ZoneNumber_dialog_cancelButton_xpath="//*[@content-desc='com.dometicapp:id/ZoneNumber-dialog-cancelButton']";
}
