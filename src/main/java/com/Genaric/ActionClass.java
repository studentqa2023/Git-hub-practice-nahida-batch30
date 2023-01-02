package com.Genaric;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	
	
	
	public static void main(String[] args) {
		DriverManager obj = new DriverManager();
		obj.getDriver();
		
		
		WebDriverManager.chromedriver().setup();	
		//to open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.spicejet.com/");
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));	
		
		//Actions ac = new Actions(driver);
		//ac.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		
		
	}

}
