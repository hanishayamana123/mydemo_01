import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_03 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		String win_name1=driver.getWindowHandle();
		System.out.println(win_name1);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
		Thread.sleep(2000);
		Set<String> T_windows=driver.getWindowHandles();
		int c_windows=T_windows.size();
		System.out.println(c_windows);
		for (String S:T_windows)
		{
			driver.switchTo().window(S);
			System.out.println(driver.getWindowHandle());
		}
		driver.findElement(By.linkText("Apply Now")).click();
		
	  
  }
}
