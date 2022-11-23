package com.selenium.test.TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_Reg_Login {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("anhfuifh");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dnidiuh");
		driver.findElement(By.xpath("//button[contains(text(),'Log in'])")).click();
		driver.findElement(By.cssSelector("input#pass")).sendKeys("hdudna");
		driver.findElement(By.partialLinkText("Forgetton")).click();
		System.out.println("working fine");
}
}