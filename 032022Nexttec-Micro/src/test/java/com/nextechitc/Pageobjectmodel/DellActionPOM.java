package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPOM {
	
	WebDriver driver;
	 public DellActionPOM  (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		      }
		      
		      @FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/button/span")
		      
              WebElement click_Allsolution;
		      public WebElement Allsolution() {
				return click_Allsolution;
		    	  
		      }
		      @FindBy(xpath=" /html/body")
		      WebElement click_viewallsolution;
		      public WebElement viewallsoution() {
				return click_viewallsolution;
		      }  
		    
		      ////*[@id="sd-navbar"]/div/nav/div[1]/a-
		      
		      @FindBy(id="sd-navbar")
		      WebElement click_monitor;
		      public WebElement monitor() {
				return click_monitor;}
}

                
               
               
             //span[@class="uc-floating-text"]                
               
                            
               
               
