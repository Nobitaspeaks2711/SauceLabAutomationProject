package com.sauce.pomClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class overView {

	//div[text()='Checkout: Overview']
	
	
	@FindBy(xpath="//div[text()='Checkout: Overview']")private WebElement overView;
	@FindBy(xpath="(//div[text()='15.99'])[1]")private WebElement prize;
	@FindBy(xpath="//a[text()='CANCEL']")private WebElement cancel;
	@FindBy(xpath="//a[text()='FINISH']")private WebElement finish;
//	@FindBy(xpath="")private WebElement ;
//	@FindBy(xpath="")private WebElement ;
	
	
public overView(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean checkPageTitle() {
		return overView.isDisplayed();
	}
	
	public boolean checkPrizeOfItem() {
		String actP = prize.getText();
		String expP = "$15.99";
		
		Assert.assertEquals(actP,expP);
		
		return true;
		
	}
	
	
	public boolean checkCancelButton() {
		return cancel.isDisplayed();
	}
	
	public boolean checkFinishButton() {
		return finish.isDisplayed();
	}
	
	
	public boolean clickOnFinishButton(WebDriver driver) {
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		w.until(ExpectedConditions.elementToBeClickable(finish)).click();;
		return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
