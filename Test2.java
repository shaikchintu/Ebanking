package steavejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 242\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// Launch Site
		driver.get("http:/www.gmail.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@aria-label='Email or phone']")).sendKeys("shaiksubhani9090@gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@aria-label='Enter your password']")).sendKeys("ashika@786");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("to")).sendKeys("gousebashaik@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("to")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@aria-label='Subject']")).sendKeys("Every Minute Important");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@aria-label='Message Body']")).sendKeys("Day 1 Starts");
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@aria-label='Send ‪(Ctrl-Enter)‬']")).click();
		
		
		
		
	}

}
