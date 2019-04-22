package Assignments_Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Sel_mod10assign_POM_EduADDCourse_keyword {
	
	public Sel_mod10assign_POM_EduADDCourse_keyword(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//button[@class='paypal' and text()='ENROLL NOW PAY LATER']")
	WebElement addCart;
	
	@FindBy(xpath="//*[@id=\"enrollModalcenter\"]/div/div/div[2]/div/form/div[1]/input")
	WebElement Uid;
	
	@FindBy(xpath="//*[@id=\"enrollModalcenter\"]/div/div/div[2]/div/form/div[2]/div/input")
	WebElement phno;
	
	@FindBy(xpath="//*[@id=\"enrollModalcenter\"]/div/div/div[2]/div/form/button")
	WebElement clickLearn;
	
	//@FindBy(xpath="//*[@class='batch_selection osp_ga' and @data-batch-id='11930']")
	//WebElement batch;
	
	@FindBy(xpath="//*[@id=\"bth_select\"]/div/div/div[5]/button")
	WebElement pay;
	
//	@FindBy(xpath="//*[@id=\"paypal-animation-content\"]/div[1]/div[3]/div[4]/img")
//	WebElement mode;

//	@FindBy(xpath="//*[@id=\"paypal-animation-content\"]/div[1]/div[1]/img[1]")
//	WebElement mode;
	
	
	
	public void addCart() throws InterruptedException
	{
		addCart.click();
		Thread.sleep(1000);
		Uid.sendKeys("vaniyuva88@gmail.com");
		Thread.sleep(1000);
		phno.sendKeys("8136062694");
		clickLearn.click();
	}
	
	public void CheckOut() throws InterruptedException, SikuliException
	{
		//batch.click();
		pay.click();
		Screen s= new Screen();
		Pattern paymode=new Pattern("D:\\Vani_selenium\\Workspace\\Sikuli\\paypal.JPG");
		s.getScreen().click(paymode);
		//mode.click();
		Thread.sleep(10000);
		
	}
	
	
	
	
}
