package com.oanda.CurrencyConverterTest.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class TestConstants {
	
	
	
	public final static String XML_CONTENT_TYPE = "text/xml;charset=utf-8";
	
	public final static String USER_AGENT_QBRANCH = "Q-Branch-Enrollment-Server";

	public static final String JSON_CONTENT_TYPE = "application/json";

	public static final String HTTP_METHOD_NOT_ALLOWED= "Method Not Allowed";

	public static final String HTTP_UNAUTHORIZED = "Unauthorized";
	
	public static  ArrayList<String> DEFAULT_SOURCE = new ArrayList<String>(){
		{
			add("SYSTEM");
			add("MANUAL");
		}};
	
	public static  ArrayList<String> DEFAULT_ROLES = new ArrayList<String>(){
	{
		add("Administrator");
		add("Manager");
		add("Student");
		add("Instructor");
		add("Staff");
	}};
	
	
	
	public static final ArrayList<String> PRIVILAGE_LEVEL = new ArrayList<String>(){
		private static final long serialVersionUID = 1L;
	{
		add("Organization");
		add("People");
		add("Content");
	}};
	
	
	public static HashMap<String,String[]> ROLE_PRIVILAGE_MAP = new HashMap<String,String[]>(){
		private static final long serialVersionUID = 1L;
	{
		put("Administrator_Organization",new String[]{"CAN_ADMINISTER_INSTITUTION","CAN_MANAGE_ROLES","CAN_TRANSFER_VPP_LICENSES","CAN_PUBLISH_ITUNESU_PUBLIC_SITE","CAN_CONFIGURE_INSTITUTION","CAN_MANAGE_DEVICES","CAN_LOGIN_IN_EE_PORTAL"});
		put("Administrator_People",new String[]{"CAN_MANAGE_MANAGED_APPLE_ID","CAN_PERFORM_ACCOUNT_INSPECTION","CAN_MANAGE_CLASSES","CAN_RESET_PASSWORD","CAN_USE_IDS"});
		put("Administrator_Content",new String[]{"CAN_BUY_VPP_CONTENTS","CAN_MANAGE_VPP_LICENSES","CAN_CONTRIBUTE_ITUNESU_PUBLIC_SITE","CAN_SUBMIT_ITUNESU_PODCAST"});
		put("Manager_Organization",new String[]{"CAN_CONFIGURE_INSTITUTION","CAN_MANAGE_DEVICES","CAN_LOGIN_IN_EE_PORTAL"});
		put("Manager_People",new String[]{"CAN_MANAGE_MANAGED_APPLE_ID","CAN_PERFORM_ACCOUNT_INSPECTION","CAN_MANAGE_CLASSES","CAN_RESET_PASSWORD","CAN_USE_IDS"});
		put("Manager_Content",new String[]{"CAN_BUY_VPP_CONTENTS","CAN_MANAGE_VPP_LICENSES","CAN_CONTRIBUTE_ITUNESU_PUBLIC_SITE","CAN_SUBMIT_ITUNESU_PODCAST"});
		put("Instructor_Organization",new String[]{});
		put("Instructor_People",new String[]{"CAN_RESET_PASSWORD"});
		put("Instructor_Content",new String[]{"CAN_CONTRIBUTE_ITUNESU_PUBLIC_SITE","CAN_SUBMIT_ITUNESU_PODCAST"});
		put("Student_Organization",new String[]{});
		put("Student_People",new String[]{"SIX_DIGIT_HOME_USE_PASSWORD"});
		put("Student_Content",new String[]{"CAN_SUBMIT_ITUNESU_PODCAST"});
	}};
	
	
	
}
