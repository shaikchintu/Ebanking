package steavejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Batch 242\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.id("email"));
		String x=e.getAttribute("type"); // Html attribute
		String y=e.getCssValue("font-size");// attribute
		String z=e.getText();
		System.out.println(x+ ""+y+"" +z);
		
		driver.close();
		
	}

}
