package com.oanda.CurrencyConverterTest.utils;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
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
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
		//	prop.load(stream);
		//	stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String[] readFromExcel(int i)
	{
	     String array[]=new String[7];
	try
    {
		//WebDriver driver =new FirefoxDriver();
		
		
        FileInputStream file = new FileInputStream(new File("CurrencyConvertionData.xlsx"));
        
   

        //Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        //Get first/desired sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);

        //Iterate through each rows one by one
        Iterator<Row> rowIterator = sheet.iterator();
        
        
        for(int j=0;j<i;j++)
        {
            Row row = rowIterator.next();
            //For each row, iterate through all the columns
            Iterator<Cell> cellIterator = row.cellIterator();
             for(int k=0;k<7;k++)
          
            {
                Cell cell = cellIterator.next();
                //Check the cell type and format accordingly
              //  System.out.print(cell.getDateCellValue() + "\t");
                
                switch (cell.getCellType()) 
                {
                    case Cell.CELL_TYPE_NUMERIC:
                    	array[k]=cell.getNumericCellValue()+"";
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                    	array[k]=cell.getStringCellValue()+"";
                       System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    
                }
            }
            System.out.println("");
        }
        file.close();
        
    } 
    catch (Exception e) 
    {
        e.printStackTrace();
    }
	return array;

}

	public static void main(String[] args) throws IOException {

	
	}

	


}
