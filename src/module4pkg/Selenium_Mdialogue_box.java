package module4pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Mdialogue_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//*[@class=\"_2AkmmA _29YdH8\"]")).click();
		WebElement e = driver.findElement(By.xpath("//*[starts-with(@title,'Search')]"));
		e.sendKeys("Iphone");
		e.sendKeys(Keys.ENTER);
		System.out.println("Dialogue box is closed and searched for iphone");
		//driver.close();
		

		
			
	
		
	}

}
