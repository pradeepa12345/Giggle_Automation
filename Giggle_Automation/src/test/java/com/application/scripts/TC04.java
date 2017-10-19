package com.application.scripts;

import org.testng.annotations.Test;
import com.objectRepository.CommonPage;

public class TC04 extends CommonPage{

	/**
	 * @author NareshBabu
	 * @Description This test case is to verify the display of giggle logo
	 * @param
	 * @throws Throwable
	 */
	@Test
	
	public void testTC07() throws Throwable{
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
		
		boolean  insidegiggleflag = isElementDisplayed(driver.findElement(lnkinsidegiggle));
		if(insidegiggleflag)
		{
			SuccessReport("Verify INSIDE giggle link", "INSIDE giggle link is displayed");
			ourblog1flag=true;
		} else {
			failureReport("Verify INSIDE giggle link", "INSIDE giggle link is not displayed");	
		}
	}
catch (Exception e) {
		e.printStackTrace();
}
	
	finally{if (ourblog1flag) {
		SuccessReport("Verify ourblog link", "ourblog link is verified");
	} else {
		failureReport("Verify ourblog link ", "Failed to verify the ourblog link");	
	}
	}
}

	}
