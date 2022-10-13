package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExcutor1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //driver.navigate().to("http://omayo.blogspot.com/");
        driver.get("http://omayo.blogspot.com/");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800)");
        driver.findElement(By.id("alert2")).click();
    }

}
