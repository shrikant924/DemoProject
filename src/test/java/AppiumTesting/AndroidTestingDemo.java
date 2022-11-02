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

public class AndroidTestingDemo {

	static JsonReader jsonReader;

	public static void main(String[] args) throws IOException, InterruptedException {

		// AppiumDriverLocalService appiumDriverLocalService= new
		// AppiumServiceBuilder().usingAnyFreePort().build();
		// appiumDriverLocalService.start();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
		capabilities.setCapability("appPackage", "com.tatasky.binge.uat");
		capabilities.setCapability("appActivity", "com.tatasky.binge.ui.features.splash.AppSplashActivity");
		AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
		System.out.println(driver.getDeviceTime());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		{
			try {

				driver.findElementById("com.tatasky.binge.uat:id/tv_not_now").click();

			}

			catch (Exception e) {
			}

			try {

				driver.findElementById("com.tatasky.binge.uat:id/btn_pack_later").click();

			}

			catch (Exception e) {

			}
			try {

				driver.findElementById("com.tatasky.binge.uat:id/iv_close").click();
				

			}

			catch (Exception e) {

			}

			driver.findElementById("com.tatasky.binge.uat:id/hamberger_menu").click();

			{
				try {

					driver.findElementById("com.tatasky.binge.uat:id/tv_text_login").click();
					driver.findElementById("com.tatasky.binge.uat:id/et").sendKeys("8856822923");
					driver.findElementById("com.tatasky.binge.uat:id/btn_proceed_guest_login").click();
					driver.findElementById("com.tatasky.binge.uat:id/et_otp_dig_1").sendKeys("938205");
					System.out.println("successfully looged In");

				} catch (Exception e) {
					System.out.println("you are already logged In");
				}

				try {
					driver.findElementById("com.tatasky.binge.uat:id/btn_proceed_guest_login_previously_used_mobile")
							.click();
				} catch (Exception e) {
				}

			}

			// driver.findElementById("com.tatasky.binge.uat:id/hamberger_menu").click();
			driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			TouchAction action = new TouchAction(driver);

			MobileElement element = (MobileElement) driver
					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
							+ ".scrollIntoView(new UiSelector().text(\"MX Player OPS test\"))"));

			// driver.closeApp();

		}

	}
}
