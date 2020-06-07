package com.inetBanking.testcases;

import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.AddCustomerPage;
import com.inetBanking.PageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseTestClass {
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		Logger logger = Logger.getLogger("ebanking");
		lp.setUserName(UserName);
		lp.setpassword(password);
		lp.submit();

		Thread.sleep(2000);
		logger.info("Adding customer detials..");
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.addCustomerLink();

		addcust.custName("Niveditha");
		addcust.custPassword("tamason");
		addcust.custgender("female");
		Thread.sleep(2000);

		addcust.custdob("04", "24", "89");
		addcust.custAddress("bsvdc");
		addcust.custCity("Bengaluru");
		addcust.custState("Karnataka");
		Thread.sleep(3000);

		addcust.custPin("255655");
		addcust.custTele("3567458965");
		String email = randomestring() + "@gmail.com";
		addcust.custEmail(email);
		addcust.custPassword("asad");
		addcust.addCustSubmit();
		Thread.sleep(3000);

		logger.info("Started validation");

		Boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if (res == true) {
			Assert.assertTrue(true);
			logger.info("Testcase is passed");
		} else {
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
			logger.info("Testcase is failed");
		}

	}

}
