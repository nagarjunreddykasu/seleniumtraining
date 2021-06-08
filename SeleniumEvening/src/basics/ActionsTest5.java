package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest5 {
	public static void main(String[] args) {
		//To Launch the Chrome browser
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();


				driver.get("https://jqueryui.com/droppable/");
				
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
				
				//To perform drag and drop action
				WebElement source=driver.findElement(By.id("draggable"));
				WebElement target=driver.findElement(By.id("droppable"));
				
				Actions actions=new Actions(driver);
				actions.dragAndDrop(source, target).perform();
	}

}
