package module5pkg;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchWindow2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows//");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// Part1 - get the name of the main window
				String mw = driver.getWindowHandle();

				System.out.println("Main Window Name - " + mw);
				
				System.out.println("=========================================================================");

				Thread.sleep(5000);

				// Part2 - Click on the new message window button
				driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
				
				Thread.sleep(5000);

				// Part3 - 2 windows are opened and we are capturing the names of both the windows
				Set awn = driver.getWindowHandles();
				
				System.out.println("All Window Name - " + awn);
				
				System.out.println("=========================================================================");
				
				Thread.sleep(5000);
						
				//Part4 - using the for loop we are going to switch between the main window and the new windows.
				for(String nw : driver.getWindowHandles()) {
					
					Thread.sleep(5000);
					
					driver.switchTo().window(nw);

					Thread.sleep(5000);
					
					driver.switchTo().window(nw);
							
				}
				
		
		
		
		
	}

}
