package Practice.Examples;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class getCurrentActivity {

    public static AndroidDriver driver;


//    public static MobileElement scrollTo(String text) {
//        MobileElement textFinder = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".resourceId(\"android:id/list\")).scrollIntoView("+ "new UiSelector().text(\"" + text + "\"));");
//        return textFinder;
//    }

    public static String currentActivity() {
        return driver.currentActivity();
    }

    public static void startActivity(String packageName, String activity) {
        try {
            driver.startActivity(new Activity(packageName, activity));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Throwable {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "LBYPFQXSVCZLUGQ4");
        dc.setCapability("appPackage", "com.tatasky.binge.uat");
        dc.setCapability("appActivity", "com.tatasky.binge.ui.features.splash.AppSplashActivity");
        URL url = new URL("http://127.0.0.1:4723/wd/hub/");
        driver = new AndroidDriver(url, dc);
        System.out.println(currentActivity());
        try {
            if (driver.isAppInstalled("com.tatasky.binge.uat")) {
                System.out.println("App is already installed ");
            }
        } catch (Exception e) {

        }
        //  scrollTo("");
        startActivity("com.vivo.gallery", "com.android.gallery3d.app.Gallery");
        driver.hideKeyboard();

        driver.quit();
    }
}
