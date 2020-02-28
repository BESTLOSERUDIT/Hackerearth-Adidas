package com.demoBlaze.qa.ApplicationFunctions;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.demoBlaze.qa.base.TestBase;

import junit.framework.Assert;


public class UserDefinedFuntions extends TestBase{

	
/*
 * FunctionName: fngetTitleOfThePage 
 * Parameters: No
 * Use of the function: Function for getting the title of the pages opened in the browser
 * Author: Udit Pratap Singh
 * Date: 12 FEB 2020
 */	
	
	public String fngetTitleOfThePage() {
		
		String title= driver.getTitle();
		
		return title;
	}

	

/* FunctionName: fnCloseCurrentBrowser 
 * Parameters: No
 * Use of the function: Function for closing the current browser
 * Author: Udit Pratap Singh
 * Date: 12 FEB 2020
 */		
	
	public void fnCloseCurrentBrowser() {
		
		driver.close();
		
	}
		

	

/* FunctionName: enterValueInField 
 * Parameters: Yes
 * 			-By elementXpath= xpath of the element
 * 			-String valueToEnter= value to enter in the field
 * 			-Object extraArgument= Future use
 * Use of the function: Function for enter the value in the field
 * Author: Udit Pratap Singh
 * Date: 12 FEB 2020
 */	
	
	public void enterValueInField(By elementXpath,String valueToEnter,Object extraArguments) {
		
		driver.findElement(elementXpath).sendKeys(valueToEnter);
		
	}
	
	
	

//Function for accepting the alert on the WebScreen	
	public void acceptTheAlertPopUp() {
		
		/*
		 * Alert alert = driver.switchTo().alert(); alert.accept();
		 * System.out.println("The Aleart says:-  "+alert.getText());
		 */
		try {
		    WebDriverWait wait = new WebDriverWait(driver, 5);
		    wait.until(ExpectedConditions.alertIsPresent());
		    Alert alert = driver.switchTo().alert();
		    System.out.println(alert.getText());
		    alert.accept();
		    Assert.assertTrue(alert.getText().contains("Product added"));
		} catch (Exception e) {
		    //exception handling
		}
		
	}
	
	
//Function to click on the Link with the object as the parameter	
	public void clickOnTheLink(By link) {
		
		driver.findElement(link).click();
		
	}
	
	
//Function to wait for the object to get visible
	
	public void waitForTheElementToVisible(By element,int TimeOut) {
		
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
		
		
	}
	
	
	public void staticwaitForTheElement(int waitTime) throws InterruptedException {
		
		Thread.sleep(waitTime);
	}
	
	
	
	public String getTextOfElement(By element) {
		
		return driver.findElement(element).getText();
		
	}
	
	
	
}	