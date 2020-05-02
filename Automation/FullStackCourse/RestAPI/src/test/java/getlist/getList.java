package getlist;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.jsoup.helper.Validate.fail;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class getList
{
    Document doc;
public String url = "http://api.openweathermap.org/data/2.5/find";
public String city = "Jerusalem,IL";
public String key = "f038b2f47b38b12cff0d90ecbbfa69af";
public RequestSpecification httpRequest;
public Response response;
    public static String humidity;
    JsonPath jp;
    WebDriver driver;
    @BeforeClass
    public void Start() throws IOException
    {
        RestAssured.baseURI = url;
        httpRequest = RestAssured.given();
    }
@Test
    public void test_jerusalem_weather()
    {
        response = httpRequest.get("?units=metric&q=" + city + "&appid=" + key);
        System.out.println(response.getBody().asString());
    }
    @Test
    public void OpenWeatherMapAPI()
    {
        response = httpRequest.get("?units=metric&q=" + city + "&appid=" + key);
        jp = response.jsonPath();
        System.out.println(jp.get("list[0].sys.country").toString());
        assertEquals(jp.get("list[0].sys.country"), "IL");
        //Part C
        humidity = jp.getString("list[0].main.humidity");
    }
    @Test
    public void OpenWeatherWeb()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://openweathermap.org/");
        try
        {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.cssSelector("input[placeholder='Your city name']")).sendKeys("Jerusalem,IL");
            driver.findElement(By.xpath("//*[@id='searchform']/button")).click();
            driver.findElement(By.id("forecast-list")).findElement(By.linkText("Jerusalem, IL")).click();
            assertEquals(driver.findElement(By.xpath("//*[@id='weather-widget']/table/tbody/tr[4]/td[2]")).getText(), humidity + " %");
        }
        catch(Exception e)
        {
            System.out.println("Test failed: " + e);
            fail("Test failed: " + e);
        }
        finally
        {
            driver.quit();
        }
    }
}

