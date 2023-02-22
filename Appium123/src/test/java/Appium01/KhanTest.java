package Appium01;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KhanTest extends Khancapability {
	 AndroidDriver<AndroidElement> driver;
  @Test()
  public void khanacademy() throws MalformedURLException, InterruptedException {
	  driver = cap2();
	  Thread.sleep(2000);
	  driver.findElements(MobileBy.className("android.widget.Button")).get(1).click();
	  Thread.sleep(1000);
	  driver.findElement(MobileBy.AccessibilityId("Continue with Google")).click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(MobileBy.id("com.google.android.gms:id/account_display_name")).click();
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Join class\")")).click();
	  driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("pavi123@gmail.com");
	  driver.findElement(MobileBy.className("android.widget.Button")).click();
	  driver.findElement(MobileBy.id("org.khanacademy.android:id/tab_bar_button_search")).click();//search bar
	  //driver.findElement(MobileBy.AccessibilityId("Search")).sendKeys("Math");
	  driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("Computing");
	  //driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"What is a computer?\")")).click();
	 driver.findElements(MobileBy.className("android.view.ViewGroup")).get(9).click();//select parellel computing
	 Thread.sleep(2000);
	 driver.navigate().back();
	 driver.navigate().back();
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Test prep\")")).click();
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"MCAT\")")).click();
	 //driver.findElements(MobileBy.className("android.view.ViewGroup")).get(1).click();
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Practice Passages: Critical Analysis and Reasoning Skills (CARS)\")")).click();
	 driver.findElement(MobileBy.AccessibilityId("Add Bookmark")).click();//add to book mark
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"GOT IT\")")).click();//suggestion select
	 driver.navigate().back();
	 driver.navigate().back();
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"SAT\")")).click();
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"About the SAT\")")).click();
	 driver.findElement(MobileBy.AccessibilityId("Add Bookmark")).click();
	 Thread.sleep(2000);
	 driver.findElement(MobileBy.AccessibilityId("Bookmarks tab")).click();
	 Thread.sleep(2000);
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Home\")")).click();
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Computers\")")).click();
	 driver.navigate().back();
	// driver.pressKey(new KeyEvent(AndroidKey.HOME));
  }
 
}


