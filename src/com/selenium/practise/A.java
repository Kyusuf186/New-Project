package com.selenium.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:/Users/ux011755/Downloads/selenium/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		

		//Now you can Initialize marionette driver to launch firefox
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		//WebDriver driver = new MarionetteDriver(capabilities); 
	
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		String URl=driver.getCurrentUrl();
		System.out.println(URl);
		driver.manage().window().maximize();
		
	}

}
