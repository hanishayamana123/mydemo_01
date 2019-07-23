




package com.SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import myselenium_11.Drivers;

public class WorkBook1 {
	public WebDriver driver;
	 String browser="chrome";
	@BeforeMethod
	public void openbrowser() throws InterruptedException {
		driver= Drivers.getdriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(3000);

		
	}
	@AfterMethod
	public void closebrowser() {
		driver.close();

}
	@Test
	public void testcase() throws InterruptedException {
		//get the url
		driver.get("http://localhost:8015/TestMeApp/");
		
		//click on sign
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		//enter username
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Lalitha");
		Thread.sleep(2000);
		
		//enter password
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		Thread.sleep(2000);
		
		//click on sign
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		Thread.sleep(2000);
		
		//Add first product to cart
		Actions mouse1=new Actions(driver);
		WebElement Category=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"));
		mouse1.moveToElement(Category).perform();
		Thread.sleep(2000);
		
		Actions mouse2=new Actions(driver);
		WebElement SubCategory=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"));
		mouse2.moveToElement(SubCategory).perform();
		Thread.sleep(2000);
     	driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
     	Thread.sleep(2000);
     	
     	driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
     	Thread.sleep(2000);
     	
     	//Add the product to cart
     	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
     	Thread.sleep(2000);
     	
     	//Add another product to cart
     	driver.findElement(By.xpath("//*[@id=\"menu-v\"]/li[2]/a/span")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//*[@id=\"menu-v11292\"]/li[1]/a/span")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
    	Thread.sleep(2000);
    	
    	//click on cart to view items
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
    	Thread.sleep(2000);
    	
    	//to fetch no of rows
    	List<WebElement> rows=driver.findElements(By.tagName("tr"));
    	System.out.println("The number of rows are" + rows.size());
    	
    	String a = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span")).getText();
     	 System.out.println(a);
		
	}
}