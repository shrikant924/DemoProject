package AppPages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static AppPages.TestBase.prop;

public class StagingTataPlayCom {

    public static WebDriver driver;

    public StagingTataPlayCom(WebDriver driver) {

        this.driver=driver;
    }

    @Test
    public static void test() throws Throwable {


        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Logger log = LogManager.getLogger(StagingTataPlayCom.class.getName());
        driver.get(prop.getProperty("url"));
        {
            try {
                if (HomePage.notNowCTA() != null) {

                    jse.executeScript("arguments[0].click();", HomePage.notNowCTA());
                    log.info("Language drawer closed successfully");
                } else {
                    jse.executeScript("arguments[0].click()", HomePage.doItLaterCTA());
                    log.info("subscription drawer successfully closed");
                }
            } catch (Exception e) {

            }

        }

        jse.executeScript("arguments[0].click();", HomePage.hamburgerMenu());
        log.info("Clicked on user profile or hamburger Menu");
        jse.executeScript("arguments[0].click()", HomePage.loginCTA());
        log.info("Clicked on login CTA");
        HomePage.RMNInputField().sendKeys("9873624724");
        log.info("RMN typed in text field");
        jse.executeScript("arguments[0].click()", HomePage.getOTPCTA());
        log.info("clicked on GET OTP CTA");
        log.debug("browser closing");
        HomePage.OTPInputField().sendKeys("938205");
    }
}
