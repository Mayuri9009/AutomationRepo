package day13Aug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import reusableComponent.GenericFunctions;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://www.espncricinfo.com/");
		Actions action = new Actions(driver);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='ds-popper-wrapper']/a"));
		
		for(int i=0;i<list.size();i++) {
			action.moveToElement(list.get(i)).perform();
			GenericFunctions.setSleep(1000);
		}

	}

}
