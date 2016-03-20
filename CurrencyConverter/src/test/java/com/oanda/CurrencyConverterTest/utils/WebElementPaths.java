package com.oanda.CurrencyConverterTest.utils;

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
	
	@FindBy(id="quote_currency_list_container")
	WebElement quoteDropdown;
	
	@FindBy(id="base_currency_list_container")
	WebElement baseDropdown;
	
	@FindBy(id="interbank_rate_list_container")
	WebElement interbankDropdown;
	
	@FindBy(id="end_date_button")
	WebElement calenderButton;
	
	@FindBy(id="date_rewind")
	WebElement dateBefore;
	
	@FindBy(id="date_forward")
	WebElement dateAfter;
	
	@FindBy(xpath=".//*[@id='ncc']//div[@class='calendarContainer']")
	WebElement calenderContainer;
	
	@FindBy(xpath=".//*[@id='ncc']//div[@class='calendarContainer']/div[@class='closeCalender']")
	WebElement closeCalender;
	
	@FindBy(xpath=".//*[@id='ncc']//div[@class='calendarContainer']//div[@class='calendarHeader']//a[@class='calendarNavButton navLastYear']")
	WebElement calenderPrevYear;
	
	@FindBy(xpath=".//*[@id='ncc']//div[@class='calendarContainer']//div[@class='calendarHeader']//a[@class='calendarNavButton navLastMonth']")
	WebElement calenderPrevMonth;
	
	@FindBy(xpath=".//*[@id='ncc']//div[@class='calendarContainer']//div[@class='calendarHeader']//a[@class='calendarNavButton navNextYear']")
	WebElement calenderNextYear;

	@FindBy(xpath=".//*[@id='ncc']//div[@class='calendarContainer']//div[@class='calendarHeader']//a[@class='calendarNavButton navNextMonth']")
	WebElement calenderNextMonth;
	
	@FindBy(xpath=".//*[@id='ncc']//div[@class='calendarContainer']//div[@class='calendarMonthDisplay']/span[1]")
	WebElement calenderMonth;
	
	@FindBy(xpath=".//*[@id='ncc']/div[1]/div[3]/span[3]/div[3]/table/tbody/tr[3]/td[4]")
	WebElement calenderDate;

	@FindBy(id="flipper")
	WebElement flipper;
	
	
	
	  public WebElementPaths(WebDriver driver){
		  
	        this.driver = driver;
	 
	        //This initElements method will create all WebElements
	 
	        PageFactory.initElements(driver, this);
	 
	    }

}
