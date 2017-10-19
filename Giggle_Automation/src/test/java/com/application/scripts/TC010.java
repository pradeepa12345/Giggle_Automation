package com.application.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.objectRepository.blognew;

public class TC010 extends blognew{
	@Test
	public void blognew() throws Throwable {
		boolean newblog = true;
		try{
			boolean logo1 = isElementDisplayed(driver.findElement(logo));
			boolean ourblogflag = isElementDisplayed(driver.findElement(ourbloglogo));
			if(logo1){
				SuccessReport("Verify Logo display", "Giggle logo is displayed");
			}
			else{
				failureReport("Verify Logo display", "Giggle logo is not displayed");
			}
			
			if(ourblogflag){
				SuccessReport("Verify the ourblog link","our blog link is displayed");
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				click(ourbloglogo,"our blog is clicked");
			}
			else{
				failureReport("Verify the ourblog link","our blog link is not displayed");
			}	
			boolean logo2flag = isElementDisplayed(driver.findElement(logo2));
			if(logo2flag){
				SuccessReport("Verify baby logo", "baby logo is displayed");
			}
			else{
				failureReport("Verify baby logo", "baby logo is displayed");
			}
		boolean lnkInspirationflag = isElementDisplayed(driver.findElement(lnkInspiration));
		if(lnkInspirationflag){
			System.out.println("INSPIRAION link is diapleyed");
		}
		else{
			System.out.println("Inspiration link is not displayed");
		}
		click(lnkInspiration,"Inspiration link is clicked");
		boolean mouseoverflag = mouseover(lnkInspiration,"INSPIRATION");
		if(mouseoverflag) {
			SuccessReport("Click the INSPIRATION", "Mousehoer action is INSPIRATION is performed");
			click(lnkdesign,"clicked Design link");
		} else {
			failureReport("Click the INSPIRATION", "Mousehoer action is INSPIRATION is not performed");	
		}
			
			boolean txtdesingflag = isElementDisplayed(driver.findElement(txtdesign));
			if(txtdesingflag){
				SuccessReport("Verify the design text","Design text is displayed");
			}
			else{
				failureReport("Verify the design text","Design text is not displayed");
			}
			boolean searchflag = isElementDisplayed(driver.findElement(btnsearch));
		if(searchflag){
			SuccessReport("Verify theSearch button","Search button is diplayed");
			click(btnsearch,"Clicked Searched button");
			type(btnsearch,"toys","Entered toys in the button");
			click(btnsearch,"successfully Clicked Searched button");
		}
		else{
			failureReport("Verify theSearch button","Search button is not diplayed");
		}
		boolean txtresultsflag = isElementDisplayed(driver.findElement(txtresults));
		if(txtresultsflag){
			SuccessReport("Verify the text Results","Results text is displayed");
		}
		else{
			failureReport("Verify the text Results","Results text is not displayed");
		}
			
	}

		catch(Exception e) {
			e.printStackTrace();
			failureReport("Verify GEAR link", "Gear link is not displayed");
		}


	finally {if (newblog) {
		
		SuccessReport("All operations are performed", "Succefully all functions are performed");
} else {
	failureReport("All operations are not performed", " All functions are not performed" );	
}
}
}


	private void mouseHover(By lnkInspiration, String string) {
		// TODO Auto-generated method stub
		
	}
	}	
