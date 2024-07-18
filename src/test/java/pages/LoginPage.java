package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	 

//	@FindBy(xpath = "//*[text()='Login']")
//	private WebElement loginBtn;
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[2]")
	private WebElement emailFeild;
	
	@FindBy(xpath = "//*[text()='Request OTP']")
	private WebElement submitOTP;

	public WebElement getEmailFeild() {
		return emailFeild;
	}

	public WebElement getSubmitOTP() {
		return submitOTP;
	}
	
	public void enterProductName() {
		emailFeild.sendKeys("men's watches" + Keys.ENTER);
	}
	
	
	
}
