package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/webhp?authuser=1");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@aria-label='No thanks']")).click();
        WebElement googleSearchCTA = driver.findElement(By.xpath("//*[@value='Google Search']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(googleSearchCTA).perform();
    }
}
