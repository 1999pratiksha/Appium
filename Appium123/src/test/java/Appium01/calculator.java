package Appium01;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.MoveToOffsetAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

import static io.appium.java_client.touch.offset.ElementOption.element;
public class calculator {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
public void bt() throws MalformedURLException, InterruptedException {
 DesiredCapabilities dc = new DesiredCapabilities();
 dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
 dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
 driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
 Thread.sleep(3000);
}
	@Test
	public void Calculator() throws InterruptedException, IOException {
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_5")).click();
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_4")).click();
		 driver.findElement(MobileBy.AccessibilityId("plus")).click();
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_5")).click();
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_3")).click();
		 driver.findElement(MobileBy.AccessibilityId("equals")).click();
		 Thread.sleep(2000);
		 driver.findElement(MobileBy.AccessibilityId("clear")).click();
		 driver.navigate().back();
		// driver.navigate().back();//to go back
		//Thread.sleep(1000);
		// driver.findElement(MobileBy.AccessibilityId("Phone")).click();
		 //Thread.sleep(2000);
		/* WebElement wd1=driver.findElement(MobileBy.id("com.google.android.dialer:id/icon"));
		 WebElement wd2=driver.findElement(MobileBy.AccessibilityId("Call History tab"));
		 
		 TouchAction act=new TouchAction(driver);
		 act.longPress(longPressOptions().withElement(element(wd1)).withDuration(Duration.ofSeconds(2))).moveTo(element(wd2)).release().perform();//for swiping in call logs
		
		 Thread.sleep(1000);
		// driver.findElement(MobileBy.AccessibilityId("key pad")).click();
		// Thread.sleep(1000);
		/* WebElement wb=driver.findElement(MobileBy.AccessibilityId("0,+"));
	     TouchAction act1=new TouchAction(driver);// long press we use this method
		 act.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(wb)).withDuration(Duration.ofSeconds(2))).release().perform();
		 Thread.sleep(1000);
		 driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
		 driver.findElement(MobileBy.AccessibilityId("3,DEF")).click();
		 driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
		 driver.findElement(MobileBy.AccessibilityId("0,+")).click();
		 driver.findElement(MobileBy.AccessibilityId("4,GHI")).click();
		 driver.findElement(MobileBy.AccessibilityId("dial")).click();
		 driver.pressKey(new KeyEvent(AndroidKey.HOME));*/
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("C:/Users/naikp/OneDrive/Pictures/sccreen.jpg"));//clicking screenshot
		 
		 
	}
}







