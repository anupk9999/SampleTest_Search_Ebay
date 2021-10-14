package Pages;

import org.openqa.selenium.By;

import Browser.Browser;
import Locators.locators;

public class ShopByCategory extends Browser{
	public static void shopbycategory() {
		//driver.findElement(By.xpath("//*[@id='gh-shop-a']")).click();
		locators.shopbycategory();
	}

}
