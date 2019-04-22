package Edureka_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Edureka_Login {
	
	
	public   Edureka_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(linkText="Log In")
	WebElement loginLink;
	
	@FindBy(id="si_popup_email")
	WebElement mailID;
	
	@FindBy(id="si_popup_passwd")
	WebElement passwd;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement clickLogin;
	
	@FindBy(xpath="//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[6]/div/button")
	WebElement logout_img;
	
	@FindBy(linkText="Log Out")
	WebElement logout;
	
		
	public  void signin(String mID,String pwd) throws InterruptedException
//	public  void signin() throws InterruptedException
	{
		loginLink.click();
		Thread.sleep(2000);
		mailID.clear();
		mailID.sendKeys(mID);
	//	mailID.sendKeys("vaniyuvacse@gmail.com");
		Thread.sleep(1000);
		passwd.sendKeys(pwd);
	//	passwd.sendKeys("edureka88");
		clickLogin.click();
	}
	
	
	public void logout()
	{
		logout_img.click();
		logout.click();
	
	}

	
}
