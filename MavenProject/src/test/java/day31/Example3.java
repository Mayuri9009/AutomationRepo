package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponent.GenericFunctions;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("edge");

		driver.get("https://www.demoblaze.com/");	
		List<WebElement> deviceNames=driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h4>a"));
		
		List<WebElement> devicePrices = driver.findElements(By.cssSelector("div>[id='tbodyid']>div>div>div>h5"));
		for(int i=0;i<deviceNames.size();i++) {
			//WebElement device=deviceNames.get(i);
			//WebElement price=devicePrices.get(i);
			//String deviceName=device.getText();
      		//String devicePrice=price.getText();
			//System.out.println(deviceName +" "+devicePrice);
      		System.out.println(deviceNames.get(i).getText() +" :"+ devicePrices.get(i).getText());
	}

}
}