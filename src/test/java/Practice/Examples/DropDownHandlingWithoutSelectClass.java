package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownHandlingWithoutSelectClass {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cowin.gov.in/");
        driver.findElement(By.xpath("//div[@id='mat-select-value-5']")).click();
        List<WebElement> listItems = driver.findElements(By.xpath("//mat-option/span"));
        for (WebElement i:listItems)
        {
            System.out.println(i.getText());
        }
        driver.close();
    }
}
