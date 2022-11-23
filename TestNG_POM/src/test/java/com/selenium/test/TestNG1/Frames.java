package com.selenium.test.TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {
	public static WebDriver driver;
	
	@BeforeTest
	public void Driver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
	}
	@Test
	public void Frame_Function() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("Amit");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("24");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("25");
		Thread.sleep(2000);
		driver.close();
		
		}
	
	

}
