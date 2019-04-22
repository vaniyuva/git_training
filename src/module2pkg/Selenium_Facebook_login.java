package module2pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Facebook_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	// open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Vani_selenium\\Installation_stuff\\ExeFile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//open URL
		driver.get("https://wwww.facebook.com");

	//locate firstname textbox and type vani using id locator
		     driver.findElement(By.id("u_0_c")).sendKeys("vani");
        //  driver.findElement(By.id("email")).sendKeys("vaniyuvabe@gmail.com");
        //  driver.findElement(By.id("pass")).sendKeys("flower88");
        //  driver.findElement(By.id("u_0_2")).click();
    // using Name locator attribute
		   driver.findElement(By.name("lastname")).sendKeys("yuva");
		   
    //Using classname
		    // driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("9787223834"); // not works bcs class attribute is common for all
		    

	// using Linktext
		 driver.findElement(By.linkText("Forgot account?")).click();
		 Thread.sleep(5000);
		 driver.navigate().back();
		 
    // using PartialLinktext
	 driver.findElement(By.partialLinkText("Forgot")).click();
	 Thread.sleep(5000);
	 driver.navigate().back();
	 
	 //using css locator
	 driver.findElement(By.cssSelector("#u_0_15> span:nth-child(1) > label")).click(); // female option will select
	 
	 
	 
	 
	 
		 
		 
		
		
	
		
	}

}
