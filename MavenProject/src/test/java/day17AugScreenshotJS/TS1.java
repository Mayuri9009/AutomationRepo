package day17AugScreenshotJS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import day13Aug.SeleniumUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponent.GenericFunctions;

public class TS1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//SeleniumUtility s1 = new SeleniumUtility();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = s1.setUp("edge", "https://online.actitime.com/uts/login.do");
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");
		driver.get("https://online.actitime.com/uts/login.do");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".\\src\\test\\resources\\Screenshots\\LoginPage.jpg"));
	
		driver.findElement(By.id("username")).sendKeys("admin01", Keys.chord(Keys.CONTROL, "a"),
				Keys.chord(Keys.CONTROL, "c"));
		
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL, "v"), Keys.ENTER);
	}

}
