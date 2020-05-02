package Lesson_3_Locators;
import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Locators
{
    WebDriver driver;

    @BeforeClass
    public void init()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://atidcollege.co.il/Xamples/ex_locators.html");
    }
    @Test
    public void lesson3()
    {
        WebElement locatorByID = driver.findElement(By.id("locator_id"));
        WebElement locatorByName = driver.findElement(By.name("locator_name"));
        WebElement locatorByClassName = driver.findElement(By.className("locator_class"));
        WebElement locatorByTag = driver.findElement(By.tagName("p"));
        WebElement locatorByLinkText = driver.findElement(By.linkText("myLocator(5)"));
        WebElement locatorByPartialLinkText = driver.findElement(By.partialLinkText("Find my locator"));
        WebElement locatorByCssSelector = driver.findElement(By.cssSelector("input[myname='selenium']"));
        WebElement locatorByXPath = driver.findElement(By.xpath("//*[@id='contact_info_left']/button"));

        System.out.println(locatorByID.getText());
        System.out.println(locatorByName.getText());
        System.out.println(locatorByClassName.getText());
        System.out.println(locatorByTag.getText());
        System.out.println(locatorByLinkText.getText());
        System.out.println(locatorByPartialLinkText.getText());
        System.out.println(locatorByCssSelector.getAttribute("value"));
        System.out.println(locatorByXPath.getText());
    }
}
