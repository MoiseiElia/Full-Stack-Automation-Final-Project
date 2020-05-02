package MidYearTest;
import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.w3c.css.sac.ElementSelector;
import java.util.List;
//import static junit.framework.TestCase.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
public class MidYearTest
{
    WebDriver driver;

    @BeforeClass
    public void init()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://atidcollege.co.il/Xamples/pizza");
    }
    @Test
    public void order()
    {
        String basePrise = "7.5";
        String withDeliveryPrice = "10.5";
        assertEquals(driver.findElement(By.id("input_5_2")).getAttribute("value"),basePrise);
        driver.findElement(By.id("input_5_22_3")).sendKeys("Moisei");
        driver.findElement(By.id("input_5_22_6")).sendKeys("Elia");
        Select delivery = new Select(driver.findElement(By.id("input_5_21")));
        delivery.selectByVisibleText("Delivery +$3.00");
        assertEquals(driver.findElement(By.id("input_5_2")).getAttribute("value"),withDeliveryPrice);
        WebElement iFrameElement = driver.findElement(By.cssSelector("iframe[src='coupon.html']"));
        driver.switchTo().frame(iFrameElement);
        String coupon = (driver.findElement(By.id("coupon_Number")).getText());
        driver.switchTo().defaultContent();
        driver.findElement(By.id("input_5_20")).sendKeys(coupon);
        driver.findElement(By.id("gform_submit_button_5")).click();
        Alert alert = driver.switchTo().alert();
        assertEquals(alert.getText(),"Moisei Elia 088-234");
        alert.accept();

    }
    @AfterClass
    public void closeBrowser()
    {
        driver.quit();
    }
}
