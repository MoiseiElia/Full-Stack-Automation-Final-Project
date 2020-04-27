package SanityTests;

import Extensions.verifications;
import Utilities.CommonOps;
import WorkFlows.calcFlow;
import WorkFlows.electronFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class calculatorDesktop extends CommonOps
{
    @Test(description = "Test01: Verify Addition Command")
    @Description("Test Description: Verify Addition Command in Calculator")
    public void test01_addition()
    {
        calcFlow.calculateAddition();
        verifications.textInElement(calcMain.field_result, "8");
    }
}
