package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class DeletePatientPage extends TestBase
{
	public DeletePatientPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[contains(text(),'This patient has been deleted')]")
	private WebElement expected;
	public String getExpectedResult()
	{
		String exp = expected.getText();
		return exp;
	}

}
