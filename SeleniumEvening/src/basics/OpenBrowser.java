package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OpenBrowser {
	public static void main(String[] args) {
		
		//To launch chrome browser, we need to download chromedriver.exe
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		
		//To launch Firefox browser, we need to download geckodriver.exe
		/*System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		
		//To Launch IE browser, we need to download IEDriver.exe
		/*System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		
		//To launch edge browser, we need to download edgedriver.exe
		/*System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//msedgedriver.exe");
		WebDriver driver=new EdgeDriver();*/
		
		//To launch opera browser, we need to download operadriver.exe
		System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"//drivers//operadriver.exe");
		WebDriver driver=new OperaDriver();
		
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