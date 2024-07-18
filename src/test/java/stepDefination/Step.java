package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AddToWishlist;
import pages.ColorFilters;
import pages.ProductSorting;

public class Step {

	//---------- declaring variables globally -----------
	WebDriver driver;
	ProductSorting productSorting;
	AddToWishlist addtoWishlist;
	ColorFilters colorFilters;
	@Given("I am on the search results page for {string}")
	public void i_am_on_the_search_results_page_for1(String string) throws InterruptedException {
	   
WebDriverManager.chromedriver().setup();
		
        WebDriverManager.chromedriver().setup();
        
	    driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(4000);

		//----------- creating object of the class ------------
		productSorting = new ProductSorting(driver);	
		
        addtoWishlist = new AddToWishlist(driver);
        
        colorFilters = new ColorFilters(driver);
	}

	@When("I sort products by {string}")
	public void i_sort_products_by(String string) throws InterruptedException {

		
		Thread.sleep(2000);
		
		productSorting.enterProductName();
		
	}

	@Then("the frst product listed should be the one with the lowest price")
	public void the_frst_product_listed_should_be_the_one_with_the_lowest_price() throws InterruptedException {
		
		Thread.sleep(2000);
		productSorting.getLowToHigh().click();
		Thread.sleep(2000);
		
		productSorting.getprices();
		
		
	}

	@Given("I am on the product details page for a specifc phone")
	public void i_am_on_the_product_details_page_for_a_specifc_phone() {
		
	}

	@When("I try to add the product to the cart with quantity {int}")
	public void i_try_to_add_the_product_to_the_cart_with_quantity(Integer int1) {
		
	}

	@Then("I should see an error message indicating invalid quantity")
	public void i_should_see_an_error_message_indicating_invalid_quantity() {		
	}

	@When("I iterate through the frst {int} product pages on the search results")
	public void i_iterate_through_the_frst_product_pages_on_the_search_results(Integer int1) throws InterruptedException {
		
		addtoWishlist.iterateOverPagesAndAddToWishlist();
	}

	@Then("for each product page, I should be able to add the product to the wishlist")
	public void for_each_product_page_i_should_be_able_to_add_the_product_to_the_wishlist() {
		
		
	}

	@When("I get all available color flter options and store them in an array")
	public void i_get_all_available_color_flter_options_and_store_them_in_an_array() {
		colorFilters.allColorEffects();
	}

	@Then("I should be able to randomly select a color from the array and apply the flter")
	public void i_should_be_able_to_randomly_select_a_color_from_the_array_and_apply_the_flter() {
		
	}

//	@Given("I am on the product details page for a specifc T-shirt")
//	public void i_am_on_the_product_details_page_for_a_specifc_t_shirt() {
//		
//	}
//
//	@When("I add the T-shirt to the cart with quantity {int}")
//	public void i_add_the_t_shirt_to_the_cart_with_quantity(Integer int1) {
//		
//	}
//
//	@Then("I navigate to the cart page")
//	public void i_navigate_to_the_cart_page() {
//		
//	}
//
//	@Then("the cart should display the T-shirt with a quantity of {int} \\(assuming a collection stores cart items)")
//	public void the_cart_should_display_the_t_shirt_with_a_quantity_of_assuming_a_collection_stores_cart_items(Integer int1) {
//		
//	}

}
