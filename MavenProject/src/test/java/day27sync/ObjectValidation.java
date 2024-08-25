package day27sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponent.GenericFunctions;

public class ObjectValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("edge");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//after implicit wait, driver will get default time as define in implicit wait, 0-30
		driver.get("https://online.actitime.com/uts/login.do");
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("Username input field visibility status? "+userNameInputField.isDisplayed());
		System.out.println("Username input field editable status? "+userNameInputField.isEnabled());		
		String defaultValueOfUserNameInputField=userNameInputField.getAttribute("placeholder");
		System.out.println("User name input field value: "+defaultValueOfUserNameInputField);
		WebElement keepMeLoggedInCheckBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("keepMeLoggedInCheckBox visibility status: "+keepMeLoggedInCheckBox.isDisplayed());
		System.out.println("keepMeLoggedInCheckBox selectable status: "+keepMeLoggedInCheckBox.isEnabled());
		System.out.println("keepMeLoggedInCheckBox default selection status: "+keepMeLoggedInCheckBox.isSelected());
		keepMeLoggedInCheckBox.click();
		System.out.println("after selection, keepMeLoggedInCheckBox status: "+keepMeLoggedInCheckBox.isSelected());
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		System.out.println("LoginButton Visibility status " +loginbutton.isDisplayed());
		System.out.println("LoginButton is enabled or not? " +loginbutton.isEnabled());
		System.out.println("LoginButton name is " +loginbutton.getText());
	}

}
/**

username 
	display or not
	editable or not
	default value/placeholder

Checkbox:
	display or not
	clickable/functional or not
	by default select or not
	select and check now its selected or not
	
Button:
	display or not
	clickable/functional or not
	button name
	button color
	
error:
	clickable/functional or not
	color 
	text 

Position:
*/