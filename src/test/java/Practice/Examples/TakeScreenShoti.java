package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShoti {

    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        File strFile= new File("D:\\test.png");
        driver.get("https://www.guru99.com/take-screenshot-selenium-webdriver.html");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File pic = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(pic,strFile);

    }
}
