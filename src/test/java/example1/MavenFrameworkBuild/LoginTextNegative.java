package example1.MavenFrameworkBuild;


import org.testng.annotations.Test;

import pageObjects.DemoLoginPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



import resources.BrowserSelect;



public class LoginTextNegative extends BrowserSelect {
	WebDriver driver;
    public static Logger log=LogManager.getLogger(LoginTextNegative.class.getName());
	@BeforeTest
	public void b4Test() throws Exception {

		driver = initializeDriver();
	}

	@Test()
	public void loginTextNegative() throws Exception {
String expectedText="Sorry!This user is locked out";
		driver.get(pp.getProperty("url"));
		DemoLoginPage logPg = new DemoLoginPage(driver);
		
		logPg.usernameMethod().sendKeys("locked_out_user");
		logPg.psswdMethod().sendKeys("secret_sauce");
		logPg.loginButtonMethod().click();
	String ErrorTextActual=	logPg.loginErroreMethod().getText();
	Assert.assertEquals( expectedText, ErrorTextActual);
		Thread.sleep(3000);
		log.info("Login test done");

	}



	

	@AfterTest
	public void aftrTestMethod() {
	driver.quit();
	}

}
