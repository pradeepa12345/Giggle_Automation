package com.application.scripts;

import org.testng.annotations.Test;
import com.objectRepository.CommonPage;

public class TC03 extends CommonPage{

	/**
	 * @author NareshBabu
	 * @Description This test case is to verify the display of giggle logo
	 * @param
	 * @throws Throwable
	 */
	@Test
	public void testTC03() throws Throwable{
		boolean searchflag = false;
		try{
			boolean chkflag = isElementDisplayed(driver.findElement(chkbtn));

			if (chkflag) {
				SuccessReport("Verify CHECKOUT display", "CHECKOUT button is displayed");
			} else {
				failureReport("Verify CHECKOUT display", "CHECKOUT button is not displayed");	
			} 
			boolean yourcartflag = isElementDisplayed(driver.findElement(ycrt));
			if (yourcartflag) {
				SuccessReport("Verify YOUR CART display", "YOUR CART button is displayed");
				 searchflag = true;
			} else {
				failureReport("Verify YOUR CART display", "YOUR CART button is not displayed");	
			}

		} catch(Exception e){
			e.printStackTrace();
		}

		finally{
			if (searchflag){
				SuccessReport("Verify the buttons", "YOUR CART button and CHECKOUT buttons are displayed");
			}else
			{
				failureReport("Verify the buttons", "YOUR CART/CHECKOUT button is not displayed");
			}


		}
	}
}

