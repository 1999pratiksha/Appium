package Appium01;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demoappium 
{
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void BT() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	  dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C:\\Users\\naikp\\eclipse-workspace\\Appium123\\chromedriver.exe");
	  driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	}
@Test
public void tc() throws InterruptedException
{
 driver.get("https://www.google.com");
 driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("OrangeHrm demo");
 //inspected chrome then inspect by clicking on arrow mark class name of text box is captured.
 //in the search box searching for an orangehrm
  Actions act= new Actions(driver);
  act.sendKeys(Keys.ENTER).build().perform();//to perform enter option
  driver.findElement(By.partialLinkText("OrangeHRM Demo.")).click();//to click on orangehrm demo
  Thread.sleep(3000);
  driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--focus']")).sendKeys("Admin");
  driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']")).sendKeys("admin123");
  Thread.sleep(3000);
  driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
  
}
}
