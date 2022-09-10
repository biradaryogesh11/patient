package com.qa.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.pageLayer.LoginPage;

public class LoginTest extends TestBase
{
	@Test
	public void verifyLogin() throws InterruptedException
	{
		Thread.sleep(2000);
		logger.info("");
		LoginPage l= new LoginPage();
		logger.info("login page is open");
		l.enterUserName("Admin");
		logger.info("username is entered");
		l.enterPassword("Admin123");
		logger.info("password is ented");
		l.clickOnLocation();
		logger.info("location is selectec");
		l.clickOnLoginButton();
		logger.info("clicked on login button");
		String expected_url = "https://demo.openmrs.org/openmrs/referenceapplication/home.page";
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);
		logger.info("test Case is passed");
	}
	

}
