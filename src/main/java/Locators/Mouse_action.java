package Locators;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass.baseclass;

public class Mouse_action extends baseclass {
	
	public Mouse_action() throws IOException {
		super();
		
	}


	static By action = By.xpath("//*[@id=\"menu-item-4131\"]/a/span");
	static By actionone = By.xpath("//*[@id=\"menu-item-4157\"]/a/span");
	static By action_click = By.xpath("//*[@id=\"menu-item-4134\"]/a/span");
	
	
	public static void Validation_action() {
		
		Actions mouse = new Actions(driver);
		mouse
		.moveToElement(driver.findElement(action))
		.moveToElement(driver.findElement(actionone))
		.moveToElement(driver.findElement(action_click))
		.click()
		.perform();
		
	}

}
