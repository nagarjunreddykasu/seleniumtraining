package basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAutoIt {
	public static void main(String[] args) throws IOException, InterruptedException {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://qa.circulus.io/login.aspx");
		driver.findElement(By.id("TxtEmail")).sendKeys("nkasu@frontier.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@123");
		driver.findElement(By.id("BtnLogin")).click();
		driver.findElement(By.id("cpBody_divqlbillentry")).click();

		driver.findElement(By.cssSelector(".input-group-btn")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\upload\\uploadfile.exe");
		Thread.sleep(3000);
		
		driver.findElement(By.id("cpBody_lblUploadText")).click();
		
		System.out.println(driver.findElement(By.id("cpBody_Sucmsg")).getText());
		
	}

}
