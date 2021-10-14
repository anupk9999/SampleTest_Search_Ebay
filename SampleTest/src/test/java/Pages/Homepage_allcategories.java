package Pages;

import org.openqa.selenium.By;

import Browser.Browser;
import Locators.locators;

public class Homepage_allcategories extends Browser {

	public static void allcategories() {
		//driver.findElement(By.xpath("//*[@id='gh-cat']")).click();
		locators.allcategories();
	}
}
