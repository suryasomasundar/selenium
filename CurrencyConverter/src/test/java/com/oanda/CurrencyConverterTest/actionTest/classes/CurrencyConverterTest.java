package com.oanda.CurrencyConverterTest.actionTest.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.RequestBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.oanda.CurrencyConverterTest.utils.TestConstants;
import com.oanda.CurrencyConverterTest.utils.TestUtil;
import com.oanda.CurrencyConverterTest.utils.WebElementFunctionUtils;
import com.oanda.CurrencyConverterTest.utils.WebElementPaths;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CurrencyConverterTest {


	RequestBuilder requestBuilder;
	HttpResponse response;
	WebDriver driver;
	WebElementFunctionUtils utils;
	HashMap<String, Integer> select = new HashMap <String ,Integer>();
	HashMap<String, Integer> fav = new HashMap <String ,Integer>();
	
	TestUtil readInput=new TestUtil();
	
	String quoteCurrency,baseCurrency,quoteAmount,baseAmount,date,baseAmountChanged,interBank;
	String inputArray[]=new String[4];
	
	@Given("User navigates to the Website")
	public void createPersonTest() throws InterruptedException{

	   driver= new FirefoxDriver();
	    
		driver.get("http://www.oanda.com/currency/converter/");
		
		driver.manage().window().maximize() ;
	    
	    utils=new WebElementFunctionUtils(driver);
		
		
	}
	
	@Then("User reads input from excel \"(.+)\"")
	public void readFromExcel(String input)
	{
		int i=Integer.parseInt(input);
		 inputArray=readInput.readFromExcel(i);
		    
		    quoteCurrency=inputArray[0];
		    baseCurrency=inputArray[1];
		    quoteAmount=inputArray[2];
		    baseAmount=inputArray[3];
		    interBank=inputArray[4];
		  String tempdate= inputArray[5];
		    StringBuilder sb = new StringBuilder(tempdate);
		    sb.deleteCharAt(0);
		    date=sb.toString();
		    baseAmountChanged=inputArray[6];
	}
	
	@Then("User inputs quoteCurrency")
	public void inputQuoteCurrency() throws InterruptedException
	{
		utils.clickQuoteCurrency();
		Thread.sleep(2000);
		utils.inputQuoteCurrency(quoteCurrency);
		Thread.sleep(2000);
		utils.enterQuoteCurrency();
	}
	
	@Then("User inputs baseCurrency")
	public void inputbaseCurrency() throws InterruptedException
	{
		utils.clickBaseCurrency();
		Thread.sleep(2000);
		utils.inputBaseCurrency(baseCurrency);
		Thread.sleep(2000);
		utils.enterBaseCurrency();
	}
	
	@Then("User inputs baseCurrency")
	public void inputBaseCurrency() throws InterruptedException
	{
		utils.clickBaseCurrency();
		Thread.sleep(2000);
		utils.inputBaseCurrency(baseCurrency);
		Thread.sleep(2000);
		utils.enterBaseCurrency();
	}
	
	@Then("User inputs Date")
	public void inputDate() throws InterruptedException
	{
		utils.clickDate();
		utils.clearDate();
		Thread.sleep(2000);
		utils.inputDate(date);
		Thread.sleep(2000);
		utils.enterDate();
		
		
		utils.clickInterBankRates();
		utils.clearInterBank();
		Thread.sleep(2000);
		utils.inputInterBankRates(interBank);
		Thread.sleep(2000);
		utils.enterInterBank();
	}
	
	@Then("User inputs quoteAmount")
	public void inputQuoteAmount() throws InterruptedException
	{
		utils.clearQuoteAmount();
		Thread.sleep(2000);
		utils.inputQuoteAmount(quoteAmount);
		
	}
	
	@Then("User checks converted baseCurrency")
	public void checkBaseCurrency() throws InterruptedException
	{
	
		
			Assert.assertEquals(utils.getBaseAmount(),baseAmount);
			
			utils.clickFlipper();
			
			Thread.sleep(2000);
			
			Assert.assertEquals(utils.getQuoteAmount(),quoteAmount);
			Assert.assertEquals(utils.getBaseAmount(),baseAmountChanged);
	}
	
	@Then("User checks converted quoteCurrency")
	public void checkQuoteCurrency() throws InterruptedException
	{
	
		
			Assert.assertEquals(utils.getQuoteAmount(),quoteAmount);
			
			utils.clickFlipper();
			
			Thread.sleep(2000);
			
			Assert.assertEquals(utils.getQuoteAmount(),quoteAmount);
			Assert.assertEquals(utils.getBaseAmount(),baseAmountChanged);
	}
	
	
	
	
	@Then("User closes the browser")
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		
	}
	
	@Then("User Enters quoteCurrency \"(.+)\"")
	public void currencyAlert(String input) throws InterruptedException
	{
		utils.clickQuoteCurrency();
		Thread.sleep(2000);
		utils.inputQuoteCurrency(input);
		Thread.sleep(2000);
		utils.enterQuoteCurrency();
	}
	@Then("User checks for quoteAlert")
	public void checkQuoteAlert() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertTrue(utils.isQuoteAlertVisible());
		
		Thread.sleep(2000);
		utils.closeQuoteAlert();
		
		Assert.assertTrue(utils.isQuoteAlertVisible());
	}
	
	@Then("User Enters baseCurrency \"(.+)\"")
	public void currencyBaseAlert(String input) throws InterruptedException
	{
		utils.clickBaseCurrency();
		Thread.sleep(2000);
		utils.inputBaseCurrency(input);
		Thread.sleep(2000);
		utils.enterBaseCurrency();
	}
	@Then("User checks for baseAlert")
	public void checkBaseAlert() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertTrue(utils.isBaseAlertVisible());
		
		Thread.sleep(2000);
		utils.closeBaseAlert();
		
		Assert.assertTrue(utils.isBaseAlertVisible());
	}
	
	
	
	@Then("User Enters Date \"(.+)\"")
	public void inputAlertDate(String date) throws InterruptedException
	{
		utils.clickDate();
		utils.clearDate();
		Thread.sleep(2000);
		utils.inputDate(date);
		Thread.sleep(2000);
		utils.enterDate();
	}
	
	
	@Then("User checks for dateAlert")
	public void checkDateAlert() throws InterruptedException
	{
			
		Thread.sleep(2000);
		Assert.assertTrue(utils.isDateAlertVisible());
		
		Thread.sleep(2000);
		utils.closeDateAlert();
		
		Assert.assertTrue(utils.isDateAlertVisible());
	}
	
	@Then("User inputs quoteTextbox \"(.+)\"")
	public void textBox(String input) throws InterruptedException
	{
		Thread.sleep(2000);
		if(input.equals("empty"))
		{
		utils.clearQuoteAmount();
		}
		else
		{
			utils.clearQuoteAmount();
		utils.inputQuoteAmount(input);
		}
		utils.clickBaseAmount();
	}
	
	@Then("User checks the quoteTextbox \"(.+)\"")
	public void checkTextBox(String input) throws InterruptedException
	{
	Thread.sleep(1000);		
	Assert.assertEquals(utils.getQuoteAmount(),input);
	}
	
	
	@Then("User inputs baseTextbox \"(.+)\"")
	public void basetextBox(String input) throws InterruptedException
	{
		Thread.sleep(2000);
		
		if(input.equals("empty"))
		{
			utils.clearBaseAmount();
		}
		else
		{
		utils.clearBaseAmount();
		utils.inputBaseAmount(input);
		}
		utils.clickQuoteAmount();
	}
	
	@Then("User checks the baseTextbox \"(.+)\"")
	public void checkbaseTextBox(String input) throws InterruptedException
	{
	Thread.sleep(1000);		
	Assert.assertEquals(utils.getBaseAmount(),input);
	}
	
	
	
	@Then("User selects date")
	public void selectDate() throws InterruptedException{

		utils.clickDate();
		utils.clearDate();
		Thread.sleep(2000);
		utils.inputDate("03/14/2014");
		Thread.sleep(2000);
		utils.enterDate();
		
		
	}
	
	@Then("User clicks on calender icon")
	public void clickCalenderIcon() throws InterruptedException{

		utils.clickCalenderButton();
	   Assert.assertTrue(utils.iscalenderContainerVisible());	
	}
	
	@Then("User checks whether navigation between years works")
	public void checkNavigationYear() throws InterruptedException{

		System.out.println(utils.getDateMonth());
		Thread.sleep(2000);
		utils.clickCalenderPrevYear();
		Assert.assertTrue(utils.getDateMonth().equals("MAR 2013"));
		Thread.sleep(2000);
		utils.clickCalenderNextYear();
		Assert.assertTrue(utils.getDateMonth().equals("MAR 2014"));
				
	}
	
	@Then("User checks whether navigation between months works")
	public void checkNavigationMonth() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println(utils.getDateMonth());
		utils.clickCalenderPrevMonth();
		Assert.assertTrue(utils.getDateMonth().equals("FEB 2014"));
		Thread.sleep(2000);
		utils.clickCalenderNextMonth();
		Assert.assertTrue(utils.getDateMonth().equals("MAR 2014"));
				
	}
	
	@Then("User selects countries from dropdown")
	public void selectCountries() throws InterruptedException{
	
		for(int i=8;i<13;i++){
		utils.clickQuoteCurrency();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath(".//*[@id='scroll-innerBox-1']/div["+i+"]"));
		Thread.sleep(2000);
		System.out.println(element.getText());
		select.put(element.getText(), i);
		element.click();

		}

		System.out.println(select.keySet());
				
	}
	
	@Then("User checks whether selected countries are listed as favourites")
	public void checkFavourites() throws InterruptedException{
		driver.findElement(By.xpath(".//*[@id='quote_currency']")).click();
		for(int i=6;i>1;i--){
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath(".//*[@id='scroll-innerBox-1']/div["+i+"]"));
		Thread.sleep(2000);
		fav.put(element.getText(), i);
		}
		System.out.println(fav.keySet());
		Assert.assertTrue(select.keySet().equals(fav.keySet()));
				
	}

	
	
	
	
	
	
}
