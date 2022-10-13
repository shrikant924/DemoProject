package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandles {

    public static void main(String[] args) throws Throwable {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.findElement(By.id("selenium143")).click();
        driver.findElement(By.xpath("//*[text()=\"compendiumdev\"]")).click();
        HandleWindow handleWindow=new HandleWindow();
        handleWindow.switchToChildWindow("selenium143",driver);
        handleWindow.switchToMainWindow(driver);
        handleWindow.switchToChildWindow("basic_web_page",driver);
        handleWindow.switchToMainWindow(driver);
        driver.close();
    }
}
