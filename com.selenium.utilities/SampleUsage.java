package com.selenium.utilities;

import com.selenium.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SampleUsage{
	public static void main(String[] args){

		WebdriverFactory factory = new WebdriverFactory();
		
		// Creating and using driver with factory object of     //  WebdriverFactory class

		WebDriver driver = factory.getDriver("chrome");

		String url = "https://www.google.com";

		//Open google in chrome with selenium

		driver.get(url);
	}
}