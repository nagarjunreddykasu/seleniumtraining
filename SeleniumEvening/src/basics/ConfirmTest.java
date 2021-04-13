package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'JS Confirm')]")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		//alert.accept();//TO click on OK button in confirmation popup
		
		alert.dismiss();//To click on Cancel button in confirmation pop up
		
		
	}

}
