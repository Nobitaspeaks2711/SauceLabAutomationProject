package com.sauce.testCases;

import org.testng.annotations.Test;

import com.sauce.baseClass.baseClass;
import com.sauce.pomClasses.finish;
import com.sauce.pomClasses.homePage;
import com.sauce.pomClasses.loginPage;
import com.sauce.pomClasses.overView;
import com.sauce.pomClasses.userInfo_page;
import com.sauce.pomClasses.yourCart_Page;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class finish_testCases extends baseClass {
	loginPage lp;
	homePage hp;
	yourCart_Page yc;
	userInfo_page up;
	overView ov;
	finish fn;
	
	
	  @BeforeMethod
	  public void beforeMethod() throws IOException, InterruptedException {
			launchThebrowser();
			lp = new loginPage(driver);
			hp = new homePage(driver);
			yc = new yourCart_Page(driver);
			up = new userInfo_page(driver);
			ov = new overView(driver);
			fn=new finish(driver);

			boolean isloggin = lp.userloggedin(driver);
			Assert.assertTrue(isloggin, "Login should be successful");

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

			boolean infoUser = up.enterUserInfo(driver);
			Assert.assertTrue(infoUser);

			boolean cancelButton = up.clickOnContinueButton(driver);
			Assert.assertTrue(cancelButton);
			
			boolean clickOnFinish = ov.clickOnFinishButton(driver);
			Assert.assertTrue(clickOnFinish);
			
			
	  }	
	
	
	
	
	@Test
  public void f() {
		
		
		boolean page = fn.checkTitleOfPage();
		Assert.assertTrue(page);
		
		
		boolean thnkU = fn.checkAppropriateThanksYou();
		Assert.assertTrue(thnkU);
		
		
		boolean delMessage = fn.checkAppropriateMessages();
		Assert.assertTrue(delMessage);
		
		boolean menuBar = fn.clickOnMenuBar(driver);
		Assert.assertTrue(menuBar);
		
		boolean allItems =	fn.clickOnAllItems(driver);
		Assert.assertTrue(allItems);
		

		
  }


}
