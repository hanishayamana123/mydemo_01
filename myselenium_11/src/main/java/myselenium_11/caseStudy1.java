package myselenium_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class caseStudy1 {
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
driver.get("http://localhost:8015/TestMeApp");
driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("l");
driver.findElement(By.name("password")).sendKeys("password123");
driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();



Thread.sleep(3000);
}
@AfterMethod
public void closeBrowser() {
	driver.quit();
}
}	