package Assignments_Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sel_mod8Assign_POM_NoPF_Gmail {
	WebDriver driver;
	
	public Sel_mod8Assign_POM_NoPF_Gmail(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By userid=By.name("identifier");
	
	By uNext=By.id("identifierNext");
	
	By passwd=By.name("password");
	
	By pNext=By.id("passwordNext");
	
	
	public void login(String uid,String pwd)
	{
		//driver.findElement(userid).clear();
		driver.findElement(userid).sendKeys(uid);
		driver.findElement(uNext).click();
		//driver.findElement(passwd).clear();
		driver.findElement(passwd).sendKeys(pwd);
		driver.findElement(pNext).click();
		
	}

}
