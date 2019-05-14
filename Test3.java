package steavejobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 242\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(3000);
		// get Title 
		String x=driver.getTitle();
		System.out.println(x);
		// to get Page Source
		String y=driver.getPageSource();
		System.out.println(y);
		
		
		
		
	}

}
