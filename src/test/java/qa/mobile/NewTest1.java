package qa.mobile;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class NewTest1 {
	AppiumDriver driver;

	@Test
	public void invalidUsername() {

		WebElement usernameTxtFld = driver.findElement(AppiumBy.accessibilityId("Test-Username"));
		WebElement passwordTxtFld = driver.findElement(AppiumBy.accessibilityId("Test-Password"));
		WebElement loginbtn = driver.findElement(AppiumBy.accessibilityId("Test-LOGIN"));
		usernameTxtFld.sendKeys("invalidusername");
		passwordTxtFld.sendKeys("secret_sauce");
		loginbtn.click();

	}

	@Test
	public void invalidPassword() {

	}

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "Pixel_6");
		caps.setCapability("automationName", "Uiautomator2");
		caps.setCapability("deviceName", "Pixel_6");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		String appURL = "/Users/saharshaojha/Documents/Test_apk/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";
		caps.setCapability(MobileCapabilityType.APP, appURL);

		URL url = new URL("http://0.0.0.0:4723/");
		driver = new AndroidDriver(url, caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
