package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToWishlist {

	
	WebDriver driver;
	LoginPage loginPage;
	ProductSorting productSorting;
	AddToWishlist wishlist;
	
	public AddToWishlist(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement NextBtn;
	
	
	@FindBy(xpath = "(//*[@class='x1UMqG'])[2]")
	WebElement addWishlist;
	
	//----------- element not scroll down -----------
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement scrollElement;
	

	//----------- creating method for perform scrolling operation -----------
	public void scrollToView() {

		JavascriptExecutor je = (JavascriptExecutor) driver;

		je.executeScript("arguments[0].scrollIntoView(true);", scrollElement);
	}
	
	public WebElement getNextBtn() {
		return NextBtn;
	}

	public WebElement getAddToWishlist() {
		return addWishlist;
	}

	public WebElement getScrollElement() {
		return scrollElement;
	}
	
	public void iterateOverPagesAndAddToWishlist() throws InterruptedException {
		
		for(int i = 0; i < 5; i++) {
		loginPage = new LoginPage(driver);
		productSorting = new ProductSorting(driver);
		
		productSorting.getSearchBtn().sendKeys("men's watches" + Keys.ENTER);
		
		Thread.sleep(3000);
		
		addWishlist.click();
		
		loginPage.getEmailFeild().sendKeys("9382392290");
		
		loginPage.getSubmitOTP().click();
		
		Thread.sleep(16000);
		
		addWishlist.click();
		
		scrollToView();
		
		NextBtn.click();
		}
	}
	
}
