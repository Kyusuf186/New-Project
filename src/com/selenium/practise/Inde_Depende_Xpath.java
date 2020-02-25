package com.selenium.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Inde_Depende_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.titleContains("enter"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(" //input[@id='email']")).sendKeys("kyusuf186@gmail.com");
		driver.findElement(By.xpath(" //input[@id='email']")).getSize().getWidth();
		driver.findElement(By.xpath(" //input[@id='email']")).getSize().getHeight();
		String t=driver.findElement(By.xpath(" //input[@id='email']")).getAttribute("value");
		System.out.println(t);
		String f=driver.findElement(By.xpath(" //input[@id='email']")).getCssValue("font-size");
		System.out.println(f);
		System.out.println(driver.findElement(By.xpath(" //input[@id='email']")).getCssValue("font-family"));
		System.out.println(driver.findElement(By.xpath(" //input[@id='email']")).getCssValue("color"));
		//driver.findElement(By.xpath(" //input[@id='email']")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("yusuf786");
		//driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		driver.findElement(By.xpath(" //input[@id='email']")).sendKeys(Keys.CONTROL+"a"+"c");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.CONTROL+ "v");
		driver.findElement(By.xpath("//input[@id='u_0_b']")).sendKeys(Keys.ENTER);
		driver.quit();
	}

}
