package myselenium_11;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
public class testcase {
	public WebDriver driver;

public String browser="chrome";
@BeforeTest
public void testCase() {
	driver=Drivers.getdriver(browser);
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("Proceed")).click();
	Alert a=driver.switchTo().alert();
	a.accept();
	

}
}
