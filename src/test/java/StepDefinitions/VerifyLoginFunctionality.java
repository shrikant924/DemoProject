package StepDefinitions;

import AppPages.HomePage;
import AppPages.StagingTataPlayCom;
import AppPages.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;

public class VerifyLoginFunctionality extends TestBase {

    JavascriptExecutor jse = (JavascriptExecutor) driver;
    @Given("User is on login page")
    public void UserIsOnLoginPage() {

        Logger log = LogManager.getLogger(StagingTataPlayCom.class.getName());
        driver.get(prop.getProperty("url"));
        jse.executeScript("arguments[0].click()",HomePage.notNowCTA());
        log.info("Language drawer closed successfully");
        jse.executeScript("arguments[0].click()",HomePage.hamburgerMenu());
        log.info("Clicked on user profile or hamburger Menu");
        jse.executeScript("arguments[0].click()",HomePage.loginCTA());
        log.info("Clicked on login CTA");
    }

    @Given("^Enter (.+) and (.+)$")
    public void EnterRMNandOTP(String RMN , String OTP)  {

        HomePage.RMNInputField().sendKeys(RMN);
        log.info("RMN typed in text field");
        jse.executeScript("arguments[0].click()", HomePage.getOTPCTA());
        log.info("clicked on GET OTP CTA");
        HomePage.OTPInputField().sendKeys(OTP);
    }

    @And("Click on proceed button")
    public void ClickOnProceedButton() {


    }

    @Then("Verify user is logged in successfully or not")
    public void VerifyUserIsLoggedInSuccessfullyOrNot(){

    }
}
