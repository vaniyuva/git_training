package module7pkg_Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingPageObjects {
	
	public BingPageObjects(WebDriver driver)
	{
		//this is a PageFactory in Selenium which will initialize all the below WebElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	WebElement searchbar;
	
	@FindBy(name = "go")
	WebElement ClickSearch;
}
