package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBSignupPOM {

	WebDriver driver;
	 public FBSignupPOM (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
		   
	 }	   		      
	 
	 @FindBy(xpath="//*[@name=\"firstname\"]")
	 WebElement edit_firstname;
	 public WebElement firstname() {
	 return edit_firstname;
	   }
	 @FindBy(name="lastname")
	 WebElement edit_lastname;
	 public WebElement lastname() {
	 return  edit_lastname;
	    }
	     
	 @FindBy(name="reg_email__")
	 WebElement edit_email;
	 public WebElement email() {
	 return  edit_email;
	 }
	 

	 @FindBy(id="password_step_input")
	  WebElement edit_password;
	  public WebElement password() {
	  return  edit_password;
	  
	  }
	 
	
		
	//  @FindBy(id="day")
		//* public WebElement click_day;
	  
	  
	  
	     
	  
	     
	    @FindBy(xpath="//*[@id=\"month\"]")
	    WebElement  click_month;
		 public WebElement  month(){
			return click_month;
			 
		 }
		
	       
	    
	       
	  @FindBy(id="day")
	  WebElement click_day;
	 public WebElement day() {
		return click_day;}

	//select[@id="year"]
       @FindBy(id="year")
    		   WebElement click_year;
    		   public WebElement year() {
				return click_year;
    			   
    		   }
    		   
      
}
       
       
       
	 
       
