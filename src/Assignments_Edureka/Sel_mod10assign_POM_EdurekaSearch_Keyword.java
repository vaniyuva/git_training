package Assignments_Edureka;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Sel_mod10assign_POM_EdurekaSearch_Keyword {
	
	public   Sel_mod10assign_POM_EdurekaSearch_Keyword(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath="//*[@id='search-inp']")
	WebElement searchBar;
	
	@FindBy(xpath="//*[@id=\"add-training-courses\"]/a[1]/div[1]")
	WebElement clickDevops;
	
	
	public void searchCourse()
	{
		
			searchBar.sendKeys("Devops");
			searchBar.sendKeys(Keys.ENTER);
			clickDevops.click();
			//System.out.println("You have Searched for Devops Certification course!!"+clickDevops.getText());
					
	}
	
	

}
