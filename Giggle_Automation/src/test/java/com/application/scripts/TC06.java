package com.application.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.objectRepository.CommonPage;

public class TC06 extends CommonPage{

	/**
	 * @author NareshBabu
	 * @Description This test case is to verify the display of giggle logo
	 * @param
	 * @throws Throwable
	 */
	@Test

	public void testTC06() throws Throwable{
		boolean ourblog1flag = false;
		try{
			/*boolean popupflag = isElementDisplayed(driver.findElement(popup));
			if  (popupflag) {
				click(popup,"closed popup");}
				else{
					failureReport("close the popup", "popup window is not closed");	
			}*/
			boolean ourblogflag = isElementDisplayed(driver.findElement(lnkourblog));
			if (ourblogflag) {
				SuccessReport("Verify ourblog link", "our blog link is displayed");
			} else {
				failureReport("Verify Logo display", "Giggle logo is not displayed");	
			}
			click(lnkourblog,"ourbloglinkclicked");

			boolean  shopwindowflag = isElementDisplayed(driver.findElement(shopwindow));
			if( shopwindowflag)
			{
				SuccessReport("Verify Shop link", "shop link is displayed");
				ourblog1flag=true;
			} else {
				failureReport("Verify shop link", "shop link is not displayed");	
			}
			click(shopwindow,"Shop link is clicked");
			boolean window2 = switchToNewWindow();
			driver.getTitle();
			boolean logoflag = isElementDisplayed(driver.findElement(imgGiggleLogo));
			if (logoflag) {
				SuccessReport("Verify Logo display", "Giggle logo is displayed");
			} else {
				failureReport("Verify Logo display", "Giggle logo is not displayed");	
			}
			boolean window1 = switchToOldWindow();
			driver.getTitle();
			boolean lnkinspirationflag = isElementDisplayed(driver.findElement(lnkinspiration));
			if (lnkinspirationflag) {
				SuccessReport("INSPIRATION display", "Inspiration is displayed");
			} else {
				failureReport("INSPIRATION display", "Inspiration is not displayed");	
			}
			///click(lnkinspiration, "INSPIRATION");
			boolean mousehoverNEW = mouseover(lnkinspiration,"INSPIRATION");
		if(mousehoverNEW) {
			SuccessReport("Click the INSPIRATION", "INSPIRATION is clicked");
		} else {
			failureReport("Click the INSPIRATION", "INSPIRATION is clicked");	
		}
		click (lnkbabyshowers," BABYSHOWER");
		boolean txtbabyshowerflag = isElementDisplayed(driver.findElement(txtbabyshower));
		if(txtbabyshowerflag){
			SuccessReport("Verify baby shower text in link", "BABYSHOWER text is displayed");
			ourblog1flag = true;
		} else {
			failureReport("Verify baby shower text in link ", "BABY SHOWER text is not displayed");	
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		finally{if (ourblog1flag) {
			SuccessReport("Verify windowhandling link", "windowhandling is verified");
		} else {
			failureReport("Verify windowhandling link ", "Failed to verify window handling link");	
		}
		}
	}
}
