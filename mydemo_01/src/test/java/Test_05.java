import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_05 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	 driver.switchTo().alert();
		driver.switchTo().alert().accept();
		driver.close();
		
		
  }
}
