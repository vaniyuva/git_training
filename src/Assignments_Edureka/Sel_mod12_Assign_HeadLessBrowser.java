package Assignments_Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Sel_mod12_Assign_HeadLessBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		WebElement we=driver.findElement(By.name("q"));
		we.sendKeys("Edureka");
		we.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println("The window title is "+driver.getTitle());
		
		
		

	}

}
