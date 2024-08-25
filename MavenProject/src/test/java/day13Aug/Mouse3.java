package day13Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import reusableComponent.GenericFunctions;

public class Mouse3 {

	public static void main(String[] args) {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		
		//first identify source and target
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		action.dragAndDrop(src,target).build().perform();
	

	}

}
