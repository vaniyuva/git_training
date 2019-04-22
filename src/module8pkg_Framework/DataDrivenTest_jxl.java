package module8pkg_Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTest_jxl {
	
public WebDriver driver;
Workbook WB;
Sheet sh;
int rowno;
int colno;
	
	@BeforeTest
	public void invokeBrowser() 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		}
	
		
@Test(dataProvider="TD")	
public void Form_Elements(String FName,String LName,String Add) throws InterruptedException
{
	// First Name
			driver.findElement(By.id("ts_first_name")).clear();
			driver.findElement(By.id("ts_first_name")).sendKeys(FName);
			// Last Name
			driver.findElement(By.id("ts_last_name")).clear();
			driver.findElement(By.id("ts_last_name")).sendKeys(LName);
			// Address
			driver.findElement(By.id("ts_address")).clear();
			driver.findElement(By.id("ts_address")).sendKeys(Add);
			/*
			//Gender
			driver.findElement(By.cssSelector("#post-body-8780970208820941936 > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > p > label:nth-child(2) > input[type=\"radio\"]")).click();
			*/
			//submitting the form
			driver.findElement(By.xpath("//*[@name='Submit1']")).click();     
		   
		Thread.sleep(1000);
		System.out.println("Your Form is Submitted Successfully");
			
			
			Thread.sleep(1000);
			
}
@DataProvider(name="TD")
public Object[] Testdatafeed() throws BiffException, IOException
{
	FileInputStream fis=new FileInputStream("D:\\Vani_selenium\\Workspace\\selenium_Training\\src\\module8pkg_Framework\\TestData.xls");
	
	WB=Workbook.getWorkbook(fis);
	sh=WB.getSheet(1);
	rowno=sh.getRows();
	colno=sh.getColumns();
	
	Object[][] FormData = new Object [rowno][colno];
	
	for(int i=0; i<rowno; i++) 
	{
		for(int j=0; j<colno; j++) 
		{
			//Fetch values of 1st Row and 3 columns
			FormData [i][j] = sh.getCell(j,i).getContents();
		}
		//goes to i loop for 2nd row
	}
		return FormData;
}

@AfterTest
public void CloseBrowser() 
{

	driver.close();
}
}
