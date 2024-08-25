package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponent.GenericFunctions;

public class LoginHRM1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		WebElement EmailInputField =driver.findElement(By.id("Email"));
		EmailInputField.sendKeys("tester01@vomoto.com");
		WebElement passwordInputField=driver.findElement(By.name("Password"));
		passwordInputField.sendKeys("Abc@12345");
		WebElement loginButton=driver.findElement(By.className("ico-login"));
		//perform required action i.e click
		loginButton.click();
		String expectedUrlContent="login";
		String currenUrl=driver.getCurrentUrl();
		System.out.println("Home page validation status: "+(currenUrl.contains(expectedUrlContent)));
		
		
		
	}

}
