package resources;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.safari.SafariDriver;


public class BrowserSelect {
	public WebDriver driver;
	public Properties pp;
	
	public WebDriver initializeDriver() throws Exception {
		 pp=new Properties();
		FileInputStream fis=new FileInputStream("//Users//supreeth//eclipse-workspace//MavenFrameworkBuild//src//main//java//resources//Browser.properties");
pp.load(fis);
//String browserUsed =pp.getProperty("browser");
 String browserUsed=System.getProperty("browser");
if (browserUsed.contains("chrome")) {
	System.setProperty("webdriver.chrome.driver", "//Users//supreeth//Downloads//chromedriver");
	
	driver = new ChromeDriver();
}
else if(browserUsed.contains("safari")) {
	
	driver=new SafariDriver();
}
	
	
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	
return driver;
	}
	
	public void screenShot(WebDriver driver,String methodName) throws Exception {
		TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String destinationFile=System.getProperty("user.dir")+"//reports//"+methodName+".png";
	FileUtils.copyFile(source, new File(destinationFile));
		
	}
	}

