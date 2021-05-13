package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2
{
	@Test
	public void testA()
	{
		System.setProperty("wdm.cachePath", "./driver");
		WebDriverManager.chromedriver().driverVersion("90.0.4430.212").setup();
		String p = System.getProperty("webdriver.chrome.driver");
		System.out.println(p);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.close();
		
	}
}
