package Pages;

import org.openqa.selenium.By;

import Browser.Browser;
import Locators.locators;

public class SearchbySectionCategory extends Browser{

	public static void SectionCategory() {
		//driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']")).click();
		locators.SectionCategory();
	}
}
