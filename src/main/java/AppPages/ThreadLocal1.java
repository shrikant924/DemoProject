package AppPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.io.IOException;

public class ThreadLocal1 {

    protected static Logger log;

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static void setDriver(String browserName) throws IOException {

        if(browserName.equalsIgnoreCase("chrome")){

                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());

        }else if(browserName.equalsIgnoreCase("firefox")){

                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver());

        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver.set(new EdgeDriver());
        } else if (browserName.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            driver.set(new SafariDriver());
        }else {
            System.out.println("Enter browser name properly");
        }
    }
    public static WebDriver getDriver(){

        return driver.get();
    }

    public static void closeBrowser(){
        driver.get().close();
       driver.remove();
    }
}
