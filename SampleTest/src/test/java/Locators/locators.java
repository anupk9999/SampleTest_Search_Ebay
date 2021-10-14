package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.Browser;

public class locators extends Browser{

	public static WebElement Productnamexcel(){
		WebElement productname = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		return productname;
	}
	public static WebElement searchbutton() {
		WebElement search_click = driver.findElement(By.xpath("//input[@type='submit']"));
		search_click.click();
		return search_click;
	}
	public static WebElement search_product() {
		// TODO Auto-generated method stub
		WebElement search_data = driver.findElement(By.xpath("//input[@type='text']"));
		search_data.sendKeys("samsung");
		return search_data;
	}
	public static WebElement Product_List() {
		WebElement productlist = driver.findElement(By.xpath("//h3[@class='s-item__title']"));
		productlist.click();
		return productlist;
	}
	//public static void ProductSelection() {
	//	WebElement productselection = driver.findElement(By.xpath("//h3[@class='s-item__title']"));
	//	productselection.click();
	//}
//	public static void addtocart() {
//		
//		//WebElement addtocart = driver.findElement(By.xpath("By.id='isCartBtn_btn'"));
//		
//		//addtocart.click();
//		driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3")).click();
//		//driver.findElement(By.xpath("//*[@id=\"binBtn_btn\"]"));
//		String parent = driver.getWindowHandle();
//		System.out.println("parent "+parent);
//		
//		System.out.println(driver.getTitle());
//		for (String child:driver.getWindowHandles()) {
//			driver.switchTo().window(child);
//		}
//		System.out.println(driver.getTitle());
//		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"binBtn_btn\"]"));
//		addtocart.click();
//	
//	}
	public static void buynow() {
		WebElement buynow = driver.findElement(By.xpath("//*[@id='binBtn_btn']"));
		buynow.click();
		
	}
	public static void allcategories() {
		WebElement allcategory = driver.findElement(By.xpath("//*[@id='gh-cat']"));
		allcategory.click();
	}
	public static void advancesearching() {
		WebElement advancesearch = driver.findElement(By.xpath("//a[@href='https://www.ebay.com/sch/ebayadvsearch']"));
		advancesearch.click();
	}
	public static void SectionCategory() {
		WebElement sectioncategory = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']"));
		sectioncategory.click();
	}
	public static void shopbycategory() {
		WebElement shopbycategory = driver.findElement(By.xpath("//*[@id='gh-shop-a']"));
		shopbycategory.click();
	}
	public static void deals() {
		WebElement dealsoftheday = driver.findElement(By.xpath("//a[@href='https://www.ebay.com/globaldeals']"));
		dealsoftheday.click();
	}
}
