package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	@SuppressWarnings("deprecation")
	public static WebDriver startapplication(WebDriver driver, String browsername, String appURL) {

		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\Framework11\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

			
		} else if (browsername.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver",
//					"C:\\Users\\HP\\eclipse-workspace\\Framework11\\Driver\\chromedriver.exe");

		} else if (browsername.equals("IE")) {
//			System.setProperty("webdriver.ie.driver",
//					"C:\\Users\\HP\\eclipse-workspace\\Framework11\\Driver\\chromedriver.exe");

		} else {
			System.out.println("we do not suppert this browser");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
			driver.get(appURL);
		return driver;

	}

	public static void quitBrowser(WebDriver driver) {
		
		driver.quit();

	}

}
