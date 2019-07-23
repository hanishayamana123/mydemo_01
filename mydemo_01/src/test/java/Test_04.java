import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_04 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/htdocs/common/onlineservices/netbankingloginsafe_nri.htm");
		String win_name1=driver.getWindowHandle();
		System.out.println(win_name1);
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[@href='/htdocs/nri_banking/accounts/fixed_deposits/fixed_deposits.htm']")).click();
		 Thread.sleep(2000);
			Set<String> T_windows=driver.getWindowHandles();
			int c_windows=T_windows.size();
			System.out.println(c_windows);
			for (String S:T_windows)
			{
				driver.switchTo().window(S);
				System.out.println(driver.getWindowHandle());
			}
			 driver.findElement(By.xpath("//img[@src='/htdocs/nri_banking/product_page/images/primnav/loans.gif\']")).click();
			 String t="Attractive interest rates";
			 String a=driver.findElement(By.xpath("//li[text()='Attractive interest rates ']")).getText();
			 Assert.assertEquals(t, a);
			 
			 System.out.println("success");
			 
			
		 
		 
  }
}
