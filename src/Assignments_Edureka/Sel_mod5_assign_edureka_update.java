package Assignments_Edureka;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_mod5_assign_edureka_update {

		WebDriver driver;

		public void invokeBrowser() 
		{
			
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("https://www.edureka.co/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			
			updateProfile();
		}
		catch(Exception e)
		{
		   e.printStackTrace();
		}
	}
		public void updateProfile()
		{
			try
			{
				WebDriverWait wait=new WebDriverWait(driver,30);
				WebElement we=wait.until(ExpectedConditions.elementToBeClickable((By.linkText("Log In"))));
				we.click();
			//	driver.findElement(By.linkText("Log In")).click();
				driver.findElement(By.id("si_popup_email")).sendKeys("vaniyuva88@gmail.com");
				driver.findElement(By.id("si_popup_passwd")).sendKeys("edureka88");
				driver.findElement(By.xpath("//button[text()='Login']")).click();
			//	driver.findElement(By.className("close")).click();
				driver.findElement(By.className("img30")).click();
				driver.findElement(By.linkText("My Profile")).click();
				
				driver.findElement(By.className("icon-pr-edit")).click();
				driver.findElement(By.xpath("//*[@href=\"/onboarding/careerinterests\"]")).click();
				Select oselect=new Select(driver.findElement(By.name("interestedJob")));
				oselect.selectByValue("Software Testing");
				Select s1=new Select(driver.findElement(By.name("elementType")));
				s1.selectByValue("Both");
				WebElement p1=driver.findElement(By.name("currentCity"));
				p1.clear();
				p1.sendKeys("Tampa");
				Select s2=new Select(driver.findElement(By.name("lastDrawnSalaryUS")));
				s2.selectByIndex(1);
				driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/div[5]/div/label[2]")).click();
				WebDriverWait wait1=new WebDriverWait(driver,30);
				WebElement p2=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
				p2.click();
				
			//	driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[3]/div/button")).click();
								
			}
			
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		public void updateDegree()
		{
			try
			{
				driver.findElement(By.xpath("//span[text()='Add Another Degree']")).click();
				driver.findElement(By.id("degree-name")).sendKeys("B.E(cse");
				driver.findElement(By.id("company-name")).sendKeys("Jayam College/Anna University");
				Select sm=new Select(driver.findElement(By.name("start_month")));
				sm.selectByVisibleText("July");
				Select sy=new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"start_year\"]")));
				sy.selectByVisibleText("2006");
				Select sem=new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"end_month\"]")));
				sem.selectByVisibleText("May");
				Select sey=new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"end_year\"]")));
				sey.selectByVisibleText("2010");
				driver.findElement(By.cssSelector("#degree-0 > div.form-group.form-div.col-lg.\\31 2.col-md-12.col-sm-12.col-xs-12.time-period > div.select-div.col-md-3.highest-education > label")).click();
				WebDriverWait wait3=new WebDriverWait(driver,30);
				WebElement we1=wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#onboarding > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.main-body > div.col-lg-9.col-md-9.col-sm-12.col-xs-12.tab-data > div.tab-content > app-onboarding-other-details > accordion > accordion-group > div > div.panel-collapse.collapse.in.show > div > form > div > button:nth-child(1)")));
				we1.click();
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
			
		}
		public void blogOpen()
		{
			try
			{
				driver.findElement(By.linkText("Blog")).click();
				driver.findElement(By.linkText("7 Reasons to Choose Edureka Online Courses")).click();
				driver.findElement(By.linkText("Home")).click();
				driver.findElement(By.className("img30")).click();
				WebDriverWait wait4=new WebDriverWait(driver,30);
				WebElement we3=wait4.until(ExpectedConditions.elementToBeClickable((By.linkText("Log Out"))));
				we3.click();
				driver.close();
			}
			catch(Exception e3)
			{
				e3.printStackTrace();
			}
		}
		


	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Sel_mod5_assign_edureka_update obj =new Sel_mod5_assign_edureka_update();
			obj.invokeBrowser();
			obj.updateDegree();
			obj.blogOpen();
			
			

}
		}
