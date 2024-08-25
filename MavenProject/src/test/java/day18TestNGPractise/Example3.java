package day18TestNGPractise;

import org.testng.annotations.Test;

public class Example3 {

	@Test(priority=1,enabled=true,description="done",expectedExceptions=ArithmeticException.class)
	public void testcaseloginHrm(){
		System.out.println("Heloo Login");
		int num=10/0;
		
	}
	
	@Test(priority=2,enabled=true,invocationCount=2)
	public void testPIMCreationOrangeHrm()
	{
		System.out.println("Hello PIM creation");
		
	}
	@Test(priority=3,enabled=false)
	public void testPIMupdateOrangeHrm()
	{
	System.out.println("Hello updatation");
	
	}
	@Test(priority=4,enabled=true)
	public void testPIMDeleteOrangeHrm()
	{
	System.out.println("Hello deletiion");
	
    }
	@Test(priority=5,enabled=true)
	public void testLogoutOrangeHrm() 
	{
		System.out.println("Logout successfully");
	}
}


