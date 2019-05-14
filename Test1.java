package steavejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 
{

	public static void main(String[] args) throws Exception
	{
		// Launch site using Chrome
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 242\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		// click register link
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Shaik");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Subhani");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9848682989");
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("shaiksubhani9090@gmail.com");
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("Somajiguda");
		driver.findElement(By.xpath("//*[@name='address2']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Telangana");
		driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("500028");
		// to Automate Dropdowns We have two Possibilities
		// either xpath or using Select class 
		//driver.findElement(By.xpath("//*[@name='country']")).sendKeys("INDIA");
		WebElement we= driver.findElement(By.name("country"));
		Select s=new Select(we);
		s.selectByVisibleText("AUSTRALIA");  
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("Chintu");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("SUBHANI@786");
		driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("SUBHANI@786");
		driver.findElement(By.xpath("//*[@name='register']")).click();
	}

}
