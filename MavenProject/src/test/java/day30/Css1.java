package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import reusableComponent.GenericFunctions;

public class Css1 {

	public static void main(String[] args) {

		WebDriver driver= GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.cssSelector("#username")).clear();
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		//driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("#password")).clear();
		driver.findElement(By.cssSelector("#password")).sendKeys("admin");
		//driver.findElement(By.cssSelector("input#password")).sendKeys("admin");
		//driver.findElement(By.cssSelector(".button")).click();
		driver.findElement(By.cssSelector("button.button")).click();
		
		
		
		
	}

}
