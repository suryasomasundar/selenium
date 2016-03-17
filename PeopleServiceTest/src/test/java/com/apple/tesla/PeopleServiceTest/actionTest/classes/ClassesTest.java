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
	
	String quoteCurrency,baseCurrency,quoteAmount,baseAmount;
	String inputArray[]=new String[4];
	
	@Given("Currency")
	public void createPersonTest() throws InterruptedException{

	   driver= new FirefoxDriver();
	    
		driver.get("http://www.oanda.com/currency/converter/");
		
		driver.manage().window().maximize() ;
	    
	    utils=new WebElementFunctionUtils(driver);
	    
	    inputArray=readInput.readFromExcel(2);
	    
	    quoteCurrency=inputArray[0];
	    baseCurrency=inputArray[1];
	    quoteAmount=inputArray[2];
	    baseAmount=inputArray[3];
	    
	    System.out.println(quoteCurrency);
	    Actions action = new Actions(driver);
	   utils.clickQuoteCurrency();
		
	   
	 
	   
	    Thread.sleep(2000);
	utils.inputQuoteCurrency(quoteCurrency);
	 Thread.sleep(2000);
	 utils.enterQuoteCurrency();
	
	utils.clickBaseCurrency();
	Thread.sleep(2000);
	utils.inputBaseCurrency(baseCurrency);
	Thread.sleep(2000);
	utils.enterBaseCurrency();
	
	
	utils.clearQuoteAmount();
	Thread.sleep(2000);
	utils.inputQuoteAmount(quoteAmount);

		
		
		
		
	}
	
	
}
