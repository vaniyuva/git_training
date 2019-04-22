package Edureka_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;


	public class Edureka_Selenium {
		
		public   Edureka_Selenium(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}	
		
		
		@FindBy(id="dropdownMenu3")
		WebElement clickCourses;
		
		@FindBy(linkText="All Courses")
		WebElement clickAllCourses;
		
		@FindBy(id="search-inp")
		WebElement searchBar;
		
		@FindBy(id="d_wishlist-icon-535")
		WebElement selectCourse;

		@FindBy(xpath="//*[@id=\"add-training-courses\"]/a/div[1]")
		WebElement viewSelenium;
		
		@FindBy(xpath="//button[@class='paypal' and text()='ENROLL NOW PAY LATER']")
		WebElement addCart;
		
		@FindBy(xpath="//*[@id=\"bth_select\"]/div/div/div[5]/button")
		WebElement pay;
		
		@FindBy(id="billingLine1")
		WebElement address;
		
		
		@FindBy(id="billingLine2")
		WebElement address2;
		
		@FindBy(id="billingCity")
		WebElement address3;
		
		@FindBy(xpath="//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a")
		WebElement lout_image;
		
		@FindBy(linkText="Log Out")
		WebElement logout;
				
		
		
		
		public void AddSelenium() throws FindFailed
		{
			clickCourses.click();
			clickAllCourses.click();
			searchBar.sendKeys("selenium");
			searchBar.sendKeys(Keys.ENTER);
			selectCourse.click();
			viewSelenium.click();
			addCart.click();
		}
		
		public void Pay() throws SikuliException
		{
			pay.click();
			Screen s= new Screen();
			Pattern paymode=new Pattern("D:\\Vani_selenium\\Workspace\\Sikuli\\paypal.JPG");
			s.getScreen().click(paymode);
		}
		
		public void updateAddress(WebDriver driver,String addr,String aptno,String city) throws InterruptedException, SikuliException
		{
			Thread.sleep(7000);
			String cw=driver.getWindowHandle();
			System.out.println("Current Window : "+cw+" and "+driver.getTitle());
			for(String nw : driver.getWindowHandles())
			{
			System.out.println("new Window : "+nw);
			driver.switchTo().window(nw);
			}
			Thread.sleep(7000);
			address.sendKeys(addr);
			address2.sendKeys(aptno);
			address3.sendKeys(city);
			driver.close();	
			driver.switchTo().window(cw);
			Thread.sleep(2000);
			driver.navigate().back();
			System.out.println("Selenium Enroll testcase has been completed successfully");
			lout_image.click();
			logout.click();
			
			
		}

}
