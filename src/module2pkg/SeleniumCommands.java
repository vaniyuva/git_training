package module2pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//open browser/instantiate the browser
		
	// Chrome Browser
		System.setProperty("webdriver.chrome.driver'", "D:\\Vani_selenium\\Installation_stuff\\ExeFile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//Firefox Browser
		System.setProperty("webdriver.gecko.driver'", "D:\\Vani_selenium\\Installation_stuff\\ExeFile\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
	//Internet Explorer
		System.setProperty("webdriver.ie.driver", "D:\\Vani_selenium\\Installation_stuff\\ExeFile\\IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		
		
//Quit and Close Browser
	    driver.quit();  // quits all the windows opened in current execution
	    driver.close90; // closes the current active window
// Get Commands
	    driver.get('URL');  // open URl of AUT
	    driver.getCurrentUrl();  //this will get the current url available into the browser
	    driver.getTitle(); // this will capture the current title of the page
	    driver.getWindowHandle(); // this will help to get the names of the window with which can shift b/w
//Navigation commands
	    driver.navigate().to('URL'); // gets particular URL which is not ur current page
	    driver.navigate().refresh();// refreshes the page
	    driver.navigate().back(); // goes to previous page
	    driver.navigate().forward();// goeas to next page 
	    
// Elements handling commands
	    driver.findElement(By.id("")).click();
	    driver.findElement(By.id("")).sendkeys("vani");
	    driver.findElement(By.id("")).clear();
	
		
			


	}

}