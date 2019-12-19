package Day2.smoketests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.DriverFactoryTraining;



// TestNG Assertions in continuation of the previous example 
public class TestNGExample2 {

	@Test
	public void loginFunctionalityTest() {

WebDriver driver=DriverFactoryTraining.getWebDriver();
//logic of login
String url="http://sdettraining.com/trguitransactions/AccountManagement.aspx";
driver.get(url);


String email="hiremathmansi1548@gmail.com";
String password="mansi";

WebElement emailWebElement=driver.findElement(By.id("MainContent_txtUserName"));
WebElement passwordWebElement=driver.findElement(By.id("MainContent_txtPassword"));
WebElement loginButtonWebElement=driver.findElement(By.id("MainContent_btnLogin"));

emailWebElement.sendKeys(email);
passwordWebElement.sendKeys(password);
loginButtonWebElement.click();



	}
}