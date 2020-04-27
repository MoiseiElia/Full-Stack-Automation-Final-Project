package Lesson01;

import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class WebManager
{
    WebDriver driver;
    @BeforeClass (alwaysRun = true)
    public void init()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://imdb.com");
    }
    @Test (groups = {"T1"})
        public void webMng()
        {
            String exRes = "Ratings and Reviews for New Movies and TV Shows - IMDb";
            String urlCom = "Google";
            driver.navigate().refresh();
            String title = driver.getTitle();
            String utl = driver.getCurrentUrl();
            System.out.println("Title: " + title);
            if(exRes.contentEquals(title))
            {
                System.out.println("Equal");
            }
            else
            {
                System.out.println("Not Equal");
            }
            if (utl.contentEquals(urlCom))
            {
                System.out.println("url equal");
            }

            else
            {
                System.out.println("url not equal");
            }

        }




}
