package automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutomation {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:.\\Driver\\chromedriver.exe");
	//WebDriver is a interface and chromeDriver is a class,driver is a object
	WebDriver driver = new ChromeDriver();
driver.get("http://www.yahoo.com");
driver.get("http://facebook.com");	
driver.get("http://www.yahoo.com");
driver.manage().window().maximize();
driver.get("http:\\www.google.com");
driver.close();


}	
	
	
	

}
