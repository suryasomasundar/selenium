package com.oanda.CurrencyConverterTest.utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class WebElementFunctionUtils extends WebElementPaths{

	public WebElementFunctionUtils(WebDriver driver) {
		super(driver);

	}
	
	public void inputQuoteCurrency(String input)
	{
		quoteCurrencyTextbox.sendKeys(input);
	}
	
	public void inputBaseCurrency(String input)
	{
		baseCurrencyTextbox.sendKeys(input);
	}
	
	public void inputQuoteAmount(String input)
	{
		quoteAmountTextbox.sendKeys(input);
	}
	
	public void inputBaseAmount(String input)
	{
		baseAmountTextbox.sendKeys(input);
	}
	
	public void inputInterBankRates(String input)
	{
		interbankRatesTextbox.sendKeys(input);
	}
	public void inputDate(String input)
	{
		dateTextbox.sendKeys(input);
	}
	
//click 	
	
	public void clickQuoteCurrency()
	{
		quoteCurrencyTextbox.click();
	}
	
	public void clickBaseCurrency()
	{
		baseCurrencyTextbox.click();
	}
	
	public void clickQuoteAmount()
	{
		quoteAmountTextbox.click();
	}
	
	public void clickBaseAmount()
	{
		baseAmountTextbox.click();
	}
	
	public void clickInterBankRates()
	{
		interbankRatesTextbox.click();
	}
	public void clickDate()
	{
		dateTextbox.click();
	}
	public void closeDateAlert()
	{
		dateAlertClose.click();
	}
	public void closeQuoteAlert()
	{
		quoteCurrencyAlertClose.click();
	}
	public void closeBaseAlert()
	{
		baseCurrencyAlertClose.click();
	}
	public void clickCalenderButton()
	{
		calenderButton.click();
	}
	public void clickCalenderPrevYear()
	{
		calenderPrevYear.click();
	}
	public void clickCalenderNextYear()
	{
		calenderNextYear.click();
	}
	public void clickCalenderPrevMonth()
	{
		calenderPrevMonth.click();
	}
	public void clickCalenderNextMonth()
	{
		calenderNextMonth.click();
	}
	public void clickCalenderDate()
	{
		calenderDate.click();
	}
	public void clickFlipper()
	{
		flipper.click();
	}
//clear
	public void clearQuoteAmount()
	{
		quoteAmountTextbox.clear();
	}
	
	public void clearBaseAmount()
	{
		baseAmountTextbox.clear();
	}
	
	public void clearDate()
	{
		dateTextbox.clear();
	}
	
	public void clearInterBank()
	{
		interbankRatesTextbox.clear();
	}
	
	//press Enter
	public void enterQuoteCurrency()
	{
		quoteCurrencyTextbox.sendKeys(Keys.ENTER);
	}
	
	
	public void enterBaseCurrency()
	{
		baseCurrencyTextbox.sendKeys(Keys.ENTER);
	}
	
	public void enterDate()
	{
		dateTextbox.sendKeys(Keys.ENTER);
	}
	public void enterInterBank()
	{
		interbankRatesTextbox.sendKeys(Keys.ENTER);
	}
	
	//gettext
	
	public String getQuoteAmount()
	{
		return quoteAmountTextbox.getAttribute("value");
	}
	
	public String getBaseAmount()
	{
		return baseAmountTextbox.getAttribute("value");
	}
	
	public String getDateMonth()
	{
		return calenderMonth.getText();
	}
	
	public String getDate()
	{
		return dateTextbox.getText();
	}
	//visible

	public boolean isQuoteAlertVisible()
	{
		return quoteCurrencyAlert.isDisplayed();
	}
	
	public boolean isBaseAlertVisible()
	{
		return baseCurrencyAlert.isDisplayed();
	}
	public boolean isDateAlertVisible()
	{
		return dateAlert.isDisplayed();
	}
	
	public boolean iscalenderContainerVisible()
	{
		return calenderContainer.isDisplayed();
	}
	
	
	
	//click
	
	
	
	
}
