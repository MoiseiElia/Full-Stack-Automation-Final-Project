package Utilities;

import PageObjects.orangeHRM.mainPage;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class base
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenShot;
    public static ImageDiffer imgDiff = new ImageDiffer();
    public static ImageDiff diff;
    public static DesiredCapabilities dc = new DesiredCapabilities();


    public static PageObjects.orangeHRM.logInPage orangeHRMLogin;
    public static PageObjects.orangeHRM.mainPage orangeHRMMainPage;
    public static PageObjects.orangeHRM.mainPageMenu orangeHRMMainMenu;
    public static PageObjects.orangeHRM.mainPageAdminMenu orangeHRMMainPageAdminMenu;
    public static PageObjects.orangeHRM.userManagementMenu orangeHRMUserManagementMenu;
    public static PageObjects.orangeHRM.systemUsersPage orangeHRMSystemUsersPage;
    public static PageObjects.orangeHRM.userListPage orangeHRMUserListPage;
    public static String Platform;
    public static PageObjects.Mortgage.mainPage mortgageMain;
    public static PageObjects.ElectronDemo.mainPage electronMain;
    public static PageObjects.Calculator.mainPage calcMain;
    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject requestParams = new JSONObject();
    public static JsonPath jp;

    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;
}