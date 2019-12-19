package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactoryTraining {
public static WebDriver getWebDriver() {
	System.setProperty("webdriver.chrome.driver","D:\\selenium_drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	return driver;

}
}
