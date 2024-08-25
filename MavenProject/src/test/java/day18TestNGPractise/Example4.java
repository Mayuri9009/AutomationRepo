package day18TestNGPractise;

import org.testng.annotations.Test;

public class Example4 {

	
		@Test(priority=1,enabled=true)
		public void testLoginOrangeHrm() throws InterruptedException {
			System.out.println("Hello Login");
		}	
		@Test(priority=2,enabled=true)
		public void testPIMCreationOrangeHrm() {
			System.out.println("Hello PIMCreation");
			int num=10/0;
		}	
		@Test(priority=4,enabled=true, dependsOnMethods = "testPIMCreationOrangeHrm")
		public void testPIMDeleteOrangeHrm()
		{
			System.out.println("Hello PIMDelete");
		}	
		@Test(priority=5,enabled=true)
		public void testLogoutOrangeHrm() {
			System.out.println("Hello Logout");
		}	
	

}
