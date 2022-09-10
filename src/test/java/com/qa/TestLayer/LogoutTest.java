package com.qa.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

public class LogoutTest extends TestBase
{

	@Test
	public void verifylogout()
	{
		home.clickOnLogout();
		String expected = "https://demo.openmrs.org/openmrs/login.htm";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
	}
}
