package module4pkg;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		// Initiate SELECT class
				
		Select oselect = new Select(driver.findElement(By.xpath("//select[@name=\"continents\"]")));
				
		//SelectByValue -- Asia
		
		oselect.selectByValue("a");
		Thread.sleep(3000);
		
		//SelectByIndex --Africa
		
		oselect.selectByIndex(2);
		Thread.sleep(3000);
		
		//SelectByVisibleText
		
		oselect.selectByVisibleText("South America");
	
		
		List<WebElement> list = oselect.getOptions();
		System.out.println("Total options available "+list.size() );
		
		

	}

}
