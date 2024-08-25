package day13Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import reusableComponent.GenericFunctions;

public class MouseE4 {

	public static void main(String[] args) {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://jqueryui.com/draggable/");
		//moving control inside the frame
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		WebElement src=driver.findElement(By.id("draggable"));
		action.dragAndDropBy(src, 100, 100).build().perform();
		
		
	}

}
