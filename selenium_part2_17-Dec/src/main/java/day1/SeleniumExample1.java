package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Write the Login Automation here
public class SeleniumExample1 {
	public static void main(String[] args) {
		// Step1: Set the System property for webdriver chrome driver, and Open the web-browser
System.setProperty("webdriver.chrome.driver","D:\\selenium_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Step2: Open the the web-application URL: http://sdettraining.com/trguitransactions/AccountManagement.aspx
	driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		// Step3: Enter email address
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("hiremathmansi1548@gmail.com");

		// Step4: Enter password
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys("mansi");
		
		// Step5: Click on LOGIN button
		driver.findElement(By.id("MainContent_btnLogin")).click();
		
		
	}
}
