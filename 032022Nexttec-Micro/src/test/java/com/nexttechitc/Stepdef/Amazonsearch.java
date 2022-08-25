package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nextechitc.Pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearch {

	WebDriver driver; //Declaring driver as local driver
	@Given("^users visit amazon homepage$")
	public void users_visit_amazon_homepage() throws Throwable {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");///How to open url
		Thread.sleep( 3000);
		//Maximize window
		driver.manage().window().maximize();
	 	 
	 
	}
	

	@When("^users type \"([^\"]*)\" and click search icon$")
	public void users_type_and_click_search_icon(String arg1) throws Throwable {
	 AmazonsearchPOM obj = new AmazonsearchPOM(driver);
	 
	 Thread.sleep(5000); 
	 
	 obj.Amazonsearch().sendKeys(arg1); //sendKey allows us to type in the search box
		obj.searchicon().click();  // click allows to click the search button
	}

	@Then("^users should able to see the expected product$")
	public void users_should_able_to_see_the_expected_product() throws Throwable {
	    
	}	
	 

	
	
}
