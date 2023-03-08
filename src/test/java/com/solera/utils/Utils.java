package com.solera.utils;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Utils {
	public static WebDriver setUp() {
		Properties properties = LoadProperties.getProperties();
		System.setProperty("webdriver.chrome.driver", properties.getProperty("locationChromeDriver"));
		WebDriver driver = new ChromeDriver();

		return driver;
	}

	public static void tearDown(WebDriver driver) {
		driver.quit();
	}
}
