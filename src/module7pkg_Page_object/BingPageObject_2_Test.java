package module7pkg_Page_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingPageObject_2_Test {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.bing.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		BingPageObjects2 page=new BingPageObjects2(driver);
		page.search("Selenium");
		
		page.clickSelenium();
		
		
	}

}
