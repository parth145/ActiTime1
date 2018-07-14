package demomaven;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitme.pages.Loginpage;

public class Testlogin extends BaseTest{


	@Test
	public void logintest()
	{
		Loginpage lp = new Loginpage(driver);
		
		lp.verifyTheTitle("actiTIME - Login");
		
		lp.enterusername("admin");
		
		lp.enterpassword("manager");
		
		lp.clickOnLogin();
	}
}
