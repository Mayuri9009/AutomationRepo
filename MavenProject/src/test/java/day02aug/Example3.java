package day02aug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponent.GenericFunctions;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		List<WebElement> countryList=driver.findElements(By.cssSelector(".dropdown-menu-right.show>div>a"));
		System.out.println(countryList.size());
		for(WebElement element: countryList) {
			System.out.println(element.getText());
		}
		
		countryList.get(5).click();
	}

}
