package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void verifyTheTitle(String etitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try {
			wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("Title is matching..."+etitle,true);
			
		}
		catch(Exception e)
		{
			Reporter.log("title is not matching.."+etitle,true);
			Reporter.log("Actual title is"+driver.getTitle(),true);
		}
	}
	
	public void verifyTheElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present..."+element,true);
			
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present",true);
			
		}
	}
	
}
