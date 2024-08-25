package com.sauce.testCases;

import org.testng.annotations.Test;

import com.sauce.baseClass.baseClass;
import com.sauce.pomClasses.homePage;
import com.sauce.pomClasses.loginPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class homePage_TestCases extends baseClass {

	homePage hp;
	loginPage lp;

	@BeforeMethod
	public void beforeMethod() throws IOException {
		launchThebrowser();

		lp = new loginPage(driver);
		hp = new homePage(driver);

	}

//	@Test (priority = -2)
//	public void userlogin() {
//
//		boolean isLoginSuccessfull = lp.userloggedin(driver);
//
//		Assert.assertTrue(isLoginSuccessfull, "Login should be successful");
//
//	}

	@Test (priority = -1)

	public void allInHomePage() throws InterruptedException {

		boolean isLoginSuccessfull = lp.userloggedin(driver);

		Assert.assertTrue(isLoginSuccessfull, "Login should be successful");
	Thread.sleep(2500);
		// check title
//		boolean isDisplayed = checkTitleOfPage();
//        Assert.assertTrue(isDisplayed, "The title of the page is not displayed as expected.");

		// check item name
             boolean itemName = hp.checkItemName(driver);
	Assert.assertTrue(itemName);

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

	





}
