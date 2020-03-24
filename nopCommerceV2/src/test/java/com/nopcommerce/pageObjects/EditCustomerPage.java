package com.nopcommerce.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {

public WebDriver ldriver;
	
	public EditCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By link_EditCustomer=By.linkText("Edit/85");
	By Email_Edit=By.xpath("//*[@id=\"Email\"]");
	By Btn_Edit=By.xpath("//button[@name='save-continue']");
	
	public void setEdit_Customer()
	{
		ldriver.findElement(link_EditCustomer).click();
	}
	
	public void setEmail(String Eemail)
	{
		ldriver.findElement(Email_Edit).sendKeys(Eemail);
	}
	
	public void setEditButon()
	{
		ldriver.findElement(Btn_Edit).click();
	}
	
	
}
