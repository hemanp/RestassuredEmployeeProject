package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyAccountStepLoginDefinitions {
	
	public WebDriver driver;
	
	@Given("^Open the Browser$")
	public void open_the_Browser() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:/JavaDriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	 
	}

	@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String arg1) throws Throwable {
	 driver.get("http://practice.automationtesting.in/");
		
	}

	@And("^Click on my Account Menu$")
	public void click_on_my_Account_Menu() throws Throwable {
	    driver.findElement(By.linkText("My Account")).click();
	}

	@And("^Registered Username and Password$")
	public void registered_Username_and_Password() throws Throwable {
	    driver.findElement(By.id("username")).sendKeys("hemant061992@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("ASD!@#lkj098");
	}

	@And("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
	    driver.findElement(By.name("login")).click();
	}

	@Then("^User must successfully login to the web$")
	public void user_must_successfully_login_to_the_web() throws Throwable {
	   String string= driver.findElement(By.xpath("//strong[contains(text(),'hemant061992')]")).getText();
	    Assert.assertEquals(true, string.contains("hemant061992"));
	}

}
