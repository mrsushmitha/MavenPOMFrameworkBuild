package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginPage {
	
	WebDriver driver;
	
	public DemoLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(id="user-name")
WebElement username;

@FindBy(name="password")
WebElement passwd;

@FindBy(css="input[value='Login']")
WebElement logIn;


@FindBy(xpath="//h3[@data-test='error']")
WebElement loginError;

public WebElement usernameMethod() {
	return username;
}

public WebElement psswdMethod() {
	return passwd;
}

public WebElement loginButtonMethod() {
	return logIn;
}

public WebElement loginErroreMethod() {
	return loginError;
}



}
