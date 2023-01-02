package com.Genaric;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		//DriverManager obj = new DriverManager();
		
		
		WebDriverManager.chromedriver().setup();	
		//to open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://jqueryui.com/droppable/");
		Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='draggable']]"))));	
		driver.switchTo().frame(0);
		Actions ac = new Actions(driver);
ac.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
.release()
.build()
.perform();		
		
		
		
	}
	
	
	
	
	
	

}
