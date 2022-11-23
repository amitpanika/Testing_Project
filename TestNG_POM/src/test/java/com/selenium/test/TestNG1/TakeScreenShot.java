package com.selenium.test.TestNG1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakeScreenShot {
	@Test
	public void login() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("email")).sendKeys("anhfuifh");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dnidiuh");
//		driver.findElement(By.xpath("//button[contains(text(),'Log in'])")).click();
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File SFile = ts.getScreenshotAs(OutputType.FILE);
//	    File DFile = new File(".//Facebook_ScreenShot\\"+"FaceBook1.png");
//	    FileHandler.copy(SFile,DFile);
	}
}
