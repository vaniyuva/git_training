package Edureka_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.SikuliException;

import Assignments_Edureka.Sel_mod10assign_POM_ExcelUtilities_Keyword;

public class Edureka_TestCase {

		public static WebDriver driver;
		public static void main(String[] args) throws IOException, InterruptedException, SikuliException
		{
			System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get("https://www.edureka.co/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			
			Edureka_Login eLogin= new Edureka_Login(driver);
			Edureka_CourseCheck eCheck = new Edureka_CourseCheck(driver);
			Edureka_Blogs blog=new Edureka_Blogs(driver);
			Edureka_Selenium sel=new Edureka_Selenium(driver);
			Edureka_UpdateProfile prof=new Edureka_UpdateProfile(driver);
			
			String mID="vaniyuvacse@gmail.com";
			String pwd="edureka88";
			
			String path="D:\\Vani_selenium\\Workspace\\selenium_Training\\src\\Edureka_Project\\Edureka_ExcelData.xlsx";
			Edureka_Excel.setExcel(path,0);
			for(int i=1;i<=4;i++)
			{
				String str="pass";
				String word=Edureka_Excel.getData(i,1);
				if(word.equalsIgnoreCase("Course Validation"))
				{
					eLogin.signin(mID,pwd);
				//  eLogin.signin();
					eCheck.CourseCheck();
					Thread.sleep(3000);
					Edureka_Excel.passData(path,i, 2,str);
				}
				else if(word.equalsIgnoreCase("Blogs"))
				{
					 eLogin.signin(mID,pwd);
				//   eLogin.signin();
					 blog.openBlog();
					 blog.selenium_Blog(); 
					 Thread.sleep(3000);
					 Edureka_Excel.passData(path,i, 2,str);
				}
				else if(word.equalsIgnoreCase("Enroll Selenium"))
				{
					 eLogin.signin(mID,pwd);
				//	 eLogin.signin();
					 sel.AddSelenium();
					 sel.Pay();
					 sel.updateAddress(driver,"St bart ln","Apt 201","Tampa");
					 Thread.sleep(3000);
					 Edureka_Excel.passData(path,i, 2,str);
				}
				else if(word.equalsIgnoreCase("Profile Updation"))
				{
					 eLogin.signin(mID,pwd);
				//	 eLogin.signin();
					 prof.updateProfile();
					 prof.updateCareer();
					 prof.updateDegree();
					 Thread.sleep(3000);
					 Edureka_Excel.passData(path,i, 2,str);
				}
			}
			
			driver.close();
		
			
	}

}
