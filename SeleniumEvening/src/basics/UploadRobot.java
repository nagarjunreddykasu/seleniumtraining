package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadRobot {
	public static void main(String[] args) throws AWTException, InterruptedException {
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
		
		String filepath=System.getProperty("user.dir")+"\\src\\upload\\INV50796.pdf";
		StringSelection sel=new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("cpBody_lblUploadText")).click();
		
		System.out.println(driver.findElement(By.id("cpBody_Sucmsg")).getText());
		
		
		
		/*
		 
		 Robot:
		  keyPress(int keycode)
		  KeyEvent.VK_SHIFT
		  
		  keyRelease(int keycode)
		 */
	}

}
