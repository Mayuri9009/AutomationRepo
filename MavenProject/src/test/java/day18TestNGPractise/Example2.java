package day18TestNGPractise;

import org.testng.annotations.Test;

public class Example2 {
	/**@Test
	public void testcaseOrangeHRM() {
		System.out.println("Hello orange HRM");
	}
	
	@Test
	public void testcaseactiTime() {
		System.out.println("Hello Acti Time");
		TC1();
	}
	
	
	public void TC1() {
		System.out.println("Hello TC1");
	}
	
	**/
	
	
	@Test
	public void testCaseOrangeHrm() {
		System.out.println("Hello OrangeHrm");
	}
	@Test
	public void testCaseActitime() {
		System.out.println("Hello Actitime");
		tc1();
	}
	
	public void tc1() {
		System.out.println("TC1");
	}
}
