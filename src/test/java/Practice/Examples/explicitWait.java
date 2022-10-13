package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.findElement(By.xpath("//*[text()='Dropdown']")).click();
        WebElement facebookCTA = driver.findElement(By.xpath("//*[text()='Facebook']"));
        WebDriverWait wait = new WebDriverWait(driver, 15);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Facebook']"))).click();
    wait.until(ExpectedConditions.visibilityOf(facebookCTA)).click();
    }
}
