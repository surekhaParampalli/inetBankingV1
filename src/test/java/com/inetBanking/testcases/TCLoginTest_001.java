package com.inetBanking.testcases;

import java.io.IOException;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.LoginPage;

public class TCLoginTest_001 extends BaseTestClass {

	@Test
	public void loginTest() throws IOException {

		LoginPage lp = new LoginPage(driver);
		Logger logger = Logger.getLogger("ebanking");
		lp.setUserName(UserName);
		logger.info("entered username");

		lp.setpassword(password);
		logger.info("entered password");

		lp.submit();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertFalse(false);
			logger.info("Login failed");
		}
	}
}
