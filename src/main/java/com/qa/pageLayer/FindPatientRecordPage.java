package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class FindPatientRecordPage extends TestBase
{
	public FindPatientRecordPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='patient-search']")
	private WebElement search_patient_result;
	public void clickOnFindPatientRecords(String name)
	{
		search_patient_result.sendKeys(name);
	}
	
	@FindBy(xpath="(//tr[@class='odd'])[1]")
	private WebElement select_patient_record;
	public void clickOnPatientRecors()
	{
		select_patient_record.click();
	}
	
	@FindBy(xpath="//div[@class='float-sm-right']")
	private WebElement id;
	public String expectedResult()
	{
		String expected = id.getText();
		return expected;
	}
	
	
	
	
	
	
}
