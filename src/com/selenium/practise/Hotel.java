package com.selenium.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.titleContains("enter"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Public/hotel.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath(""))

	}

}
