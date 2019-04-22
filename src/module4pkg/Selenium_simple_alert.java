package module4pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_simple_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
				
		//Simple Alert
		
		  driver.findElement(By.id("alert")).click();     // to click the button so that it opens an alert box
		  		  
		// initialize Alert
		  Alert a = driver.switchTo().alert();
		  System.out.println(a.getText()+ " Simple Alert");
		  a.accept();										// to ok
		  Thread.sleep(5000);
		  driver.close();

	}

}
