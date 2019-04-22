package module7pkg_Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Tour_HotelsPage {
	
	public POM_Tour_HotelsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Hotels")
	WebElement hotelpage;
	
	@FindBy(linkText="SIGN-OFF")
	WebElement signoff;
	
	
	
	
	
	

}
