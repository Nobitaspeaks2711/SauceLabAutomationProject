package com.sauce.pomClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

//	@FindBy(xpath="")private WebElement ;
//	@FindBy(xpath="")private WebElement ;
	@FindBy(xpath="//div[text()='Products']")private WebElement products;
	@FindBy(xpath="(//button[text()='ADD TO CART'])[6]")private WebElement addToCart;
	@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")private WebElement tShirt;
	@FindBy(xpath="//div[@id='shopping_cart_container']")private WebElement addCrt;
	@FindBy(xpath="//div[@class='footer_copy']")private WebElement move;
	
	
	public homePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean checkTitleOfPage() {
		
	return	products.isDisplayed();
		
	}
	
	public boolean checkItemName(WebDriver driver) throws InterruptedException {
		
		Actions a=new Actions(driver);
		Thread.sleep(1500);
		a.moveToElement(move).build().perform();
		
		String act = tShirt.getText();
		String exp="Test.allTheThings() T-Shirt (Red)";
		Assert.assertEquals(act, exp);
		
	
		return true;
	}
	
	
	public boolean clickOnAddToCartButton() {
		
	addToCart.click();
	
	 return true;
	}
	
	public boolean checkCartIconIsDisplayed(WebDriver driver) throws InterruptedException {
		Actions a=new Actions(driver);
		Thread.sleep(1500);
		a.moveToElement(addCrt).build().perform();
		
		
		
	return	addCrt.isDisplayed();
		
	}
	
	
	public boolean clickOnCartButton() {
		
		addCrt.click();
		
		return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
