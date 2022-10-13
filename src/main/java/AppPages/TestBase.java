package AppPages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
protected static WebDriver driver;

    static String path = System.getProperty("user.dir")+"/src/main/resources/data.properties";
    protected JavascriptExecutor jse;
    public static Properties prop;
    static FileInputStream fis;
    protected static Logger log;

    public static void launchBrowser() throws Throwable{
        log = LogManager.getLogger(TestBase.class.getName());
        prop = new Properties();
        fis = new FileInputStream(path);
        log= LogManager.getLogger(TestBase.class.getName());
        prop.load(fis);
        ThreadLocal1.setDriver(prop.getProperty("browserName"));
        driver =ThreadLocal1.getDriver();
        driver.manage().window().maximize();
          log.info("window gets maximized");
          driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        TataPlayHome tataPlayHome = new TataPlayHome(driver);

    }

    public static void tearDown(){
        ThreadLocal1.closeBrowser();
        log.debug("browser closed successfully");
    }

}
