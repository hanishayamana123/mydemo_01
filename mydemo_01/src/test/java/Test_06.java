



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_06 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		WebElement t1=driver.findElement(By.xpath("//a[text()='SIGN-ON']"));
		Actions act1=new Actions(driver);
		//act1.moveToElement(t1).build().perform();
		act1.doubleClick(t1).build().perform();
  }
}
