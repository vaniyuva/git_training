package Assignments_Edureka;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_mod2_assign_edureka_login {

	public static void main(String[] args) throws InterruptedException {
	
		//Chrome launch
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
/*
		//Firefox launch
			System.setProperty("webdriver.gecko.driver", "D:\\Vani_selenium\\Installation_stuff\\ExeFile\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
	    //	driver.manage().window().fullscreen();
*/
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");
		
		//Thread.sleep(3000);
		
	    driver.findElement(By.id("wzrk-cancel")).click();      //to close the pop-up
		
		driver.findElement(By.id("search-inp")).sendKeys("a");;                                           //  using id
		
		driver.findElement(By.name("user_v1[query]")).sendKeys("b");;                                     // using name
		//driver.findElement(By.className("search_inp collapse giTrackElementHeader")).sendKeys("c");;    // using classname
		driver.findElement(By.cssSelector("#search-inp")).sendKeys("d");;                                 // using CSS
		
		driver.findElement(By.xpath("//*[@id='search-inp']")).sendKeys("e");;                             // using Xpath
		
		List <WebElement> list = driver.findElements(By.tagName("a"));                                    // using tagname
		System.out.println("No of link tag " +list.size());
		
		driver.findElement(By.linkText("Log In")).click();  	                                          // Using Linktext
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#new_sign_up_mode > div > div > div.modal-header > button")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.partialLinkText("Log")).click();  // using partiallink text
		Thread.sleep(2000);	 
		driver.findElement(By.cssSelector("#new_sign_up_mode > div > div > div.modal-header > button")).click();
		driver.quit();
		
	}

}
