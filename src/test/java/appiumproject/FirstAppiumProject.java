package appiumproject;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstAppiumProject {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_6");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");

		String appURL = "/Users/saharshaojha/Documents/Test_apk/ApiDemos-debug.apk";
		cap.setCapability(MobileCapabilityType.APP, appURL);
		
		
		URL url =new URL("http://0.0.0.0:4723/wd/hub");
		AppiumDriver driver = new AndroidDriver(url,cap);
		

	}

}
