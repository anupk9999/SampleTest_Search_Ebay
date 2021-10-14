package Pages;

import org.openqa.selenium.By;

import Browser.Browser;
import Locators.locators;

public class AdvanceSearch extends Browser{

	public static void advancesearching() {
		//driver.findElement(By.xpath("//a[@href='https://www.ebay.com/sch/ebayadvsearch']")).click();
		locators.advancesearching();
	}
}
