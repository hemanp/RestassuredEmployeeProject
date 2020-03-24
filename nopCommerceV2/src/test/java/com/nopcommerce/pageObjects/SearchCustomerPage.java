package com.nopcommerce.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {
	
public WebDriver ldriver;
	
	public SearchCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By lnkSearch_Customer=By.xpath("//div[@class='search-text']");
	By text_firstName=By.xpath("//input[@id='SearchFirstName']");
	By text_lastName=By.xpath("//input[@id='SearchLastName']");
	By text_email=By.xpath("//input[@id='SearchEmail']");
	By click_SearchBtn =By.xpath("//button[@id='search-customers']");
	
	
	
	public void clickOnCustomersMenu() {
		ldriver.findElement(lnkSearch_Customer).click();
	}
	
	public void setText_firstName(String fname)
	{
		ldriver.findElement(text_firstName).sendKeys(fname);
	}
	
	public void setText_lastName(String lname)
	{
		ldriver.findElement(text_lastName).sendKeys(lname);
	}
	
	public void setText_email(String email)
	{
		ldriver.findElement(text_email).sendKeys(email);
	}
	
	public void setSearchBtn()
	{
		ldriver.findElement(click_SearchBtn).click();
	}
	
}
