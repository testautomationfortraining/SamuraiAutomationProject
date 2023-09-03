package com.samurai.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.samurai.qa.pages.HomePage;
import com.samurai.qa.pages.LoginPage;
import com.samurai.qa.testbase.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
	}
	
	@Test(priority=1)
	public void validateLoginPageTitle() {
		String actualTitle=loginPage.validateTitle();
		Assert.assertEquals(actualTitle, "Guru99 Bank Home Page");
	}

	@Test(priority=2)
	public void validateLoginPageLogo() {
		Assert.assertTrue(loginPage.validateLogo());
	}
	
	@Test(priority=3)
	public void loginToApp() {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
