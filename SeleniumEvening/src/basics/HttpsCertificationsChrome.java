package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class HttpsCertificationsChrome {
	public static void main(String[] args) {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		//options.setAcceptInsecureCerts(true);
		
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();


		driver.get("URL");
	}

}
