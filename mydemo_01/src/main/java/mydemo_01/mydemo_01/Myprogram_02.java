package mydemo_01.mydemo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Myprogram_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
//		driver.navigate().to("http://10.232.237.143:443/TestMeApp");
		WebElement Signin=driver.findElement(By.linkText("login.htm"));
		Signin.click();
		WebElement Uname=driver.findElement(By.name("userName"));
		WebElement Pswrd=driver.findElement(By. name("password"));
		WebElement Sbmt=driver.findElement(By.name("Login"));
		Uname.sendKeys("demo");
		Pswrd.sendKeys("demo");
		Sbmt.click();

	}

}
