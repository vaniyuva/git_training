package module6pkg_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Grouping {
	
	WebDriver driver;
	@Test(groups="Start")
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test(priority=1,groups="Home")
	public void Homepage() throws InterruptedException
	{
		driver.findElement(By.linkText("Home")).click();
		System.out.println("Home Page");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	@Test(priority=2,groups="Hotels")
	public void Hotelspage() throws InterruptedException
	{
	driver.findElement(By.linkText("Hotels")).click();
	System.out.println("Hotles Page");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	}
	
	@Test(priority=3,groups="Hotels")
	public void Cruisespage() throws InterruptedException
	{
	driver.findElement(By.linkText("Cruises")).click();
	System.out.println("Cruises Page");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	}
	
	
	@Test(priority=4,groups="vacation")
	public void Vacationspage() throws InterruptedException
	{
	driver.findElement(By.linkText("Vacations")).click();
	Thread.sleep(3000);
	System.out.println("Vacation Page");
	driver.navigate().back();
	Thread.sleep(3000);
	}
	
	}
