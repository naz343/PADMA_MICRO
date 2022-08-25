package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nextechitc.Pageobjectmodel.BestsellerPOM;
import com.nextechitc.Pageobjectmodel.ContactusPOM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bestseller {
	
	
	WebDriver driver;
	@Given("^user visit amazon homepage$")
	public void user_visit_amazon_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
			
	
	
	@When("^user click on best Seller$")
	public void When_user_click_bestseller () throws Throwable{
	BestsellerPOM ab = new BestsellerPOM(driver);
	
	
	}
	
	
	
	
	 
			//Calling ContactusPOM into Contactus class in Stepdef package by creating object.
			 
			   
	

	@Then("^user should be able to ridirect to the Best Seller page$")
	public void user_should_be_able_to_ridirect_to_the_Best_Seller_page() throws Throwable {
	    
	}
}