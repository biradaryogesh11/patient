package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class LoginPage extends TestBase
{

	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	public void enterUserName(String username1)
	{
		username.sendKeys(username1);
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public void enterPassword(String password1)
	{
		password.sendKeys(password1);
	}
	
	@FindBy(xpath="//input[@id='loginButton']")
	private WebElement login_button;
	public void clickOnLoginButton()
	{
		login_button.click();
	}
	
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	private WebElement location;
	public void clickOnLocation()
	{
		location.click();
	}
}
