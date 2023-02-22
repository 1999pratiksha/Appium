package Appium01;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Khancapability {
	public static AndroidDriver<AndroidElement>cap2() throws MalformedURLException {
		 DesiredCapabilities dc = new DesiredCapabilities();
		 dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		 dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android");
		 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"org.khanacademy.android.ui.library.MainActivity");
		 AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		 return driver;
}
}