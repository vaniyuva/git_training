package Assignments_Edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sel_mod2_assign_BlogForm {

	//Automation script for filling the blogForm of abresh's blog
	public static void main(String[] args) throws InterruptedException {
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
		
		
	//using ID
		
		driver.findElement(By.id("ts_first_name")).sendKeys("vani");  //Firstname
		Thread.sleep(1000);
	//using name	
		driver.findElement(By.name("ts_last_name")).sendKeys("yuva"); // last name
		Thread.sleep(1000);

	//using Classname
			//	driver.findElement(By.className(""))
		
	//using Xpath
		driver.findElement(By.xpath("//*[@id='ts_address']")).sendKeys("Chennai/Tamilnadu/India");  // address
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//*[@id='ts_address']//following::option[2]")).click();       //nationality
		Thread.sleep(1000);

	// using CSS values
		//to select male/female
		driver.findElement(By.cssSelector("#post-body-8780970208820941936 > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > p > label:nth-child(2) > input[type=\"radio\"]")).click();
		Thread.sleep(1000);
		
	//xpath	
		driver.findElement(By.xpath("//*[contains(@value,'cricket')]")).click();   //cricket checkbox checked
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='Submit1']")).click();     //submitting the form
		    //driver.findElement(By.xpath("//*[starts-with(text(),'Here')]")).click();   // to  return to home page
		Thread.sleep(3000);
		System.out.println("Your Form is Submitted Successfully");
	//Link-text
		driver.findElement(By.linkText("Here")).click();
		Thread.sleep(3000);
		//driver.navigate().back();
		driver.quit();
		
		
		
		
	
	
		


		
		
	}

	
}
