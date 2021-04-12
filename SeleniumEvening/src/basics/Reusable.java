package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

}
