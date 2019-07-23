import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboarddemo_01 {
	WebDriver driver;
	  @Test
  public void f() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			WebElement element =driver.findElement(By.xpath("//input[@name='q']"));
			Actions act1=new Actions(driver);
			act1.keyDown(element,Keys.ALT).sendKeys("accenture").keyUp(Keys.SHIFT).build().perform();
			Thread.sleep(5000);
			act1.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.UP).sendKeys(Keys.ENTER).build().perform();
  }
}
