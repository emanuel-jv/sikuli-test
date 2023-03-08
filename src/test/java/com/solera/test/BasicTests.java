package com.solera.test;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.solera.behaviour.Actions;
import com.solera.utils.Utils;

public class BasicTests {

	@Test
	public void Test() {
		WebDriver driver = Utils.setUp();
		Actions.goToPage(driver);
		Actions.acceptCookies(driver);
		boolean Recognize = Actions.findLogo();
		Utils.tearDown(driver);
		assertTrue(Recognize);
	}
}
