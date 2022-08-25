package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nextechitc.Pageobjectmodel.ContactusPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contactus {
    WebDriver driver;
	@Given("^Visit Dell homepage$")
	public void visit_Dell_homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Dell.com/en-us");
	}
		
		
			  

	@When("^When user click Dell Contact")
	public void when_user_click_Dell_Contact() throws Throwable {
		//Calling ContactusPOM into Contactus class in Stepdef package by creating object.
		ContactusPOM obj = new ContactusPOM (driver);	
		obj.Contactus().click();
		
	}   

	@Then("^user redirect to Contact Page$")
	public void user_redirect_to_Contact_Page() throws Throwable {
	   
	}
	
}
