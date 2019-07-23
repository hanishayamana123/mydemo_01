import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class democom_01 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebElement element =driver.findElement(By.xpath("//input[@name='q']"));
		Actions act1=new Actions(driver);
		act1.keyDown(element,Keys.ALT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(5000);
		act1.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		Set<String> T_windows=driver.getWindowHandles();
		int c_windows=T_windows.size();
		System.out.println(c_windows);
		for (String S:T_windows)
		{
			driver.switchTo().window(S);
			//System.out.println(driver.getWindowHandle());
		}
		String e_text=driver.findElement(By.xpath("//h1[contains(text(),'Build your')]")).getText();
		String a_text="Build your own expensive computer";
		if(e_text.equals(a_text))
		{
			System.out.println("The web page has opened correctly");
		}
		else
		{
			System.out.println("The web page has not been opened correctly");
		}
		

  }
}
