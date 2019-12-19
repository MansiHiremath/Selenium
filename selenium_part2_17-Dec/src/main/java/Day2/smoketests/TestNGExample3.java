package Day2.smoketests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.DriverFactoryTraining;
// TestNG Annotations in continuation of the previous example, creating @BeforeMethod and @AfterMethod
public class TestNGExample3 {
	WebDriver driver;

	@Test
	public void loginFunctionalityTest() {
		String email="hiremathmansi1548@gmail.com";
		String password="mansi";

		WebElement emailWebElement=driver.findElement(By.id("MainContent_txtUserName"));
		WebElement passwordWebElement=driver.findElement(By.id("MainContent_txtPassword"));
		WebElement loginButtonWebElement=driver.findElement(By.id("MainContent_btnLogin"));
Assert.assertNotNull(emailWebElement);
Assert.assertNotNull(passwordWebElement);
		emailWebElement.sendKeys(email);
		passwordWebElement.sendKeys(password);
		loginButtonWebElement.click();




	}

	@BeforeMethod
	public void setupTestEnv() {
		driver=DriverFactoryTraining.getWebDriver();
		//logic of login
		String url="http://sdettraining.com/trguitransactions/AccountManagement.aspx";
		driver.get(url);
	

	}

	@AfterMethod
	public void tearDownTestEnv() {
		System.out.println("Now closing the browser");
		driver.close();
	}
}