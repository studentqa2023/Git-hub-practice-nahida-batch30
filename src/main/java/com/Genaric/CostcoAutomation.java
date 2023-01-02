package com.Genaric;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CostcoAutomation {

	public static void productHandle() {
		WebDriverManager.chromedriver().setup();
		
		//go to https://www.costco.com/	
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.costco.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//get the page page name=>get title()
		driver.getTitle();	
		System.out.println("Home page title/name = "+driver.getTitle());
		//check the current URL is matched or not()
		//Expection = ("https://www.costco.com/"),Actual= driver.getCurrentUrl()
		driver.getCurrentUrl();
		System.out.println("Current page URl = "+driver.getCurrentUrl());
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(driver.getCurrentUrl(), ("https://www.costco.com/"));
		
		sf.assertAll();
	}
	public static void main(String[] args) {
		
		CostcoAutomation.productHandle();	
		
	}
}
