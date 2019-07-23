package myselenium_11;


	
	import java.util.concurrent.TimeUnit;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
	public class Locators {
		public WebDriver driver;

	public String browser="chrome";

	@Test
	 
	public void openBrowser()throws InterruptedException {
		driver=Drivers.getdriver(browser);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//*[@id=\"get_sign_in\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"authMobile\"]")).sendKeys("7411160476");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"authOverlay\"]/div/as")).click();
		Actions mouse =new Actions(driver);
		WebElement panchang=driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/a"));
		mouse.moveToElement(panchang).perform();
		driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/div[2]/div[1]/a[3]")).click();

	}
	}



