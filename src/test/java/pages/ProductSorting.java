package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSorting {

	WebDriver driver;
	
	public ProductSorting(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//----------- locate search button for sending keys-----------
	@FindBy(xpath = "//input[@class='Pke_EE']")
	private WebElement searchBtn;

	//----------- locate Low_To_High sorting element for clicking -----------
	@FindBy(xpath = "//*[text()='Price -- Low to High']")
	private WebElement lowToHigh;

	//----------- locate the prices for mobiles -----------
	@FindBy(xpath = "//*[@class='Nx9bqj _4b5DiR']")
	private List<WebElement> prices;
	
	
	//----------- locate one webelement to scroll -----------
//	@FindBy(xpath = "//*[text()='SHINNEE 310'])[1]")
//	WebElement scrollableElement;
//
//	//----------- creating method for perform scrolling operation -----------
//	public void scrollToView() {
//
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//
//		je.executeScript("arguments[0].scrollIntoView(true);", scrollableElement);
//	}

	//----------- creating method for pressing Enter from keyboard -----------
	public void pressEnter() {
		searchBtn.sendKeys(Keys.ENTER);
		
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getLowToHigh() {
		return lowToHigh;
	}
	
	public List<WebElement> getprices() {
		
		List<WebElement> productPrices = driver.findElements(By.xpath("//*[@class='Nx9bqj _4b5DiR']"));
		
		WebElement proPrice = productPrices.get(0);
		
		//----------- Extract the price of the first product ------------
		
		String firstProductPriceText= proPrice.getText();
		
		String substringfirstProductPriceText = firstProductPriceText.substring(1);
		
		int newSubString = Integer.parseInt(substringfirstProductPriceText) ;
		
		//----------- Verify the first product listed has the lowest price ------------
		
				        boolean isLowestPrice = true;
				        for (WebElement prices : productPrices) {
				        	
				            
			            String priceText = prices.getText();
			            priceText  = priceText.substring(1);
        // Convert the resulting string to an integer							
							int Price = Integer.parseInt(priceText);
				            if (Price < newSubString) {
				                isLowestPrice = false;
				                break;
				            }
				        }
		
				        if (isLowestPrice) {
				            System.out.println("The first product listed has the lowest price.");
				        } else {
				            System.out.println("The first product listed does not have the lowest price.");
				        }
		
			     
		return prices;
	}

	
	public void enterProductName() {
		searchBtn.sendKeys("Mobile phones" + Keys.ENTER);
	}
	
	
}
