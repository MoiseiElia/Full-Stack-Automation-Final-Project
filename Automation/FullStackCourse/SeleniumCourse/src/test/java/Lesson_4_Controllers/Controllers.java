package Lesson_4_Controllers;
import com.google.errorprone.annotations.Var;
import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.ir.CallNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.List;
public class Controllers
{

    WebDriver driver;

    @BeforeClass
    public void init()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://atidcollege.co.il/Xamples/ex_controllers.html");
    }

    @Test

    public void Control()
    {
        WebElement first = driver.findElement(By.name("firstname"));
        WebElement last = driver.findElement(By.name("lastname"));
        first.sendKeys("Moisei");
        last.sendKeys("Elia");
        Select Continent = new Select(driver.findElement(By.id("continents")));
        Continent.selectByVisibleText("Antartica");
        driver.findElement(By.id("submit")).click();
        WebElement sex = driver.findElement(By.id("sex-1"));
        sex.click();
        WebElement exp = driver.findElement(By.id("exp-6"));
        exp.click();
       // String exp = driver.findElement(By.id("exp-6")).getAttribute("value");

        if(sex.isSelected())
        {
            System.out.println("Selected");
        }
        if(driver.getCurrentUrl().contains("Moisei") & driver.getCurrentUrl().contains("Elia"))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }

       WebElement prof = driver.findElement(By.id("profession-1"));
        prof.click();
        driver.findElement(By.id("photo")).sendKeys("C:/photo.jpg");
        WebElement tool = driver.findElement(By.id("tool-2"));
        tool.click();
        Select commands = new Select(driver.findElement(By.id("selenium_commands")));
        commands.selectByIndex(4);
driver.findElement(By.id("datepicker")).click();
WebElement date = driver.findElement(By.id("ui-datepicker-div"));
List <WebElement> cells = date.findElements(By.tagName("td"));
for (WebElement cell : cells)
{
    if(cell.getText().equals("25"))
    {
        cell.click();
        break;
    }
}
    }
}
