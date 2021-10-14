package Pages;

import org.openqa.selenium.By;

import Browser.Browser;
import Locators.locators;

public class Productbuynow extends Browser{

	public static void buynow() {
		//driver.findElement(By.xpath("//*[@id='binBtn_btn']")).click();
		locators.buynow();
	}
}
