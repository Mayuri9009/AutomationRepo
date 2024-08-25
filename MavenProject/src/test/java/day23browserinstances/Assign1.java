package day23browserinstances;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver cdriver=new EdgeDriver();
		cdriver.get("https://demo.vtiger.com/");
		String S= cdriver.getTitle();
		System.out.println(S);
		System.out.println(S.length());
		String CurrentUrl = cdriver.getCurrentUrl();
		System.out.println(CurrentUrl);
		String pageSource = cdriver.getPageSource();
		System.out.println(pageSource.length());
		
		
	}

}