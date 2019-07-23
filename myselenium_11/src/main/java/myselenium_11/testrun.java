package myselenium_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class testrun {
	public WebDriver driver;
	public String browser="chrome";
	
	
		
	
@BeforeTest
		public void openBrowser()throws InterruptedException{
			driver=Drivers.getdriver(browser);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("http://www.google.com");
			Thread.sleep(2000);		
	
		}	
@Test
public void testcase2() {
	driver.get("http://www.drikpanchang.com/");
	Actions mouse =new Actions(driver);
	WebElement panchang=driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/a"));
	mouse.moveToElement(panchang).perform();
	driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/div[2]/div[1]/a[3]")).click();
	
}
	
}