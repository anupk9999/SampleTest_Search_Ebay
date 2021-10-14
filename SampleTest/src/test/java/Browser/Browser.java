package Browser;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Product_addtocart;

public class Browser {
	public static WebDriver driver;
	public void setDriver() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\akulka25\\Desktop\\Destination\\chromedriver.exe");
	     driver = new ChromeDriver();	
	     driver.get("https://www.ebay.com/");
	     driver.manage().window().maximize();
	    // Thread.sleep(30000);
	     
	}
public void changewindow() throws InterruptedException {

	Thread.sleep(2000);
	String parent=driver.getWindowHandle();
System.out.println(parent);
	Set<String>s=driver.getWindowHandles();

	// Now iterate using Iterator
	Iterator<String> I1= s.iterator();

	while(I1.hasNext()) {
		String childwindow = I1.next();
		System.out.println(childwindow);
		if(!parent.equals(childwindow)) {
			driver.switchTo().window(childwindow);
			System.out.println(driver.switchTo().window(childwindow).getTitle());
			
		}
	
}
	}
}

