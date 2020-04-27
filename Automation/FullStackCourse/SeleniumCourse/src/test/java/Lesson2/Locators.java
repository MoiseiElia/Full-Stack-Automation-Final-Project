package Lesson2;

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
    WebDriver driver; @Test
    @BeforeClass
    public void init()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumhq.org");
    }

    public void lesson2()
    {
        System.out.println(driver.findElement(By.id("menu_about")));
        System.out.println(driver.findElement(By.linkText("About")));
        System.out.println(driver.findElement(By.partialLinkText("About")));
        System.out.println(driver.findElement(By.tagName("li")));
        System.out.println(driver.findElements(By.tagName("a")).get(7));

        List<WebElement> links = driver.findElements(By.tagName("a"));
        List<WebElement> Seleniumlinks = driver.findElements(By.partialLinkText("Selenium"));
        List<WebElement> seleniumlinks = driver.findElements(By.partialLinkText("selenium"));
        System.out.println("Number of total links in page: " + links.size());
        System.out.println("Number of links in page with word: Selenium is: " + Seleniumlinks.size());
        System.out.println("Number of links in page with word: selenium is: " + seleniumlinks.size());
    }
}
