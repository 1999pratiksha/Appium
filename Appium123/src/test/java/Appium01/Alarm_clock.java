package Appium01;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Alarm_clock {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
public void bt() throws MalformedURLException, InterruptedException {
 DesiredCapabilities dc = new DesiredCapabilities();
 dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
 dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.deskclock");
 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.deskclock.DeskClock");
 driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
 Thread.sleep(3000);
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

@Test
 public void Test() throws InterruptedException {
	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ALARM\")")).click();
	 driver.findElement(MobileBy.AccessibilityId("Add alarm")).click();
	 Thread.sleep(2000);
	 driver.findElement(MobileBy.AccessibilityId("9")).click();
	 driver.findElement(MobileBy.AccessibilityId("30")).click();
	 Thread.sleep(2000);
	 driver.findElement(MobileBy.id("android:id/am_label")).click();
	 driver.findElement(MobileBy.id("android:id/button1")).click();
	/*driver.findElement(By.xpath("//*[@text='ALARM']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@text='9:00 AM']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@text='00']")).click();
	Thread.sleep(2000);
	driver.findElement(MobileBy.AccessibilityId("30")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@text='PM']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@text='OK']")).click();*/
	
	
 //driver.findElement(MobileBy.AccessibilityId("Clock")).click();
 
}
}

