package Assignments_Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_mod8_assign_Gmail_PF_Compose {
	public Sel_mod8_assign_Gmail_PF_Compose(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//*[@class='T-I J-J5-Ji T-I-KE L3' and @role='button']")
	WebElement mailCompose;
	
		
	@FindBy(xpath="//*[@id=\":q3\"]")
	WebElement toMail;

	
	@FindBy(id=":pl")
	WebElement Subject;
	
	@FindBy(id=":qq")
	WebElement message;
	
	@FindBy(id=":pb")
	WebElement clickSend;
	
	@FindBy(xpath="//*[@class='gb_b gb_hb gb_R']")
	WebElement log_out_img;
	
	@FindBy(linkText="Sign out")
	WebElement log_out;
	
	
	
	public void composeMail(String toID,String sub,String msg) throws InterruptedException
	{
		
		toMail.click();
		toMail.sendKeys(toID);
		Subject.sendKeys(sub);
		message.sendKeys(msg);
		clickSend.click();
		
	}
	
	public void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		log_out_img.click();
		log_out.click();
	
		
	}
	
	
	
	

}
