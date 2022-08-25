package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterSignupPOM {

	WebDriver driver;//global variable
	 /*
	  * constructor is not a method but special type of method
	  * 1. Constructor name should be match with classname
	  * 2. it has no return type
	  */
	 //we use constructor to access code from one class to another class
	    public TwitterSignupPOM(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	
	      }	      
	      
	      @FindBy(xpath=" //*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/div[1]/div/div[3]/a/div/span/span")
       
	      WebElement click_withphonenumber;
	      public WebElement withphonenumber(){
			return click_withphonenumber;
			
					
	      	      
	      }
			 
			
				      
	      
	      @FindBy(xpath="//input[name=\"name\"]")
	      WebElement Type_Name;
	      public WebElement Name() {
			return Type_Name;
			
	      }
	      
	      
	      
	       
	    @FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/label/div/div[2]")
	    WebElement Type_PhoneNumber;
	    public WebElement PhoneNumber() {
			return Type_PhoneNumber;
			
	    }	 
	     
	    @FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div")
	    WebElement Click_Next;
	    public WebElement Next() {
			return Click_Next;
	    }	
	    	
	    	    	    
	    @FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div")
	    
	    WebElement Click_next;
	    public WebElement next() {
			return Click_Next;
	    
	    }    
	    
	    @FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div/span/span")
 
	    WebElement Click_Signup;
	    public WebElement Signup() {
			return Click_Signup;
	    
	    
}

}


	      

