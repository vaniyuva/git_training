package module5pkg;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchTabs {

	
	
		public WebDriver driver;
		public void invokeBrowser() 
		{
			
			System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			}
		
			public void openURL() 
			{
				driver.get("https://www.flipkart.com/");
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			}
		
			public void searchSelenium()
			{
			driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
			WebElement we1=driver.findElement(By.name("q"));
			we1.sendKeys("Selenium book");
			we1.sendKeys(Keys.ENTER);
			driver.findElement(By.linkText("Mastering Selenium WebDriver 3.0")).click();
			System.out.println("Main Tab :"+driver.getTitle());
			}
		
		public void Switch_tabs() throws InterruptedException
		{
			// To swtich to next window tabs.
			//here new tab will always open but not thw control to the new tab
			//one way of switching the control  between tabs
			
			int tab_index=1;
			ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs_windows.get(tab_index));
		    
		    
		   //Another way of switching the contols to tab
			/*
		    Set<String> tab_handles = driver.getWindowHandles();
		    int number_of_tabs = tab_handles.size();
		    System.out.println("Total tabs :"+number_of_tabs);
		    int new_tab_index = number_of_tabs-1;
		    driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString()); 
		    */
		   		    
		    System.out.println("Current Tab :"+driver.getTitle());
		    
		    //ADD cart
		    WebDriverWait wait2=new WebDriverWait(driver,30);
			WebElement we5=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li[1]/button")));
			we5.click();
			
			//Switch the control to main tab and searc for jacket
			 driver.switchTo().window(tabs_windows.get(0));
			 Thread.sleep(1000);
			 	WebElement we1=driver.findElement(By.name("q"));
			 	we1.clear();
			 	Thread.sleep(1000);
				we1.sendKeys("jackets");
				we1.sendKeys(Keys.ENTER);
				
				 System.out.println("Current Tab :"+driver.getTitle());
			 
		    
		    
		    Thread.sleep(2000);
		    driver.quit();
		

	}
		
		public static void main(String[] args) throws InterruptedException {
			
			SwitchTabs ST=new SwitchTabs();
			ST.invokeBrowser();
			ST.openURL();
			ST.searchSelenium();
			ST.Switch_tabs();
			
		}

}
