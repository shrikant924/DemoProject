package Practice.Examples;

import org.openqa.selenium.WebDriver;
import java.util.Set;

public class HandleWindow {
    String parentWindow;
    public void switchToChildWindow(String windowTitle , WebDriver driver) {

        parentWindow = driver.getWindowHandle();
        Set<String> windowslist = driver.getWindowHandles();
        System.out.println(windowslist);
        for (String cntWindow:windowslist
             ) {
            if(driver.switchTo().window(cntWindow).getTitle().equalsIgnoreCase(windowTitle)) {
                break;
            }
            else {
                driver.switchTo().window(parentWindow);
            }
        }
        System.out.println( driver.getTitle());
    }

    public void switchToMainWindow(WebDriver driver){
        driver.close();
        driver.switchTo().window(parentWindow);
    }
}

