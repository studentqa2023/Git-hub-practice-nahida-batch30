package com.Genaric;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.BaseConfig;
import com.utilities.Highliter;
import com.utilities.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeBaseLogin {

public void getLogin() {
	
//system.setProperty("package name","driver path");	
//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();//Up casting
//open the browser &pass the URL

//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
driver.navigate().to(BaseConfig.getConfigValue("URL"));
//to maximize the window
driver.manage().window().maximize();
//Create an object for MasterPagefactory class
MasterPageFactory mpf = new MasterPageFactory(driver);

//wait till the login button visable/loaded/enable
//using expicite wait
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.elementToBeClickable(mpf.getLogin()));

//Create an object for MasterPagefactory class
// MasterPageFactory mpf = new MasterPageFactory(driver);

//To Highlight the user name field;
Highliter.addColor(driver, mpf.getUsername());
//enter the user name in the user name field
mpf.getUsername().sendKeys(BaseConfig.getConfigValue("Username"));

//To highlight password field
Highliter.addColor(driver, mpf.getPassword());
//enter the password in the password field
mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));

//To highlight login field
Highliter.addColor(driver, mpf.getLogin());
//click on login
mpf.getLogin().click();

wait.until(ExpectedConditions.elementToBeClickable(mpf.getDropdown()));

//Screenshot of the Website after login
Screenshot.getScreenShot(driver, "After_Login");

//To highlight drop down button
Highliter.addColor(driver, mpf.getDropdown());
//click on drop down button
mpf.getDropdown().click();

//To highlight logout button
Highliter.addColor(driver, mpf.getLogout());
//click on logout
mpf.getLogout().click();
if (mpf.getLogout().isDisplayed()) {
	System.out.println("Login successful");
	
 }else {
	 System.out.println("Logout fail");
 }
//Screenshots of the website after logout
Screenshot.getScreenShot(driver, "After_Logout");
//driver.close();//close the current windows only
//driver.quit();//close the whole program

}	



}
