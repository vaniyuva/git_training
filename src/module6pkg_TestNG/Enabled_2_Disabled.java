package module6pkg_TestNG;

import org.testng.annotations.Test;

public class Enabled_2_Disabled {
	
	@Test(priority = 2)
	public void Shifali() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority = 0)
	public void Jacob() {
		System.out.println("This is the Test Case 2");
	}
//Kalaivani test method will not be executed
	@Test(priority = 3, enabled = false)
	public void Kalaivani() {
		System.out.println("This is the Test Case 3");
	}

	@Test(priority = 6)
	public void Namrata() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority = 8)
	public void Tavish() {
		System.out.println("This is the Test Case 5");
	}

}
