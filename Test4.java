package steavejobs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
  {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 242\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		// to get secure site or not
		String x=driver.getCurrentUrl();
		if(x.contains("https"))
		{
		System.out.println("Site Is Secure ");
	    }
		else 
		{
		System.out.println("site is not secured");
		}
		driver.close();
    }
}