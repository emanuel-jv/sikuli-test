package com.solera.behaviour;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.solera.utils.LoadProperties;

public class Actions {
	
	private static Properties properties = LoadProperties.getProperties();
	
	public static void goToPage(WebDriver driver) {
		driver.manage().window().maximize();
		String url = properties.getProperty("soleraUrl");
		driver.get(url);
	}
	
	public static void acceptCookies(WebDriver driver) {
		String idBtn = properties.getProperty("AcceptCookiesBtnId");
		WebElement acceptCookiesBtn = driver.findElement(By.id(idBtn));
		acceptCookiesBtn.click();
		
	}
	
	public static void findLogo() throws InterruptedException, FindFailed {
		String imgPath = properties.getProperty("pathLogoSolera");
		
		Screen screen = new Screen();
		Pattern SoleraLogo = new Pattern (imgPath);

		if (screen.exists(SoleraLogo.similar((float)0.28)) != null) {
			System.out.print("The Logo Exist");
		}
		else {
			System.out.print("The Logo doesn't exist");
		}
	}
	
}
