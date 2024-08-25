package com.sauce.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.baseClass.baseClass;
import com.sauce.pomClasses.loginPage;

public class login_testCases extends baseClass{
 
	loginPage lp;
	
	
	@BeforeMethod
	public void before() throws IOException {
		launchThebrowser();
	 lp=new loginPage(driver);
		
	}
	
	
	
	
	@Test
  public void f() {
		String tit= lp.getTitleOfLoginPage(driver);
		 Assert.assertEquals(tit, "Swag Labs");
		 
		 //validate logo
		 boolean logo = lp.validateLogo();
		 
		 Assert.assertTrue(logo,"Logo should be successful");
		 
		 //user logged in using valid id password
		 
		 boolean isLoginSuccessfull = lp.userloggedin(driver);
		 
		 Assert.assertTrue(isLoginSuccessfull,"Login should be successful");
		
			
		
  }
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(8000);
		driver.quit();
		
	}
}
