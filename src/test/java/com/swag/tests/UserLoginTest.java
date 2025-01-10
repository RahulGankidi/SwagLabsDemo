package com.swag.tests;

import org.testng.annotations.Test;

import com.swag.pages.BasePage;
import com.swag.pages.UserLoginPage;

public class UserLoginTest extends BasePage {
	
	UserLoginPage userloginpage;
	
	@Test
	public void UserLoginTest() {
		test = extent.createTest("UserLogin Test").info("UserLogin Test Execution Started");
		userloginpage = new UserLoginPage(driver, test);
		userloginpage.enteruserName();
		userloginpage.enterPassword();
		userloginpage.clickonLoginButton();
		userloginpage.selectProduct();
		userloginpage.clickonAddtoCart();
		userloginpage.openCart();
		userloginpage.clickonCheckOut();
		userloginpage.enterFirstName();
		userloginpage.enterLastName();
		userloginpage.enterZipCode();
		userloginpage.clickonContinue();
		userloginpage.clickonFinish();
		
		test.info("UserLogin Test Execution Completed Successfully");
	}
}
