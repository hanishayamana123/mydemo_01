package mydemo_01.mydemo_01;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Testdemo_04 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys(n);
		driver.findElement(By.name("password")).sendKeys(s);
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.linkText("SignOut")).click();
		driver.close();
		
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "asdfgh", "asdfgh" },
      new Object[] { "asdfgh", "asdfgh" },
    };
  }
}
