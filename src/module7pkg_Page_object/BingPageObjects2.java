package module7pkg_Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingPageObjects2 {
	public BingPageObjects2(WebDriver driver)
	{
		//this is a PageFactory in Selenium which will initialize all the below WebElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	WebElement searchbar;
	
	@FindBy(name = "go")
	WebElement ClickSearch;
	
	@FindBy(linkText = "Selenium - Web Browser Automation")
	WebElement LinkClick;
	
	public void search(String str)
	{
		searchbar.clear();
		searchbar.sendKeys(str);
		ClickSearch.click();
	}
	
	public void clickSelenium()
	{
		LinkClick.click();
	}

}
