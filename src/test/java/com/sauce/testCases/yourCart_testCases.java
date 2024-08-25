package com.sauce.testCases;

import org.testng.annotations.Test;

import com.sauce.baseClass.baseClass;
import com.sauce.pomClasses.homePage;
import com.sauce.pomClasses.loginPage;
import com.sauce.pomClasses.yourCart_Page;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;


public class yourCart_testCases extends baseClass {
	loginPage lp;
	homePage hp;
	yourCart_Page yc;
	
	
	
	@BeforeMethod
	public void before() throws IOException, InterruptedException {
		launchThebrowser();
		 lp=new loginPage(driver);
	hp=new homePage(driver);
	yc=new yourCart_Page(driver);
	
	
	boolean isloggin = lp.userloggedin(driver);
	 Assert.assertTrue(isloggin,"Login should be successful");

	// click on add to cart button //

	boolean atc = hp.clickOnAddToCartButton();
	Assert.assertTrue(atc);

	// checkCartIconIsDisplayed
	boolean atc1 = hp.checkCartIconIsDisplayed(driver);

	Assert.assertTrue(atc1);

	// click on cart icon

	boolean cartIcon = hp.clickOnCartButton();
	Assert.assertTrue(cartIcon);
	
		
	}
	

	@Test
  public void f() {

		 boolean pageTitleDisplay = yc.checkPageTile();
		 Assert.assertTrue(pageTitleDisplay);
		 
		 boolean checkItemName = yc.checkItemNameDisplayed();
		 Assert.assertTrue(checkItemName);
		 
		 boolean checkContinueShopping = yc.checkContinueShoppingButton();
		 Assert.assertTrue(checkContinueShopping);
		 
		 
		 boolean checkRemove = yc.checkRemoveButton();
		 Assert.assertTrue(checkRemove);
		 
		 boolean checkCheckout = yc.checkCheckoutButton();
		 Assert.assertTrue(checkCheckout);
		 
		boolean clickoncheckoutButton = yc.click_on_checkoutButton(driver);
		 Assert.assertTrue(clickoncheckoutButton);
 
  }

}
