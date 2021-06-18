package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basics.Reusable;

public class StaticDataProvider2 {
	static WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browser,String url){
		Reusable.launchApp(browser, url);
		driver=Reusable.getDriver();
	}
	
	@Test(dataProvider="getData",dataProviderClass=DataProviders.class)
    public void TC_Login_01(String username, String password, String flag) throws InterruptedException {
		driver.findElement(By.id("TxtEmail")).sendKeys(username);
		driver.findElement(By.id("TxtPassword")).sendKeys(password);
		driver.findElement(By.id("BtnLogin")).click();
		Thread.sleep(2000);
		String expectedMsg="Invalid Username / Email Address or Password.";
		String expInvalidEmailMsg="Please enter a valid Username / Email Address.";
		String expectedErrUserName="Please enter Username / Email Address.";
		String expectedErrPassword="Please enter Password.";
		
		switch(flag){
		case "invuser":
			Assert.assertEquals(driver.findElement(By.id("divemail")).getText(),expectedMsg);
			System.out.println("Actual and Expected validation messages are Equal for Invalid User...");
			break;
		case "invpwd":
			Assert.assertEquals(expectedMsg, driver.findElement(By.id("divemail")).getText());
			System.out.println("Actual and Expected validation messages are Equal for Invalid Password...");
			break;
		case "invEmail":
			Assert.assertEquals(expInvalidEmailMsg, driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText());
			System.out.println("Actual and Expected validation messages are Equal for Invalid Email...");
			break;
		case "blank":
			String actualErrUserName=driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();
			String actualErrPassword=driver.findElement(By.xpath("//*[@id='Div1']/div[4]/div")).getText();
			Assert.assertEquals(expectedErrUserName, actualErrUserName);
			Assert.assertEquals(expectedErrPassword, actualErrPassword);
			System.out.println("Actual and Expected validation messages are Equal for blank credentials...");
			break;
			
		}

		Thread.sleep(2000);
		driver.findElement(By.id("TxtEmail")).clear();
		driver.findElement(By.id("TxtPassword")).clear();
		
    }
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
