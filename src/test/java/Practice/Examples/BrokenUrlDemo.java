package Practice.Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenUrlDemo {

    public static void main(String[] args) {

        HttpURLConnection huc=null;
        int responseCode=200;
        String homepage ="https://www.makemytrip.com/";
        String url;

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(homepage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> urllist= driver.findElements(By.xpath("//a"));
        for(WebElement url1:urllist){

           // System.out.println(url1.getAttribute("href"));
            if(url1.getAttribute("href")!=null){
              //  System.out.println(url1.getText());

                try{
                    String url2=url1.getAttribute("href");
                    huc = (HttpURLConnection)(new URL(url2)).openConnection() ;
                    huc.setRequestMethod("HEAD");
                    huc.connect();
                    int respCode = huc.getResponseCode();
                    if (respCode==200){
                        System.out.println("url is working: "+url2+" Response Code: "+respCode);
                    }else {
                        System.out.println("url Broken :"+url2+" Response Code: "+respCode);
                    }

                }
                catch(Exception e){}
            }
        }

        driver.close();



    }
}
