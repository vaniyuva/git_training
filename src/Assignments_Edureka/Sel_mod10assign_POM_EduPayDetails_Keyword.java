package Assignments_Edureka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Sel_mod10assign_POM_EduPayDetails_Keyword {
	public Sel_mod10assign_POM_EduPayDetails_Keyword(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="billingLine1")
	WebElement address;
	
	
	@FindBy(id="billingLine2")
	WebElement address2;
	
	@FindBy(id="billingCity")
	WebElement address3;
	
	public void updateAddress(String addr,String aptno,String city) throws InterruptedException, SikuliException
	{
		
		address.sendKeys(addr);
		address2.sendKeys(aptno);
		address3.sendKeys(city);
		
	}

}
