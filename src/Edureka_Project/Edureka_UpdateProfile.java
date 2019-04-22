package Edureka_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Edureka_UpdateProfile {
	
	WebDriver driver;
	public Edureka_UpdateProfile(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void updateProfile() throws InterruptedException
	{		
		driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a")).click();
		driver.findElement(By.linkText("My Profile")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"professional_details\"]/i")).click();
		Thread.sleep(2000);
		WebElement f=driver.findElement(By.name("companyName"));
		f.clear();
		f.sendKeys("Ford");
		Thread.sleep(2000);
		WebElement job=driver.findElement(By.name("currentjob"));
		Select j=new Select(job);
		j.selectByValue("Mid Management");
		WebElement industry=driver.findElement(By.name("currentIndustry"));
		Select i=new Select(industry);
		i.selectByValue("IT-Software / Software Services");
		
		WebElement skill=driver.findElement(By.name("userSkill"));
		
		skill.clear();
		Thread.sleep(1000);
		skill.sendKeys("Java,Mainframe,Selenium");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/button[2]")).click();
		
		
	}
	public void updateCareer() throws InterruptedException
	{
	//	WebDriverWait wa=new WebDriverWait(driver,30);
	//	WebElement pz=wa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[1]/app-onboarding-leftnav/ul/li[5]/a")));
	//	pz.click();
		Select oselect=new Select(driver.findElement(By.name("interestedJob")));
		Thread.sleep(2000);
		oselect.selectByValue("Software Testing");
		Thread.sleep(3000);
		Select s1=new Select(driver.findElement(By.name("elementType")));
		Thread.sleep(1000);
		s1.selectByValue("Both");
		Thread.sleep(2000);
		WebElement p1=driver.findElement(By.name("currentCity"));
		p1.clear();
		Thread.sleep(1000);
		p1.sendKeys("Tampa");
		Select s2=new Select(driver.findElement(By.name("lastDrawnSalaryUS")));
		s2.selectByIndex(1);
	//	Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/div[5]/div/label[2]")).click();
	//	Thread.sleep(3000);
		WebDriverWait wait1=new WebDriverWait(driver,30);
		WebElement p2=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/button[2]")));
		p2.click();
		
	}	
	
	public void updateDegree() throws InterruptedException
	{
		
			driver.findElement(By.xpath("//*[@id=\"education-container\"]/button")).click();
			driver.findElement(By.id("degree-name")).sendKeys("B.E(cse");
			driver.findElement(By.id("company-name")).sendKeys("Jayam College/Anna University");
			Select sm=new Select(driver.findElement(By.name("start_month")));
			sm.selectByVisibleText("July");
			Select sy=new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"start_year\"]")));
			sy.selectByVisibleText("2006");
			Select sem=new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"end_month\"]")));
			sem.selectByVisibleText("May");
			Select sey=new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"end_year\"]")));
			sey.selectByVisibleText("2010");
			driver.findElement(By.xpath("//*[@id=\"degree-0\"]/div[3]/div[8]/label")).click();
			Thread.sleep(2000);
			WebDriverWait wait3=new WebDriverWait(driver,30);
			WebElement we1=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-other-details/accordion/accordion-group/div/div[2]/div/form/div/button[1]")));
			we1.click();
			Thread.sleep(3000);
			System.out.println("Profile updation testcase has been completed successfully");
			logout();
		}
	public void logout()
	{
		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[6]/div/button")).click();
		driver.findElement(By.linkText("Log Out")).click();
	}
}
		


	


