package Assignments_Edureka;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_mod8_Assign_Gmail_PageFactory_Test {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.Gmail.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		Sel_mod8_assign_Gmail_POM_PF log=new Sel_mod8_assign_Gmail_POM_PF(driver);
		String id="vaniyuva88@gmail.com";
		String pass="*******";
		log.login(id, pass);
		
		//Compose mail  class file
		
		Sel_mod8_assign_Gmail_PF_Compose com=new Sel_mod8_assign_Gmail_PF_Compose(driver);
				
		com.mailCompose.click();
	/*	
		int tab_index=1;
		ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs_windows.get(tab_index));
	*/	
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\":q3\"]")));
					
		String toID="vaniyuva88@gmail.com";
		String sub="Test mail for selenium";
		String msg="Hi Selenium";
		com.composeMail(toID, sub, msg);
		
		com.logout();
		
		
	}

}
