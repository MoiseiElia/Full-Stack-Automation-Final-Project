package Lesson_06;
import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.List;

//import static junit.framework.TestCase.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertFalse;


public class Switch_and_Navigate
{
    WebDriver driver;

    @BeforeClass
    public void init()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://atidcollege.co.il/Xamples/ex_switch_navigation.html#");
    }

     @Test
    public void switch_and_navigation()
    {
        driver.findElement(By.id("btnAlert")).click();
        Alert popup = driver.switchTo().alert();
        popup.accept();
        driver.findElement(By.id("btnPrompt")).click();
        Alert popup1 = driver.switchTo().alert();
        popup1.sendKeys("Moisei");
        popup1.accept();
        driver.findElement(By.id("btnConfirm")).click();
        Alert popup2 = driver.switchTo().alert();

        driver.findElement(By.id("output")).click();
       // driver.findElement(By.id("btnNewTab")).click();
       // driver.findElement(By.xpath("//*[@LinkText'Open New Window'")).click();
//WebElement locatorByXPath = driver.findElement(By.xpath("//*[@id='contact_info_left']/button"));

    }
}
