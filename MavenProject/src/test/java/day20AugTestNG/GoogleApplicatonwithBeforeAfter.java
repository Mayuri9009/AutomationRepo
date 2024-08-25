package day20AugTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import day13Aug.SeleniumUtility;
import reusableComponent.GenericFunctions;

public class GoogleApplicatonwithBeforeAfter {

	WebDriver driver;
	@BeforeTest()
	public void startUp() {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");	
		}
	
	@BeforeMethod()
	public void login()
	{
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.cssSelector(".buttonBlue")).click();
	}
	@Test(priority=1)
	public void testVtigerHomePage() {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String ExpectedTitle="Dashboard";
		//String ActualTitle= getCurrentTitleOfApplication();
		String ActualTitle="driver.getCurrentUrl()";
		Assert.assertEquals(ActualTitle, ExpectedTitle, "Vtiger home page not opened or its title got changed");
	}
}


















/*
open browser with ULR ---> @BeforeTest
	 login ---> @BeforeMethod
		 home page validate ---> @Test
		 report page validate --> @Test
	 logout ---> @AfterMethod
close ----> @AfterTest
 */