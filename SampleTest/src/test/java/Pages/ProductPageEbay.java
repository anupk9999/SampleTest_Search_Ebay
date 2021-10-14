package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Browser.Browser;
import Locators.locators;

public class ProductPageEbay extends Browser{
	public static void Product_List() {
		//driver.findElement(By.xpath("//h3[@class='s-item__title']")).click();
		locators.Product_List();
	}

}
