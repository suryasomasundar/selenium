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
	
	@FindBy(id="quote_amount_input")
	WebElement quoteAmountTextbox;
	
	@FindBy(id="base_amount_input")
	WebElement baseAmountTextbox;

	@FindBy(id="interbank_rates_input")
	WebElement interbankRatesTextbox;
	
	@FindBy(id="end_date_inputt")
	WebElement dateTextbox;
	

	
	
	
	
	
	
	  public WebElementPaths(WebDriver driver){
		  
	        this.driver = driver;
	 
	        //This initElements method will create all WebElements
	 
	        PageFactory.initElements(driver, this);
	 
	    }

}
