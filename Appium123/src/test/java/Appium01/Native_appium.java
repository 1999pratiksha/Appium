package Appium01;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Native_appium {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void bt() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	    dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		//dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.example.android.apis");
		//dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY ,"com.example.android.apis.ApiDemos");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY ,"io.appium.android.apis.ApiDemos");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		Thread.sleep(3000);
		
	}
 @Test
 public void Test() throws InterruptedException {
	 System.out.println("first native automation");
	 driver.findElements(MobileBy.id("android:id/text1")).get(1).click();
	 Thread.sleep(3000);
	 driver.findElements(MobileBy.id("android:id/text1")).get(0).click();
	 driver.findElements(MobileBy.id("android:id/text1")).get(0).click();
	 driver.findElement(MobileBy.id("com.example.android.apis:id/ball")).click();
	 driver.navigate().back();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Reversing\")")).click();
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Preference\")")).click();
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"3. Preference dependencies\")")).click();
	  driver.findElement(MobileBy.id("android:id/checkbox")).click();
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
	  driver.findElement(MobileBy.id("android:id/edit")).sendKeys("pratiksha");
	  driver.findElement(MobileBy.id("android:id/button1")).click();
	 driver.findElement(MobileBy.AccessibilityId("Animation")).click();
	 driver.openNotifications();
	 driver.findElement(MobileBy.AccessibilityId("Battery Saver")).click();
	 driver.findElement(MobileBy.AccessibilityId("Auto-rotate screen")).click();
	 driver.navigate().back();
	
	 
 }
}
