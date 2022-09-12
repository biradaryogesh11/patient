package com.qa.utilPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload 
{
	public void uploadFile() throws AWTException
	{
		Robot robo= new Robot();
		robo.delay(2000);
		StringSelection ss= new StringSelection("\"C:\\Users\\MANGESH PC\\Desktop\\upload\\Screenshot (68).png\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//ctr V
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.delay(2000);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.delay(2000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		robo.delay(2000);
	}

}
