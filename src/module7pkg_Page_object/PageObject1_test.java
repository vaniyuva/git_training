package module7pkg_Page_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject1_test {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		PageObject1 page=new PageObject1(driver);
		
		page.log.click(); //log in button clicking to enter id & passwd
		
		page.login("vaniyuva88@gmail.com","edureka88");
		page.loginClick();
		
		
		page.l_img.click();
		page.logout.click();
		
		page.quit(driver);	

	}

}
