package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPOM {

	WebDriver driver;//global variable
	 /*
	  * constructor is not a method but special type of method
	  * 1. Constructor name should be match with classname
	  * 2. it has no return type
	  */
	 //we use constructor to access code from one class to another class
	      public ContactusPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	      }
	    //Storing xpath of element Contatct us into Pageobjectmodel as per systex below.
	      
	  @FindBy(xpath= " //span[@class=\"mh-icon\"] ") 
	   WebElement  click_Contactus;
	   public WebElement Contactus (){
	  return click_Contactus;
	   
	   }

}