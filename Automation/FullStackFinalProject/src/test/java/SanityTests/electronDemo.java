package SanityTests;

import Extensions.uiActions;
import Extensions.verifications;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import WorkFlows.electronFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)

public class electronDemo extends CommonOps
{
    @Test(description = "Test01: Verify Screen Resolution")
    @Description("Test Description: Getting Resolution from App and Verify it")
    public void test02_addAndVerifyNewRowCreated()
    {

        electronFlow.getScreenInfo();
        verifications.textInElement(electronMain.field_screen_info, "Your screen is: 1920px x 1080px");

    }
}
