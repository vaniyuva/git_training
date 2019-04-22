package Assignments_Edureka;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.SikuliException;

public class Sel_mod10assign_POM_TestEdureka_Keyword {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException, SikuliException {
				
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		
		
		Sel_mod10assign_POM_EdurekaLogin_Keyword eLogin= new Sel_mod10assign_POM_EdurekaLogin_Keyword(driver);
		Sel_mod10assign_POM_EdurekaSearch_Keyword eSearch = new Sel_mod10assign_POM_EdurekaSearch_Keyword(driver);
		Sel_mod10assign_POM_EduADDCourse_keyword eAdd= new Sel_mod10assign_POM_EduADDCourse_keyword(driver);
		Sel_mod10assign_POM_EduPayDetails_Keyword ePay= new Sel_mod10assign_POM_EduPayDetails_Keyword(driver);

		
		String path="D:\\Vani_selenium\\Workspace\\selenium_Training\\src\\Assignments_Edureka\\mod10Edureka.xlsx";
		Sel_mod10assign_POM_ExcelUtilities_Keyword.setExcel(path,0);
		
		for(int i=1;i<=4;i++)
		{
			String str="pass";
			String word=Sel_mod10assign_POM_ExcelUtilities_Keyword.getData(i,1);
		/*	if(word.equals("signin"))
			{
				eLogin.signin();
				eLogin.clickSignin();
				Sel_mod10assign_POM_ExcelUtilities_Keyword.passData(path,i, 2,str);
			}
		*/
		
			 if(word.equals("searchCourse"))
			{
				eSearch.searchCourse();
				Sel_mod10assign_POM_ExcelUtilities_Keyword.passData(path,i, 2,str);
			}
			else if(word.equals("addCart"))
			{
				eAdd.addCart();
				Sel_mod10assign_POM_ExcelUtilities_Keyword.passData(path,i, 2,str);
											
			}
		
			else if(word.equals("CheckOut"))
			{
				eAdd.CheckOut();
				
				Sel_mod10assign_POM_ExcelUtilities_Keyword.passData(path,i, 2,str);
					
			}
			
			else if(word.equals("updateAddress"))
			{
				
				String addr="3478 St Bart";
				String aptno="201";
				String city="Tampa";
			
				String cw=driver.getWindowHandle();
				System.out.println(cw);
				for(String nw : driver.getWindowHandles())
				{
				System.out.println("new Window : "+nw);
				driver.switchTo().window(nw);
				}
		
				
				ePay.updateAddress(addr, aptno, city);
				Sel_mod10assign_POM_ExcelUtilities_Keyword.passData(path,i, 2,str);
				driver.close();	
				driver.switchTo().window(cw);
				driver.navigate().back();
			//	eLogin.logout();
				Thread.sleep(5000);
				driver.close();
				
			} 
			
			
	}
		
	}
}
