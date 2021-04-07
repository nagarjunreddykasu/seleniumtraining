package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {
	public static void main(String[] args) {
		
		//To launch chrome browser, we need to download chromedriver.exe
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		
		//To launch Firefox browser, we need to download geckodriver.exe
		/*System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		
		//To Launch IE browser, we need to download IEDriver.exe
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		
		//To open the application
		driver.get("https://www.selenium.dev/");
		//To maximize the browser window
		driver.manage().window().maximize();
		
		
		
	}

}


/*

WebDriver is an interface

ChromeDriver implements WebDriver
FirefoxDriver
InternetExplorerDriver
EdgeDriver
OperaDriver
SafariDriver





*/