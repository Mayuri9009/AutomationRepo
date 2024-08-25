package day13Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import reusableComponent.GenericFunctions;

public class KeyboardE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("Edge");
		driver.get("https://online.actitime.com/uts/login.do");
		driver.findElement(By.id("username")).sendKeys("admin01",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v",Keys.ENTER));
		
		
	}

}
