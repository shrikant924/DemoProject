package Core;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ThreadLocalDriver {

    public static ThreadLocal<MobileDriver<AndroidElement>> tl1driver = new ThreadLocal<>();

    public static AndroidDriver<AndroidElement> getTL1driver() {
        return (AndroidDriver<AndroidElement>) tl1driver.get();
    }

    public static void setTL1driver(AndroidDriver<AndroidElement> driver) {
        tl1driver.set(driver);
    }
}

