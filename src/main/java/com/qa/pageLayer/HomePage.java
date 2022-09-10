package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class HomePage extends TestBase
{

	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//i[@class='icon-user']")
	private WebElement register_a_patient;
	public void clickonRegisterAPatient()
	{
		register_a_patient.click();
	}
	
	@FindBy(xpath="//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")
	private WebElement find_patient_records;
	public void clickOnFindPatientRecords()
	{
		find_patient_records.click();
	}
	
	@FindBy(xpath="//i[@class='icon-signout small']")
	private WebElement logout;
	public void clickOnLogout()
	{
		logout.click();
	}
}
