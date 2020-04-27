package page_objects;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class page_objects
{
    WebDriver driver;
    clickPage click;
    login login;
    formPage form;

    @BeforeClass
    public void init()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://atidcollege.co.il/Xamples/webdriveradvance.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login = PageFactory.initElements(driver, login.class);
        form = PageFactory.initElements(driver, formPage.class);
        click = PageFactory.initElements(driver, clickPage.class);
    }

    @Test
    public void execute()
    {
        login.loginAction("selenium", "webdriver");
        form.formAction("Software Engineer", "50", "Tel Aviv");
        assertTrue(click.button.isDisplayed());
        //click.button.click();
    }
    @AfterClass
    public void closeBrowser()
    {
        driver.quit();
    }
}

