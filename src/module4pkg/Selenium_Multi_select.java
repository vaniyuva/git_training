package module4pkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Multi_select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		// Initiate SELECT class
				
		Select oselect = new Select(driver.findElement(By.name("selenium_commands")));
		List<WebElement> list = oselect.getOptions();
		int total= list.size();
		
		System.out.println("Total options available "+total );
		
				
		//SelectByIndex 
		
		oselect.selectByIndex(2);
		Thread.sleep(3000);
		oselect.deselectByIndex(2);
		Thread.sleep(3000);
		
		//Multiple Select
		
		for(int i=0;i<total;i+=2)
		{
			String str=list.get(i).getText();
			oselect.selectByIndex(i);
			System.out.println(str+" is selected");
		}
		
		Thread.sleep(3000);
		oselect.deselectAll();
		
	
		
		
		
		

	}

}
