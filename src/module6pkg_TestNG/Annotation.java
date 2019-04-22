package module6pkg_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	@Test
	  public void TestMethod() {
		  System.out.println("Hi, This is the Test case");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("This will execute Before Every methods");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("This will execute after Every methods");

	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("This will execute Before Every class");

	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("This will execute after Every class");

	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("This will execute Before Every Test");

	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("This will execute after Every Test");

	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("This will execute Before Every Suite");

	  }

	  @AfterSuite
	  
	   
	  public void afterSuite() {
		  System.out.println("This will execute after Every suite");

	  }
	 

	}
