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


import com.apple.tesla.PeopleServiceTest.utils.TestConstants;
import com.apple.tesla.PeopleServiceTest.utils.TestUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassesTest {


	RequestBuilder requestBuilder;
	HttpResponse response;

	/*
	@Given("^I create a person \"(.+)\" as \"(.+)\"$")
	public void createPersonTest(String personName, String personType){

		requestBuilder = TestUtil.buildHTTPPostRequest("url", TestConstants.JSON_CONTENT_TYPE);
		response = TestUtil.getHttpResponseForStringReqEntity(requestBuilder,createPrsonJson);

		Assert.assertNotNull(appleRID_msg,response);
		Assert.assertEquals(appleRID_msg,HttpStatus.SC_OK,response.getStatusLine().getStatusCode());
		
		String responseString = TestUtil.readResponseString(response);
		Assert.assertNotNull(appleRID_msg,responseString);
		JSONObject respJson = new JSONObject(responseString);
	}
	
	@Given("^I create a new grade \"(.+)\" for person \"(.+)\" as \"(.+)\"$")
	public void createPersonTestWithGrade(String grade,String personName, String personType){
		createPersonTest( personName,  personType);
	}


	//create class valid inputs
	@When("^I create class with course name \"(.*?)\"$")
	public void createClassTest(String courseName) {
		
		requestBuilder = TestUtil.buildHTTPPostRequest("url", TestConstants.JSON_CONTENT_TYPE);
		response = TestUtil.getHttpResponseForStringReqEntity(requestBuilder,createClassJSON);
		
	}

	@Then("^The response of create class should be validated with responsecode and responseMessage$")
	public void testClassCreateResponse()  {

		
		Assert.assertNotNull(appleRID_msg,response);
		Assert.assertEquals(appleRID_msg,HttpStatus.SC_OK,response.getStatusLine().getStatusCode());
		String responseString = TestUtil.readResponseString(response);
		JSONObject respJson = new JSONObject(responseString);
		
		
		
	}

	//create class invalid input
	@When("^I send create class for \"(.*?)\" with request json as \"(.*?)\"$")
	public void testInvalidCreateClassRequestBuilder(String description, String json) {
		
	
		requestBuilder = TestUtil.buildHTTPPostRequest("url", TestConstants.JSON_CONTENT_TYPE);
		response = TestUtil.getHttpResponseForStringReqEntity(requestBuilder,json);
		
	}
	
	
	@Then("^Asserting the class response with responsecode \"(.*?)\" and responseMessage \"(.*?)\"$")
	public void testInvalidClassCreateResponse(String expectedResponseCode, String expectedResponseMessage)  {
		
		Assert.assertNotNull(response);
		
		String data = TestUtil.readResponseString(response);
		
		
	}
	*/

}
