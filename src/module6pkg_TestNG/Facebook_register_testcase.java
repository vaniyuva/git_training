package module6pkg_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook_register_testcase {
	WebDriver driver;
	@BeforeTest
				public void invokeBrowser() 
				{
					
					System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().deleteAllCookies();
					//driver.manage().window().maximize();
					driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
					//driver.get("https://www.edureka.co/");
					//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
					
					}
	@Test(priority=0)
	public void openURL() 
	{

		driver.get("https://wwww.facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void register()
	{
	driver.findElement(By.xpath("//*[@id='u_0_c']")).sendKeys("vani"); 
	driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys("yuva"); 
	driver.findElement(By.id("u_0_h")).sendKeys("vaniyuvabe@gmail.com");
	driver.findElement(By.id("u_0_k")).sendKeys("vaniyuvabe@gmail.com");
	driver.findElement(By.xpath("//*[@id='u_0_h']//following::input[3]")).sendKeys("$abcd1234$");
	Select oselect =new Select(driver.findElement(By.id("month")));
	oselect.selectByValue("8");
	Select oselect1 =new Select(driver.findElement(By.id("day")));
	oselect1.selectByValue("16");
	Select oselect2 =new Select(driver.findElement(By.id("year")));
	oselect2.selectByValue("1988");
	driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
	driver.findElement(By.id("u_0_u")).click();
	
	
}
}
