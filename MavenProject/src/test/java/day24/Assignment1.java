package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponent.GenericFunctions;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Admin");
		driver.findElement(By.className("button")).click();
		
		String ExpectedUrl= "Login";
		String CurrentUrl= driver.getCurrentUrl();
		System.out.println("Home page validation status: "+(CurrentUrl.contains(ExpectedUrl)));
		//driver.close();
	}

}
