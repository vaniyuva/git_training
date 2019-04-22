package module6pkg_TestNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Screen_Shot {
	WebDriver driver;
	@Test
	public void google() throws IOException
	{
	
	System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
	driver = new ChromeDriver();
//	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.findElement(By.name("q")).sendKeys("Youtube");
	
	//testing with wrong path
	driver.findElement(By.name("quee")).sendKeys("Youtube");
/*	String title=driver.getTitle();
	 // if(title.equals("Youtube"));
	Assert.assertEquals(title,"YouTube");
*/	
	}
@AfterMethod
public void scrshot(ITestResult result)
{
try
	{
	if (ITestResult.FAILURE==result.getStatus())
	{
	File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile, new File("D:\\Vani_selenium\\Workspace\\selenium_Training\\Ggooyou"+System.currentTimeMillis()+".png"));
	System.out.println("Screenshot is captured for failed testcase");
		
	}
	}
	catch(Exception e)
	{
	e.printStackTrace();	
	}

}
}
