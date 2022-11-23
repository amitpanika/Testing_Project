package com.selenium.test.TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POM {

	public static void main(String[] args) {
		
		 
		/*
		 * This is Login without page model method..............................................
		*/
		
		// launch ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Open URL
		driver.get("https://www.saucedemo.com/");
	    
		// find and enter UserName 
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		
		// find and enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//find and click on login button
		driver.findElement(By.id("login-button")).click();

	}

}
