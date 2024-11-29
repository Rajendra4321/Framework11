package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	WebDriver driver;
	
	public Loginpage(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	
	@FindBy(xpath ="//input[@name='username']")WebElement un;
	@FindBy(xpath ="//input[@name='password']") WebElement pwd;
	@FindBy(xpath ="//input[@type='submit']") WebElement btn;
	
	
	public void loginToCRM(String userapplication, String passwordapplication) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		un.sendKeys(userapplication);
		pwd.sendKeys(passwordapplication);
		btn.click();
	}
}
