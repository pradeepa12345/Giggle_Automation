package com.objectRepository;

import org.openqa.selenium.By;

public class addtocart {
	public By lnkgear= By.id("gear");
	public By lnkdiaperbags = By.linkText("Diaper Bags");
	public By txtcontent = By.id("content");
	public By lnkcolor = By.id("refinement-refinementColor");
	public By stripebag = By.id("swatch-Stripe");
	public By tab = By.id("productsTab");
	public By product1 = By.xpath("(//img[@alt='Skip Hop Highline Diaper Tote - Oyster Stripe'])[2]");
	public By quanity = By.cssSelector("input.quantityspinner");
	//public By zoomimage = By.linkText("VIEW FULL SIZE IMAGE");
	public By zoomimage = By.xpath("//a[@class='click-enlarge']");
//public By closezoom = By.xpath("/html/body/div[12]/div[1]/a/span");
//public By closezoom = By.id("container");
public By closezoom = By.xpath("//span[@class='ui-icon ui-icon-closethick']");

public By addtocart = By.cssSelector("button.allproducttoregistry.addtoregistry");
public By regemail = By.id("dwfrm_login_username");
public By regpassword = By.id("dwfrm_login_password");
public By signin = By.name("dwfrm_login_login");
}
