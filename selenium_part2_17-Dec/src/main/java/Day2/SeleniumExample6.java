package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.DriverFactoryTraining;

// Using Variables to Parameterize data in example 4. Now implement all the fields
// including radio button, select box , and check-boxes
public class SeleniumExample6 {
	public static void main(String[] args) {
		// Step1: Set the System property for webdriver chrome driver, and Open the
		// web-browser
		WebDriver driver = DriverFactoryTraining.getWebDriver();

		// Step2: Open the the web-application URL:
		// http://sdettraining.com/trguitransactions/AccountManagement.aspx
		String url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
		driver.get(url);

		// Step3: Click on the CREATE ACCOUNT button
		WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a"));
		createAccountButton.click();
		// Step4: Fill values in the fields Name, Email, Phone, Password, VerifyPassword
		// (Skip the fields: Gender, Country, and Subscriptions )

		// declaring variables for fields
		String name = "Vinay";
		String email = "vinay@gmail.com";
		String phone = "7030452256";
		String password = "vinay";
		String verifyPassword = "vinay";
		String gender = "male";
		String country = "India";
		String weeklyEmail="true";
		String monthlyEmail="true";
		String occassionalEmail="false";

		// creating WebElement variables
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
		
		

		enterName.sendKeys(name);
		enterEmail.sendKeys(email);
		enterPhoneNumber.sendKeys(phone);
		enterPassword.sendKeys(password);
		reenterPassword.sendKeys(verifyPassword);
		if (gender.equalsIgnoreCase("female")) {
			femaleGender.click();
		} 
		else if(gender.equalsIgnoreCase("male")) {
			maleGender.click();
		}
		countrySelectBox.selectByValue(country);
		//countrySelectBox.selectByVisibleText(country);
		
		if(weeklyEmail.equalsIgnoreCase("true"))
		{
			weeklyWebElement.click();
		}
		if(monthlyEmail.equalsIgnoreCase("true")) {
			monthlyWebElement.click();
		}
		if(occassionalEmail.equalsIgnoreCase("true")) {
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
