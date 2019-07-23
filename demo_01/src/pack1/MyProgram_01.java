package pack1;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyProgram_01 {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		//driver.navigate().to("http://newtours.demoaut.com");
		//Thread.sleep(5000);
		//driver.get("http://www.google.com");
		//driver.manage().window().maximize();
		//Dimension d=new Dimension(300,900);
		//driver.manage().window().setSize(d);
		WebElement Reg=driver.findElement(By.linkText("REGISTER"));
		Reg.click();
		WebElement Cntry=driver.findElement(By.name("country"));
		Select Sel1=new Select(Cntry);
		Sel1.selectByVisibleText("GERMANY");
		WebElement Uname=driver.findElement(By.id("email"));
		WebElement Pswrd=driver.findElement(By.name("password"));
		WebElement Cpswrd=driver.findElement(By.name("confirmPassword"));
		WebElement Sbmt=driver.findElement(By.name("register"));
		Uname.sendKeys("demo");
		Pswrd.sendKeys("demo");
		Cpswrd.sendKeys("demo");
		Sbmt.click();
		//driver.close();
		/*int a=10;
		int sum;
		int b=20;
		sum=a+b;
		System.out.println("the total is:"+sum);
		driver.findElement(By.name("username")).sendKeys("Haneesha");*/

	}

}
