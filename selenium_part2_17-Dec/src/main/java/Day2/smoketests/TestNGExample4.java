package Day2.smoketests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.DriverFactoryTraining;
// write TestNG code for testing login functionality
public class TestNGExample4 {

	WebDriver driver;
	
	@Test
	public void createAccountFunctionalityTest() {
		WebElement createAccountButton=driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a"));
		createAccountButton.click();
		// declaring variables for fields
				String name="Vinay";
				String email="vinay@gmail.com";
				String phone="7030452256";
				String password="vinay";
				String verifyPassword="vinay";
				String gender = "male";
				String country = "India";
				String weeklyEmail="true";
				String monthlyEmail="true";
				String occassionalEmail="false";
					
					//creating WebElement variables
					WebElement enterName=driver.findElement(By.id("MainContent_txtFirstName"));
					WebElement enterEmail=driver.findElement(By.id("MainContent_txtEmail"));
					WebElement enterPhoneNumber=driver.findElement(By.id("MainContent_txtHomePhone"));
					WebElement enterPassword=driver.findElement(By.id("MainContent_txtPassword"));
					WebElement reenterPassword=driver.findElement(By.id("MainContent_txtVerifyPassword"));
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

				
			
				// Step5: Click on SUBMIT button
			
				WebElement submitButton=driver.findElement(By.id("MainContent_btnSubmit"));
				submitButton.click();
				// Step6: Printing the result
				WebElement resultWebElement=driver.findElement(By.id("MainContent_lblTransactionResult"));
				String result=resultWebElement.getText();
				System.out.println("Result is: "+result);
				

		
	}
	
	@BeforeMethod
	public void setupEnv() {
		driver=DriverFactoryTraining.getWebDriver();
		String url="http://sdettraining.com/trguitransactions/AccountManagement.aspx";
		driver.get(url);

		
	}
	
	@AfterMethod
	public void tearDown() {
	System.out.println("Now closing the browser");
	driver.close();
		
	}
}
