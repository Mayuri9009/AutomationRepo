package day27sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponent.GenericFunctions;

public class WithFluentWait3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// after implicit wait, driver will get default time as define in implicit wait,
		// 0-30
		driver.get("https://online.actitime.com/uts/login.do");
		driver.findElement(By.id("username")).sendKeys("admin01");// 0-30 sec
		driver.findElement(By.name("pwd")).sendKeys("admin01");// 0-30 sec
		driver.findElement(By.id("loginButton")).click();// 0-30 sec
		String expectedTitle = "actiTIME - Enter Time-Track";
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(ElementNotInteractableException.class);
		// wait for title to be changed
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		String actualTitle = driver.getTitle();// we need explicit wait to wait for certain condition/element
		System.out.println("Actutal Title: " + actualTitle);
		boolean status = actualTitle.equals(expectedTitle);
		System.out.println("Is login validation successful? " + status);

		// wait till login button is clickable with in given time
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		driver.findElement(By.id("logoutLink")).click();

	}

}
