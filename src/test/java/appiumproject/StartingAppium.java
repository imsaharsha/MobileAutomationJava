package appiumproject;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class StartingAppium {

	public static void main(String[] args) throws MalformedURLException {
		// For Android
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_6");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		String appURL = "/Users/saharshaojha/Documents/Test_apk/ApiDemos-debug.apk";
		caps.setCapability(MobileCapabilityType.APP, appURL);
		//caps.setCapability("avd","pixel_6");
		//caps.setCapability("avdLauchTimeOut",1800);

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		AppiumDriver driver = new AppiumDriver(url, caps);
		System.out.println("session id:"+driver.getSessionId());
		// For iOS
		/*
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
		 * caps.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 14 pro max");
		 * caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
		 * caps.setCapability(MobileCapabilityType.UDID,
		 * "BE1B00E3-4A4B-42AC-B73B-90FBEE20B4D5"); String appURL = "";
		 * 
		 * caps.setCapability(MobileCapabilityType.APP,appURL);
		 */

	}

}
