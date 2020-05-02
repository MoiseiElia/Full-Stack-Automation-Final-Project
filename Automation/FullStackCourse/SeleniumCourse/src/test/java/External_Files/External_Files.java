package External_Files;
import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import io.github.bonigarcia.wdm.WebDriverManager;
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
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
public class External_Files
{
    WebDriver driver;

    @BeforeClass
    public void init()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getData("url"));
    }
    @Test
    public void assertsAndVerifications()
    {
        driver.findElement(By.id("weight")).sendKeys(getData("weight"));
        driver.findElement(By.id("hight")).sendKeys(getData("height"));
        WebElement click =driver.findElement(By.id(getData("calc")));
        click.click();
        String Expected = "25";
        String result = driver.findElement(By.id("bmi_result")).getAttribute("value");
        assertEquals(result,Expected);
    }
   /* @Test
    public void calculate_bmi()
    {
        int width = driver.findElement(By.id("calculate_data")).getSize().getWidth();
        int height = driver.findElement(By.id("calculate_data")).getSize().getHeight();
        int XCoordinate = driver.findElement(By.id("calculate_data")).getLocation().x;
        int YCoordinate = driver.findElement(By.id("calculate_data")).getLocation().y;

        System.out.println("Button Width: " + width);
        System.out.println("Button Hieght: " + height);
        System.out.println("Button X Coordinate: " + XCoordinate);
        System.out.println("Button Y Coordinate: " + YCoordinate);

        assertEquals(width,133);
        assertEquals(height,35);
        assertEquals(XCoordinate,685);
        assertEquals(YCoordinate,265);

        assertTrue(driver.findElement(By.id("calculate_data")).isDisplayed());
        assertTrue(driver.findElement(By.id("calculate_data")).isEnabled());
        assertFalse(driver.findElement(By.id("calculate_data")).isSelected());

        assertEquals(driver.findElement(By.id("calculate_data")).getTagName(),"input");
        assertEquals(driver.findElement(By.id("calculate_data")).getAttribute("value"),"Calculate BMI");

        assertFalse(driver.findElement(By.id("new_input")).isDisplayed());
    }*/
    public String getData (String nodeName)

    {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./DataConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        }
        catch(Exception e) {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }
    @AfterClass
    public void closeBrowser()
    {
       // driver.quit();
    }
}
