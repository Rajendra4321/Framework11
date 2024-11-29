package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.Loginpage;

public class LoginTestCRM extends BaseClass {

	@Test(priority = 1)
	public void loginApp() {
		Reporter.log("system login", true);
		logger = reports.createTest("login to CRM");

		Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);

		logger.info("starting application");

		loginpage.loginToCRM(excel.getStringData("sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));

		logger.pass("login sucesss");

	}
	
//	@Test(priority = 2)
//	public void loginApp1() {
//		Reporter.log("system logout", true);
//		logger = reports.createTest("logout");
//
//	
//
//		logger.fail("logout fail");
//
//	}

}
