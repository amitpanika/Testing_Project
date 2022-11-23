package com.selenium.test.TestNG1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Auto_It {
	
	@Test
	public void Auto() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uploadnow.io/?utm_source=gads&utm_medium=en&gclid=Cj0KCQiA37KbBhDgARIsAIzce16DKKTRmUEzdhme70P3R1h1reBhPF1lLxTdgDuWABurCUNwmg2ts4MaAgrZEALw_wcB");
		driver.findElement(By.className("buttons_btn__k25BR buttons_primary__Vxg9y buttons_lg__DFbOG common_anim_shake__7VVs8"));
	    Runtime.getRuntime().exec("C:\\Users\\HP\\Downloads");
	    Thread.sleep(3000);
	    driver.close();
	
	}

}
