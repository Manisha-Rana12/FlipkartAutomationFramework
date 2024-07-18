package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColorFilters {

	WebDriver driver;
	ProductSorting productSorting;
	
	public ColorFilters(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='_0QyAeO +ov7tq dpZEpc']")
	private List<WebElement> colorEffects;

	@FindBy(xpath = "(//*[@class='_53J4C-'])[1]")
	private WebElement product;
	
	

	public List<WebElement> getColorEffect() {
		return colorEffects;
	}
	
	public WebElement getProduct() {
		return product;
	}
	
	public void allColorEffects() {
		
		productSorting = new ProductSorting(driver);

		productSorting.getSearchBtn().sendKeys("Women's tshirts" + Keys.ENTER);
		
		product.click();
		
	}
	
	
}
