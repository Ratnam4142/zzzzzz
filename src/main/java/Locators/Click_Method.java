package Locators;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.baseclass;

public class Click_Method extends baseclass {
	public Click_Method() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	static By male = By.id("vfb-8-1");
	static By Female = By.id("vfb-8-2");

	public void Clickon_male() {
		WebElement element = driver.findElement(male);
		element.click();
	}
	public void Clickon_Female() {
		WebElement element = driver.findElement(Female);
		element.click();
	}
}
