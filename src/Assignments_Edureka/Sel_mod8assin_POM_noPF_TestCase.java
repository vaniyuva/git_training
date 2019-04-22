package Assignments_Edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_mod8assin_POM_noPF_TestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.Gmail.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		Sel_mod8Assign_POM_NoPF_Gmail log=new Sel_mod8Assign_POM_NoPF_Gmail(driver);
		String uid="vaniyuva88@gmail.com";
		String pwd="******";
		log.login(uid, pwd);
		
		//Compose mail  class file
		
		Sel_mod8assign_POM_noPF_Compose comp=new Sel_mod8assign_POM_noPF_Compose(driver);
			
		String toID="vaniyuva88@gmail.com";
		String sub="Test mail for selenium";
		String msg="Hi Selenium";
		comp.composeMail(toID, sub, msg);
		
		comp.logout();

	}

}
