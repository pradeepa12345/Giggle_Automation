package com.application.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.objectRepository.CommonPage;

public class TC05 extends CommonPage{

	/**
	 * @author NareshBabu
	 * @Description This test case is to verify the display of giggle logo
	 * @param
	 * @throws Throwable
	 */
	@Test
	public void testTC05() throws Throwable{
		boolean NEWmousehoverflag = false;
		try{
			boolean lnknewflag= isElementDisplayed(driver.findElement(lnknew));
			if (lnknewflag) {
				SuccessReport("Verify NEW link", "NEW link is displayed");
			} else {
				failureReport("Verify NEW link", "NEW link is not displayed");	
			}

			boolean mousehoverNEW = mouseHoverByJavaScript(lnknew,"NEW LINK");
			if(mousehoverNEW) {
				SuccessReport("Click the NEW link", "NEW link is clicked");
			} else {
				failureReport("Click the NEW link", "NEW link is clicked");	
			}
			click (lnkToys," Toy link ");
			boolean verifytoysflag = isElementDisplayed(driver.findElement(verifyToys));
			if(verifytoysflag){
				SuccessReport("Verify Toy text in TOY link", "Toy word is displayed");
				NEWmousehoverflag = true;
			} else {
				failureReport("Verify Toy text in TOY link ", "Toy word is not displayed");	
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}

		finally{if (NEWmousehoverflag) {
			SuccessReport("Clicked NEW and Toy link", "Both NEW and Toy links are clicked successfully");
		} else {
			failureReport("Clicked NEW and Toy link", "Both NEW and Toy links are not clicked ");	
		}
		}
	}
}

