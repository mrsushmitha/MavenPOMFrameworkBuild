package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportClass {
	static ExtentReports extent;
	
	public static ExtentReports extentMethod() {
		
		String path=System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("qaTest");
		reporter.config().setReportName("Report1");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("TesterName", "SupSma");
		return extent;
	}

}
