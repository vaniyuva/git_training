package Assignments_Edureka;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_mod3_assign_WaitCmds {
	
	WebDriver driver;

	public void invokeBrowser()
	{
		
	try
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		searchCourse();
	}
	catch(Exception e)
	{
	   e.printStackTrace();
	}
	}	
	
	public void searchCourse() throws InterruptedException
	{
		try
		{	
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.id("search-inp")).sendKeys("selenium");
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='testing-with-selenium-webdriver']")));
		ele.click();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println("Title is ' "+title +"'");
		String title1 = "Selenium Training";
		if (title.contains(title1))
		{
			System.out.println("Ur atRight page");
					
		}		
		driver.navigate().back();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		wait1.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait1.withTimeout(2, TimeUnit.MINUTES);
		wait1.ignoring(NoSuchElementException.class);
		WebElement ele1 = wait1.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver driver) 
			{
				WebElement ele1 = driver.findElement(By.linkText("Courses"));
				ele1.click();
					return ele1;
			}
		});
	
		Thread.sleep(2000);
		driver.close();
		
	}
		catch(Exception ex)
		
		{
		ex.printStackTrace();
		}

	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sel_mod3_assign_WaitCmds obj = new Sel_mod3_assign_WaitCmds();
		obj.invokeBrowser();
		

	}

}
