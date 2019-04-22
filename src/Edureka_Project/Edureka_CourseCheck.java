package Edureka_Project;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Edureka_CourseCheck {
	
	public   Edureka_CourseCheck(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(id="dropdownMenu3")
	WebElement clickCourses;
	
	@FindBy(linkText="My Classroom")
	WebElement clickClassroom;
	
	@FindBy(xpath="//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/section[2]/div/div/div/div[1]")
	WebElement element1;
	
	@FindBy(xpath="//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/section[2]/div/div/div/div[2]/div[3]")
	WebElement element2;
	
	@FindBy(xpath="//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[6]/div/button")
	WebElement logout_img;
	
	@FindBy(linkText="Log Out")
	WebElement logout;
	
	
	
	public void CourseCheck()
	{
		
			clickCourses.click();;
			clickClassroom.click();
			String check=element1.getText();
			if(check.contains("It looks like you are not enrolled for any course"))
			{
			System.out.println(check);
			}
			else
			{
				System.out.println(check);
				String check1=element2.getText();
				System.out.println("You have Enrolled to "+check1);
				
				
			}
			System.out.println("CourseValidation testcase has been completed successfully");	
			logout_img.click();
			logout.click();
						
	}
	
	

}
