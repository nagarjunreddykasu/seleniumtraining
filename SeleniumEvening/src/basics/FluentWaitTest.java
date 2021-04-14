package basics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //Global wait
		
		driver.findElement(By.partialLinkText("Example 1:")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		
		
		/*Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver){
				if(driver.findElement(By.cssSelector("#finish h4")).isDisplayed()){
					return driver.findElement(By.cssSelector("#finish h4"));
				}
				else
					return null;
			}
		});*/
		
		Reusable.fluentWait(driver, By.cssSelector("#finish h4"));
		
		String message=driver.findElement(By.cssSelector("#finish h4")).getText();
		System.out.println(message);
		
		
	}

}
