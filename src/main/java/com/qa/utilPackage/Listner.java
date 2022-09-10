package com.qa.utilPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.TestBase.TestBase;

public class Listner extends TestBase implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
      logger.info("Test case excution is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		logger.info("Test case excution is ssuccessful");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		logger.info("Test method is failed ");
     GetScreenshot.takeScreenshot(result.getName()+System.currentTimeMillis());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{

	}

	@Override
	public void onStart(ITestContext context) 
	{

	}

	@Override
	public void onFinish(ITestContext context)
	{

	}


}
