package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownloadFileFirefox {
	public static void main(String[] args) throws Exception {
		//To Launch the Chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://qa.circulus.io/login.aspx");
		driver.findElement(By.id("TxtEmail")).sendKeys("nkasu@frontier.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@123");
		driver.findElement(By.id("BtnLogin")).click();


		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("menu_aBills"))).perform();

		driver.findElement(By.linkText("Approve Bills")).click();


		driver.findElement(By.id("cpBody_btnExcel")).click();

		Thread.sleep(5000);
		
		/*Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);*/
		String fileName="ApproveBills.xlsx";
		String downloadFilePath="C:\\Users\\admin1\\Downloads";
		
		File dir=new File(downloadFilePath);
		File[] files=dir.listFiles();
		boolean isDownloaded=false;
		for(int i=0;i<files.length;i++){
			if(files[i].getName().equals(fileName)){
				System.out.println(fileName+" is downloaded.");
				isDownloaded=true;
				break;
			}
		}
		
		if(isDownloaded){
			System.out.println("File is downloaded");
		}
		else{
			System.out.println("File is NOT downloaded");
			throw new Exception("File is NOT downloaded");
		}
	}

}
