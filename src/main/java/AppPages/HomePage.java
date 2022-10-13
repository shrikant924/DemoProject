package AppPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[contains(text(),'Not Now')]")
    private static WebElement notNowCTA;

    public static WebElement notNowCTA(){
        return notNowCTA;
    }

    @FindBy(xpath = "//*[@class='logged-out-profile']")
    private static WebElement hamburgerMenu;

    public static WebElement hamburgerMenu(){
        return hamburgerMenu;
    }

    @FindBy(xpath = "(//*[contains(text(),'Log In')])[1]")
    private static WebElement loginCTA;

    public static WebElement loginCTA(){
        return loginCTA;
    }

    @FindBy(xpath = "//*[contains(text(),'Get OTP')]")
    private static WebElement getOTPCTA;

    public static WebElement getOTPCTA(){
        return getOTPCTA;
    }

    @FindBy(xpath = "//input")
    private static WebElement RMNInputField;

    public static WebElement RMNInputField(){
        return RMNInputField;
    }

    @FindBy(xpath = "(//*[@inputmode='decimal'])[1]")
    private static WebElement OTPInputField;

    public static WebElement OTPInputField(){
        return OTPInputField;
    }

    @FindBy(xpath = "//*[contains(text(),'Do it Later')]")
    private static WebElement doItLaterCTA;

    public static WebElement doItLaterCTA(){
        return doItLaterCTA;
    }

}
