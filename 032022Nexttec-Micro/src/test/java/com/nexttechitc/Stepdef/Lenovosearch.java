package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Lenovosearch {
	WebDriver driver;
	
	@Given("^I visit Lenovo homepage$")
	public void i_visit_Lenovo_homepage(TimeUnit seconds) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lenovo.com");
		//Imlecite wait time
		driver.manage().timeouts().implicitlyWait(20, seconds);

	
		
		
	}
	@When("^I type \"([^\"]*)\" search bar and click on search$")
	public void i_type_search_bar_and_click_on_search(String arg1) throws Throwable {
	 
		
		
		
		
	}
	@Then("^I am able to visit page for Alexa devices$")
	public void i_am_able_to_visit_page_for_Alexa_devices() throws Throwable {
	   
	}
	
	
}
