package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage {
	WebDriver driver;
	
	public FinishPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	}
	
	
@FindBy(xpath="//*[@class='title']")
	WebElement checkoutmsg;


	@FindBy(css=".complete-header")
	WebElement orderCompletemsg;
	
	
	public WebElement checkoutMsgMthd() {
		return checkoutmsg;

	}
		
		public WebElement orderMsgMthd() {
			return orderCompletemsg;

	}

}
