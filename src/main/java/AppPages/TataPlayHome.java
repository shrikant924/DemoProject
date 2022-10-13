package AppPages;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

import static AppPages.TestBase.driver;

public class TataPlayHome {
    public HomePage homePage;
    public StagingTataPlayCom stagingTataPlayCom;

    public TataPlayHome(WebDriver driver) {
        homePage = new HomePage(driver);
        stagingTataPlayCom = new StagingTataPlayCom(driver);

    }

}

