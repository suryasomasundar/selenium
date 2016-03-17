package com.apple.tesla.PeopleServiceTest.utils;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONObject;


public class TestUtil {
	
	public static Properties prop = new Properties();
	public static Properties config = new Properties();
	
	static{
		try{
			
			InputStream str = TestUtil.class.getClassLoader().getResourceAsStream("config.properties");
			config.load(str);
			
			if(System.getProperty("env") !=null && !System.getProperty("env").equals("") )
			{
				config.setProperty("myenv",System.getProperty("env"));
			}

			String env = config.getProperty("myenv");
			System.out.println("running in "+env);
			String propFileName = "peopleservice_"+config.getProperty("myenv")+".properties";
			System.out.println(propFileName);
			InputStream stream = TestUtil.class.getClassLoader().getResourceAsStream(propFileName);
			prop.load(stream);
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readResponseString(HttpResponse response) 
	{
		StringBuffer result = new StringBuffer();
		String line = null;
		String responseString = null;
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			responseString = result.toString();
		}  catch (IOException e) {
			e.printStackTrace();
		}
		return responseString;
	}

	
	
	
	public static RequestBuilder buildHTTPPostRequest(String url,String contentType)
	{
		RequestBuilder requestBuilder = RequestBuilder.post().setUri(url)
				.setHeader(HttpHeaders.CONTENT_TYPE, contentType)
				.setHeader(	HttpHeaders.HOST,getHostName(url));
		requestBuilder = buildCommonHeaders(requestBuilder);		
				
		return requestBuilder;
	}
	
	public static RequestBuilder buildHTTPPostRequestWithoutToken(String url,String contentType)
	{
		RequestBuilder requestBuilder = RequestBuilder.post().setUri(url)
				.setHeader(HttpHeaders.CONTENT_TYPE, contentType)
				.setHeader(	HttpHeaders.HOST,getHostName(url))
				.setHeader(HttpHeaders.ACCEPT_LANGUAGE,"en-us")
		;
				
		return requestBuilder;
	}
	
	
	
	public static RequestBuilder buildHTTPGetRequest(String url,String contentType)
	{
		RequestBuilder requestBuilder = RequestBuilder.get().setUri(url)
				.setHeader(HttpHeaders.CONTENT_TYPE, contentType)
				.setHeader(	HttpHeaders.HOST,getHostName(url));
		requestBuilder = buildCommonHeaders(requestBuilder);		
				
		return requestBuilder;
	}
	
	
	public static RequestBuilder buildHTTPPutRequest(String url,String contentType)
	{
		RequestBuilder requestBuilder = RequestBuilder.put().setUri(url)
				.setHeader(HttpHeaders.CONTENT_TYPE, contentType)
				.setHeader(	HttpHeaders.HOST,getHostName(url));
		requestBuilder = buildCommonHeaders(requestBuilder);		
				
		return requestBuilder;
	}
	
	public static RequestBuilder buildHTTPDeleteRequest(String url,String contentType)
	{
		RequestBuilder requestBuilder = RequestBuilder.delete().setUri(url)
				.setHeader(HttpHeaders.CONTENT_TYPE, contentType)
				.setHeader(	HttpHeaders.HOST,getHostName(url));
		requestBuilder = buildCommonHeaders(requestBuilder);		
				
		return requestBuilder;
	}
		
	private static RequestBuilder buildCommonHeaders(RequestBuilder requestBuilder)
	{
		return requestBuilder.setHeader(HttpHeaders.ACCEPT_LANGUAGE,"en-us")
		;
	}
	
	public static String getHostName(String uri)
	{
		//String uri ="https://vp21q01su-volume.isu.apple.com/devices/server/edit";
		String hostname = null;
		if(uri.startsWith("https://") || uri.startsWith("http://"))
			hostname =  uri.split("//")[1].split("/")[0];
		else
			hostname = uri.split("/")[0];
		return hostname;
			
	}

	public static HttpResponse getHttpResponseForStringReqEntity(RequestBuilder requestBuilder, String inputString) {
		
		HttpResponse response = null;
		try {
			HttpClient client = HttpClientBuilder.create().build();
			StringEntity requestEntity = new StringEntity(inputString);		 
			HttpUriRequest request = requestBuilder.setEntity(requestEntity).build();
			response = client.execute(request);
		} catch (ClientProtocolException e) {
			response = null;
			e.printStackTrace();
		} catch (IOException e) {
			response = null;
			e.printStackTrace();
		}
		return response;		
	}

	public static HttpResponse getHttpResponse(RequestBuilder requestBuilder) {
		
		HttpResponse response = null;
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpUriRequest request = requestBuilder.build();
			response = client.execute(request);
		} catch (ClientProtocolException e) {
			response = null;
			e.printStackTrace();
		} catch (IOException e) {
			response = null;
			e.printStackTrace();
		}
		return response;		
	}
	
	
	public static String[] getStringArrayFromJsonArray(JSONArray jsonArray) {
		System.out.println(jsonArray);
		if(jsonArray != null){
			ArrayList<String> list = new ArrayList<String>();     
				int len = jsonArray.length();
				for (int i=0;i<len;i++){ 
					list.add(jsonArray.get(i).toString());
				} 
			return list.toArray(new String[list.size()]);
		}
		else 
			return null;
	}
	
	
	static Random rnd = new Random();
	public static final String alpha_numeric = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String numeric = "0123456789";
	public static final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String alpha_numeric_sym = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ/_.-";

	public static String randomString( int len, String type ) 
	{
		StringBuilder sb = new StringBuilder( len );
		for( int i = 0; i < len; i++ ) 
			sb.append( type.charAt( rnd.nextInt(type.length()) ) );
		return sb.toString();
	}
	
	public static String randomString( int len) 
	{
		return randomString( len,TestUtil.alpha_numeric); 
	}
	
	public static void main(String[] args) throws IOException {

	
	}

	


}
