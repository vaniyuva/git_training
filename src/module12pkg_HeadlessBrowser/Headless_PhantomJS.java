package module12pkg_HeadlessBrowser;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Headless_PhantomJS {
	
public static void main(String args[]) throws InterruptedException
{
	//	File file=new File("C:\\Program Files\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	//	System.setProperty("phantomjs.binary.path",file.getAbsolutePath());
		System.setProperty("phantomjs.binary.path","D:\\Vani_selenium\\Installation_stuff\\ExeFile\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.google.com/");
		WebElement we=driver.findElement(By.name("q"));
		we.sendKeys("Edureka");
		we.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println("The window title is "+driver.getTitle());
		
		//Take ScreenShot		
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
		FileUtils.copyFile(scrfile, new File("D:\\Vani_selenium\\Workspace\\Selenium_Screenshots\\"+System.currentTimeMillis()+"Headless2.png"));
		System.out.println("Screenshot is captured!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}


