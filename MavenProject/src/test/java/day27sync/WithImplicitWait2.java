package day27sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponent.GenericFunctions;

public class WithImplicitWait2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		

	}

}
