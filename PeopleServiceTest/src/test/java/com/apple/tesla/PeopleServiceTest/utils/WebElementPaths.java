package com.apple.tesla.PeopleServiceTest.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebElementPaths {
	
	WebDriver driver;
	
	
	@FindBy(id="quote_currency")
	WebElement quoteCurrencyTextbox;
	
	@FindBy(id="base_currency")
	WebElement baseCurrencyTextbox;
	
	
	
	
	
	
	
	
	  public WebElementPaths(WebDriver driver){
		  
	        this.driver = driver;
	 
	        //This initElements method will create all WebElements
	 
	        PageFactory.initElements(driver, this);
	 
	    }

}
