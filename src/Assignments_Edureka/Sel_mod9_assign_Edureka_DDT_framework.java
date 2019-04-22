package Assignments_Edureka;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.CellType;
import jxl.LabelCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Sel_mod9_assign_Edureka_DDT_framework {
	public WebDriver driver;
	Workbook WB;
	WritableWorkbook wbw;
	Sheet sh;
	WritableSheet shw;
	WritableCell cell;
	//String path="D:\\Vani_selenium\\Workspace\\selenium_Training\\src\\Assignments_Edureka\\Edureka_login.xls";
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
		driver.get("https://www.edureka.co/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement we=wait.until(ExpectedConditions.elementToBeClickable((By.linkText("Log In"))));
		we.click();
		
	}
@Test(priority=0,dataProvider ="TD")
public void login(String mailID,String passwd)
{
	
	driver.findElement(By.id("si_popup_email")).sendKeys(mailID);
	driver.findElement(By.id("si_popup_passwd")).sendKeys(passwd);
	driver.findElement(By.xpath("//button[text()='Login']")).click();
}

@DataProvider(name="TD")
public Object[][] TestDataFeed() throws IOException, BiffException
{
	FileInputStream fis=new FileInputStream("D:\\Vani_selenium\\Workspace\\selenium_Training\\src\\Assignments_Edureka\\edurekaLogin.xls");
	WB=Workbook.getWorkbook(fis);
	sh=WB.getSheet(0);
	rowno=sh.getRows();
	colno=sh.getColumns();
	System.out.println("row"+rowno);
	
	System.out.println("col"+colno);
	
	Object[][] FormData = new Object [rowno][colno];
	
	for(int i=1; i<rowno; i++) 
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


@Test(priority=1)
public void passData() throws IOException,WriteException
{
	FileOutputStream fos=new FileOutputStream("D:\\\\Vani_selenium\\\\Workspace\\\\selenium_Training\\\\src\\\\Assignments_Edureka\\\\edurekaLoginCopy.xls");
	wbw=Workbook.createWorkbook(fos,WB);
	shw=wbw.getSheet(1);
	
	//cell=shw.getWritableCell(1,2);
	String msg="pass";
		
	
	Label label= new Label(3,2,msg);
	cell=label;
	shw.addCell(cell);
	
	wbw.write();
	fos.close();
	
}

@Test(priority=2)
public void openBlogs()
{
	driver.findElement(By.linkText("Blog")).click();
	//int tab_index=1;
	//ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
   // driver.switchTo().window(tabs_windows.get(tab_index));
	WebElement we=driver.findElement(By.id("search-inp"));
	we.sendKeys("selenium");
	//we.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"remote\"]/div[2]/ul/li[5]/a/span/span/a")).click();
	
}
@Test(priority=3)
public void logout()
{
	
		//driver.findElement(By.className("img30")).click();
		WebDriverWait wait2=new WebDriverWait(driver,30);
		WebElement we3=wait2.until(ExpectedConditions.elementToBeClickable((By.linkText("Logout"))));
		we3.click();
	
}

@AfterTest
public void quit() throws InterruptedException
{ 
	Thread.sleep(2000);
	driver.quit();
}

}

