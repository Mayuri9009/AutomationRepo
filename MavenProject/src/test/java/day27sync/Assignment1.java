package day27sync;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponent.GenericFunctions;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin");
		WebElement SignIn =driver.findElement(By.className("button"));
		System.out.println("SignIn button is visible or not =  " +SignIn.isDisplayed() );
		System.out.println("SignIn button is enabled or not = " +SignIn.isEnabled());
		System.out.println("SignIn button text = " +SignIn.getText());
		driver.findElement(By.className("button")).click();

	}

}
