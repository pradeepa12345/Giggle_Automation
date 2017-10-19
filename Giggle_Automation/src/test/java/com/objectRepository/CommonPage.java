package com.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.accelerators.ActionEngine;

public class CommonPage extends ActionEngine{

	public  By imgGiggleLogo = 	By.id("giggle-logo");
	public 	By txtSearchbox = 	By.id("searchTerm");
	public 	By btnSearch 	= 	By.xpath("//input[@type='submit']");
	public By chkbtn = By.id("checkout");
	public By ycrt = By.xpath("//span[@class='cartlabel sofiapromedium']");
	public By popup = By.id("closewelcomeRedirectPopupDialog");
	public By lnkourblog = By.linkText("our blog");
	public By lnkinsidegiggle= By.linkText("INSIDE giggle");
	public By lnknew = By.id("new");
	public By lnkToys = By.linkText("Toys");
	public By verifyToys = By.xpath("//h1[@class='category-title']");
	public By shopwindow = By.id("menu-item-14539");
	public By lnkinspiration = By.linkText("INSPIRATION");
	public By lnkbabyshowers = By.xpath("//a[contains(.,'Baby Showers')]");
	public By txtbabyshower = By.xpath("//h3[contains(.,'Baby Showers')]");
	public By lnkfreeshipping = By.xpath("//*[@id='headerfreeshipbanner']/div/img");
	public By closelink = By.id("ui-dialog-title-headerShipModal");
	public By lnkcreate = By.linkText("CREATE");
	public By lnkcontinue = By.xpath("//button[@name='dwfrm_login_register']");
	
}
