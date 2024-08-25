package day18TestNGPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import reusableComponent.GenericFunctions;

public class Assignment1 {
	@Test()
	public void testPIM_Creation()
	{
	WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("edge");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.cssSelector(".oxd-button")).click();
	driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
	//driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	driver.findElement(By.xpath("label[text()='Employee Id']//following::input")).click();
	driver.findElement(By.name("firstName")).sendKeys("A");
	driver.findElement(By.name("middleName")).sendKeys("B");
	driver.findElement(By.name("lastName")).sendKeys("C");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
	
	
	}@Test()
	public void testPIM_Update()
	{
		/*WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button")).click();
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)");
		*/
		
		
	}
	
	@Test()
	public void testPIM_Delete()
	{
		
	}
	
}
