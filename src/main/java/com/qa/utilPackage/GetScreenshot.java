package com.qa.utilPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.TestBase.TestBase;

public class GetScreenshot extends TestBase
{
	public static void takeScreenshot(String filename)
	{
		try {
		String path="C:\\Users\\MANGESH PC\\Desktop\\github\\GroupRBranch\\patientrecords\\Screenshot\\";
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des= new File(path+filename+".png");
		FileHandler.copy(src, des);
		}
		catch(IOException e)
		{
			logger.info("please provide right path");
			e.printStackTrace();
		}
	}

}
