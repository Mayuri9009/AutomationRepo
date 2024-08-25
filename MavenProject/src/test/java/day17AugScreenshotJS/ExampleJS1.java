package day17AugScreenshotJS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponent.GenericFunctions;

public class ExampleJS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ExampleJS1 e1= new ExampleJS1();
			e1.TC1();
			e1.TC2();
	}
	public void TC1() {
		
		WebDriver driver =GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//Identify Login button using Selenium
		WebElement element=driver.findElement(By.cssSelector(".buttonBlue"));
		//convert WebDriver instance into javascriptexecutor
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//write a code to perform click operation
		js.executeScript("arguments[0].click()", element);
		
		
		
	}
	public void TC2() {
		WebDriver driver =GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByClassName('button buttonBlue')[0].click()");
	}
}
