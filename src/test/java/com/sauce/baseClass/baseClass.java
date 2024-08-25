package com.sauce.baseClass;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;



import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	protected WebDriver driver;

	public void launchThebrowser() throws IOException  {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions c=new ChromeOptions();
		
		c.addArguments("--incognito");

		driver = new ChromeDriver(c);

		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Reporter.log("Open the web application", true);

	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {

			try {

				TakesScreenshot screenshot = (TakesScreenshot) driver;
				File src = screenshot.getScreenshotAs(OutputType.FILE);

				String timestamp = new SimpleDateFormat("yyyy-MM-dd--hh-mm").format(new Date());

				FileUtils.copyFile(src, new File(".\\screenshot\\" + " " + timestamp + ".png"));

			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}

		}

	}

}
