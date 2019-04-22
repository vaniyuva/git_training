package module3pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_wait_cmds_blogForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chrome browser lauch
		
				System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();   // maximize the window
				
/*		
			//Firefox launch
				System.setProperty("webdriver.gecko.driver", "D:\\Vani_selenium\\Installation_stuff\\ExeFile\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
		    //	driver.manage().window().fullscreen();
*/
			// open link
			 	 
				driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
			//Implicit wait and pageload wait	
			    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
				
			//using ID
				
				driver.findElement(By.id("ts_first_name")).sendKeys("vani");  //Firstname
				
			//using name	
				driver.findElement(By.name("ts_last_name")).sendKeys("yuva"); // last name
				

				
			//using Classname
					//	driver.findElement(By.className(""))
				
			//using Xpath
				driver.findElement(By.xpath("//*[@id='ts_address']")).sendKeys("Chennai/Tamilnadu/India");  // address
/*		
	//Explicit wait			
			WebDriverWait wait=new WebDriverWait(driver,10);
        	WebElement e= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ts_country > option:nth-child(2)")));
		    e.click(); 
		
*/				
				driver.findElement(By.xpath("//*[@id='ts_address']//following::option[2]")).click();       //nationality
				

			// using CSS values
				//to select male/female
				driver.findElement(By.cssSelector("#post-body-8780970208820941936 > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > p > label:nth-child(2) > input[type=\"radio\"]")).click();
				

			//xpath	
				driver.findElement(By.xpath("//*[contains(@value,'cricket')]")).click();   //cricket checkbox checked
				
				driver.findElement(By.xpath("//*[@name='Submit1']")).click();     //submitting the form
				    //driver.findElement(By.xpath("//*[starts-with(text(),'Here')]")).click();   // to  return to home page
				
				System.out.println("Your Form is Submitted Successfully");
			//Link-text
				driver.findElement(By.linkText("Here")).click();
				
				//driver.quit();
					
		

	}

}
