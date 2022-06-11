package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
	WebDriver driver;
	
	public AddtoCartPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement backpack;
	
	@FindBy(name="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement btshirt;
	
	@FindBy(css=".shopping_cart_badge")
	WebElement shoppingCart;
	
	
	public WebElement addBackpack() {
		return backpack;
	}
	
	public WebElement bolttshirtMthd() {
		return btshirt;
	}
	
	public CheckoutPage cartClickCheckout() {
		shoppingCart.click();
		return new CheckoutPage(driver);
		
	}
}
