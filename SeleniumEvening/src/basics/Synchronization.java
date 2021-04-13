package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //Global wait
		
		driver.findElement(By.partialLinkText("Example 1:")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4")));
		
		String message=driver.findElement(By.cssSelector("#finish h4")).getText();
		System.out.println(message);
		
		
		
		
	}

}


/*
Waits:
------
Implicit Wait



Explicit Wait
		WebDriverWait
		FluentWait
		implemented classes of Wait interface




*/