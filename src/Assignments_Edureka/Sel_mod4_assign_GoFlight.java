package Assignments_Edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_mod4_assign_GoFlight {
	
	
	WebDriver driver;

	public void invokeBrowser() 
	{
		
	try
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		searchFlight();
	}
	catch(Exception e)
	{
	   e.printStackTrace();
	}
	}
	
	public void searchFlight() 
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.linkText("Book Flight")).click();
			driver.findElement(By.xpath("//*[text()=\"One Way\"]")).click();
			//source
			driver.findElement(By.name("or-src")).click();
			WebElement source= driver.findElement(By.xpath("//input[@name=\"or-src\"]"));
			source.sendKeys("BLR");
			source.sendKeys(Keys.ENTER);
			//Destination
			WebDriverWait wait=new WebDriverWait(driver,30);
			WebElement dest=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("or-dest")));
			dest.sendKeys("LKO");
			dest.sendKeys(Keys.ENTER);
			//today date.  
				
				/*WebDriverWait wa=new WebDriverWait(driver,30);
				WebElement date1=wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\" selected-date ui-datepicker-current-day\"]//a")));
				date.click(); */
			//Mouse handling for date
			WebElement date = driver.findElement(By.xpath("//*[@class=\" selected-date ui-datepicker-current-day\"]//a"));
			Actions act=new Actions(driver);
			act.click(date).perform();

			//To open No. of Tickets counter
			WebDriverWait wt=new WebDriverWait(driver,30);
			WebElement pa = wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("passenger")));
			pa.click();
			//Adult ticket
			WebDriverWait wt1=new WebDriverWait(driver,30);
			WebElement adult=wt1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]")));
			int Tadult=1;
			for(int i=1;i<=2;i++)
			{
				adult.click();
				Tadult=Tadult+1;
			}
			//Child Ticket			
			WebElement child=driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[2]/div/button[2]"));
			int Tchild=0;
			for(int j=1;j<=2;j++)
			{
				child.click();
				Tchild=Tchild+1;
			}
			WebDriverWait wait1=new WebDriverWait(driver,30);
			WebElement done=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary pax-done' and text()='Done']")));
			done.click();
			//Selecting Currency
			Select oselect = new Select(driver.findElement(By.xpath("//select[@class=\"form-control bw-currency-list\"]")));
			oselect.selectByValue("INR");
	        //Search Flights	
			WebDriverWait wait2=new WebDriverWait(driver,60);
			WebElement search=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[7]/div[6]/button")));
			search.click();
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			int total=Tadult+Tchild;
			System.out.println(" Total Number of tickets : "+total+ " ( Adult : "+Tadult+" and Child : "+Tchild+")");
			System.out.println("You are at the list of Flights available for your destination!!!");
		
						
		}
		
	
		catch(Exception e1)
		{
		   e1.printStackTrace();
		}
		
		
	}
	
		
	

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		Sel_mod4_assign_GoFlight obj= new Sel_mod4_assign_GoFlight();
		obj.invokeBrowser();
		

	}

}
