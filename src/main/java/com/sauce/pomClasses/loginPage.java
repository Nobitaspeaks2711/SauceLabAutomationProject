package com.sauce.pomClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

	
	@FindBy(xpath="//input[@id='user-name']")private WebElement id ;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginButton;
	@FindBy(xpath="//div[@class='login_logo']")private WebElement logo ;
//	@FindBy(xpath="")private WebElement ;
//	@FindBy(xpath="")private WebElement ;
	
	
	public loginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String getTitleOfLoginPage(WebDriver driver) {
	    return driver.getTitle();
	}
	
	public boolean validateLogo() {
		
	return	logo.isDisplayed();
		
	}
	
	public boolean userloggedin(WebDriver driver)
	{
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		w.until(ExpectedConditions.elementToBeClickable(id)).sendKeys("standard_user");
		w.until(ExpectedConditions.elementToBeClickable(password)).sendKeys("secret_sauce");
		w.until(ExpectedConditions.elementToBeClickable(loginButton)).click();;
		return true;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
