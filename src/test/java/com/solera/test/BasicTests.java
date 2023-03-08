package com.solera.test;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.solera.behaviour.Actions;
import com.solera.utils.Utils;

public class BasicTests {

	@Test
	public void Test() throws FindFailed, InterruptedException {
		WebDriver driver = Utils.setUp();
		Actions.goToPage(driver);
		Actions.acceptCookies(driver);
		Actions.findLogo();
		Utils.tearDown(driver);
	}
}
