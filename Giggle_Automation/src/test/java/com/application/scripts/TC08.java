package com.application.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.objectRepository.CommonPage;
import com.objectRepository.LoginPage;
import com.objectRepository.SearchResPage;
import com.utilities.Xls_Reader;

public class TC08 extends CommonPage{

	/**
	 * @author Pradeepa
	 * @Description This test case is to create registertion in giggle.com
	 * @param
	 * @throws Throwable
	 */
	@SuppressWarnings({ "unused", "unused" })
	@Test
	public void testTC08() throws Throwable{
		boolean regflag = false;
		Xls_Reader reader = new Xls_Reader("TestData/Data.xlsx");
		SearchResPage sr = new SearchResPage();

		try{
			boolean logoflag = isElementDisplayed(driver.findElement(imgGiggleLogo));
			if (logoflag) {
				SuccessReport("Verify Logo display", "Giggle logo is displayed");
			} else {
				failureReport("Verify Logo display", "Giggle logo is not displayed");	
			}
			boolean createflag = isElementDisplayed(driver.findElement(lnkcreate));
			if (createflag) {
				SuccessReport("Verify CREATE link display", "CREATE LINK is displayed");
			} else {
				failureReport("Verify CREATE link display", "CREATE LINK is  not displayed");	
			}
			click(lnkcreate,"click on CREATE LINK");
			boolean countineflag = isElementDisplayed(driver.findElement(lnkcontinue));
			if (countineflag) {
				SuccessReport("Verify COUNTINE link display", "COUNTINE LINK is displayed");
			} else {
				failureReport("Verify COUNTINE link display", "COUNTINE LINK is  not displayed");	
			}
			click(lnkcontinue,"click on COUNTINE LINK");
			boolean txtemailflag = isElementDisplayed(driver.findElement(sr.txtemail));
			if (txtemailflag) {
				SuccessReport("Verify EMAIL textbox display", "Email textbox is displayed");
			} else {
				failureReport("Verify EMAIL  textbox display", "Email textbox is  not displayed");	
			}
			click(sr.txtemail,"Click email");
			type(sr.txtemail, reader.getCellData("sheet1", "RegDetails", 2), "Enter the  Email address");
			boolean txtpasswordflag = isElementDisplayed(driver.findElement(sr.txtpassword));
			if (txtpasswordflag) {
				SuccessReport("Verify Password textbox display", "Password textbox is displayed");
			} else {
				failureReport("Verify Password textbox display", "Password textbox is  not displayed");	
			}
			click(sr.txtpassword,"Click Password");
			type(sr.txtpassword, reader.getCellData("sheet1", "RegDetails", 3), "Enter the Password");
			boolean txtCpasswordflag = isElementDisplayed(driver.findElement(sr.txtconfirm));
			if (txtCpasswordflag) {
				SuccessReport("Verify confirm Password textbox display", "comfirm Password textbox is displayed");
			} else {
				failureReport("Verify confirm Password textbox display", "confirm Password textbox is  not displayed");	
			}
			click(sr.txtconfirm,"Click confirm Password");
			type(sr.txtconfirm, reader.getCellData("sheet1", "RegDetails", 4), "Enter the Password");
			boolean txtfirstnameflag = isElementDisplayed(driver.findElement(sr.txtfirstname));
			if (txtfirstnameflag) {
				SuccessReport("Verify firstname textbox display", "Firstname textbox is displayed");
			} else {
				failureReport("Verify firstname textbox display", "Firstname textbox is  not displayed");	
			}
			click(sr.txtfirstname,"Click Firstname");
			type(sr.txtfirstname, reader.getCellData("sheet1", "RegDetails", 5), "Enter the Firstname");
			boolean txtlastnameflag = isElementDisplayed(driver.findElement(sr.txtlastname));
			if (txtlastnameflag) {
				SuccessReport("Verify Lastname textbox display", "Lastname textbox is displayed");
			} else {
				failureReport("Verify Lastname textbox display", "Lastname textbox is  not displayed");	
			}
			click(sr.txtlastname,"Click lastname");
			type(sr.txtlastname, reader.getCellData("sheet1", "RegDetails", 6), "Enter the lastname");
			boolean txtshippingcoflag = isElementDisplayed(driver.findElement(sr.txtshippingco));
			if (txtshippingcoflag) {
				SuccessReport("Verify shippingco textbox display", "shippingco textbox is displayed");
			} else {
				failureReport("Verify shippingco textbox display", "shippingco textbox is  not displayed");	
			}
			click(sr.txtshippingco,"Click Shippingco");
			type(sr.txtshippingco, reader.getCellData("sheet1", "RegDetails", 7), "Enter the shippingco");
			boolean txtshipping1flag = isElementDisplayed(driver.findElement(sr.txtshipping1));
			if (txtshipping1flag) {
				SuccessReport("Verify shipping1 textbox display", "shipping1 textbox is displayed");
			} else {
				failureReport("Verify shipping1 textbox display", "shipping1 textbox is  not displayed");	
			}
			click(sr.txtshipping1,"Click Shipping1");
			type(sr.txtshipping1, reader.getCellData("sheet1", "RegDetails", 8), "Enter the shipping1");
			boolean txtshipping2flag = isElementDisplayed(driver.findElement(sr.txtshipping2));
			if (txtshipping2flag) {
				SuccessReport("Verify shipping2 textbox display", "shipping2 textbox is displayed");
			} else {
				failureReport("Verify shipping2 textbox display", "shipping2 textbox is  not displayed");	
			}
			click(sr.txtshipping2,"Click Shipping2");
			type(sr.txtshipping2, reader.getCellData("sheet1", "RegDetails", 9), "Enter the shipping2");
			boolean txtcityflag = isElementDisplayed(driver.findElement(sr.txtcity));
			if (txtcityflag) {
				SuccessReport("Verify city textbox display", "city textbox is displayed");
			} else {
				failureReport("Verify city textbox display", "city textbox is  not displayed");	
			}
			click(sr.txtcity,"Click city");
			type(sr.txtcity, reader.getCellData("sheet1", "RegDetails", 10), "Enter the city");
			
			boolean txtstateflag = isElementDisplayed(driver.findElement(sr.txtstate));
			if (txtstateflag) {
				SuccessReport("Verify state listboxbox display", "state listbox is displayed");
			} else {
				failureReport("Verify state listbox display", "state listbox is  not displayed");	
			}
			selectByIndex(sr.txtstate,  8,
					"Statename");
			boolean txtzipcodeflag = isElementDisplayed(driver.findElement(sr.txtzip));
			if (txtzipcodeflag) {
				SuccessReport("Verify zipcode textbox display", "zipcode textbox is displayed");
			} else {
				failureReport("Verify zipcode textbox display", "zipcode textbox is  not displayed");	
			}
			click(sr.txtzip,"Click zipcode");
			type(sr.txtzip, reader.getCellData("sheet1", "RegDetails", 11), "Enter the zipcode");
			boolean txtphoneflag = isElementDisplayed(driver.findElement(sr.txtphone));
			if (txtphoneflag) {
				SuccessReport("Verify phone textbox display", "phone textbox is displayed");
			} else {
				failureReport("Verify phone textbox display", "phone textbox is  not displayed");	
			}
			click(sr.txtphone,"Click phone");
			type(sr.txtphone, reader.getCellData("sheet1", "RegDetails", 12), "Enter the phone");
			
			boolean radiogiftflag = isElementDisplayed(driver.findElement(sr.radiogift));
			if (radiogiftflag) {
				SuccessReport("Verify gift radio button display", "gift radiobutton  is displayed");
			} else {
				failureReport("Verify gift radio button display", "gift radiobutton  is not displayed");	
			}
			click(sr.radiogift,"Click gift radiobutton");
			boolean radioaddflag = isElementDisplayed(driver.findElement(sr.radioaddpartner));
			if (radioaddflag) {
				SuccessReport("Verify add radio button display", "add radiobutton  is displayed");
			} else {
				failureReport("Verify add radio button display", "add radiobutton  is not displayed");	
			}
			//click(sr.radioaddpartner,"Click add radiobutton");
			boolean nextflag = isElementDisplayed(driver.findElement(sr.lnkNEXT));
			if (nextflag) {
				SuccessReport("Verify NEXT link button display", "NEXT link   is displayed");
				
			} else {
				failureReport("Verify NEXT link button display", "NEXT link   is not displayed");	
			}
			click(sr.lnkNEXT,"CLICK NEXT");
			
			boolean verifynaviflag = isElementDisplayed(driver.findElement(sr.verifynavi));
			if (verifynaviflag ) {
				SuccessReport("Verify the next navigation page display", "next page  is displayed");
			} else {
				failureReport("Verify the next navigation page display", "next page  is not displayed");	
			}
			boolean main1flag = isElementDisplayed(driver.findElement(sr.main1));
			if (main1flag) {
				SuccessReport("Verify next page  display", "next page is displayed");
			} else {
				failureReport("Verify next page  display", "next page is not displayed");	
			}
			
			boolean next2flag = isElementDisplayed(driver.findElement(sr.next2));
			if (next2flag) {
				SuccessReport("Verify next page  display", "next page is displayed");
			} else {
				failureReport("Verify next page  display", "next page is not displayed");	
			}
			click(sr.next2,"next page");

			
			boolean eventtypeflag = isElementDisplayed(driver.findElement(sr.eventtype));
			if (eventtypeflag) {
				SuccessReport("Verify the event type listbox display", "list box  is displayed");
			} else {
				failureReport("Verify the event type listbox display", "list box  is not displayed");	
			}
			selectByValue(sr.eventtype, "Other",
					"event type name");
			
			boolean regnameflag = isElementDisplayed(driver.findElement(sr.regname));
			if (regnameflag) {
				SuccessReport("Verify reg name textbox  display", "name textbox   is displayed");
				
			} else {
				failureReport("Verify reg name textbox  display", "name textbox   is not displayed");	
			}
			click(sr.regname,"name");
			selectBySendkeys(sr.regname, "MOORTHY",
					"register name");
			boolean dateflag = isElementDisplayed(driver.findElement(sr.date));
			if (dateflag) {
				SuccessReport("Verify date calender display", "date calender   is displayed");
				
			} else {
				failureReport("Verify date calender display", "date calender   is not displayed");	
			}
			click(sr.date,"date");
			click(sr.date1,"select date");
			boolean genderflag = isElementDisplayed(driver.findElement(sr.gender));
			if (genderflag) {
				SuccessReport("Verify gender textbox display", "gender textbox   is displayed");
				
			} else {
				failureReport("Verify gender textbox display", "gender textbox   is not displayed");	
			}
			click(sr.gender,"gender");
			boolean next1flag = isElementDisplayed(driver.findElement(sr.next1));
			if (next1flag) {
				SuccessReport("Verify gender textbox display", "gender textbox   is displayed");
				regflag=true;
			} else {
				failureReport("Verify gender textbox display", "gender textbox   is not displayed");	
			}
			click(sr.next1,"gender");
			
			boolean main2flag = isElementDisplayed(driver.findElement(sr.main1));
			if (main2flag) {
				SuccessReport("Verify next page  display", "next page is displayed");
			} else {
				failureReport("Verify next page  display", "next page is not displayed");	
			}
			boolean createflag1 = isElementDisplayed(driver.findElement(sr.lnkcreatereg));
			if (createflag1) {
				SuccessReport("Verify CREATE link display", "CREATE link   is displayed");
				regflag=true;
			} else {
				failureReport("Verify CREATE link display", "CREATE link   is not displayed");	
			}
			click(sr.lnkcreatereg,"CREATE");
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}	
		catch(Exception e) {
			e.printStackTrace();
		}

		finally{if (regflag) {
			SuccessReport("Clicked NEW and Toy link", "Both NEW and Toy links are clicked successfully");
		} else {
			failureReport("Clicked NEW and Toy link", "Both NEW and Toy links are not clicked ");	
		}
		}
	}

	private SearchResPage SearchResPage() {
		// TODO Auto-generated method stub
		return null;
	}}
