package com.demoBlaze.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.demoBlaze.qa.utilities.TestUtil;


public class TestBase {

		//public static WebDriver driver;
		public static Properties prop;
		public static ChromeOptions options;
		static SingleTonDriver singleTonDriver = SingleTonDriver.getInstanceOfSingletonBrowserClass();
		public static WebDriver driver=singleTonDriver.getDriver();
		public static  Map<String, Object> globalmap ;	
		
		
		public TestBase() {
			
			 prop= new Properties();
			try {
				FileInputStream file= new FileInputStream("src\\main\\java\\com\\"
						+ "demoBlaze\\qa\\config\\config.properties");
				try {
					prop.load(file);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
					e.printStackTrace();
			}
						
		}
				
		public static void initialization() throws IOException {	
			
			//globalmap=GlobalTestDataRead.readExcel(prop.getProperty("testDataFilePath"), prop.getProperty("testDataSheet"), scenarioName);	
			
			driver.get(prop.getProperty("url"));			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
						
		}
			
			
		
		
		
		
		
	

}
