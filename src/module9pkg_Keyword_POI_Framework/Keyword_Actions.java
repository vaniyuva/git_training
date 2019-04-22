package module9pkg_Keyword_POI_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyword_Actions {

	 static WebDriver driver;
	
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
	}
	public static void openURL() throws InterruptedException
	{
		driver.get("https://www.Google.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	
	public static void clickGmail() throws InterruptedException
	{
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}
}
