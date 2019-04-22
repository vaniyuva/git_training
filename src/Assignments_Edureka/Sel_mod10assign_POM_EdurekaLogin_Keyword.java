package Assignments_Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_mod10assign_POM_EdurekaLogin_Keyword {
	
	
	public   Sel_mod10assign_POM_EdurekaLogin_Keyword(WebDriver driver)
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
	
	@FindBy(className="img30")
	WebElement logout_img;
	
	@FindBy(linkText="Log Out")
	WebElement logout;
	
	
	
	public  void signin() throws InterruptedException
	{
		loginLink.click();
		//mailID.clear();
		mailID.sendKeys("vaniyuva88@gmail.com");
		passwd.sendKeys("edureka88");
	}
	
	public void clickSignin()
	{
		clickLogin.click();
	}
	
	public void logout()
	{
		logout_img.click();
		logout.click();
	
	}

	
}
