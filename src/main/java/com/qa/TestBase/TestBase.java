package com.qa.TestBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.FindPatientRecordPage;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.PatientPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	
	public static WebDriver driver;
	public static Logger logger;
	public static FindPatientRecordPage record;
	public static HomePage home;
	public static PatientPage patient;
	
	@BeforeMethod
	public void start()
	{
		 logger=Logger.getLogger("patientrecords");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("FrameWork Excution started");
	}
	@AfterMethod
	public void stop()
	{
		logger.info("FrameWork Excution End");
	}

	@Parameters("browser")
	@BeforeMethod
	public void setProperty(String br) throws InterruptedException
	{
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("please enter correct url");
		}

		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		Thread.sleep(2000);
		LoginPage l= new LoginPage();
		l.enterUserName("Admin");
		l.enterPassword("Admin123");
		l.clickOnLocation();
		l.clickOnLoginButton();
		
		 home= new HomePage();
		 record= new FindPatientRecordPage();
		 patient=new PatientPage();
		
	}
	@AfterMethod
	public void closeTab()
	{
		driver.quit();
	}
	
}
