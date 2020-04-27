package Synchronization;
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
//import org.w3c.css.sac.ElementSelector;

import java.util.List;

//import static junit.framework.TestCase.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertFalse;


public class Synchronization
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
    public void synchronization()
    {

    }
}
