package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponent.GenericFunctions;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(700,500));
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("hmenu-item")).click();
		String pageTitle = "Amazon.in";
		String ExpectedPageTitle= driver.getTitle();
		System.out.println("verification " +pageTitle.contains(pageTitle));
		//System.out.println(driver.getTitle());
		driver.findElement(By.className("hm-icon")).click();
		driver.navigate().back();
		driver.close();
		
		
	}

}
