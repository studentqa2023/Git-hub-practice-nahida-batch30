package com.Genaric;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
public void getProduct() {
	

	WebDriverManager.chromedriver().setup();	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	//to open the browser
	driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");	
	
	WebElement product = driver.findElement(By.xpath("(//*[@id='first'])[2]"));

	Select sc = new Select(product);
	sc.selectByVisibleText("Iphone");
    sc.selectByIndex(3);
   sc.selectByValue("Google");
}	

public static void main(String[] args) {
	DropDown obj = new DropDown();
	obj.getProduct();
}

}	
	
	
	
	
	


