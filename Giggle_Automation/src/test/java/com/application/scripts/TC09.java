package com.application.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.objectRepository.CommonPage;
import com.objectRepository.addtocart;
import com.utilities.Xls_Reader;

public class TC09 extends CommonPage{

	/**
	 * @author Pradeepa
	 * @Description This test case is to add product to cart with regsiter emailid
	 * @param
	 * @throws Throwable
	 */
	@Test
	public void testTC09() throws Throwable{
		boolean lnkgearflag;
		addtocart ad = new addtocart();
		boolean Newmousehoverflag = false;
		Xls_Reader reader = new Xls_Reader("TestData/Registerdetails.xlsx");
		try{
			boolean logoflag = isElementDisplayed(driver.findElement(imgGiggleLogo));
			if (logoflag) {
				SuccessReport("Verify Logo display", "Giggle logo is displayed");
			} else {
				failureReport("Verify Logo display", "Giggle logo is not displayed");	
			}
			boolean gearmousehoverflag = false;

			 lnkgearflag= isElementDisplayed(driver.findElement(ad.lnkgear));
			if (lnkgearflag) {
				SuccessReport("Verify GEAR link", "Gear link is displayed");
			}

			boolean mousehoverNEW = mouseHoverByJavaScript(ad.lnkgear,"GEAR LINK");
			if(mousehoverNEW) {
				SuccessReport("Click the GEAR link", "GEAR link is clicked");
			} else {
				failureReport("Click the GEAR link", "GEAR link is clicked");	
			}
			click (ad.lnkdiaperbags ," Diaper bags ");
			boolean verifycontentflag = isElementDisplayed(driver.findElement(ad.txtcontent));
			if(verifycontentflag){
				SuccessReport("Verify Diaper bags text  in  Daiaper bags link", "Diaper bags is displayed");

			} else {
				failureReport("Verify Diaper bags text  in  Daiaper bags link", "Diaper bags is not displayed");	
			}
			boolean verifylnkcolorflag = isElementDisplayed(driver.findElement(ad.lnkcolor));
			if(verifylnkcolorflag){
				SuccessReport("Verify color link  in  aiaper bags link", "Colors link  is displayed");

			} else {
				failureReport("Verify color link  in  aiaper bags link", "Colors link  is not displayed");	
			}
			click(ad.lnkcolor, "Colors link");
			boolean verifystripebagflag = isElementDisplayed(driver.findElement(ad.stripebag));
			if(verifystripebagflag){
				SuccessReport("Verify Stripe bag optioion  in  aiaper bags link", "Stripe bag  is displayed");

			} else {
				failureReport("Verify Stripe bag optioion  in  aiaper bags link", "Stripe bag  is not displayed");	
			}
			click(ad.stripebag, "Stripe bags");
			click(ad.tab, "click)");

			boolean verifyproduct1flag = isElementDisplayed(driver.findElement(ad.product1));
			if(verifyproduct1flag){
				SuccessReport("Verify Skip Hop high bag  in  aiaper bags link", "Skip Hop high bag  is displayed");

			} else {
				failureReport("Verify Skip Hop high bag  in  aiaper bags link", "Skip Hop high bag  is not displayed");	
			}
			click(ad.product1, "Skip Sky High bags");
			/*boolean verifyzoomimageflag = isElementDisplayed(driver.findElement(ad.zoomimage));
			if(verifyzoomimageflag){
				SuccessReport("Verify Zoom image in  Daiaper bags link", "Zoom image  is displayed");

			} else {
				failureReport("Verify Zoom image in  Daiaper bags link", "Zoom image  is  not displayed");	
			}
			click(ad.zoomimage, "Zoom image");
			boolean verifyzoomimageflag1 = isElementDisplayed(driver.findElement(ad.zoomimage));
			if(verifyzoomimageflag1){
				SuccessReport("Verify Zoom image in  Daiaper bags link", "Zoom image  is displayed");

			} else {
				failureReport("Verify Zoom image in  Daiaper bags link", "Zoom image  is  not displayed");	
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			click(ad.zoomimage, "Zoom image");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			boolean verifyclosezoomflag = isElementDisplayed(driver.findElement(ad.closezoom));
			if(verifyclosezoomflag){
				SuccessReport("Verify close in Zoom image ", "Close is displayed");

			} else {
				failureReport("Verify close in Zoom image ", "Close is not displayed");	
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			click(ad.closezoom, "Close the Zoom image");*/
			boolean verifyquanityflag = isElementDisplayed(driver.findElement(ad.quanity));
			if(verifyquanityflag){
				SuccessReport("Verify the Quantity list box", "Quanitity listbox is displayed");

			} else {
				failureReport("Verify the Quantity list box", "Quanitity listbox is not displayed");	
			}
			clear(ad.quanity, "Select the number of items");
			click(ad.quanity, "Select the number of items");

			selectBySendkeys(ad.quanity, "2",
					"Quanity seleted");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			boolean verifyaddtocartflag = isElementDisplayed(driver.findElement(ad.addtocart));
			if(verifyaddtocartflag){
				SuccessReport("Verify add to regsiter ", "Add to Register is displayed");

			} else {
				failureReport("Verify add to regsiter ", "Add to Register is not displayed");	
			}
			click(ad.addtocart, "Add to Register");
			boolean verifyregemailflag = isElementDisplayed(driver.findElement(ad.regemail));
			if(verifyregemailflag){
				SuccessReport("Verify Email textbox in  regsiter ", "Email tetxbox is displayed");

			} else {
				failureReport("Verify Email textbox in  regsiter ", "Email tetxbox is not displayed");	
			}
			click(ad.regemail, "Email");
			type(ad.regemail, reader.getCellData("sheet2", "Details", 2), "Enter the Email ID");
			boolean verifyregpassflag = isElementDisplayed(driver.findElement(ad.regpassword));
			if(verifyregpassflag){
				SuccessReport("Verify Password textbox in  regsiter ", "Password tetxbox is displayed");

			} else {
				failureReport("Verify Password textbox in  regsiter ", "Password tetxbox is not displayed");	
			}
			click(ad.regpassword, "Password");
			type(ad.regpassword, reader.getCellData("sheet2", "Details", 3), "Enter the Password");
			boolean verifysigninflag = isElementDisplayed(driver.findElement(ad.signin));
			if(verifysigninflag){
				SuccessReport("Verify Sign In link in  regsiter ", "Sign In is displayed");
				Newmousehoverflag = true;
			} else {
				failureReport("Verify Sign In link in  regsiter ", "Sign In is not displayed");	
			}
			click(ad.signin, "Sign In");
			screenshot("C:/Users/Pradeepa/Pictures/deepa1.png");

		}
		catch(Exception e) {
			e.printStackTrace();
			failureReport("Verify GEAR link", "Gear link is not displayed");
	}

		finally{if (Newmousehoverflag) {
							
				SuccessReport("Add the Diaper bag to the cart", "Diaper Bag is successfully add to the cart");
		} else {
			failureReport("Add the Diaper bag to the cart", "Diaper Bag is not able to add to the cart" );	
		}
		}
	}

	public void screenshot(String string) {
		// TODO Auto-generated method stub

	}
}

