package day23browserinstances;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericWaytoOpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = createInstanceOfRequiredBrowser("edge");
		driver.get("https://www.google.com");
		String applicationTitle=driver.getTitle();
		System.out.println("Application title: "+applicationTitle);
		System.out.println("No of character in Application title: "+applicationTitle.length());
		String applicationCurrentUrl=driver.getCurrentUrl();
		System.out.println("Application URL: "+applicationCurrentUrl);
		String pageSource=driver.getPageSource();
		System.out.println("Character in page source: "+pageSource.length());
		//driver.close();
		}
	
		public static WebDriver createInstanceOfRequiredBrowser(String browserName) 
		{
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) 
		{
			driver=new EdgeDriver();
		}
		return driver;
		}
	

}
