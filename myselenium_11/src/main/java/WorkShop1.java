import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import myselenium_11.Drivers;

public class WorkShop1 {public WebDriver driver;
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
	Actions mouse1=new Actions(driver);
	WebElement Category=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
	mouse1.moveToElement(Category).perform();
	Thread.sleep(2000);
	Actions mouse2=new Actions(driver);
	WebElement SubCategory=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
	mouse2.moveToElement(SubCategory).perform();
	Thread.sleep(2000);
 	driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span")).click();
 	Thread.sleep(2000);
 	driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span")).click();
 	Thread.sleep(2000);
	Set<String> s=driver.getWindowHandles();
	Thread.sleep(2000);	
	Iterator <String> it =s.iterator();
	
	String mwid= it.next();
	String t1= it.next();
		
	driver.switchTo().window(t1);
	Thread.sleep(2000);
	driver.switchTo().window(mwid);
	Thread.sleep(2000);
	driver.switchTo().window(t1);
	Thread.sleep(2000);
	driver.close();
	Thread.sleep(2000);
	driver.switchTo().window(mwid);
 	
}
}
