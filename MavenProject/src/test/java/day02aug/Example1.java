package day02aug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import reusableComponent.GenericFunctions;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement yearDropdown = driver.findElement(By.id("yearbox"));
		Select yDropdown = new Select(yearDropdown);
		System.out.println("Is this dropdown allows multiple selection " +yDropdown.isMultiple());
		System.out.println("Already selected option in dropdown " +yDropdown.getFirstSelectedOption().getText());
		yDropdown.selectByIndex(1);
		System.out.println("After first selection using index " +yDropdown.getFirstSelectedOption().getText());
		yDropdown.selectByValue("1998");
		System.out.println("After first selection using value " +yDropdown.getFirstSelectedOption().getText());
		yDropdown.selectByVisibleText("1927");
		System.out.println("After first selection using value " +yDropdown.getFirstSelectedOption().getText());
		
		List<WebElement> yearList = yDropdown.getOptions();
		System.out.println("List " +yearList.size());
		for(int i=0;i<yearList.size();i++) {
			System.out.println(yearList.get(i).getText());
		}
		
	}

}
