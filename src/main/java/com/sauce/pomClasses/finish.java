package com.sauce.pomClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class finish {

	//div[text()='Finish']
	
	
	@FindBy(xpath="//div[text()='Finish']")private WebElement finish;
	@FindBy(xpath="//h2[@class='complete-header']")private WebElement thankYou;
	@FindBy(xpath="//div[@class='complete-text']")private WebElement messages;
	@FindBy(xpath="//div[@class='bm-burger-button']")private WebElement menu;
	@FindBy(xpath="//a[text()='All Items']")private WebElement allItems;	
	
	public finish(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean checkTitleOfPage() {
		String act = finish.getText();
		String exp="Finish";
		
		Assert.assertEquals(act, exp);
		
		return true;
	}
	
	public boolean checkAppropriateThanksYou() {
		String act = thankYou.getText();
		String exp="THANK YOU FOR YOUR ORDER";
		
		Assert.assertEquals(act, exp);
		
		return true;
		
	}
	
	
	
	public boolean checkAppropriateMessages() {
		String act = messages.getText();
		String exp="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		
		Assert.assertEquals(act, exp);
		
		return true;
		
	}
	
	
	public boolean clickOnMenuBar(WebDriver driver) {
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		w.until(ExpectedConditions.elementToBeClickable(menu)).click();;
		return true;
		
		
	}
	
	public boolean clickOnAllItems(WebDriver driver) {
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		w.until(ExpectedConditions.elementToBeClickable(allItems)).click();;
		return true;
	}
	
	
	
	
	
	
	
}
