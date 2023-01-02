package com.Genaric;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeBaseLogin01 {
public void getlogin() {
	
	System.setProperty("webdriver. chrome.driver", "./Driver/chromedriver.exe");
	//open the browser
WebDriver driver = new ChromeDriver();//up casting
//go to the URL
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();


// maximize windows
driver.manage().window().maximize();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//enter the username in the username field//click
driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
//enter the the password in the password field
driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
//click on login button
driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//click on dropdown button
driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']")).click();
//click on logout button
driver.findElement(By.xpath("(//*[@class='oxd-userdropdown-link'])[4]")).click();

}	
	
	

}
