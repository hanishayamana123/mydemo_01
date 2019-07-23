package mydemo_01.mydemo_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Myprogram_03 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		WebElement Reg=driver.findElement(By.xpath("//a[text()=..]"));
		Reg.click();
		/*WebElement Cntry=driver.findElement(By.name("country"));
		Select Sel1=new Select(Cntry);
		Sel1.selectByVisibleText("GERMANY");*/
		WebElement Uname=driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement Pswrd=driver.findElement(By.xpath("//input[@name='password']"));
		
		WebElement Sbmt=driver.findElement(By.xpath("//input[@name='Login']"));;
		Uname.sendKeys("asdfgh");
		Pswrd.sendKeys("asdfgh");
		Sbmt.click();


	}

}
