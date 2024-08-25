package com.sauce.pomClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class userInfo_page {

	
	
	@FindBy(xpath="//div[text()='Checkout: Your Information']")private WebElement pageTitle;
	@FindBy(xpath="//input[@id='first-name']")private WebElement fn;
	@FindBy(xpath="//input[@id='last-name']")private WebElement ln;
	@FindBy(xpath="//input[@id='postal-code']")private WebElement zipCode;
	@FindBy(xpath="//a[text()='CANCEL']")private WebElement cancel;
	@FindBy(xpath="//input[@type='submit']")private WebElement submit ;
	
	public userInfo_page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean checkPageTitle() {
		
		return pageTitle.isDisplayed();
		
	}
	
	public boolean enterUserInfo(WebDriver driver) {
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		w.until(ExpectedConditions.elementToBeClickable(fn)).sendKeys("Vaibhav");
		w.until(ExpectedConditions.elementToBeClickable(ln)).sendKeys("Auti");
		w.until(ExpectedConditions.elementToBeClickable(zipCode)).sendKeys("414003");
		return true;
	}
	
	
	public boolean checkForCancelButton() {
	return	cancel.isDisplayed();
	}
	
	
	public boolean checkForContinueButton() {
	return	submit.isDisplayed();
	}
	
	public boolean clickOnContinueButton(WebDriver driver) {
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		w.until(ExpectedConditions.elementToBeClickable(submit)).click();;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
