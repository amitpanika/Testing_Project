package com.selenium.test.TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Double_Click {
	
	@Test
	public void Action () {
		
		        // launch Chrome browser
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				// Maximize browser
				
				driver.manage().window().minimize();
				
				// Open Url
				
				driver.get("https://demoqa.com/buttons");
				
				// find element 
				
				WebElement element = driver.findElement(By.id("doubleClickBtn"));
				Actions act = new Actions(driver);
				act.contextClick(element).perform();
		
	}

}
