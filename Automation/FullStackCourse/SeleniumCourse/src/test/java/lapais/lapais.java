package lapais;
import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
public class lapais
        {

        WebDriver driver;

@BeforeClass
public void init()
        {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pais.co.il/lotto/archive.aspx");
        }

@Test

public void lapais()
        {
            WebElement locatorByXPath = driver.findElement(By.xpath("//*[@id='contact_info_left']/button"));
            System.out.println("hi");
        }
        }