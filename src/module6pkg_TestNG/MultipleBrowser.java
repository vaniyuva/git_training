package module6pkg_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowser {
	WebDriver driver;
	String URL="https://www.google.com/";
	//for this program- check the code in xml
	@Parameters("B")
	@BeforeTest
	public void invokeBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Vani_selenium\\Installation_stuff\\ExeFile\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("IE")) 
		{
			System.setProperty("webdriver.ie.driver",
					"D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}
	
	@Test
	public void getURL()
	{
		driver.navigate().to(URL);
		driver.findElement(By.name("q")).sendKeys("youtube");
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
}
