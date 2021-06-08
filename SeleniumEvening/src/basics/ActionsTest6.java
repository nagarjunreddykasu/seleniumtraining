package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActionsTest6 {
	public static void main(String[] args) throws InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://qa.circulus.io/login.aspx");
		driver.findElement(By.id("TxtEmail")).sendKeys("nkasu@frontier.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@123");
		driver.findElement(By.id("BtnLogin")).click();
		driver.findElement(By.id("cpBody_divqlbillentry")).click();
		driver.findElement(By.id("cpBody_btnBeginDEWithoutImg")).click();
		
		
		/*Actions actions=new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_UP).perform();*/
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,200)"); //to scroll down
		
		//js.executeScript("window.scrollBy(0,-200)"); //to scroll up
		
		//js.executeScript("window.scrollBy(2000,0)"); //To Scroll horizontally in right direction
		
		//js.executeScript("window.scrollBy(-2000,0)"); ////To Scroll horizontally in left direction
		
		WebElement btnSubmit=driver.findElement(By.id("cpBody_btnSubmit"));
		js.executeScript("arguments[0].scrollIntoView();",btnSubmit);
		
		
		
		
		
	}

}
