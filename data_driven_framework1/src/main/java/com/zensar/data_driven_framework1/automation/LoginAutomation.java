package com.zensar.data_driven_framework1.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.zensar.data_driven_framework1.beans.LoginPage;
import com.zensar.data_driven_framework1.util.DriverFactory;

public class LoginAutomation {
public static void fillTheLoginForm(LoginPage loginPage) {
	//write the selenium code to open the browser and fill the login form
	System.out.println("Email "+loginPage.getEmail());
	System.out.println("Password "+loginPage.getPassword());

	WebDriver driver=DriverFactory.getWebDriver();
	String url="http://sdettraining.com/trguitransactions/AccountManagement.aspx";
	driver.get(url);
	WebElement emailWebElement=driver.findElement(By.id("MainContent_txtUserName"));
	WebElement passwordWebElement=driver.findElement(By.id("MainContent_txtPassword"));
	emailWebElement.sendKeys(loginPage.getEmail());
	passwordWebElement.sendKeys(loginPage.getPassword());
}
}
