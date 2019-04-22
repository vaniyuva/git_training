package Assignments_Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sel_mod8assign_POM_noPF_Compose {
	WebDriver driver;
	public Sel_mod8assign_POM_noPF_Compose(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By mailCompose=By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3' and @role='button']");
			
	By toMail=By.id(":q3");
		
	By Subject=By.id(":pl");
	
	By message=By.id(":qq");
	
	By clickSend=By.id(":pb");
	
	By log_out_img=By.xpath("//*[@class='gb_b gb_hb gb_R']");
		
	By log_out=By.linkText("Sign out");
	
	
	
	
	public void composeMail(String toID,String sub,String msg) throws InterruptedException
	{
		driver.findElement(mailCompose).click();	
		driver.findElement(toMail).sendKeys(toID);
		driver.findElement(Subject).sendKeys(sub);
		driver.findElement(message).sendKeys(msg);
		driver.findElement(clickSend).click();
		
	}
	
	public void logout() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(log_out_img).click();
		driver.findElement(log_out).click();
	
		
	}
	

}
