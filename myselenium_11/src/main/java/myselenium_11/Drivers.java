package myselenium_11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Drivers {
	public static WebDriver getdriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\training_d2.03.07\\Desktop\\Sumit Wankhede\\Selenium Softwares\\Selenium Softwares\\SeleniumDrivers\\chromedriver.exe");
			return new ChromeDriver();}
		else if (browser.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver","C:\\Users\\training_d2.03.07\\Desktop\\Sumit Wankhede\\Selenium Softwares\\Selenium Softwares\\SeleniumDrivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else {
			System.out.println("wrong option");
			return null;
		}
		
		
		
	}

}
