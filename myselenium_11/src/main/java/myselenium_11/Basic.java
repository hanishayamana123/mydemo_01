package myselenium_11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic {
	@Test
	
	public void testCase() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_d2.03.07\\Desktop\\Sumit Wankhede\\Selenium Softwares\\Selenium Softwares\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
