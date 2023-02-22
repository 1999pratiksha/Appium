package Appium01;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class banjararide{
    AndroidDriver<AndroidElement> driver;
    ExtentReports extent;
	ExtentTest logger;
@BeforeTest
 public void bt() throws MalformedURLException, InterruptedException {
     extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/Document.html",true);
     extent.loadConfig(new File(System.getProperty("user.dir")+"src/test/java/extent-config.xml"));
     DesiredCapabilities dc = new DesiredCapabilities();
     dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
     dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
     dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
     dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.forbinary.banjararide");
     dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.forbinary.banjararide.activity.SplashActivity");
     driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
     Thread.sleep(3000);
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

  @Test
  public void Login() throws InterruptedException {
	  //Home page Login//
	  logger=extent.startTest("Testing BookNow");
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/home_language_button")).click(); 
	  logger.log(LogStatus.PASS, "Banjara ride app is launched on phone");
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/rlClickConsumer")).click(); 
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Search...\")")).sendKeys("India");
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"India (IN)\")")).click();
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/edtMobileNumber")).sendKeys("6360476957");  
	  logger.log(LogStatus.PASS,"Country name and phone number is entered Sucessfully");
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
	  logger.log(LogStatus.PASS,"OTP Sent");
	  Thread.sleep(3000);
	  driver.findElement(MobileBy.className("android.widget.ImageView")).click();
	  logger.log(LogStatus.PASS,"Home page is Opened");
	  //driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();  
	 // driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Resend OTP\")")).click();
 }
  
  @Test(dependsOnMethods = "Login")
  public void bookings() throws InterruptedException {
	  logger=extent.startTest("Testing BookNow");
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/link_2")).click();
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hire Bike\")")).click();
	  logger.log(LogStatus.PASS,"Hire Bike is Clicked");
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"CB Hornet 160R\"))")).click();
	  logger.log(LogStatus.PASS,"Scrolled and selected CB Hornet 160R Bike");
	  Thread.sleep(2000);
	  //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"7 days\"))").click();
	  // driver.findElement(By.xpath("//*[@text='7 days']")).click();
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/btnBookNow")).click(); 
	  logger.log(LogStatus.PASS,"Booking CB Hornet 160R Bike");
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/llDateContainer")).click(); 
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.AccessibilityId("31 January 2023")).click(); 
	  logger.log(LogStatus.PASS,"CB Hornet 160R Bike is booked for 31 January 2023");
	  driver.findElement(MobileBy.id("android:id/button1")).click(); 
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  driver.navigate().back();
}
  @Test(dependsOnMethods = "bookings")
  public void Bookings() throws InterruptedException {
	  logger=extent.startTest("Testing BookNow");
	  driver.findElement(MobileBy.AccessibilityId("Open")).click();
	  Thread.sleep(1000);
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Bookings\")")).click();
	  driver.findElement(MobileBy.className("android.widget.ImageView")).click();
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_src_text")).sendKeys("Activa");
	  logger.log(LogStatus.PASS,"Activa is serached in search box");
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_close_btn")).click();
	  logger.log(LogStatus.PASS, "Checked for Activa Bookings");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.navigate().back();
	  driver.navigate().back();
	  logger.log(LogStatus.PASS, "Returns to Home page");
	 // driver.findElement(MobileBy.AccessibilityId("‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‎")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Call Us\"))")).click();
	  logger.log(LogStatus.PASS, "Call Us button clicked");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Thread.sleep(2000);
	  driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	  Thread.sleep(2000);
	  driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	  logger.log(LogStatus.PASS, "App switched back");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  logger.log(LogStatus.PASS, "App closed");
	  driver.navigate().back();
}
  @AfterTest
  public void afterTest() {
		extent.endTest(logger);//this will end the logger function
		extent.flush();//this will flush all the logged data into the html report
		  extent.close();//this will give an end report
	  
  }
}
