package Assignments_Edureka;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sel_mod6_assign_SignUp_TestCase {

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

	driver.get("https://www.edureka.co/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	

}
@Test(priority=1)
public void register() throws InterruptedException
{
	try
	{
		driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[1]")).click();
		WebElement we3=driver.findElement(By.id("sg_popup_email"));
		we3.clear();
		Thread.sleep(1000);
		we3.sendKeys("vaniyuva88@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[1]/form/div[2]/div/div/ul/li[221]")).click();
		WebElement we4=driver.findElement(By.id("sg_popup_phone_no"));
		we4.clear();
		Thread.sleep(1000);
		we4.sendKeys("8136062694");
		driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[1]/form/button")).click();
		WebElement err = driver.findElement(By.xpath("//*[contains(text(),'You are registered with us. Login to continue')]"));
		String str=err.getText();
		//System.out.println(str);
		
		if(str.contains("You are registered with us. Login to continue."))
				{
			System.out.println(" This Email is  already Registered");
				}
		else
		{
			System.out.println(" This Email is not Registered");
		}
			
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

@AfterTest
public void quit() throws InterruptedException
{ 
	Thread.sleep(2000);
	driver.quit();
}

}



	



