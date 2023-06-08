package appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebViewAutomation {

	public static void main(String[] args) throws MalformedURLException {
		AppiumDriver driver;
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "Uiautomator2");
		caps.setCapability("deviceName", "Pixel_6");

		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		String appURL = "/Users/saharshaojha/Documents/Testapk/ApiDemos-debug.apk";
		caps.setCapability(MobileCapabilityType.APP, appURL);

		URL url = new URL("http://0.0.0.0:4723/");
		driver = new AndroidDriver(url, caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.quit();

	}

}
