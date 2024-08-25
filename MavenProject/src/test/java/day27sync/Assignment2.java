package day27sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponent.GenericFunctions;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement loginbtn = driver.findElement(By.className("oxd-button"));
		System.out.println("Login button visibility " +loginbtn.isDisplayed());
		System.out.println("Login button is enabled or not " +loginbtn.isEnabled());
		driver.findElement(By.className("oxd-button")).click();
		String ExpectedUrlContent = "index";
		String CurrentUrl= driver.getCurrentUrl();
		System.out.println("Home Page validation " +CurrentUrl.contains(ExpectedUrlContent));
		
		Thread.sleep(5000);
		driver.findElement(By.className("oxd-icon")).click();
		driver.findElement(By.className("oxd-userdropdown-link")).click();
		
		
		
		
	}

}
