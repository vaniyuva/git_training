package module7pkg_Page_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Tour_Test {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		POM_Tour_HomePage  page = new POM_Tour_HomePage(driver);
		page.signin();
		page.clickSignin();
		
		POM_Tour_HotelsPage page1= new POM_Tour_HotelsPage(driver);
		page1.hotelpage.click();
		
		driver.navigate().back();
		 page1.signoff.click();
		 
				Thread.sleep(1000);
				driver.quit();
		
		
	}

}
