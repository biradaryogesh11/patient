package com.qa.TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

public class PatientRecordTest extends TestBase
{
	@Test
	public void verifyPatientRecordPage() throws InterruptedException
	{
		Thread.sleep(6000);

		home.clickOnFindPatientRecords();
		logger.info("patient record page is open");
		record.clickOnFindPatientRecords("logen");
		logger.info("id is entered");
		Thread.sleep(2000);
		record.clickOnPatientRecors();
		Thread.sleep(2000);
		logger.info("Patient record is selected");
		String expected = record.expectedResult();
		String actual = driver.findElement(By.xpath("//div[@class='float-sm-right']")).getText();
		Assert.assertEquals(actual, expected);
		logger.info("Assert name");
		String expected1=patient.getHeight();
		String actual1 = driver.findElement(By.xpath("//h3[contains(text(),'Height (cm)')]")).getText();
		Assert.assertEquals(actual1, expected1);
		logger.info("Assert height");
		String expected2=patient.getWeight();
		String actual2 = driver.findElement(By.xpath("//h3[contains(text(),'Weight (kg)')]")).getText();
		Assert.assertEquals(actual2, expected2);
		logger.info("Assert weight");
		String expected3=patient.getTemperature();
		String actual3 = driver.findElement(By.xpath("//h3[contains(text(),'Température (c)')]")).getText();
		Assert.assertEquals(actual3, expected3);
		logger.info("Assert temprature");
		String expected4=patient.getPulse();
		String actual4 = driver.findElement(By.xpath("//h3[contains(text(),'Pulse')]")).getText();
		Assert.assertEquals(actual4, expected4);
		logger.info("Assert pulse");
	}
}
