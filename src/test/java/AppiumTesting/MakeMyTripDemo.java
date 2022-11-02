package AppiumTesting;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.gson.stream.JsonReader;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.messages.types.Duration;

public class MakeMyTripDemo {

	static JsonReader jsonReader;

	public static void main(String[] args) throws IOException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
		capabilities.setCapability("appPackage", "com.makemytrip");
		capabilities.setCapability("appActivity", "com.mmt.travel.app.home.ui.SplashActivity");
		AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
		System.out.println(driver.getDeviceTime());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try {
			
			driver.findElementById("com.makemytrip:id/continueButton").click();
		}catch(Exception e) {}
		try {
			driver.findElementById("com.google.android.gms:id/credential_secondary_label").click();
		}catch(Exception e) {}
		try {
			driver.findElementById("com.makemytrip:id/logo").click();
		}catch(Exception e) {}
		try {}catch(Exception e) {}
		try {}catch(Exception e) {}
		try {}catch(Exception e) {}
		try {}catch(Exception e) {}
		try {}catch(Exception e) {}
		try {}catch(Exception e) {}
		
	}

}
