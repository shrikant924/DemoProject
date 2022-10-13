package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class FluentWait1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        FluentWait wait;
        wait = new FluentWait(driver);
        wait.withTimeout(15, TimeUnit.SECONDS);
        wait.pollingEvery(2, TimeUnit.SECONDS);
        wait.ignoring(NoSuchElementException.class);

    }
}
