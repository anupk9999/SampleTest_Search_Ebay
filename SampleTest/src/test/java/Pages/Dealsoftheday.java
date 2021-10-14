package Pages;

import org.openqa.selenium.By;

import Browser.Browser;

public class Dealsoftheday extends Browser{

	public static void deals() {
		driver.findElement(By.xpath("//a[@href='https://www.ebay.com/globaldeals']")).click();
	}
}
