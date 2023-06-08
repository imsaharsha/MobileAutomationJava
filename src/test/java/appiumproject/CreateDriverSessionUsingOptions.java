package appiumproject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class CreateDriverSessionUsingOptions {

	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setDeviceName("Pixel_6");
		options.setAutomationName("UiAutomator2");
		String appURL = "/Users/saharshaojha/Documents/Test_apk/ApiDemos-debug.apk";
		options.setApp(appURL);
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		
		AppiumDriver driver = new AndroidDriver(url,options);
		
		
		
		
		

	}

}
