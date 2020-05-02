package Reports;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import static junit.framework.TestCase.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
public class Reports
{
    WebDriver driver;
    @BeforeClass
    public void init()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
    }
    @Test(description = "Report01 Google")
    @Description("Test Description: Google")
    public void report()
    {
        verifyTitle();
    }
    @Step("Verify Title")
    public void verifyTitle()
    {
        assertEquals(driver.getTitle(), "Google");
    }
    @AfterClass
    public void closeBrowser()
    {
         driver.quit();
    }

}
