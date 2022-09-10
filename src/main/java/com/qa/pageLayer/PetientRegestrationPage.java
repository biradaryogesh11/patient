package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.TestBase.TestBase;

public class PetientRegestrationPage extends TestBase
{
	public PetientRegestrationPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='givenName']")
	private WebElement patient_first_name;
	public void enterPatientName(String name)
	{   patient_first_name.clear();
		patient_first_name.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement patient_middle_name;
	public void enterPatientMiddleName(String middle_name)
	{   patient_middle_name.clear();
		patient_middle_name.sendKeys(middle_name);
	}
	
	@FindBy(xpath="//input[@name='familyName']")
	private WebElement patient_last_name;
	public void enterPatientlastName(String last_name)
	{   patient_last_name.clear();
		patient_last_name.sendKeys(last_name);
	}
	
	@FindBy(xpath="//button[@id='next-button']")
	private WebElement next_button;
	public void clickOnNextButton()
	{
		next_button.click();
	}
	
	@FindBy(xpath="//option[contains(text(),'Male')]")
	private WebElement select_male_gender;
	public void clickOnMaleGender()
	{
		select_male_gender.click();
	}
	
	@FindBy(xpath="//option[contains(text(),'Female')]")
	private WebElement select_female_gender;
	public void clickOnFemaleGender()
	{
		select_female_gender.click();
	}
	
	@FindBy(xpath="//input[@id='birthdateDay-field']")
	private WebElement select_date;
	public void enterDate(String date)
	{
		select_date.sendKeys(date);
	}
	
	@FindBy(xpath="//select[@id='birthdateMonth-field']")
	private WebElement select_month;
	public void enterMonth(String month)
	{
		Select s= new Select(select_month);
	     s.selectByVisibleText(month);
	}
	
	@FindBy(xpath="//input[@id='birthdateYear-field']")
	private WebElement select_year;
	public void enteryear(String year)
	{
		select_year.sendKeys(year);
	}
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement address1;
	public void enterAddress(String address)
	{
		address1.sendKeys(address);
	}
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	private WebElement phone_number ;
	public void enterPhoneNumber(String Number)
	{
		phone_number.sendKeys(Number);
	}
	//input[@id='submit']
	
	@FindBy(xpath="//input[@id='submit']")
	private WebElement submit_button ;
	public void clickOnSubmitButton()
	{
		submit_button.click();
	}
	
	@FindBy(xpath="//span[@class='PersonName-givenName']")
	private WebElement expected_result ;
	public String getExpectedResult()
	{
		String expected = expected_result.getText();
		return expected;
	}
	
	
	
	
	
	

}
