package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class AttachmentPage extends TestBase
{
	public AttachmentPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//form[@id='visit-documents-dropzone']")
	private WebElement drop_file_here;
	public void clickOnDropfile()
	{
		drop_file_here.click();
	}
     // comment on caption
	
	@FindBy(xpath="//textarea[@placeholder='Enter a caption']")
	private WebElement add_caption;
	public void sendKeysToCaption(String caption)
	{
		add_caption.sendKeys(caption);
	}
	
	//click on upload button
	
	
	
	@FindBy(xpath="//button[contains(text(),'Upload file')]")
	private WebElement upload_file_button;
	public void clickOnUploadFilebutton()
	{
		upload_file_button.click();
	}
	
	//
	
	@FindBy(xpath="//p[text()='The attachment was successfully uploaded.']")
	private WebElement attchment_assert;
	public String expectedResult()
	{
		String exp = attchment_assert.getText();
		return exp;
	}
	

}
