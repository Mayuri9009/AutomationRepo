package day17AugScreenshotJS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import reusableComponent.GenericFunctions;

public class ExampleJS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleJS2 js= new ExampleJS2();
		js.TC1();
	}
	public void TC1() {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://online.actitime.com/uts/login.do");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//identifying elements from the UI using JavaScript and typing required value in it
		js.executeScript("document.getElementById('username').value='admin01'");
		js.executeScript("document.getElementsByName('pwd')[0].value='admin01'");
		js.executeScript("document.getElementById('loginButton').click()");
	}
}
