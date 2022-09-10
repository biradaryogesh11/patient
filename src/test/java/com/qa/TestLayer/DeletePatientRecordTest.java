package com.qa.TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.pageLayer.DeletePatientPage;

public class DeletePatientRecordTest extends TestBase
{
    @Test
	public void verifyDeletePatientRecord() throws InterruptedException
	{
	   home.clickOnFindPatientRecords();
	   logger.info(" enter patient record page");
	   record.clickOnFindPatientRecords("Sharad");
	   logger.info(" enter name search box");
	   record.clickOnPatientRecors();
	   Thread.sleep(2000);
	   logger.info("enter on patient record page");
	   patient.clickOnDeletePatientRecord();
	   logger.info("delete tab is pop-up");
	   patient.EnterReasonDeleteRecord("personal");
	   logger.info("reason is entered");
	   patient.clickOnConfirmButton();
	   logger.info("clicked on button");
//	   DeletePatientPage delete= new DeletePatientPage();
//	   String expected = delete.getExpectedResult();
//	   Thread.sleep(2000);
//	   String actual = driver.findElement(By.xpath("//h1[contains(text(),'This patient has been deleted')]")).getText();
//	   Assert.assertEquals(actual, expected);
	}
}
