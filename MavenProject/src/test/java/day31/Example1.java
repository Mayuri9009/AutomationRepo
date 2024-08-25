package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponent.GenericFunctions;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			WebElement element=links.get(i);
			String linkUrl=element.getAttribute("href");
			System.out.println("Link "+i+" "+linkUrl);
		}

		
	}

}
