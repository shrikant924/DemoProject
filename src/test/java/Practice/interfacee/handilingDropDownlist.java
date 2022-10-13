package Practice.interfacee;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handilingDropDownlist {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        //Handling dropdown which having select class
        WebElement dropDownList = driver.findElement(By.id("drop1"));
        Select select=new Select(dropDownList);
        select.selectByIndex(2);
        Thread.sleep(4000);
        select.selectByValue("mno");
        Thread.sleep(4000);
        select.selectByVisibleText("doc 1");
        boolean ismultiselectable = select.isMultiple();
        System.out.println(ismultiselectable);

        //Handling multi selection box
        WebElement multiSelectionBox = driver.findElement(By.id("multiselect1"));
        Select select1=new Select(multiSelectionBox);
        select1.selectByIndex(2);
        Thread.sleep(4000);
        select1.selectByVisibleText("Volvo");
        Thread.sleep(4000);
        select1.selectByValue("volvox");
        Thread.sleep(4000);
        select1.deselectAll();

    }
}
