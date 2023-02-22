package Appium01;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Hybrid_test extends capability {
	 AndroidDriver<AndroidElement> driver;
	@Test
	public void test1() throws MalformedURLException, InterruptedException {
	driver = cap();
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"))").click();//to scroll and view element and click
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("pratiksha");
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"))");//scroll and view
	Thread.sleep(1000);
	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ADD TO CART\")")).click();//by text we are finding an element"add to car"
	Thread.sleep(1000);
	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ADD TO CART\")")).click();//it will add 2 items by index
	Thread.sleep(1000);
	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	Thread.sleep(1000);
	String price1=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();//first price with 0 index
	System.out.println(price1);// print the first price $131.00
	price1=price1.substring(1);//index 0 is $ and 1 is 131 it will fetch index 1 
	Double dprice1=Double.parseDouble(price1);//131.00 is considered as float otherwise we can mention it as integer
	String price2=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();//2nd price
	System.out.println(price2);
	price2=price2.substring(1);
	Double dprice2=Double.parseDouble(price2);//161
	String Total_Amt=driver.findElement(MobileBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();//total amount is 238 soby clicking on 238 get the id and text
	System.out.println(Total_Amt);
	Total_Amt=Total_Amt.substring(1);//
	Double DTotal=Double.parseDouble(Total_Amt);//it will take248.00
	Double Add_total=dprice1+dprice2;//it will add both price by removing $ and comparing with total_amt
	System.out.println(Add_total);
	if (DTotal.equals(Add_total)){//here assertion is performed for comparing Dtotal and addtotal
		System.out.println("Assertion Passed");
	} else {
		System.out.println("Assertion failed");
	}
	driver.pressKey(new KeyEvent(AndroidKey.HOME));//it will redirect to homepage
	
	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));//switch between the pages
	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	driver.pressKey(new KeyEvent(AndroidKey.POWER));
	 //driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue with Google\")")).click();
	  
		/*  driver.findElement(MobileBy.className("android.widget.ImageView")).click();
		  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sign in\")")).click();
		  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue with Google\")")).click();
		  driver.findElements(MobileBy.id("com.google.android.gms:id/account_name")).get(1).click();
		  //driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"pratikshanaik065@gmail.com\")")).click();*/
}
	
}