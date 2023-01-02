package com.Genaric;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	public void getDriver() {
		
	//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");	
	WebDriverManager.chromedriver().setup();
	//ChromeOptions chromeOptions = new ChromeOptions();
	//chromeOptions.addArguments("--headless");
	
	//to open the browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.navigate().to("https://www.google.com/")
	driver.navigate().to("https://www.costco.com/");
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='Home_Ancillary_5']"))));

	Actions ac = new Actions(driver);
	//ac.contextClick().perform();
	ac.moveToElement(driver.findElement(By.xpath("//*[@id='Home_Ancillary_5']"))).build().perform();
	
   // driver.findElement(By.className("gLFyf")).sendKeys("England");
	//driver.navigate().to("Username");
    
   // driver.navigate().to("Password");
	}
   public static void main(String[] args) { 
		DriverManager obj = new DriverManager();
		obj.getDriver();
	
   
   }

}
	


