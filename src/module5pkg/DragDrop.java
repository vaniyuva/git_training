package module5pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		
		//Get into the Frame by iFrame
		
			//driver.findElement(By.xpath("//iframe[@src=\"/resources/demos/droppable/default.html\"]"));
		WebElement iFrame =driver.findElement(By.tagName("iframe"));
		
		//switch to Frame
		driver.switchTo().frame(iFrame);
		
		//Source location ---From  where to Drag
		WebElement drag=driver.findElement(By.id("draggable"));
		
		//Drop location--- Where To Drop
		WebElement drop=driver.findElement(By.id("droppable"));
		
		//Mouse Actions to drag and drop
			Actions act=new Actions(driver);
			act.dragAndDrop(drag,drop).perform();
			
			Thread.sleep(3000);
			driver.close();
			
		
	}

}
