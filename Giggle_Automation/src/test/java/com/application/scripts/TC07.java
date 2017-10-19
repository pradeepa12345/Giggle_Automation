package com.application.scripts;

import org.testng.annotations.Test;
import com.objectRepository.CommonPage;

public class TC07 extends CommonPage{

	/**
	 * @author NareshBabu
	 * @Description This test case is to verify the display of giggle logo
	 * @param
	 * @throws Throwable
	 */
	@Test
	public void testTC01() throws Throwable{
	boolean bflag=false;
	
		try{
	
		boolean freeshippingflag = isElementDisplayed(driver.findElement(lnkfreeshipping));
		if (freeshippingflag) {
			SuccessReport("Verify freeshipping link display", "freeshipping link is displayed");
		} else {
			failureReport("Verify freeshipping link display", "freeshipping link is not displayed");	
		}
		click(lnkfreeshipping,"FREESHIPPING");
		boolean closelinkflag = isElementDisplayed(driver.findElement(closelink ));
	if (closelinkflag) {
		SuccessReport("Verify POPUP window display", "POP-UP window is displayed");
		bflag=true;
	} else {
		failureReport("Verify POPUP window display", "POP-UP window is not displayed");	
	}
	click (closelink,"closed the popup");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		
		if (bflag) {
			SuccessReport("Verify Product Search", "Successfully searched the product");
		} else {
			failureReport("Verify Product Search", "Failed to search the product");	
		}
		
	}
	}
}

