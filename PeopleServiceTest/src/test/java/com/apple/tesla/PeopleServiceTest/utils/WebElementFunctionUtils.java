package com.apple.tesla.PeopleServiceTest.utils;

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
	
	

	public void clearQuoteAmount()
	{
		quoteAmountTextbox.clear();
	}
	
	public void clearBaseAmount()
	{
		baseAmountTextbox.clear();
	}
	
	
	
	
	public void enterQuoteCurrency()
	{
		quoteCurrencyTextbox.sendKeys(Keys.ENTER);
	}
	
	
	public void enterBaseCurrency()
	{
		baseCurrencyTextbox.sendKeys(Keys.ENTER);
	}
	
	

}
