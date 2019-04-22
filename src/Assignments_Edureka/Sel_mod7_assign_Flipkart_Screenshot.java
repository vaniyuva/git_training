package Assignments_Edureka;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sel_mod7_assign_Flipkart_Screenshot {
	public WebDriver driver;
	
	@BeforeTest
	public void invokeBrowser() 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		}
	
	@Test
		public void openURL() 
		{
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
	
	@Test(dependsOnMethods="openURL")
		public void searchSelenium()
		{
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		WebElement we1=driver.findElement(By.name("q"));
		we1.sendKeys("Selenium book");
		we1.sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Mastering Selenium WebDriver 3.0")).click();
		System.out.println(driver.getTitle());
		}
	
	@Test(dependsOnMethods="searchSelenium")
	public void CheckPincode() throws InterruptedException
	{
		// To swtich to next window tabs.
		int tab_index=1;
		ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs_windows.get(tab_index));
		
		WebDriverWait wait=new WebDriverWait(driver,160);
		WebElement we2=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"pincodeInputId\"]")));
		we2.sendKeys("636701");
		Thread.sleep(1000);
		WebElement we3=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div[1]/span"));
		we3.click();
		Thread.sleep(1000);
		WebDriverWait wait1=new WebDriverWait(driver,30);
		WebElement we4=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='_29Zp1s']")));
		String delivery=we4.getText();
		System.out.println("The book gets "+delivery);
		
		
	}
	
	@Test(dependsOnMethods="searchSelenium")
	public void addCart()
	{
		WebDriverWait wait2=new WebDriverWait(driver,30);
		WebElement we5=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li[1]/button")));
		we5.click();
	}
	
	@Test(dependsOnMethods="addCart")
	public void Checkout() throws IOException
	{
		try
		{
			
		driver.findElement(By.xpath("//*[@class='_2AkmmA _14O7kc _7UHT_c']")).click();
		WebDriverWait wait3=new WebDriverWait(driver,30);
		WebElement we6=wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='_2zrpKA _14H79F']")));
		we6.sendKeys("abcdef@gmail.com");
		driver.findElement(By.xpath("//*[@class='_2AkmmA _1poQZq _7UHT_c' and @type='submit']")).click();
		WebDriverWait wait4=new WebDriverWait(driver,30);
		WebElement we7=wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='_2zrpKA _3v41xv _14H79F']")));
		we7.sendKeys("abcdef");
		WebElement we8=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button"));
		we8.click();
		Thread.sleep(2000);
		}
		
		catch(Exception e1)
		{
			
			e1.printStackTrace();
		
		}
		
	}
	
	
	@Test(dependsOnMethods="Checkout")
	public void Screen_Shot()
	{
		try
		{
			File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrfile, new File("D:\\Vani_selenium\\Workspace\\selenium_Training\\FlipKart_ScreenShot"+System.currentTimeMillis()+".png"));
			System.out.println("ScreenShot is captured for incorrect login");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
@AfterTest
public void quit() throws InterruptedException
{
	Thread.sleep(3000);
	driver.quit();
}
	
	
	
	
	

}
