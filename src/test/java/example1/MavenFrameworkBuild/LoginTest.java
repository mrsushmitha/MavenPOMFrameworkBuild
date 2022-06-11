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
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



import resources.BrowserSelect;



public class LoginTest extends BrowserSelect {
	WebDriver driver;
    public static Logger log=LogManager.getLogger(LoginTest.class.getName());
	@BeforeTest
	public void b4Test() throws Exception {

		driver = initializeDriver();
	}

	@Test(dataProvider = "getData")
	public void loginMethod(String uname, String psswd, String print) throws Exception {

		driver.get(pp.getProperty("url"));
		DemoLoginPage logPg = new DemoLoginPage(driver);
		log.info("Navigated to login Page");
		logPg.usernameMethod().sendKeys(uname);
		logPg.psswdMethod().sendKeys(psswd);
		logPg.loginButtonMethod().click();
		System.out.println(print);
		Thread.sleep(3000);
		log.info("Login test done");

	}

	@DataProvider
	public Object[][] getData() {
		Object n1[][] = new Object[2][3];
		n1[0][0] = "ghgjhhjr";
		n1[0][1] = "xyz";
		n1[0][2] = "Invalid one";

		n1[1][0] = "standard_user";
		n1[1][1] = "secret_sauce";
		n1[1][2] = "Valid one";
		return n1;

	}

	@AfterTest
	public void aftrTestMethod() {
	driver.quit();
	}

}
