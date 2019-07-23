package myselenium_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import org.testng.annotations.Test;

public class MercuryTours {
	public WebDriver driver;
	@Test
	public void Browser() throws InterruptedException {
		//step1: Opening chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_d2.03.07\\Desktop\\Sumit Wankhede\\Selenium Softwares\\Selenium Softwares\\SeleniumDrivers\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		// step2:maximize window and applying implicit wait 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//step3:launching Url 
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
	
	



	
	
	//Step4: Go to registration page
	
		
		
		
		
	//step5:enter details
		driver.findElement(By.name("firstName")).sendKeys("Ram");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("9871432911");
		
		driver.findElement(By.name("userName")).sendKeys("RamKumar123");
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("Kapashera,Delhi");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("Delhi");
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("Delhi");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("110037");
		Thread.sleep(2000);
		WebElement dropdownLocation = driver.findElement(By.name("country"));
		Thread.sleep(2000);
		Select dropdown = new Select(dropdownLocation);
		dropdown.selectByValue("92");
		Thread.sleep(2000);
		WebElement msg =driver.findElement(By.name("email"));
		String text=msg.getText();
		if (msg.isEnabled()&& text.contains("@"))
			System.out.println("successful");
		else {
			System.out.println("missing");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("liveddream");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("liveddream");
		
		Thread.sleep(2000);
		driver.findElement(By.name("register")).click();
		driver.close();
	
	
		
		
	}
	
			
		
		
	

}
