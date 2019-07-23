package mydemo_01.mydemo_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDriver123 {

	public static WebDriver getDriver(String browser){
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
			return new InternetExplorerDriver();
		}
		else if(browser.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
			return new FirefoxDriver();
		}
		return null;

	}

}
