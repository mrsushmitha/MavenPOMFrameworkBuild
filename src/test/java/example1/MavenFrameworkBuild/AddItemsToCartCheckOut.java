package example1.MavenFrameworkBuild;

import org.testng.annotations.Test;

import pageObjects.AddtoCartPage;
import pageObjects.CheckoutOverviewPage;
import pageObjects.CheckoutPage;
import pageObjects.CheckoutYourInfoPage;
import pageObjects.DemoLoginPage;
import pageObjects.FinishPage;
import resources.BrowserSelect;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddItemsToCartCheckOut extends BrowserSelect {
	WebDriver driver;
	public static Logger log = LogManager.getLogger(AddItemsToCartCheckOut.class.getName());

	@BeforeTest
	public void b4Test() throws Exception {

		driver = initializeDriver();
		driver.get(pp.getProperty("url"));
	}

	@Test
	public void navigationTesting() throws Exception {

		DemoLoginPage dlp = new DemoLoginPage(driver);
		dlp.usernameMethod().sendKeys("standard_user");
		dlp.psswdMethod().sendKeys("secret_sauce");
		dlp.loginButtonMethod().click();
		log.info("Logged in to ecommerce website");

		AddtoCartPage adc = new AddtoCartPage(driver);
		adc.addBackpack().click();
		adc.bolttshirtMthd().click();
		

		CheckoutPage cp = adc.cartClickCheckout();
		log.info("Added items and clicked on Add to cart");
		cp.checkoutMthd().click();

		CheckoutYourInfoPage cinfo = new CheckoutYourInfoPage(driver);
		cinfo.enterFirstNm().sendKeys("abcd");
		cinfo.enterLastNm().sendKeys("xyz");
		cinfo.zipMthd().sendKeys("57677");
		cinfo.continueMthd().click();

		CheckoutOverviewPage co = new CheckoutOverviewPage(driver);
		co.chkoutMthd().click();

		log.info("Filled details and checked out");
		FinishPage fp = new FinishPage(driver);
		System.out.println(fp.checkoutMsgMthd().getText());
		System.out.println(fp.orderMsgMthd().getText());

		log.info("Finish page message");

	}

	@AfterTest
	public void aftrTestMethod() {
		driver.quit();
	}
}
