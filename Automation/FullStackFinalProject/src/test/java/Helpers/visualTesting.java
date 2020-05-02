package Helpers;

import Utilities.CommonOps;
import Utilities.helperMethods;
import WorkFlows.WebFlows;
import org.testng.annotations.Test;

public class visualTesting extends CommonOps
{
    @Test
    public void createScreenshot()
    {
        WebFlows.login("Admin", "admin123");
        helperMethods.takeElementScreenShot(orangeHRMMainPage.imageLogo, "siteLogo_ver1.0");
    }

}
