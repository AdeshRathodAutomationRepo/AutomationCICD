package Automation.MAZAD;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.Base;
import pageObjects.HomePage;
import pageObjects.SignUpPage;
import utils.Utilities;

public class login extends Base{
	
	SignUpPage signUpPage;
	
	public login() {
		super();
	}
	
	public WebDriver driver;

	@Test
	public void verifyLogin() {
		driver= init_browser(prop.getProperty("browser"));
		driver.close();
//		HomePage homePage = new HomePage(driver);
//		Assert.assertTrue(homePage.validateMazad());
//		SignUpPage signUpPage= homePage.clickOnSignUpBtn();
//		Assert.assertTrue(signUpPage.validateSignUpWindow());
		
	}
	
	@DataProvider(name="sampleData")
	public Object[][] supplyTestData() {
		Object[][] data= Utilities.getTestDataFromExcel("Sheet1");
		return data;
	}
}
