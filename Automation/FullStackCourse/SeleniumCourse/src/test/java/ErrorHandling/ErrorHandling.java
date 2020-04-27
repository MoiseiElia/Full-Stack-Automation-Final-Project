package ErrorHandling;

import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import io.github.bonigarcia.wdm.WebDriverManager;
//import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import jdk.nashorn.internal.ir.CatchNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.w3c.css.sac.ElementSelector;
import java.util.List;
//import static junit.framework.TestCase.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public class ErrorHandling
{
    WebDriver driver;

    @BeforeClass
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://atidcollege.co.il/Xamples/ex_synchronization.html");
    }
    /*@Test
    public void ErrorHandling()
    {
        try

        {

            driver.findElement(By.id("btn")).click();
            Thread.sleep(6000);
            //WebDriverWait wait = new WebDriverWait(driver, 5000);
            driver.findElement(By.id("checkbox")).click();
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish2")));
            // String output = driver.findElement(By.id("finish2")).getText();
            // assertEquals(output, "My Rendered Element After Fact!");
        }
        catch (Exception e)
        {
            System.out.println("Can not find checkbox element");
        }
    }*/
    @Test
            public void errorHandlingWOTry() throws InterruptedException
    {
        driver.findElement(By.id("btn")).click();
       Thread.sleep(5000);
       if(driver.findElements(By.id("checkbox")).size() > 0)
       {
           System.out.println("Check Box Exist");
       }
       else
       {
           System.out.println("Check Box does not exist");
       }
    }
    /*@Test
    public void test02_Sleep() throws InterruptedException
    {

        driver.findElement(By.id("btn")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("div[id='loading1'][style='display: none;']"));
    }*/

  /*  @Test
    public void test03_ImplicitWait()
    {
        // ---------- Button 1 Implicit Wait --------------
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("checkbox")).isDisplayed();
        driver.findElement(By.id("btn")).click();
        assertTrue(driver.findElement(By.id("message")).isDisplayed());
    }*/

    @AfterClass
    public void closeBrowser()
    {
       // driver.quit();
    }
}
