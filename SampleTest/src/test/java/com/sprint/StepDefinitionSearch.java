package com.sprint;

import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Browser.Browser;
import Locators.locators;
import Pages.AdvanceSearch;
import Pages.Dealsoftheday;
import Pages.Homepage_allcategories;
import Pages.ProductPageEbay;
import Pages.ProductSelect;
import Pages.Product_addtocart;
import Pages.Productbuynow;
import Pages.SearchPageEbay;
import Pages.SearchbySectionCategory;
import Pages.ShopByCategory;
import ReadData.ReadData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionSearch extends Browser{

	WebDriver driver = null;
	
	@Given("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\akulka25\\Desktop\\Destination\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.navigate().to("https://www.ebay.com/");
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		setDriver();
	}

	@And("user is able to see search bar and products on home page")
	public void user_is_able_to_see_search_bar_and_products_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on search bar and enters the product to be searched")
	public void user_clicks_on_search_bar_and_enters_the_product_to_be_searched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    locators.Productnamexcel().sendKeys(ReadData.readExcel(0,0));
		SearchPageEbay.search_product();
	}

	@And("hit the search button")
	public void hit_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User should be to see the products")
	public void user_should_be_to_see_the_products() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		ProductPageEbay.Product_List();
	}

	@And("click on any product which user is interested to buy")
	public void click_on_any_product_which_user_is_interested_to_buy() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		ProductSelect.ProductSelection();
	}

	@When("Product specification page should be visible")
	public void product_specification_page_should_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}

	@Then("user should be able to access add to cart or buy button")
	public void user_should_be_able_to_access_add_to_cart_or_buy_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		changewindow();
		Thread.sleep(2000);
		//Product_addtocart.addtocart();
		
	}
	@Given("User shall be redirected to home page")
	public void user_shall_be_redirected_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User is able to see deals of the tab")
	public void user_is_able_to_see_deals_of_the_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Click on deals of the day tab")
	public void click_on_deals_of_the_day_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//Dealsoftheday.deals();
	}

	@Given("User should be available on home page")
	public void user_should_be_available_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("User should be able to see the all category section")
	public void user_should_be_able_to_see_the_all_category_section() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user should be able to click on that")
	public void user_should_be_able_to_click_on_that() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		Homepage_allcategories.allcategories();
	}

	@Given("Home page of the user should be visible")
	public void home_page_of_the_user_should_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user should be able to see section wise category")
	public void user_should_be_able_to_see_section_wise_category() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("click on any of the sub category")
	public void click_on_any_of_the_sub_category() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		SearchbySectionCategory.SectionCategory();
	}

	@Given("Navigated to home page")
	public void navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User should be able to see advance search button")
	public void user_should_be_able_to_see_advance_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("click on advance search")
	public void click_on_advance_search() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		AdvanceSearch.advancesearching();
	}
	@Given("User should be redirected to home Page")
	public void user_should_be_redirected_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("Shopb by category sould be visible")
	public void shopb_by_category_sould_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("click on shop by category")
	public void click_on_shop_by_category() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
//		ShopByCategory.shopbycategory();
	}

}
