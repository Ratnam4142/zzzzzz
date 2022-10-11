package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import BaseClass.baseclass;

public class ScreenShots extends baseclass {

	public ScreenShots() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void ScreenShotsTcs(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			try {			    
				TakesScreenshot ss = (TakesScreenshot) driver;
				File sourse = ss.getScreenshotAs(OutputType.FILE);
				File dest = new File("./ScreenShot\\Screenshot_Of" + result.getClass() + "OF" + result.getName() + ".png");
				FileUtils.copyFile(sourse, dest);
				System.out.println("Screenshot print as a" + result.getName());
				
			} catch (Exception e) {
				System.out.println("Exception will taking screenshot: " +e.getMessage()); 
			}
			
		}
	}

}
