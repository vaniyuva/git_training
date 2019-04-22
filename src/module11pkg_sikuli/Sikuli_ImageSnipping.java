package module11pkg_sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;


public class Sikuli_ImageSnipping {

	public static void main(String[] args) throws SikuliException, InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","D:\\\\Vani_selenium\\\\Installation_stuff\\\\ExeFile\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("https://www.edureka.co/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			
			Screen s= new Screen();
			Pattern login=new Pattern("D:\\Vani_selenium\\Workspace\\Sikuli\\log.JPG");
			s.getScreen().click(login);
			
			Pattern email=new Pattern("D:\\Vani_selenium\\Workspace\\Sikuli\\Email.JPG");
			s.getScreen().type(email,"vaniyuva88@gmail.com");
			
			Pattern passwd=new Pattern("D:\\Vani_selenium\\Workspace\\Sikuli\\passwd.JPG");
			s.getScreen().type(passwd,"edureka88");
			
			Pattern clickLogin=new Pattern("D:\\Vani_selenium\\Workspace\\Sikuli\\login.JPG");
			s.getScreen().click(clickLogin);
			
			Thread.sleep(3000);
			
			Pattern logOut_img=new Pattern("D:\\Vani_selenium\\Workspace\\Sikuli\\Lout_img.JPG");
			s.getScreen().click(logOut_img);
			
			Pattern ClickLogout=new Pattern("D:\\Vani_selenium\\Workspace\\Sikuli\\Logout.JPG");
			s.getScreen().click(ClickLogout);
			
			
			
			
			}
}

