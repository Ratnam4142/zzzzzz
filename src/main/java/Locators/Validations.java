package Locators;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.baseclass;

public class Validations extends baseclass {
	
	public Validations() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	static By Demo = By.xpath("//*[@id=\"item-vfb-1\"]/div/h3");
	static By Package = By.xpath("//*[@id=\"content\"]/article/div/div/section[3]/div/div/div/div/div/h2");
	                              
	
	
	public static String Demo_Text() {
		WebElement element = driver.findElement(Demo);
		String text = element.getText();
		System.out.println(text);
		
		return text;
		
	}
	public static String package_Text() {
		WebElement element = driver.findElement(Package);
		String text = element.getText();
		System.out.println(text);
		
		return text;
	}
}
