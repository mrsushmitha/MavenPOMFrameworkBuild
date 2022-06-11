package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutYourInfoPage {
	WebDriver driver;
	
	public CheckoutYourInfoPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	}
	
	
	/*checkout info*/
	@FindBy(css="#first-name")
	WebElement firstNm;

	@FindBy(name="lastName")
	WebElement lastNm;
	
	
	@FindBy(id="postal-code")
	WebElement zipCode;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueButton;
	
	
	
	public WebElement enterFirstNm() {
		return firstNm;

}

	public WebElement enterLastNm() {
		return lastNm;

}
	
	public WebElement zipMthd() {
		return zipCode;

}
	
	public WebElement continueMthd() {
	return  continueButton;

}
}

