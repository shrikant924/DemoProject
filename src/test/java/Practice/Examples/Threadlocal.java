package Practice.Examples;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Threadlocal {

    public static ThreadLocal<MobileDriver<AndroidElement>> tlDriver= new ThreadLocal<>();

    public static AndroidDriver<AndroidElement> getTl(){
        return (AndroidDriver<AndroidElement>) tlDriver.get();
    }

    public static void setTl(AndroidDriver<AndroidElement> driver){
        tlDriver.set(driver);
    }
    public static void main(String args[]) throws Throwable{

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"LBYPFQXSVCZLUGQ4"); //Simulator or real device
        //dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554"); //Emulator or virtual device
        dc.setCapability("appPackage","com.tatasky.binge.uat");
        dc.setCapability("appActivity","com.tatasky.binge.ui.features.splash.AppSplashActivity");
        URL url=new URL("http://127.0.0.1:4723/wd/hub/");
        Threadlocal.setTl(new AndroidDriver<AndroidElement>(url,dc));
        Threadlocal.getTl();

    }
}
