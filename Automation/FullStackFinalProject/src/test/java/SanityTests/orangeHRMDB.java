package SanityTests;

import Extensions.verifications;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class orangeHRMDB extends CommonOps
{
    @Test(description = "Test01: Login to orangeHRM with DB")
    @Description("Test Description: Login to orangeHRM Demo web site with DB")
    public void test01_loginDB()
    {
        WebFlows.loginDB();
        verifications.textInElement(orangeHRMMainPage.txt_dashboard,"Dashboard");
    }
}
