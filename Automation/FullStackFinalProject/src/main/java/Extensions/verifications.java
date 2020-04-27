package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.util.ImageBytesDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class verifications extends CommonOps
{
    @Step("Verify Text in Element")
        public static void textInElement(WebElement elem, String expectedValue)
            {
                if(!Platform.equalsIgnoreCase("mobile") && !Platform.equalsIgnoreCase("electron") && !Platform.equalsIgnoreCase("desktop"))

                    wait.until(ExpectedConditions.visibilityOf(elem));
                if(Platform.equalsIgnoreCase("desktop"))
                assertEquals(elem.getText().replaceAll("Display is", "").trim(), expectedValue);
                else
                assertEquals(elem.getText(), expectedValue);
            }
    @Step("Verify the Number of Elements Equals to")
    public static void rowNumbers(List<WebElement> elems, int expectedValue)
    {
        if(Platform.equalsIgnoreCase("mobile"))

            wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));

        assertEquals(elems.size(),expectedValue);

    }
    @Step("Return the Number of Elements")
    public static int rows (List<WebElement> elems)
    {
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        return elems.size();
    }
    @Step("Verify that new Element Created")
    public static void isNewRowCreated(int rowsBefore)
    {
        assertEquals(rowsBefore+1, rows(orangeHRMSystemUsersPage.rows));
    }
    @Step("Verify Element Existence")
    public static void isUserExist(String userName)
{
    boolean isUserExist = false;
    for(int i = 0; i < rows(orangeHRMSystemUsersPage.usersTable); i++)
    {
        if (orangeHRMSystemUsersPage.usersTable.get(i).getText().equals(userName))
        {
            // System.out.println(orangeHRMSystemUsersPage.usersTable.get(i).getText() + " New User Row No.: " + i);
            isUserExist = true;
        }
    }
    assertTrue(isUserExist,"***** Attention ! User: " + userName + " Not Found *****");
}
    @Step("Verify Element Deleted")
    public static void isUserDeleted(String userName)
    {
        boolean isUserExist = false;
        for(int i = 0; i < rows(orangeHRMSystemUsersPage.usersTable); i++)
        {
            if (orangeHRMSystemUsersPage.usersTable.get(i).getText().equals(userName))
            {
                System.out.println(orangeHRMSystemUsersPage.usersTable.get(i).getText() + " New User Row No.: " + i);
                isUserExist = true;
            }
        }
        assertFalse(isUserExist,"***** User Not Deleted *****");
    }

    @Step("Delete Element")
    public static void deleteRow(String userName)
    {
        boolean rowDeleted = false;
        for(int i = 0; i < rows(orangeHRMSystemUsersPage.usersTable); i++)
        {
            int j = i;
            if (orangeHRMSystemUsersPage.usersTable.get(i).getText().equals(userName))
            {
                if(i == 0)
                {
                    j = 1;
                }
                    orangeHRMSystemUsersPage.chkBoxList.get(j - 1).click();
                    orangeHRMSystemUsersPage.btnDelete.click();
                    orangeHRMSystemUsersPage.btnDeleteOk.click();
                    rowDeleted = true;
            }
        }
        assertTrue(rowDeleted, "Delete User Failed");
    }

    @Step("Verify Element Visually")
    public static void visualElement(WebElement imageElement, String expectedImageName)
    {
        BufferedImage expectedImage = null;
        try
        {
            expectedImage = ImageIO.read(new File(getData("ImageRepo") + expectedImageName + ".png"));
        }
        catch(Exception e)
        {
            System.out.println("Error Reading image file" + e);
        }
        Screenshot imageScreenShot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, imageElement);
        BufferedImage actualImage = imageScreenShot.getImage();
        diff = imgDiff.makeDiff(actualImage, expectedImage);
        assertFalse(diff.hasDiff(), "Images not the same");
    }

    @Step("Verify Text with Text")
    public static void text(String actualText, String expectedText)
    {
        assertEquals(actualText,expectedText);
    }
}
