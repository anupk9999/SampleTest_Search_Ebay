package Pages;

import org.openqa.selenium.By;


import Browser.Browser;
import Locators.locators;
public class SearchPageEbay extends Browser{
	
	public static void search_product() {
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mega");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		//locators.search_product();
		locators.searchbutton();
	}

	
}
