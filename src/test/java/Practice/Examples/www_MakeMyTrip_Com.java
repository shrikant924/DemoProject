package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class www_MakeMyTrip_Com {

    public static void main(String[] args) throws Throwable {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@class='langCardClose']")).click();
        driver.findElement(By.xpath("//*[@id='fromCity']")).sendKeys("New Delhi");
        driver.findElement(By.xpath("//*[@id='fromCity']")).sendKeys(Keys.TAB);
        Thread.sleep(5000);
        WebElement toPlaceHolder = driver.findElement(By.xpath("//*[@placeholder='To']"));
        toPlaceHolder.click();
        toPlaceHolder.sendKeys("Pune");
        Thread.sleep(5000);
        toPlaceHolder.sendKeys(Keys.TAB);
        List<WebElement> list1=driver.findElements(By.xpath("//*[@class='DayPicker-Day']"));
        for(WebElement date : list1)
        {
            String departureDate = "Mon Nov 07 2022";
            if(date.getAttribute("aria-label").equalsIgnoreCase(departureDate)){

                date.click();
                break;
            }
        }

        driver.findElement(By.xpath("(//*[contains(text(),'RETURN')])[1]")).click();
        List<WebElement> list2=driver.findElements(By.xpath("//*[@class='DayPicker-Day']"));
        for(WebElement date : list2)
        {
            String returnDate = "Mon Nov 28 2022";
            if(date.getAttribute("aria-label").equalsIgnoreCase(returnDate)){

                date.click();
                break;
            }
        }
        driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
        WebElement textFlight = driver.findElement(By.xpath("//*[contains(text(),'Flights from ')]"));
        Assert.assertEquals(textFlight.getText(), "Flights from New Delhi to Bengaluru, and back");
        TakesScreenshot ts= (TakesScreenshot)driver;
        ts.getScreenshotAs(OutputType.FILE);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        String date = now.toString();
        String date1 = date.replace(':', '-');
        String date2 = date1.replace('.', '-');
        String path= "D:\\SSL\\"+date2+".png";
        System.out.println(path);
       FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(path));
        Thread.sleep(5000);
//        SoftAssert softAssert=new SoftAssert();
//        softAssert.assertAll();

        WebElement slider = driver.findElement(By.xpath("//*[@class='rangeslider__handle']"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider,48,0).perform();
        Thread.sleep(5000);
        actions.dragAndDropBy(slider,-30,0).perform();
        Thread.sleep(5000);
        driver.close();
    }
}
