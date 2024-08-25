package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import reusableComponent.GenericFunctions;

public class Css3 {

	public static void main(String[] args) {
		//4. CSS with regex(handling dynamic attribute):
			//^ ---> starts with  ==> htmltag[attributename^='attributevalue']
			//$ ---> ends with   ==> htmltag[attributename$='attributevalue']
			//* ---> contains    ==> htmltag[attributename*='attributevalue']
			WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.cssSelector(".oxd-input")).sendKeys("Admin");
			driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
			driver.findElement(By.cssSelector(".oxd-button")).click();
			
			
			
	}

}
