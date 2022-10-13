package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

public class BrokenurlDemo2 {

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
       List<WebElement> links= driver.findElements(By.xpath("//a"));
       for(WebElement link:links)
       {
           if(link!=null)
           {
             String  link1=link.getAttribute("href").toString();
               HttpURLConnection conn= (HttpURLConnection)(new URL(link1).openConnection());
               conn.connect();
               int respCode =conn.getResponseCode();
           System.out.println(link.getAttribute("href")+ " Response Code:" +respCode);
           }
       }
        driver.quit();
    }


}
