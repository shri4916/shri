package ContactsTest;

import java.io.File;
import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class First_ExtentReprt 
{
	ExtentReports report;
	
	@BeforeTest
	public void firstReport()
	{
		//String currentDate= new Date().toString();
		report= new ExtentReports("./advanceReport.html");
		report.loadConfig(new File("./extent-config.xml"));
		
	}
	
	@Test
	public void firstReporttest()
	{
		ExtentTest logger= report.startTest("Creat orgnization Test");
		logger.log(LogStatus.INFO, "login to app");
		logger.log(LogStatus.INFO, "open campaign page");
		logger.log(LogStatus.INFO, "creat campaign page");
		logger.log(LogStatus.INFO, "varify campaign");
		
		if("HDFC".equals("HDFC"))
		{
			logger.log(LogStatus.PASS, "campaign is varified");
		}
		else
		{
			logger.log(LogStatus.FAIL, "campaign not varified");
		}
		
		//logger.log(LogStatus.INFO, "log out");
		
		report.endTest(logger);
	}
	
	
	

}
