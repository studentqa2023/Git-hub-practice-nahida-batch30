package com.Genaric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory(WebDriver driver) {
	PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(xpath="//*[@ name='username']")
	private WebElement username;
	@FindBy(xpath="//*[@ name='password']")
   private WebElement password;
	@FindBy(xpath="//*[@ class='oxd-form-actions orangehrm-login-action']")
   private WebElement login;
	@FindBy(xpath="//*[@class='oxd-userdropdown-name']")
	private WebElement dropdown;
	@FindBy(xpath="(//*[@class='oxd-userdropdown-link'])[4]")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}

	
	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUsername() {
		return username;
	}

}
