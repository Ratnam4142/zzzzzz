package Locators;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.baseclass;

public class SendKeys extends baseclass {
	public SendKeys() throws IOException {
		super();
		
	}

	static By FirstName = By.name("vfb-5"); 
	static By lastName = By.name("vfb-");
	
	public static String FirstName_send(String abcd) {
		WebElement element = driver.findElement(FirstName);
		element.sendKeys(abcd);
		
		return null;
		
	}
	public static String lasttName_send(String xyd) {
		WebElement element = driver.findElement(lastName);
		element.sendKeys(xyd);
		
		return null;
		
	}

}
