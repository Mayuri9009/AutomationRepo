package day12Aug;

public class XpathSyntax {

	public static void main(String[] args) {
		//1. https://www.demoblaze.com/ ---> get a price for Sony xperia z5

		//a[@href='prod.html?idp_=6']
		//a[text()='Sony xperia z5']
		//a[contains(text(),'Sony')]
		//*[contains(text(),'Sony')]
		//a[@class='hrefch']
		//a[@*='hrefch']
		//*[@*='hrefch']
		
		
		//get a price for Sony xperia z5
		//Step1:Identify independent and dependent elements
		//Independent:Sony xperia z5
		//dependent: Price
		/*Step2:
			Right click on Independent element and inspect the element, dn slowly drag you mouse pointer in the upwards direction till both dependent and independent elements are covered or highlighted together

			Step3: 
			note down the HTML tree structore

			Step4:
			write down xpath for independent element

			Step5:
			with the help of independent element expression drive xpath for common parent

			Step6:
			with the help of comman parent expression drive expression for dependent element
		
		
		//div[h4[a[text()="Sony xperia z5"]]]//h5
		*/
		
		
		//2. from flipkart get samsung price for mobile present in "Latest Samsung mobiles" https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung
		
		//independent= SAMSUNG Galaxy F34 5G (Mystic Green, 128 GB)
		//Dependent-price
		
		//div[div[a[text()="SAMSUNG Galaxy F34 5G (Mystic Green, 128 GB)"]]]//div[3]//div/div
	
		//3.from https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc
		//for Anniversary checkbox
		//for birthday checknox
		//for friendship checkbox
		
		//a[span[text()='Anniversary']]//div//label//input
		
		//write xpath expression to get "Sort on Date" as 9th Nov from https://erail.in/
		
		
	}

}
