package basics;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable {
	
	public static void selectDate(WebDriver driver, String month, String day) throws InterruptedException{
		while(!driver.findElement(By.cssSelector("[class*='ui-datepicker-group-last'] [class='ui-datepicker-title']")).getText().contains(month)){
			driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
			Thread.sleep(1000);
		}
		
		List<WebElement> dates=driver.findElements(By.cssSelector("[class*='ui-datepicker-group-last'] [data-handler='selectDay']"));
		
		for(int i=0;i<dates.size();i++){
			String date=dates.get(i).getText();
			if(date.equals(day)){
				dates.get(i).click();
				break;
			}
		}
	}
	
	public static void sendKeys(WebDriver driver,By locator, String value){
		driver.findElement(locator).sendKeys(value);
	}
	
	public static void click(WebDriver driver,By locator){
		driver.findElement(locator).click();
	}
	
	public static String getText(WebDriver driver,By locator){
		return driver.findElement(locator).getText();
	}
	
	
	public static void wait(WebDriver driver, By locator){
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void fluentWait(WebDriver driver,By locator){
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver){
				if(driver.findElement(locator).isDisplayed()){
					return driver.findElement(locator);
				}
				else
					return null;
			}
		});
	}
	
	public static void scroll(WebDriver driver,WebElement element){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

}
