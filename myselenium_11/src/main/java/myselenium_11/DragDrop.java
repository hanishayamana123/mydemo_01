package myselenium_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDrop {
	public WebDriver driver;

	public String browser="chrome";


	 @BeforeTest
	public void openBrowser()throws InterruptedException {
		driver=Drivers.getdriver(browser);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 }
		
		

		@Test
		public void testcase2() throws InterruptedException {
			driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
			Actions mouse =new Actions(driver);
			WebElement src=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[2]/div/div/span"));
			WebElement dest=driver.findElement(By.id("ctl00_ContentPlaceholder1_priceChecker"));
			mouse.dragAndDrop(src,dest).perform();
			Thread.sleep(3000);
		}
	 }	
