package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		//Navigation methods
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		//driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}

}
