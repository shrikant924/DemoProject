package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingPopUpWindow {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.findElement(By.xpath("//*[text()='Open a popup window']")).click();

        String parentWindow = driver.getWindowHandle();
        Set<String> childWindows = driver.getWindowHandles();
        for (String chw:childWindows
             ) {
            if(!parentWindow.equalsIgnoreCase(chw)){
                driver.switchTo().window(chw);
            }
        }
        System.out.println(driver.findElement(By.id("para1")).getText());
        driver.close();
        driver.switchTo().window(parentWindow);
        driver.close();
    }
}
