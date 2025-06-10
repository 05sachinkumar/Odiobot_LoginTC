package Odiobot.LoginTC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class LoginPage extends BaseLibrary{
	
	String path = "C:\\Users\\Sachin Kumar\\AutomationOdioTestNG2\\Testdata\\LoginDataAutomate.xlsx";
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@name=\"email\"]")
	private WebElement username;
	@FindBy(xpath="//*[@name=\"password\"]")
	private WebElement psswd;
	@FindBy(xpath="//*[text()='Login']")
	private WebElement login;
	
	public void getTitle()
	{
		String title = driver.getTitle();
		System.out.println("Title of Odiobot :"+title);
	}
	public void getuserpass() throws InterruptedException
	{
		username.sendKeys(getReadData(path, 0, 0, 1));
		psswd.sendKeys(getReadData(path, 0, 1, 1));
		login.click();
		Thread.sleep(5000);
	}
}