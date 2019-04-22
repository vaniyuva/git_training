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

	public class Sel_2_mod4assign_GoFlight {
		
		
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
				driver.findElement(By.name("or-src")).click();
				WebElement source= driver.findElement(By.xpath("//input[@name=\"or-src\"]"));
				source.sendKeys("BLR");
				source.sendKeys(Keys.ENTER);
				WebDriverWait wait=new WebDriverWait(driver,30);
				WebElement dest=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("or-dest")));
				dest.sendKeys("LKO");
				dest.sendKeys(Keys.ENTER);
				//today date.  
								//   driver.findElement(By.className("ui-state-default")).click();
				
									WebElement d = driver.findElement(By.xpath("//*[@class=\" selected-date ui-datepicker-current-day\"]//a"));
											Actions act=new Actions(driver);
											act.click(d).perform();
				
			
				/*
				WebDriverWait wa=new WebDriverWait(driver,30);
				WebElement dest1=wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\" selected-date ui-datepicker-current-day\"]//a")));
				dest1.click();
				*/
				
				
				WebDriverWait wt=new WebDriverWait(driver,30);
				WebElement pa = wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("passenger")));
				pa.click();
		
								//driver.findElement(By.xpath("//input[@name=\"passenger\"]")).click();
				WebDriverWait wt1=new WebDriverWait(driver,30);
				WebElement adult=wt1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]")));
				
				//WebElement adult=driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]"));
				int Tadult=1;
				for(int i=1;i<=2;i++)
				{
					adult.click();
					//Thread.sleep(2000);
					Tadult=Tadult+1;
				}
				//System.out.println("Number of Adult tickets booked : " +Tadult);
				//WebDriverWait wt2=new WebDriverWait(driver,30);
				//WebElement child=wt2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[2]/div/button[2]")));
				
				WebElement child=driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[2]/div/button[2]"));
				int Tchild=0;
				for(int j=1;j<=2;j++)
				{
					child.click();
					//Thread.sleep(2000);
					Tchild=Tchild+1;
				}
				//System.out.println("Number of Child tickets booked : " +Tchild);
				WebDriverWait wait1=new WebDriverWait(driver,30);
				WebElement done=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary pax-done' and text()='Done']")));
				done.click();
				
							//driver.findElement(By.cssSelector("(By.cssSelector(\"#bookFlightTab > form > div.row.justify-content-around.bw-mobile.ie-justify-pass-cur > div.col-sm-5.col-5.padd-left.pax-selection-container > div.passenger-dropdown.pax-selection-row > div > button\"))")).click();
				Select oselect = new Select(driver.findElement(By.xpath("//select[@class=\"form-control bw-currency-list\"]")));
				oselect.selectByValue("USD");
			//	driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/div/button")).click();
			//	driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[7]/div[3]/span/label")).click();
			
				WebDriverWait wait2=new WebDriverWait(driver,60);
				WebElement search=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[7]/div[6]/button")));
				search.click();
				
				driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
				
			//	driver.findElement(By.cssSelector("#bookFlightTab > form > div.row.justify-content-around.bw-mobile.ie-justify-pass-cur > div.col-sm-5.col-5.padd-left.pax-selection-container > div.passenger-dropdown.pax-selection-row > div > button")).click();
				

				
				System.out.println("Tickets booked Succefully!!!");
				int total=Tadult+Tchild;
				System.out.println("Number of ticket booked : "+total+ " ( Adult : "+Tadult+" and Child : ) "+Tchild);

							
			}
			
		
			catch(Exception e1)
			{
			   e1.printStackTrace();
			}
		}
		
			
		

		public static void main(String[] args)   {
			// TODO Auto-generated method stub
			
			Sel_2_mod4assign_GoFlight obj= new Sel_2_mod4assign_GoFlight();
			obj.invokeBrowser();
			

		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
