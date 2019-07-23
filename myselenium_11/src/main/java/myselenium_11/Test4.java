package myselenium_11;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import org.testng.annotations.Test;

public class Test4 {
	public WebDriver driver;
	public String browser="chrome";
	@Test
	public void testCase() {
		driver=Drivers.getdriver(browser);
	driver.get("http://newtours.demoaut.com/mercuryregister.php");
	WebElement dropdownlocation=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));

	Select dropdown=new Select(dropdownlocation);
	List<WebElement> options=dropdown.getOptions();

	System.out.println(options.size());
	for(int i=0;i<=options.size();i++)
	{
		System.out.println(options.get(i).getText());
		
	}

}

}