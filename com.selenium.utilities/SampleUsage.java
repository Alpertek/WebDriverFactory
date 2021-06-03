package com.selenium.utilities;

import com.selenium.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SampleUsage{
	public static void main(String[] args){

		
		
		// Creating and using driver with  a static method of WebdriverFactory class

		WebDriver driver = WebdriverFactory.getDriver("chrome");

		String url = "https://www.google.com";

		//Open google in chrome with selenium

		driver.get(url);
	}
}
