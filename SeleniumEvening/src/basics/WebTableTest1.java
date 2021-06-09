package basics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableTest1 {
	public static void main(String[] args) {
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
		
		//*[@id="cpBody_GVBillReviewApprove"]/thead/tr/th[1]
		//*[@id="cpBody_GVBillReviewApprove"]/thead/tr/th[2]
		//*[@id="cpBody_GVBillReviewApprove"]/thead/tr/th[8]
		//*[@id="cpBody_GVBillReviewApprove"]/thead/tr/th[9]
		
		//To get Column count in web table
		int colCount=driver.findElements(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/thead/tr/th")).size();
		System.out.println("Column count: "+colCount);
		
		//To get Column Names
		ArrayList<String> actualColumns=new ArrayList<>();
		for(int i=1;i<colCount;i++){
			String colName=driver.findElement(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/thead/tr/th["+i+"]")).getText();
			//System.out.println(colName);
			actualColumns.add(colName);
		}
		System.out.println("Actual Column Names: "+actualColumns);
		
		//To get Row Count
		int rowCount=driver.findElements(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr")).size();
		System.out.println("Row count: "+rowCount);
		
		//*[@id="cpBody_GVBillReviewApprove"]/tbody/tr[1]/td[2]
		//*[@id="cpBody_GVBillReviewApprove"]/tbody/tr[2]/td[2]
		//*[@id="cpBody_GVBillReviewApprove"]/tbody/tr[3]/td[2]
		
		//To get any specific column data in web table
		for(int row=1;row<=rowCount;row++){
			String vendorName=driver.findElement(By.xpath("//*[@id='cpBody_GVBillReviewApprove']/tbody/tr["+row+"]/td[2]")).getText();
			System.out.println(vendorName);
		}
	}
}


/*

WebTable:

<table>
<th>
<tr>
<td>

Static web table:
Dynamic web table:


 */