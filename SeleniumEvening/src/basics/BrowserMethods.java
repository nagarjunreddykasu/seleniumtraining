package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Browser methods
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		driver.close();
		
		driver.quit();
		
	}

}
