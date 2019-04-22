package Assignments_Edureka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sel_mod8_assign_Gmail_POM_PF {
	
public Sel_mod8_assign_Gmail_POM_PF(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

@FindBy(name="identifier")
WebElement userid;

@FindBy(id="identifierNext")
WebElement uNext;

@FindBy(name="password")
WebElement passwd;

@FindBy(id="passwordNext")
WebElement pNext;

public void login(String uid,String pwd)
{
	userid.clear();
	userid.sendKeys(uid);
	uNext.click();
	passwd.clear();
	passwd.sendKeys(pwd);
	pNext.click();
	
}
}