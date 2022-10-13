package Practice;

import AppPages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class StagingTataPlayCom {

//    private final WebDriver driver;
//
//    StagingTataPlayCom(WebDriver driver){
//        this.driver=driver;
//    }
//
//    @Test
//    public static void main(String[] args) throws Throwable {
//
////        Logger log = LogManager.getLogger(StagingTataPlayCom.class.getName());
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("disable-infobars");
////        options.addArguments("headless");
////        WebDriverManager.chromedriver().setup();
////        WebDriver driver = new ChromeDriver(options);
////        log.debug("Chrome driver successfully launched");
////        driver.get("https://staging-web-frm.videoready.tv/");
////        log.info("website loaded");
////        driver.manage().window().maximize();
////        log.info("window gets maximized");
////        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//       // HomePage homePage = new HomePage(driver);
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click();", homePage.notNowCTA());
//        log.info("Language drawer closed successfully");
//        jse.executeScript("arguments[0].click();", homePage.hamburgerMenu());
//        log.info("Clicked on user profile or hamburger Menu");
//        jse.executeScript("arguments[0].click()", homePage.loginCTA());
//        log.info("Clicked on login CTA");
//        homePage.RMNInputField().sendKeys("9873624724");
//        log.info("RMN typed in text field");
//        jse.executeScript("arguments[0].click()", homePage.getOTPCTA());
//        log.info("clicked on GET OTP CTA");
//        log.debug("browser closing");
//        homePage.OTPInputField().sendKeys("938205");
//        Thread.sleep(10000);
//        driver.quit();
//        log.debug("browser closed successfully");
//
//    }
}
