package com.sauce.testCases;

import org.testng.annotations.Test;

import com.sauce.baseClass.baseClass;
import com.sauce.pomClasses.homePage;
import com.sauce.pomClasses.loginPage;
import com.sauce.pomClasses.userInfo_page;
import com.sauce.pomClasses.yourCart_Page;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class userInfo_testCases extends baseClass {
	 loginPage lp;
	 homePage hp;
	 yourCart_Page yc;
	 userInfo_page up;
	
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException, IOException {
		  
			launchThebrowser();
		lp = new loginPage(driver);
		hp = new homePage(driver);
		yc= new yourCart_Page(driver);
		up=new userInfo_page(driver);
		
		
		
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
		  
		  
		  
		boolean clickoncheckoutButton = yc.click_on_checkoutButton(driver);
		 Assert.assertTrue(clickoncheckoutButton);
		  
		  
		  
		  
	  }
	
	
	
	
	
	@Test
  public void f() {
		
		boolean page = up.checkPageTitle();
		Assert.assertTrue(page);
		
		boolean infoUser = up.enterUserInfo(driver);
		Assert.assertTrue(infoUser);
		
		boolean cancel = up.checkForCancelButton();
		Assert.assertTrue(cancel);
		
		boolean submit = up.clickOnContinueButton(driver);
		Assert.assertTrue(submit);
		
		boolean cancelButton = up.clickOnContinueButton(driver);
		Assert.assertTrue(cancelButton);
		
		
  }


}
