package myselenium_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	public WebDriver driver;

	
@Test
	public void test() throws InterruptedException {
	//step1:opening browser
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_d2.03.07\\Desktop\\Sumit Wankhede\\Selenium Softwares\\Selenium Softwares\\SeleniumDrivers\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	
	



		//step2:launching url
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		
	//step3:login details
		driver.findElement(By.name("userName")).sendKeys("Ram");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("liveddream");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	//step4:matching title
	String etitle="Welcome to Mercury Tours";
	String atitle = driver.getTitle();
	Assert.assertEquals  (atitle,etitle);
	System.out.println("tite of the page is:"+atitle);
	driver.close();
}
}
	