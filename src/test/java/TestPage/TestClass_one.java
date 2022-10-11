package TestPage;



import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.baseclass;
import Locators.Mouse_action;
import Locators.SendKeys;
import Locators.Validations;
import ScreenShot.ScreenShots;

public class TestClass_one extends baseclass {

	public TestClass_one() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@AfterMethod
	public void TakeScreenshot(ITestResult result) {
		ScreenShots.ScreenShotsTcs(result);
	}
	@Test (priority = 0)
	public void Welcome_to_TestNg() {
		System.out.println("R-Testing Tools – Manual & Automation Testing");
	}
	@Test (priority = 1)
	public void Validation_Package_Text() throws InterruptedException {
		Assert.assertEquals(Validations.package_Text(), "Package 1 : Self Paced Video Course for Manual Testing (INR 499)");
		Thread.sleep(5000);
	}
	@Test (priority = 2)
	public void Validation_Mouse() throws InterruptedException {
		Mouse_action.Validation_action();
		Assert.assertEquals(Validations.Demo_Text(), "Register For Demo");
		Thread.sleep(5000);
	}
	@Test (priority = 3)
	public void Validation_sendkeys() throws InterruptedException {
		SendKeys.FirstName_send(prop.getProperty("Fname"));
		Thread.sleep(5000);
		SendKeys.lasttName_send(prop.getProperty("Lname"));
		Thread.sleep(5000);
	}
	
	@BeforeClass
	public void open_Browser() {
		initlization();
	}
	@AfterClass
	public void Browser_Close() {
		TearDown();
	}
}
