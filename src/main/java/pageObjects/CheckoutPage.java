package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	}
	
	
	
	@FindBy(css="button[class*=checkout_button]")
	WebElement checkOut;
	
	public WebElement checkoutMthd() {
		return checkOut;
	}

}
