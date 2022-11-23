package com.selenium.test.TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    /*
     *   Without page Factory............................................
     */

public class LoginPage {

	WebDriver driver;
	
	LoginPage(WebDriver d)
	{
		driver= d;
	}
	
	By username = By.id("user-name");
	By password = By.id("password");
	By Loginbtn = By.id("login-button");
	
	/*
	 *  Method..............................................................
	 */
	
	public void enterUsename(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLoginBtn()
	{
		driver.findElement(Loginbtn).click();
	}
	
	
}
