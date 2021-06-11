package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorTest {
	public static void main(String[] args) {

		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://qa.circulus.io/login.aspx");
		
		/*driver.findElement(By.id("TxtEmail")).sendKeys("nkasu@frontier.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@123");
		driver.findElement(By.id("BtnLogin")).click();*/
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='nkasu@frontier.com'", driver.findElement(By.id("TxtEmail")));
		js.executeScript("arguments[0].value='xeno@123'", driver.findElement(By.id("TxtPassword")));
		
		js.executeScript("arguments[0].click();", driver.findElement(By.id("BtnLogin")));
		
		
		

	}

}
