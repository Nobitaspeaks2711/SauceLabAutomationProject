package com.sauce.pomClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class yourCart_Page {

	
	@FindBy(xpath="//div[text()='Your Cart']")private WebElement yourCart;
	@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")private WebElement itemName;                                  
	@FindBy(xpath="//a[text()='Continue Shopping']")private WebElement continueShopping;
	@FindBy(xpath="//button[text()='REMOVE']")private WebElement remove;
	@FindBy(xpath="//a[text()='CHECKOUT']")private WebElement checkout;
	//@FindBy(xpath="")private WebElement ;
	
	public yourCart_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean checkPageTile() {
		return yourCart.isDisplayed();
	}
	
	public boolean checkItemNameDisplayed() {
		return itemName.isDisplayed();
	}
	
	public boolean checkContinueShoppingButton() {
		return continueShopping.isDisplayed();
	}
	
	public boolean checkRemoveButton() {
		return remove.isDisplayed();
	}
	
	public boolean checkCheckoutButton() {
		return checkout.isDisplayed();
	}
	
	public boolean click_on_checkoutButton(WebDriver driver) {
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		w.until(ExpectedConditions.elementToBeClickable(checkout)).click();;
		return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
