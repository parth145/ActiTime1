package com.actitme.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BasePage;

public class Loginpage extends BasePage {

	@FindBy(id="username")
	private WebElement usernamebtn;
	
	@FindBy(name="pwd")
	private WebElement passwordbtn;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginb;
	
	public Loginpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String un)
	{
		usernamebtn.sendKeys(un);
	}
	
	public void enterpassword(String pw)
	{
		passwordbtn.sendKeys(pw);
	}
	
	public void clickOnLogin()
	{
		loginb.click();
	}
	


}
