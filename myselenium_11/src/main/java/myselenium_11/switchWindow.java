package myselenium_11;


	import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class switchWindow {
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
	public void testcasee() throws InterruptedException {
		driver.get("http://www.licindia.com/");
		driver .findElement(By.xpath("//*[@id=\"socialThings2\"]/ul/li[1]/a/img")).click();
		Set<String> s=driver.getWindowHandles();
		Thread.sleep(2000);	
		Iterator <String> it =s.iterator();
		Thread.sleep(2000);	
		String mwid= it.next();
		Thread.sleep(2000);	
		String t1= it.next();
		Thread.sleep(2000);	
		driver.switchTo().window(t1);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kartik010@gmail.com");
		Thread.sleep(2000);	
		

		
		
		
		driver.close();
		driver.switchTo().window(mwid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"socialThings2\"]/ul/li[2]/a/img")).click();
		Thread.sleep(4000);
		}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	}	
		
		
		
		
		
		