package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kyusuf186@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("yusuf786");
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		driver.quit();
		
	}

}
