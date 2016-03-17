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
	
	@FindBy(id="end_date_input")
	WebElement dateTextbox;
	
	@FindBy(id="quote_annotation")
	WebElement quoteCurrencyAlert;

	@FindBy(id="base_annotation")
	WebElement baseCurrencyAlert;
	
	@FindBy(id="date_annotation")
	WebElement dateAlert;
	
	@FindBy(xpath=".//*[@id='quote_annotation']/div[@class='annotation_close']")
	WebElement quoteCurrencyAlertClose;

	@FindBy(xpath=".//*[@id='base_annotation']/div[@class='annotation_close']")
	WebElement baseCurrencyAlertClose;
	
	@FindBy(xpath=".//*[@id='date_annotation']/div[@class='annotation_close']")
	WebElement dateAlertClose;
	
	
	
	  public WebElementPaths(WebDriver driver){
		  
	        this.driver = driver;
	 
	        //This initElements method will create all WebElements
	 
	        PageFactory.initElements(driver, this);
	 
	    }

}
