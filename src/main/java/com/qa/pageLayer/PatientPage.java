package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class PatientPage extends TestBase
{
	public PatientPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[contains(@class,'col-11 col-lg-10')])[17]")
	private WebElement delete_patient;
	public void clickOnDeletePatientRecord()
	{
		delete_patient.click();
	}
	
	@FindBy(xpath="//input[@id='delete-reason']")
	private WebElement delete_reason;
	public void EnterReasonDeleteRecord(String reason)
	{
		delete_reason.sendKeys(reason);
	}
	
	@FindBy(xpath="(//button[@class='confirm right'])[6]")
	private WebElement confirm_button;
	public void clickOnConfirmButton()
	{
		confirm_button.click();
	}
	
	@FindBy(xpath="//h3[contains(text(),'Height (cm)')]")
	private WebElement height;
	public String getHeight()
	{
		String exp = height.getText();
		return exp;
	}
	
	@FindBy(xpath="//h3[contains(text(),'Weight (kg)')]")
	private WebElement weight;
	public String getWeight()
	{
		String exp = weight.getText();
		return exp;
	}
	
	@FindBy(xpath="//h3[contains(text(),'Température (c)')]")
	private WebElement temperature;
	public String getTemperature()
	{
		String exp = temperature.getText();
		return exp;
	}
	
	@FindBy(xpath="//h3[contains(text(),'Pulse')]")
	private WebElement pulse;
	public String getPulse()
	{
		String exp = pulse.getText();
		return exp;
	}
	

}
