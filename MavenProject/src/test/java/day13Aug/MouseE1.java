package day13Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import reusableComponent.GenericFunctions;

public class MouseE1 {

	public static void main(String[] args) {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://online.actitime.com/uts/login.do");
		Actions action = new Actions(driver);
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin01");
		action.moveToElement(username).doubleClick().build().perform();
		username.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v",Keys.ENTER));
		
		

	}

}
