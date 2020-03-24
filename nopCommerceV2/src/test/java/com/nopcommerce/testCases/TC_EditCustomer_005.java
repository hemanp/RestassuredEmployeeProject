package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.AddcustomerPage;
import com.nopcommerce.pageObjects.EditCustomerPage;
import com.nopcommerce.pageObjects.LoginPage;

public class TC_EditCustomer_005 extends BaseClass {

	@Test
	public void EditCustomer()
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
		
		
		logger.info("Edit customer information");
		
		EditCustomerPage object=new EditCustomerPage(driver);
		object.setEditButon();
		object.setEmail("abc@gmail.com");
		object.setEditButon();
		
		
	}
	
}
