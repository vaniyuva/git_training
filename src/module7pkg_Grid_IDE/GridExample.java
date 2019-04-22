package module7pkg_Grid_IDE;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GridExample {
	
	RemoteWebDriver driver;
	String appURL="http://www.google.com";
	@BeforeTest
				public void invokeBrowser() throws MalformedURLException 
				{
		
					
	//				System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
					DesiredCapabilities capabilities=DesiredCapabilities.chrome();
	//				driver = new ChromeDriver();
					driver=new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"),capabilities);
									
								
				}

	@Test
	public void testURL() 
	{

		System.out.println("Navigation to the website");
		driver.navigate().to(appURL);
		String str=driver.getTitle();
		System.out.println("verifying the pageTitle");
		Assert.assertTrue(str.equalsIgnoreCase("Google"),"page doesnt match");
		
}
	@AfterTest
	public void quit() throws InterruptedException
	{
		
	Thread.sleep(1000);
		driver.quit();
	}
}
