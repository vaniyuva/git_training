package module6pkg_TestNG;


import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 2)
	public void Shifali() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority = 0)
	public void Jacob() {
		System.out.println("This is the Test Case 2");
	}

	@Test(priority = 223)
	public void Kalaivani() {
		System.out.println("This is the Test Case 3");
	}

	@Test(priority = 323)
	public void Namrata() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority = 4000)
	public void Tavish() {
		System.out.println("This is the Test Case 5");
	}
}

