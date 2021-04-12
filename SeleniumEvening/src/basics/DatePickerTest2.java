package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerTest2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		
		
		//To select December 31
		
		/*while(!driver.findElement(By.cssSelector("[class*='ui-datepicker-group-last'] [class='ui-datepicker-title']")).getText().contains("December")){
			driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
			Thread.sleep(1000);
		}
		
		List<WebElement> dates=driver.findElements(By.cssSelector("[class*='ui-datepicker-group-last'] [data-handler='selectDay']"));
		
		for(int i=0;i<dates.size();i++){
			String date=dates.get(i).getText();
			if(date.equals("31")){
				dates.get(i).click();
				break;
			}
		}*/
		
		Reusable.selectDate(driver, "November", "25");
		
		
	}

}
