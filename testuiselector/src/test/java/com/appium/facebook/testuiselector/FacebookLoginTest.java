package com.appium.facebook.testuiselector;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FacebookLoginTest {

	@Test
	public void testLoginFB() throws MalformedURLException, InterruptedException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("deviceName", "AndroidEmulator");
		capabilities.setCapability("app", "/Users/schakr7/Documents/Softwares/appium/facebook.apk");
		capabilities.setCapability("appPackage", "com.facebook.katana");
		capabilities.setCapability("appActivity", "com.facebook.katana.LoginActivity");
		capabilities.setCapability("noReset", false);
		
			AndroidDriver androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			androidDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_username\")").sendKeys("mobile.automation7@gmail.com");
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_password\")").click();
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_password\")").sendKeys("training123");
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_login\").text(\"LOG IN\")").click();
			
			
			if(androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/title\").text(\"New! Log In Faster\")").isDisplayed())
			{
				System.out.println("Inside 0");
				androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/dbl_off\").text(\"Not Now\")").click();
			}
			
			/*if(androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/login_settings\").text(\"Login Settings\")").isDisplayed())
			{
				System.out.println("Inside 1");
				androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/profile_pic_container\")").click();
			}*/
			
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/publisher_button0\").text(\"Status\")").click();
			System.out.println("Inside 2");
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/status_text\").text(\"What's on your mind?\")").click();
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/status_text\").text(\"What's on your mind?\")").sendKeys("Hello from Santanu :)");
			System.out.println("Inside 4");
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/composer_primary_named_button\").description(\"Post\")").click();
			
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/header_view_menu_button\").description(\"Story Menu\")").click();
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/fbui_popover_list_item_title\").text(\"Delete\")").click();
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/button1\").text(\"Delete\")").click();
			System.out.println("Inside 5");
			
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/bookmarks_tab\").text(\"More\")").click();
			androidDriver.scrollTo("Log Out").click();
			androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.facebook.katana:id/button1\").text(\"Log Out\")").click();
			System.out.println("Inside 6");
			Thread.sleep(2000);
	}
	
}
