package Practice.interfacee;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShot {

    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https:\\www.google.com");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File Scrshot = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Scrshot,new File("D:\\screenshot.png"));
    }
}
