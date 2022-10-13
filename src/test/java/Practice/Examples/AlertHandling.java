package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");
        driver.findElement(By.id("alert1")).click();
        Alert alert = driver.switchTo().alert();
        //alert.accept();
        System.out.println(alert.getText());
        alert.dismiss();
        driver.close();


    }
}
