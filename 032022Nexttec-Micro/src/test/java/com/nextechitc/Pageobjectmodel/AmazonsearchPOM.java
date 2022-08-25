package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {
	WebDriver driver;//global variable
	 /*
	  * constructor is not a method but special type of method
	  * 1. Constructor name should be match with classname
	  * 2. it has no return type
	  */
	 //we use constructor to access code from one class to another class
	      public   AmazonsearchPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	
	      }
	      
	      @FindBy(name="field-keywords")
	      
	 
	      //@FindBy(xpath="")to keep our locator//WebElement
	      //WebElement click_bestseller;//Declearing WebElement
	      //public WebElement bestseller(){}// Creating method
	      
	      WebElement Type_amazonsearch;
	      public WebElement Amazonsearch() {
			return Type_amazonsearch; 
	      }
	     
	      @FindBy(id="nav-search-submit-button")
	      
	      WebElement Click__searchicon;
	      public WebElement searchicon() {
			return Click__searchicon; 
			
	      }	      
	      
}
