import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  	 // driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	  driver.findElement(By.name("userName")).sendKeys(n);
		driver.findElement(By. name("password")).sendKeys(s);
		driver.findElement(By.name("Login")).click();
		String a_title=driver.getTitle();
		String e_title="Home";
		if(a_title.equals(e_title))
		{
			System.out.println("login success"+n);
		}
		else
		{
			System.out.println("login failed");
		}
		
		
		
  }
  
  

 @AfterMethod
 public void afterMethod() {
	 driver.findElement(By.xpath("//a[contains(text(),'SignOut')]")).click();
//	  WebDriver driver;
//	  driver=new ChromeDriver();
//	  driver.close();
 }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "haneesha213", "haneesha213" },
      new Object[] { "haneesha214", "haneesha214" },
      new Object[] { "haneesha215", "haneesha215" },
      new Object[] { "haneesha216", "haneesha216" },
      
    };
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
  }

  @AfterClass
  public void afterClass() {
	  /*WebDriver driver;
	  driver=new ChromeDriver();
	  driver.close();*/
	//  driver.findElement(By.xpath("//a[contains(text(),'SignOut')]")).click();
	  
  }

}
