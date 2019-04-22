package Edureka_Project;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edureka_Blogs {
	WebDriver driver;
	
	public Edureka_Blogs(WebDriver driver)
	{
		this.driver=driver;
	}
	
//	By clickHome=By.linkText("Home");
	By clickCommunity=By.id("dropdownMenu4");
	By clickBlog=By.linkText("Blog");
	By searchBlog=By.id("search-inp");
	By question=By.linkText("Interview Questions");
	By SelQuestion=By.linkText("Top Selenium Interview Questions And Answers You Must Prepare In 2019");
	By Lout=By.linkText("Logout");
	By l_img=By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a");
	By Logout=By.linkText("Log Out");
	
	//Edureka_Login B_log =new Edureka_Login(driver);
		
	public void openBlog() throws InterruptedException
	{		
		//B_log.signin();
		Thread.sleep(3000);
		driver.findElement(clickCommunity).click();
		driver.findElement(clickBlog).click();
		
	}
	public void selenium_Blog() throws InterruptedException
	{
		String old_Tab=driver.getWindowHandle();
		int tab_index=1;		
		ArrayList<String> tab_windows= new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab_windows.get(tab_index));
		driver.findElement(searchBlog).sendKeys("Selenium");
		driver.findElement(searchBlog).sendKeys(Keys.ENTER);
		driver.findElement(question).click();
		driver.findElement(SelQuestion).click();
		driver.findElement(Lout).click();
		driver.close();
		Thread.sleep(5000);
	//	System.out.println(driver.getTitle());
		driver.switchTo().window(old_Tab);
		Thread.sleep(3000);
		System.out.println("Blogs testcase has been completed successfully");

		driver.findElement(l_img).click();
		driver.findElement(Logout).click();
		
			
	}
	
	
	
	
	

}
