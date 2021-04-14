package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.circulus.io/login.aspx");
		driver.manage().window().maximize();
		
		Reusable.sendKeys(driver, By.id("TxtEmail"), "nkasu@frontier.com");
		Reusable.sendKeys(driver, By.id("TxtPassword"), "xeno@1234");
		Reusable.click(driver, By.id("BtnLogin"));
		
		Reusable.click(driver, By.id("cpBody_divqlbillentry"));
		Reusable.click(driver, By.id("cpBody_btnBeginDEWithoutImg"));
		
		Reusable.click(driver, By.id("cpBody_ddlAutoCompExt_btn_comb"));
		Reusable.click(driver, By.cssSelector(".divAddVendorTemp"));
		
		Reusable.sendKeys(driver, By.id("cpBody_userNewVendor_cVtxtVendorName"), "QA_Vendor01");
		
		Reusable.sendKeys(driver, By.id("cpBody_userNewVendor_cVtxtFirstName"), "TestUser");
		
		
		
		
	}

}

