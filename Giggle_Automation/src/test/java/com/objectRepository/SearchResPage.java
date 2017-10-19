package com.objectRepository;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;

public class SearchResPage extends ActionEngine{
	
	public By txtemail = By.id("dwfrm_profile_customer_email");
	public By lnkNEXT = By.name("dwfrm_profile_confirm");
	public By txtpassword = By.id("dwfrm_profile_login_password");
	public By txtconfirm=By.id("dwfrm_profile_login_passwordconfirm");
public By txtfirstname=By.id("dwfrm_profile_customer_firstname");
public By txtlastname=By.id("dwfrm_profile_customer_lastname");
public By txtshippingco=By.id("dwfrm_profile_address_shippingco");
public By txtshipping1=By.id("dwfrm_profile_address_address1");
public By txtshipping2=By.id("dwfrm_profile_address_address2");
public By txtcity=By.id("dwfrm_profile_address_city");
public By txtstate=By.id("dwfrm_profile_address_states_state");
public By txtzip=By.id("dwfrm_profile_address_zip");
public By txtphone=By.id("dwfrm_profile_address_phone");
public By radiogift=By.id("dwfrm_giftregistry_event_registrant");
public By radioaddpartner = By.id("dwfrm_giftregistry_event_coregistrant");
public By verifynavi = By.id("main");
public By eventtype = By.id("dwfrm_giftregistry_event_type");
public By regname = By.id("dwfrm_giftregistry_event_name");
public By date = By.cssSelector("img.ui-datepicker-trigger");
public By date1= By.linkText("21");
public By gender = By.id("t");
public By next1 = By.name("dwfrm_giftregistry_event_confirm");
public By main1 = By.id("main");
public By next2=By.name("dwfrm_giftregistry_confirm");
public By lnkcreatereg = By.id("dwfrm_giftregistry_event_confirm");

}