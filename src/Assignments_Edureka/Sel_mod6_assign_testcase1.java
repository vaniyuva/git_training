package Assignments_Edureka;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sel_mod6_assign_testcase1 {

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
@Test
public void openURL() 
{
	driver.get("https://www.edureka.co/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
@Test(dependsOnMethods="openURL")
			public void login() 
			{			
					WebDriverWait wait=new WebDriverWait(driver,30);
					WebElement we=wait.until(ExpectedConditions.elementToBeClickable((By.linkText("Log In"))));
					we.click();
					driver.findElement(By.id("si_popup_email")).sendKeys("vaniyuva88@gmail.com");
					WebDriverWait wait5=new WebDriverWait(driver,30);
					WebElement wep=wait5.until(ExpectedConditions.visibilityOfElementLocated(By.id("si_popup_passwd")));
					wep.sendKeys("edureka88");
				//	driver.findElement(By.id("si_popup_passwd")).sendKeys("edureka88");
					driver.findElement(By.xpath("//button[text()='Login']")).click();
			
		}

@Test(dependsOnMethods="login")
public void search()
{
	
		driver.findElement(By.xpath("//*[@id=\"dropdownMenu3\"]")).click();
		driver.findElement(By.linkText("All Courses")).click();
		WebDriverWait wait1=new WebDriverWait(driver,30);
		WebElement we1=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-training-courses\"]/a[7]/div[1]")));
		Actions act=new Actions(driver);
		act.moveToElement(we1).click().build().perform();
	//	we1.click();
		System.out.println("You have Searched for Selenium Certification course!!!");
		
			
}
@Test(priority=5)
public void logout()
{
	
		driver.findElement(By.className("img30")).click();
		WebDriverWait wait2=new WebDriverWait(driver,30);
		WebElement we3=wait2.until(ExpectedConditions.elementToBeClickable((By.linkText("Log Out"))));
		we3.click();
	
}

@Test(priority=10)
public void register() throws InterruptedException
{
	try
	{
		WebElement w1=driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(w1).click().build().perform();
		//driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[1]")).click();
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
		//WebElement err=driver.findElement((By.xpath("//input[@id='sg_popup_email']//following::p[@id='emailError']")));
		String str=err.getText();
		//System.out.println(str);
		if(str.contains("You are registered with us. Login to continue."))
				{
			System.out.println(" This Email is  already Registered");
				}
		else 
		{
			System.out.println(" This Email is  not Registered");
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



	



