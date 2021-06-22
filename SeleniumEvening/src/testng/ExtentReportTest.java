package testng;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import basics.Reusable;

public class ExtentReportTest {
	
	public static ExtentSparkReporter reporter;
	public static ExtentReports reports;
	public static ExtentTest extentTest;
	@BeforeSuite
	public void beforeSuite(){
		reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"//reports//ExtentReport.html");
		reporter.config().setEncoding("utf-8");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Automation Test Results");
		reporter.config().setTheme(Theme.STANDARD);
		reports=new ExtentReports();
		reports.setSystemInfo("selenium version", "3.141.0");
		reports.setSystemInfo("Author", "Automation Test User");
		
		reports.attachReporter(reporter);
	}
	
	@BeforeClass
	@Parameters({"browser","url"})
	public void beforeClass(String browser, String url) {
		Reusable.launchApp(browser,url);
	}
	
	//Verify the page title in Login page
		@Test
		public void TC_Login_01() throws Exception{
			try{
				extentTest=reports.createTest("Verify the page title in Login page");
				String expectedTitle="Circulus - Login1";
				String actualTitle=Reusable.getDriver().getTitle();
				System.out.println("Actual page title: "+actualTitle);
				Assert.assertEquals(expectedTitle, actualTitle);
				System.out.println("Actual and Expected Page titles are Equal...");
			}
			catch(Exception e){
				throw new Exception(e.getMessage());
			}
		}

		// Verify the validation messages when clicking on Submit button without entering user name and password
		@Test
		public void TC_Login_02() throws Exception {
			try {
				extentTest=reports.createTest("Verify the validation messages when clicking on Submit button without entering user name and password");
				String expectedErrUserName = "Please enter Username / Email Address.";
				String expectedErrPassword = "Please enter Password.";
				Reusable.getDriver().findElement(By.id("BtnLogin")).click();
				Thread.sleep(2000);
				String actualErrUserName = Reusable.getDriver().findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();
				String actualErrPassword = Reusable.getDriver().findElement(By.xpath("//*[@id='Div1']/div[4]/div")).getText();
				System.out.println("Actual validation message for User Name: " + actualErrUserName);
				System.out.println("Actual validation message for Password: " + actualErrPassword);
				Assert.assertEquals(expectedErrUserName, actualErrUserName);
				Assert.assertEquals(expectedErrPassword, actualErrPassword);
				System.out.println("Actual and Expected validation messages are Equal...");
			} catch (Exception e){
				throw new Exception(e.getMessage());
			}
		}

		@AfterSuite
		public void afterTest() {
			reports.flush();
			Reusable.getDriver().quit();
		}
		
		@AfterMethod
		public void afterMethod(ITestResult result) throws IOException{
			if(result.getStatus()==ITestResult.SUCCESS){
				String methodName=result.getMethod().getMethodName();
				String logText=methodName+" successfull.";
				Markup markup=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
				extentTest.log(Status.PASS, markup);
				
			}
			else if(result.getStatus()==ITestResult.FAILURE){
				String methodName=result.getMethod().getMethodName();
				String exceptionMessage=Arrays.toString(result.getThrowable().getStackTrace());
				extentTest.fail(exceptionMessage);
				
				String path=Reusable.takeScreenshot();
				extentTest.fail("Screenshot of Failure: ",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
				String logText=methodName+" Failed.";
				Markup markup=MarkupHelper.createLabel(logText, ExtentColor.RED);
				extentTest.log(Status.FAIL, markup);
			}
			else{
				String methodName=result.getMethod().getMethodName();
				String logText=methodName+" Skipped.";
				Markup markup=MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
				extentTest.log(Status.SKIP, markup);
				
			}
		}
	
	

}


/*
ExtentSparkReporter
ExtentReports
ExtentTest

extentreports-5.0.7.jar
freemarker-2.3.31.jar
reactive-streams-1.0.1.jar
rxjava-3.0.11.jar

*/