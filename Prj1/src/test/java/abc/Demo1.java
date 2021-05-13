package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1
{
	@Test
	public void testA()
	{
		//below code will download exe file and set the path
	//Ankit: post the code in group to  change download path of exe
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.chromedriver().driverVersion("88.0.4324.96").setup();
		WebDriverManager.chromedriver().driverVersion("90.0.4430.212").setup();
		String p = System.getProperty("webdriver.chrome.driver");
		System.out.println(p);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.close();
		
	}
}
