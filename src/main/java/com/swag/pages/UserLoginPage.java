package com.swag.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class UserLoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest test;
	
	public UserLoginPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.test = test;
	}
	
	By EnterUserName = By.id("user-name");
	By EnterPassword = By.id("password");
	By ClickLoginButton = By.id("login-button");
	By SelectProduct = By.xpath("(//*[@class=\"inventory_item_name \"])[2]");
	By ClickAddtoCart = By.id("add-to-cart");
	By OpenCart = By.xpath("//*[@class=\"shopping_cart_link\"]");
	By ClickCheckout = By.xpath("//*[@class=\"btn btn_action btn_medium checkout_button \"]");
	By Firstname = By.id("first-name");
	By Lastname = By.id("last-name");
	By Zipcode = By.id("postal-code");
	By ClickContinue = By.id("continue");
	By ClickFinish = By.id("finish");
	
	public void enteruserName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement usernameElement = wait.until(ExpectedConditions.elementToBeClickable(EnterUserName));
		usernameElement.click();
		usernameElement.sendKeys("standard_user");
		test.pass("Entered UserName");
	}
	public void enterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(EnterPassword));
		passwordElement.click();
		passwordElement.sendKeys("secret_sauce");
		test.pass("Entered Password");
	}
	public void clickonLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(ClickLoginButton));
		loginElement.click();
		test.pass("Clicked on Login Button");
	}
	public void selectProduct() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement productElement = wait.until(ExpectedConditions.elementToBeClickable(SelectProduct));
		productElement.click();
		test.pass("Selected Product");
	}
	public void clickonAddtoCart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement addtocartElement = wait.until(ExpectedConditions.elementToBeClickable(ClickAddtoCart));
		addtocartElement.click();
		test.pass("Clicked on AddtoCart");
	}
	public void openCart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cartElement = wait.until(ExpectedConditions.elementToBeClickable(OpenCart));
		cartElement.click();
		test.pass("Opened Cart");
	}
	public void clickonCheckOut() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement checkoutElement = wait.until(ExpectedConditions.elementToBeClickable(ClickCheckout));
		checkoutElement.click();
		test.pass("Clicked on CheckOut");
	}
	public void enterFirstName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement firstnameElement = wait.until(ExpectedConditions.elementToBeClickable(Firstname));
		firstnameElement.click();
		firstnameElement.sendKeys("Ravi");
		test.pass("Entered FirstName");
	}
	public void enterLastName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement lastnameElement = wait.until(ExpectedConditions.elementToBeClickable(Lastname));
		lastnameElement.click();
		lastnameElement.sendKeys("Rao");
		test.pass("Entered LastName");
	}
	public void enterZipCode() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement zipcodeElement = wait.until(ExpectedConditions.elementToBeClickable(Zipcode));
		zipcodeElement.click();
		zipcodeElement.sendKeys("CH41FT");
		test.pass("Entered ZipCode");
	}
	public void clickonContinue() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement continueElement = wait.until(ExpectedConditions.elementToBeClickable(ClickContinue));
		continueElement.click();
		test.pass("Clicked on Continue");
	}
	public void clickonFinish() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement finishElement = wait.until(ExpectedConditions.elementToBeClickable(ClickFinish));
		finishElement.click();
		test.pass("Clicked on Finish");
	}
	
}