package module4pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_practise_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		
		
		
			
			driver.findElement(By.id("ts_first_name")).sendKeys("vani");  //Firstname
			Thread.sleep(1000);
			driver.findElement(By.name("ts_last_name")).sendKeys("yuva"); // last name
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='ts_address']")).sendKeys("Chennai/Tamilnadu/India");  // address
			Thread.sleep(1000);
			
			Select st=new Select(driver.findElement(By.name("ts_country")));  //nationality
			st.selectByVisibleText("India");
			Thread.sleep(1000);
		
			
		// using CSS values
			//to select male/female
			driver.findElement(By.cssSelector("#post-body-8780970208820941936 > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > p > label:nth-child(2) > input[type=\"radio\"]")).click();
			Thread.sleep(1000);

		//xpath	
			driver.findElement(By.xpath("//*[contains(@value,'cricket')]")).click();   //cricket checkbox checked
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='Submit1']")).click();     //submitting the form
			Thread.sleep(3000);
			System.out.println("Your Form is Submitted Successfully");
		//Link-text
			driver.findElement(By.linkText("Here")).click();
			Thread.sleep(3000);
			//driver.navigate().back();
			//driver.quit();
			
			

	}

}
