package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility {
 public static Actions act;
 
 	public ActionsUtility(WebDriver driver)
 	{
 		act = new Actions(driver);
 	}
 	
 	public static void moveToElement(WebElement element)
 	{
 		act.moveToElement(element);
 	}
}
