package myselenium_11;



import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Case4 {
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
driver.get("http://localhost:8015/TestMeApp/");


driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Lalitha");
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
Thread.sleep(3000);
Actions mouse =new Actions(driver);
WebElement cate=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"));
mouse.moveToElement(cate).perform();
Actions mouse1 =new Actions(driver);
WebElement cate1=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"));
mouse1.moveToElement(cate1).perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
Thread.sleep(3000);
Actions mouse2 =new Actions(driver);
WebElement cate2=driver.findElement(By.xpath("//*[@id=\"menu-v\"]/li[1]/a/span"));
mouse2.moveToElement(cate2).perform();
driver.findElement(By.xpath("//*[@id=\"menu-v\"]/li[1]/a/span")).click();
driver.findElement(By.xpath("//*[@id=\"menu-v11290\"]/li[2]/a/span")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/center/a")).click();
driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
List<WebElement> rows=driver.findElements(By.tagName("tr"));
System.out.println("The number of rows are" + rows.size());
}

@AfterMethod
public void closeBrowser() {
	driver.quit();
}
}



