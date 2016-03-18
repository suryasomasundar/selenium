package com.apple.tesla.PeopleServiceTest.actionTest.classes;

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

import com.apple.tesla.PeopleServiceTest.utils.TestConstants;
import com.apple.tesla.PeopleServiceTest.utils.TestUtil;
import com.apple.tesla.PeopleServiceTest.utils.WebElementFunctionUtils;
import com.apple.tesla.PeopleServiceTest.utils.WebElementPaths;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassesTest {


	RequestBuilder requestBuilder;
	HttpResponse response;
	WebDriver driver;
	WebElementFunctionUtils utils;
	
	TestUtil readInput=new TestUtil();
	
	String quoteCurrency,baseCurrency,quoteAmount,baseAmount,date,conversionAmount;
	String inputArray[]=new String[4];
	
	@Given("User navigates to the Website")
	public void createPersonTest() throws InterruptedException{

	   driver= new FirefoxDriver();
	    
		driver.get("http://www.oanda.com/currency/converter/");
		
		driver.manage().window().maximize() ;
	    
	    utils=new WebElementFunctionUtils(driver);
		
		
	}
	
	@Then("User reads input from excel (.+)")
	public void readFromExcel(String input)
	{
		 inputArray=readInput.readFromExcel(2);
		    
		    quoteCurrency=inputArray[0];
		    baseCurrency=inputArray[1];
		    conversionAmount=inputArray[2];
		  String tempdate= inputArray[3];
		    StringBuilder sb = new StringBuilder(tempdate);
		    sb.deleteCharAt(0);
		    date=sb.toString();
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
	}
	
	@Then("User inputs quoteAmount")
	public void inputQuoteAmount() throws InterruptedException
	{
		utils.clearQuoteAmount();
		Thread.sleep(2000);
		utils.inputQuoteAmount("543");
		
	}
	
	@Then("User checks converted baseCurrency")
	public void checkBaseCurrency() throws InterruptedException
	{
	
		
			
			
	}
	
	@Then("User closes the browser")
	public void close() throws InterruptedException
	{
		//driver.close();
		
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
		System.out.println(utils.isQuoteAlertVisible());
		
		Thread.sleep(2000);
		utils.closeQuoteAlert();
		
		System.out.println(utils.isQuoteAlertVisible());
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
		System.out.println(utils.isBaseAlertVisible());
		
		Thread.sleep(2000);
		utils.closeBaseAlert();
		
		System.out.println(utils.isBaseAlertVisible());
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
		System.out.println(utils.isDateAlertVisible());
		
		Thread.sleep(2000);
		utils.closeDateAlert();
		
		System.out.println(utils.isDateAlertVisible());
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
	System.out.println(utils.getQuoteAmount());
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
	System.out.println(utils.getBaseAmount());
	}
}
