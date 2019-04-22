package module5pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.name("q")).sendKeys("jackets");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();;
		WebElement mh=driver.findElement(By.cssSelector("#container > div > div.t-0M7P._2doH3V > div._3e7xtJ > div > div._1HmYoV.hCUpcT > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(3) > div > a > div:nth-child(1) > div > div._3JlYXy > div > img"));
		
		Actions act=new Actions(driver);
		act.moveToElement(mh).perform();
		
		
	//	Thread.sleep(5000);
	//	driver.close();
	}

}
