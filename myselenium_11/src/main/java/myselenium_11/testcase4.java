package myselenium_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase4 { 
public WebDriver driver;
public String browser="chrome";
@BeforeTest
public void testCase() {
	driver=Drivers.getdriver(browser);
	
}
	
	
	public void openBrowser()throws InterruptedException{
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div[2]/form/div/div[1]/div/input"));
		WebElement searchbutton=driver.findElement( By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div[2]/form/div/div[2]/button"));
		
		searchbox.sendKeys("bags");
		searchbutton.click();
		driver.navigate().back();
		searchbox.clear();
		searchbox.sendKeys("watches");
		searchbutton.click();
	}
	@Test
	public void test2(){
	
	

	driver.get("http://newtours.demoaut.com/mercuryregister.php");
	WebElement dropdownlocation=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));

	Select dropdown=new Select(dropdownlocation);
	dropdown.selectByIndex(12);
	dropdown.selectByVisibleText("INDIA");
	dropdown.selectByValue("14");
	

}
}