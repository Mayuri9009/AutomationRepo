package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponent.GenericFunctions;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		String ExpectedUrl = "inventory";
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("Home Page Validation = " +CurrentUrl.contains(ExpectedUrl));

	}

}
