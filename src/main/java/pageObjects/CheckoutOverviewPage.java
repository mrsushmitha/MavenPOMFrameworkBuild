package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
	WebDriver driver;
	
	public CheckoutOverviewPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	}
	
	
	/* checkout*/
	@FindBy(xpath="//button[contains(text(),'Finish')]")
	WebElement checkOut;
	
	public WebElement chkoutMthd()  {
		return checkOut;
		
	}
	

}
