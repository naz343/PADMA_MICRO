package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nextechitc.Pageobjectmodel.FBSignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBSignup {
	
	WebDriver driver;
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		try	{ //how to open the browser.
			System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver_win32\\\\chromedriver.exe");
			driver = new ChromeDriver();
			
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			// how to open the URL
			driver.get("https://www.facebook.com/reg/");///How to open url
			Thread.sleep( 5000);
			
			//Maximize window
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println("browser and url not opening");
		}
	}

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		Thread.sleep(5000); 
		 FBSignupPOM ab = new FBSignupPOM(driver);
		ab.firstname().sendKeys(arg1);
		ab.lastname().sendKeys(arg2);
		ab.email().sendKeys(arg3);
        ab.password().sendKeys(arg4);		
		
		 

		
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		 FBSignupPOM fbsignup1  = new FBSignupPOM(driver);
		 Select dropdown = new Select (fbsignup1.month());
		 dropdown.selectByIndex(2);
		 Select dropdown1 =new Select(fbsignup1.day());
		 dropdown1.selectByIndex(2);
		 Select dropdown2 =new Select(fbsignup1.year());
		 dropdown2.selectByIndex(4);
		 
	}
	
}
