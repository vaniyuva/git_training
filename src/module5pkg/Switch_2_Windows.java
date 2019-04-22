package module5pkg;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Switch_2_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("Youtube");
			
		String win=driver.getWindowHandle();
		System.out.println("Main Window "+win);
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		Actions act=new Actions(driver);
		Action key=	act.moveToElement(gmail)
				.keyDown(gmail,Keys.SHIFT)
				.click(gmail)
				.keyUp(gmail, Keys.SHIFT)
				.build();
		key.perform();
			
		//gets both window names
		Set aw = driver.getWindowHandles();
		System.out.println("Both window names are " +aw);
		//Switching windows
			for(String nw : driver.getWindowHandles()) {
				
				Thread.sleep(5000);
				
				driver.switchTo().window(nw);

				Thread.sleep(5000);
				
				driver.switchTo().window(nw);
						
		}
		}
		
		
		
	}


