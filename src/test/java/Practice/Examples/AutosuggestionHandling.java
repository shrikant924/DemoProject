package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutosuggestionHandling {

    public static void main(String[] args) throws Throwable {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        WebElement noThanksCTA = driver.findElement(By.xpath("//*[@class='QlyBfb']/button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
        wait.until(ExpectedConditions.elementToBeClickable(noThanksCTA));
        actions.moveToElement(noThanksCTA).click().build().perform();
        driver.switchTo().parentFrame();
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(3000);
        List<WebElement> auto = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
        for (WebElement element : auto) {
            if (element.getText().equalsIgnoreCase("Selenium python")) {
                element.click();
                break;
            }

        }
        driver.close();


    }
}
