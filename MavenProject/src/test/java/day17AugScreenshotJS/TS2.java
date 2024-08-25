package day17AugScreenshotJS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import day13Aug.SeleniumUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TS2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		SeleniumUtility s1=new SeleniumUtility();
		
		WebDriver driver=s1.setUp("edge", "https://online.actitime.com/uts/login.do");
        s1.takeScreenShotOfThePage(".\\src\\test\\resources\\screenshots\\LoginPage.jpg");
		
		// type user name
		driver.findElement(By.id("username")).sendKeys("admin01", Keys.chord(Keys.CONTROL, "a"),
				Keys.chord(Keys.CONTROL, "c"));
		s1.takeScreenShotOfThePage(".\\src\\test\\resources\\screenshots\\AfterUserName.jpg");
		
		// type password and press enter button
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL, "v"), Keys.ENTER);
		s1.getCurrentTitleOfApplication("actiTIME - Enter Time-Track");
		s1.takeScreenShotOfThePage(".\\src\\test\\resources\\screenshots\\HomePage.jpg");
	}

}
