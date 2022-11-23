package com.selenium.test.TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	/*
	 *    Without page Factory.........................................
	 */

	public static void main(String[] args) {
		
    // Launch ChromeBrowser.............................................
    
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				// Create Object of LoginPage...........................
				
				LoginPage Loginpg = new LoginPage(driver);
				
				// Open URL
				driver.get("https://www.saucedemo.com/");
				Loginpg.enterUsename("problem_user");
				Loginpg.enterPassword("secret_sauce");
				Loginpg.clickOnLoginBtn();
	}

}
