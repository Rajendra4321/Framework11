package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcaseswithoutframwork {

	@SuppressWarnings("deprecation")
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Framework11\\Driver\\chromedriver.exe");
		// open the url
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/");
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Tester");
		
		//enter PWD
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test234");
	
		//click on login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.quit();
		
	}
	
	}
