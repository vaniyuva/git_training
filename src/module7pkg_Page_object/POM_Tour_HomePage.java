package module7pkg_Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Tour_HomePage {
	
	public  POM_Tour_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="userName")
	WebElement user;
	
	@FindBy(name="password")
	WebElement passwd;
	
	@FindBy(name="login")
	WebElement clickin;
	
	
	public  void signin()
	{
		user.sendKeys("tutorial");
		passwd.sendKeys("tutorial");
	}
	
	public void clickSignin()
	{
		clickin.click();
	}
	
	
	
	
	

}
