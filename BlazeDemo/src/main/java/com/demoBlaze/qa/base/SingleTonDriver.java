package com.demoBlaze.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.demoBlaze.qa.utilities.EventHandler;


public class SingleTonDriver extends TestBase{

	//This is a singleton driver class
	public static SingleTonDriver instanceOfSingletonBrowserClass=null;
	public static ChromeOptions options;
	private EventFiringWebDriver eventDriver;
   // private static WebDriver driversingleton;
    ThreadLocal<WebDriver> driversingleton = new ThreadLocal<WebDriver>();
    // Defining the constructor as private so that no want can access by creating the object
    private SingleTonDriver(){
        	
	    	System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	    	options =new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--profile-directory=Default");
			//driversingleton= new ChromeDriver(options);
			driversingleton.set(new ChromeDriver(options));
			eventDriver = new EventFiringWebDriver(driversingleton.get());
			EventHandler handler = new EventHandler();
			eventDriver.register(handler);
		    	
    }

    // TO create instance of singleton driver class
    public static SingleTonDriver getInstanceOfSingletonBrowserClass(){
        if(instanceOfSingletonBrowserClass==null){
        	instanceOfSingletonBrowserClass = new SingleTonDriver();
        }
        return instanceOfSingletonBrowserClass;
    }
    
    // To get driver instance
    public WebDriver getDriver()
    {
    	return eventDriver;
    }
    

   
}
