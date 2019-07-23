package myselenium_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class caseStudy3 {
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
public void testcase2() throws InterruptedException {
	driver.get("http://demowebshop.tricentis.com");
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("kumar");
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("kartikey");
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("kumarkartiky010@gmail.com");
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("kumar123");
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("kumar123");
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
}
@AfterMethod
public void closeBrowser() {
	driver.quit();
}
}