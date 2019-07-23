import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_07 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.findElement(By.xpath("//span[text()='AboutUs']")).click();
		//Actions act1=new Actions(driver);
		//act1.moveToElement(t1).build().perform();
	 driver.findElement(By.xpath("//span[contains(text(),'Our')]")).click();
		//Actions act2=new Actions(driver);
		//act2.moveToElement(t2).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Bang')]")).click();
		Set<String> T_windows=driver.getWindowHandles();
		int c_windows=T_windows.size();
		System.out.println(c_windows);
		for (String S:T_windows)
		{
			driver.switchTo().window(S);
			//System.out.println(driver.getWindowHandle());
		}
		driver.switchTo().frame(driver.findElement(By.name("main_page")));
		String address=driver.findElement(By.xpath("//div[@class='contact-info']")).getText(); 
		System.out.println(address);
		
	
		
		
  }
}
