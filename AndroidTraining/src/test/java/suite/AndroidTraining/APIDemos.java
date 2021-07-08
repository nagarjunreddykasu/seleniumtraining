package suite.AndroidTraining;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class APIDemos {
	
	@Test
	public void APIDemosTest() throws MalformedURLException, InterruptedException{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");//deviceid
		
		//cap.setCapability(MobileCapabilityType.UDID, "deviceid");
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		
		File app=new File(System.getProperty("user.dir")+"//ApiDemos-debug.apk");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		/*cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");*/
		
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(MobileCapabilityType.FULL_RESET, false);
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='App']")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Alert Dialogs")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("io.appium.android.apis:id/two_buttons")).click();
		Thread.sleep(2000);
		String actualAlertMessage=driver.findElement(MobileBy.id("android:id/alertTitle")).getText();
		System.out.println(actualAlertMessage);
		
		//tagname[@attributename='value']
		//tagname[startsWith(@attributename,'partialstartingvalue')]
		//tagname[contains(@attributename,'partialvalue')]
		
		
	}

}


/*


Platform_Name -> Android

Device_Name -> "emulator-5554" or "Nexus_5_API_29" or "Android Emulator"

Automation_name -> "UiAutomator2"

App


App_Package
App_Activity

1. APK Analyzer app

2. cmd prompt
adb shell
dumpsys window windows | grep -E 'mObscuringWindow'


No_Reset  -> true
Full_Reset -> false

uiautomatorviewer bat file

Android:
---------
id -> resource-id attribute value
className -> class attribute value
xpath  -> text attribute value
AccessibilityId -> content-desc attribute value

AndroidUIAutomator  -> UiSelector class object with attribute values
UiScrollable class object with attribute values


ios:
-----
id 
className 
xpath
AccessibilityId
IOSUIAutomation


AndroidUIAutomator
Scrolling (Vertical and Horizontal)
KeyEvents
Auto Complete
Toast Messages
TouchAction class (tap, longpress, swipe, drag and drop)
Hybrid App (Native and Web view)

Jenkins integration





*/