package com.samurai.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.samurai.qa.testbase.TestBase;

public class HomePage extends TestBase {
	
	//Page Factory
	@FindBy(xpath="//a[text()='Delete Customer']")
	WebElement deleteCustomerBtn;
	
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement logo;
	
	//initialization
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public boolean validateHomePageLogo() {
		return logo.isDisplayed();
	}
	
	public void navigateToDeleteCustomerPage() {
		deleteCustomerBtn.click();
	}

}
