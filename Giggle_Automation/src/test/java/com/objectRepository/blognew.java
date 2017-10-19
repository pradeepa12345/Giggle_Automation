package com.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.accelerators.ActionEngine;

public class blognew extends ActionEngine {

	public static  By logo = By.id("giggle-logo");
	public static By closepopup = By.xpath(".//*[@id='x-button']/a/img");
	public static By ourbloglogo = By.linkText("our blog");
	public static By logo2 = By.xpath("html/body/div[2]/header/div[1]/div/a/img");
	public static By lnkInspiration = By.linkText("INSPIRATION");
	public static By lnkdesign = By.xpath(".//*[@id='menu-item-14609']/a");
	public static By txtdesign = By.xpath("//h3[@class='sub-title']");
	public static By btnsearch = By.id("s");
	public static By txtresults = By.xpath("html/body/div[2]/div/div/div/section/div[1]/div/h3");
	
}
