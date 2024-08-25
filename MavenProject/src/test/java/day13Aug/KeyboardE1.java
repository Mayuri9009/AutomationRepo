package day13Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import reusableComponent.GenericFunctions;

public class KeyboardE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://online.actitime.com/uts/login.do");
		//type user name
		driver.findElement(By.id("username")).sendKeys("admin01");
		//type password and press enter button
		driver.findElement(By.name("pwd")).sendKeys("admin01",Keys.ENTER);

		
	}

}
