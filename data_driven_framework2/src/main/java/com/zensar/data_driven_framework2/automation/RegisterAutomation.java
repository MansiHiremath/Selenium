package com.zensar.data_driven_framework2.automation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.zensar.data_driven_framework2.beans.RegisterPage;
import com.zensar.data_driven_framework2.util.DriverFactory;

public class RegisterAutomation {
	public static void fillTheRegisterForm(RegisterPage registerPage) {
	WebDriver driver=DriverFactory.getWebDriver();
	String url="http://sdettraining.com/trguitransactions/AccountManagement.aspx";
	driver.get(url);
	
	WebElement createAccountButton=driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a"));
	createAccountButton.click();

	WebElement enterName = driver.findElement(By.id("MainContent_txtFirstName"));
	WebElement enterEmail = driver.findElement(By.id("MainContent_txtEmail"));
	WebElement enterPhoneNumber = driver.findElement(By.id("MainContent_txtHomePhone"));
	WebElement enterPassword = driver.findElement(By.id("MainContent_txtPassword"));
	WebElement reenterPassword = driver.findElement(By.id("MainContent_txtVerifyPassword"));
	WebElement maleGender = driver.findElement(By.id("MainContent_Male"));
	WebElement femaleGender = driver.findElement(By.id("MainContent_Female"));
	WebElement selectCountry = driver.findElement(By.id("MainContent_menuCountry"));
	Select countrySelectBox=new Select(selectCountry);
	WebElement weeklyWebElement=driver.findElement(By.id("MainContent_checkWeeklyEmail"));
	WebElement monthlyWebElement=driver.findElement(By.id("MainContent_checkMonthlyEmail"));
	WebElement occasionalWebElement=driver.findElement(By.id("MainContent_checkUpdates"));
	
	enterName.sendKeys(registerPage.getName());
	enterEmail.sendKeys(registerPage.getEmail());
	enterPhoneNumber.sendKeys(registerPage.getPhone());
	enterPassword.sendKeys(registerPage.getPassword());
	//reenterPassword.sendKeys(verifyPassword);
	if (registerPage.getGender().equalsIgnoreCase("female")) {
		femaleGender.click();
	} 
	else if(registerPage.getGender().equalsIgnoreCase("male")) {
		maleGender.click();
	}
	countrySelectBox.selectByValue(registerPage.getCountry());
	//countrySelectBox.selectByVisibleText(country);
	
	if(registerPage.getWeeklyEmail().equalsIgnoreCase("true"))
	{
		weeklyWebElement.click();
	}
	if(registerPage.getMonthlyEmail().equalsIgnoreCase("true")) {
		monthlyWebElement.click();
	}
	if(registerPage.getOccassionalEmail().equalsIgnoreCase("true")) {
		occasionalWebElement.click();
	}
	
	/*
	 * // Step5: Click on SUBMIT button
	 * 
	 * WebElement submitButton=driver.findElement(By.id("MainContent_btnSubmit"));
	 * submitButton.click(); // Step6: Printing the result WebElement
	 * resultWebElement=driver.findElement(By.id("MainContent_lblTransactionResult")
	 * ); String result=resultWebElement.getText();
	 * System.out.println("Result is: "+result);
	 */
}
}
