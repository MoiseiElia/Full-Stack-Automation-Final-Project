package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class dbActions extends CommonOps
{
    @Step("Get the Credentials From DB")
    public static List<String> getCredentials(String query)
    {
        List<String> credentials = new ArrayList<String>();
        try
        {
            rs = stmt.executeQuery(query);
            rs.next();
            credentials.add(rs.getString(1));
            credentials.add(rs.getString(2));
         }
        catch (Exception e)
        {
            System.out.println("Error Occurred while Printing Table Data");
        }
        return credentials;
    }
}
