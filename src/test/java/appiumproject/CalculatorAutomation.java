package appiumproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorAutomation {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_6");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		String appURL = "/Users/saharshaojha/Documents/Testapk/AndroidCalculator.apk";
		caps.setCapability(MobileCapabilityType.APP, appURL);

		URL url = new URL("http://0.0.0.0:4723/");

		AppiumDriver driver = new AndroidDriver(url, caps);
		driver.getSessionId().toString();

		WebElement button = driver.findElement(AppiumBy.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/div[2]/div/div/div/div/div[18]"));
		WebElement seven = driver.findElement(AppiumBy.xpath("00000000-0000-00a2-ffff-ffff00000034"));
		WebElement four = driver.findElement(AppiumBy.id("digit4"));
		WebElement add = driver.findElement(AppiumBy.id("plus"));

		WebElement equal = driver.findElement(By.id("equal"));
		By.id("result_final");

		button.click();
		seven.click();
		add.click();
		four.click();
		equal.click();
	}
}
