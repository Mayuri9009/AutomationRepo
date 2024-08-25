package day18TestNGPractise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example5 {

	@Test()
	public void testOrangeHrm(){
		System.out.println("LOgin is done in orange HRM");
	}
	
	@Test()
	public void testActiTime() {
		System.out.println("Login in Acti Time is done");
	}
	
	@BeforeMethod()
	public void beforeMethod() {
		System.out.println("@@@@@@@@@@@@@@@ BeforeMethod @@@@@@@@@@@@@@@@@@@@");
	}
	
	@AfterMethod()
	public void afterMethod() {
		System.out.println("@@@@@@@@@@@@@@@ afterMethod @@@@@@@@@@@@@@@@@@@@");
	}
	@BeforeClass()
	public void beforeClass() {
		System.out.println("@@@@@@@@@@@@@@@ beforeclass @@@@@@@@@@@@@@@@@@@@");
	}
	@AfterClass()
	public void afterClass() {
		System.out.println("@@@@@@@@@@@@@@@ afterclass @@@@@@@@@@@@@@@@@@@@");
	}
	 @BeforeTest
	  public void beforeTest() {
		  System.out.println("************BeforeTest****************");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("************AfterTest****************");
	  }
	
}
