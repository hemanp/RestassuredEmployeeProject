package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.AddcustomerPage;
import com.nopcommerce.pageObjects.LoginPage;
import com.nopcommerce.pageObjects.SearchCustomerPage;

public class TC_SearchCustomerTest_004 extends BaseClass {

	
	@Test
	public void SearchCustomer() throws InterruptedException
	{
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		
		lp.setPassword(password);
		logger.info("password is provided");
		
		lp.clickLogin();
		
		logger.info("providing customer details....");
		
		AddcustomerPage addcust=new AddcustomerPage(driver);
		
		addcust.clickOnCustomersMenu();
		addcust.clickOnCustomersMenuItem();
		
		SearchCustomerPage serch=new SearchCustomerPage(driver);
		
//		serch.setText_firstName("Victoria");
//		serch.setText_lastName("Holmes");
		serch.setText_email("james_pan@nopCommerce.com");
		
		Thread.sleep(10000);
		
		serch.setSearchBtn();
		
	}
	
}
