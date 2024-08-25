package day17AugScreenshotJS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import reusableComponent.GenericFunctions;

public class ExampleJS3 {

	public static void main(String[] args) throws InterruptedException {
		ExampleJS3 e1=new ExampleJS3();
		e1.testCase1();

	}
	public void testCase1() throws InterruptedException {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://www.amazon.in/ref=nav_logo");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//vertical scrolling
//		js.executeScript("window.scrollBy(0,2500)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-2500)");
		
		//scroll till bottom of the page
	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

		
		//Horizontal scrolling
		//js.executeScript("window.scrollBy(500,0)");
}
}
