package com.qa.TestLayer;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.pageLayer.AttachmentPage;
import com.qa.utilPackage.FileUpload;

public class AddAttachmentOfPatient extends TestBase
{
	@Test
	public void VerifyAddAttachment() throws AWTException, InterruptedException
	{
		logger.info("find patient record page");
		home.clickOnFindPatientRecords();
		logger.info("enter the patient name");
		record.clickOnFindPatientRecords("rohn");
		record.clickOnPatientRecors();
		logger.info("patient record page");
		logger.info("attachment is selcted");
		patient.clickOnAttachment();

		logger.info("attachment page is opened");
		AttachmentPage attach= new AttachmentPage();
		attach.clickOnDropfile();
		logger.info("attachment location page is open");
		Thread.sleep(2000);
		FileUpload upload= new FileUpload();
		upload.uploadFile();
		logger.info("file is uploaded");
		attach.sendKeysToCaption("attachment is added");
		attach.clickOnUploadFilebutton();
		String expected = attach.expectedResult();
		String actual = driver.findElement(By.xpath("//p[text()='The attachment was successfully uploaded.']")).getText();
		Assert.assertEquals(actual, expected);





	}
}
