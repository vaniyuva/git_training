package Assignments_Edureka;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Sel_mod11_assign_updatePic_edureka {
		WebDriver driver;
	@BeforeTest
		public void invokeBrowser() 
		{
			
			System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("https://www.edureka.co/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}
	@Test
	public void login()
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement we=wait.until(ExpectedConditions.elementToBeClickable((By.linkText("Log In"))));
		we.click();
		driver.findElement(By.id("si_popup_email")).sendKeys("vaniyuva88@gmail.com");
		driver.findElement(By.id("si_popup_passwd")).sendKeys("edureka88");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@Test(dependsOnMethods="login")
		public void updateProfile_Picture() throws IOException, InterruptedException, SikuliException
		{
			
				driver.findElement(By.className("img30")).click();
				driver.findElement(By.linkText("My Profile")).click();
				
				driver.findElement(By.className("icon-pr-edit")).click();
				driver.findElement(By.className("icon-camera")).click();
				for(String nw : driver.getWindowHandles())
				{
				//System.out.println("new Window : "+nw);
				driver.switchTo().window(nw);
				}
				Thread.sleep(2000);
				driver.findElement(By.id("custom-input")).click();
				Runtime.getRuntime().exec("D:\\Vani_selenium\\PicAutoITEdureka.exe");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='submit' and @class='submitbtn']")).click();
				Thread.sleep(3000);
				WebDriverWait wait1=new WebDriverWait(driver,30);
				WebElement p2=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/button")));
				p2.click();
				
				Screen s =new Screen();
				Pattern next1=new Pattern("D:\\Vani_selenium\\Workspace\\Sikuli\\Next1.JPG");
				s.getScreen().click(next1);
				Pattern next2=new Pattern("D:\\Vani_selenium\\Workspace\\Sikuli\\Next2.JPG");
				s.getScreen().click(next2);
			
				WebDriverWait wait3=new WebDriverWait(driver,30);
				WebElement we1=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn pull-right onboarding-primary-button' and @type='submit']")));
				we1.click();
				
		}
	/*
	@Test(dependsOnMethods="updateProfile_Picture")
		public void SavePicture() throws InterruptedException
		{
			
				driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/button[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/button[2]")).click();
				WebDriverWait wait3=new WebDriverWait(driver,30);
				WebElement we1=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='btn pull-right onboarding-primary-button' and @type='submit']")));
				we1.click();
			
			
		}
		*/
		@AfterTest
		public void Logout()
		{
			
				driver.findElement(By.className("user_image")).click();
				WebDriverWait wait4=new WebDriverWait(driver,30);
				WebElement we3=wait4.until(ExpectedConditions.elementToBeClickable((By.linkText("Log Out"))));
				we3.click();
				driver.close();
			}

	}

