package Odiobot.LoginTC;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Odiobot.LoginTC.LoginTest;
import baselibrary.BaseLibrary;

public class LoginTest extends BaseLibrary {
	
	LoginPage obj1;
	@BeforeTest
	public void getLaunchUrl()
	{
		getLaunchUrl("https://bot.odioiq.com/app/general/dashboard");
		obj1 = new LoginPage();
	}
	@Test(priority = 1)
	public void getTitle_odio()
	{
		obj1.getTitle();
	}
	@Test(priority = 2)
	public void getuserpass_odio() throws InterruptedException
	{
		obj1.getuserpass();
		Thread.sleep(3000);	
	}
}
