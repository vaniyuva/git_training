package module7pkg_Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject1 {
	
	public PageObject1(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Log In")
	WebElement log;
	
	@FindBy(id="si_popup_email")
	WebElement email;
	
	@FindBy(id="si_popup_passwd")
	WebElement pwd;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement logClick;
	
	
	@FindBy(xpath="//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a/img")
	WebElement l_img;
	
	@FindBy(linkText="Log Out")
	WebElement logout;
	
	
	
	public void login(String mail_id,String passwd)
	{
		email.sendKeys(mail_id);
		pwd.sendKeys(passwd);
	}
		
	public void loginClick()
	{
		logClick.click();
	}
	
	public void quit(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();	
	}
	
}
