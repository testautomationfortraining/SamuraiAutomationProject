package com.samurai.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.samurai.qa.pages.HomePage;
import com.samurai.qa.pages.LoginPage;
import com.samurai.qa.testbase.TestBase;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void validateHomePageLogo() {
		Assert.assertTrue(homePage.validateHomePageLogo());
	}
	
	@Test(priority=2)
	public void clickDeleteCustomerBtn() {
		homePage.navigateToDeleteCustomerPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
