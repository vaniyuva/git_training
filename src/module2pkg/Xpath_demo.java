package module2pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// open Browser
		System.setProperty("webdriver.chrome.driver","D:\\Vani_selenium\\Installation_stuff\\ExeFile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//open URL
		driver.get("https://wwww.facebook.com");
		
//X Path functions
//Absolute Xpath - not comaptible as  we have to give whole path from parent to child.
		
		//Relative Xpath
		// using attribute
			driver.findElement(By.xpath("//*[@id='u_0_c']")).sendKeys("vani"); 			 //fname
			driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys("yuva"); 			//sname.. note here tagname input is used. * can be used in general
		
	//Handling dynamic elements using Xpath
			
// Xpath Contains
			
			driver.findElement(By.xpath("//*[contains(@id,'email')]")).sendKeys("vaniyuva"); 			// using id as attribute of text box itself
		//	driver.findElement(By.xpath("//label[contains(text(),'Email')]"));			 // using  text method for the label .this will just fetch the label name
		
	//Xpath starts-with
			
			 driver.findElement(By.xpath("//*[starts-with(text(),'Forgot')]"));// using text method
			//driver.findElemnet(By.xpath("//*[starts-with(@href,'https://www.facebook.com/recover/initiate?')]"));			 //@href attribute
			
		
//Xpath axes
			
	//Xpath following        -- from one attribute we pass value to the next following attribute or field /textbox
			
				driver.findElement(By.xpath("//*[@id='u_0_h']//following::input[3]")).sendKeys("**"); 		// from mobile number field  , passed input to new password field
               // driver.findElement(By.xpath("//*[@id='u_0_h']//following::input[@id='u_0_o']")).sendKeys("**"); //another way
				
	//Xpath preceding   
				
				driver.findElement(By.xpath("//*[@id='u_0_o']//preceding::input[3]")).sendKeys("9787223834");   //from new password to mobile
			//	driver.findElement(By.xpath("//*[@id='u_0_o']//preceding::input[@id='u_0_h']")).sendKeys("9787334");  // another waay
				
				
	// Xpath following-sibling   -- multiple choice options DOB-- drop down choices
				
				//driver.findElement(By.xpath("//*[@id='day']//following-sibling::option[4]")).click();
				     /* here  it shows more list so siblings wont be comaptible
				         so we can go for following xpath, from day to YEAR value can be given */	
				
				driver.findElement(By.xpath("//*[@id='day']//following::select/option[4]")).click();  // year selection
			
	// Xpath preceding-sibling
				//driver.findElement(By.xpath("//*[@id='day']//preceding-sibling::option[4]")).click();
						// here  it shows more list so siblings wont be comaptible
		         		//so we can go for following xpath, from day to MONTH value can be given	
				driver.findElement(By.xpath("//*[@id='day']//preceding::select/option[4]")).click();   //month selection
				driver.findElement(By.xpath("//*[@id='year']//preceding::select/option[29]")).click();  //day selection

		// xpath contains .. to select female/male option
				
				driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();;

		Thread.sleep(100); 
				
				
	

	}

}


   
