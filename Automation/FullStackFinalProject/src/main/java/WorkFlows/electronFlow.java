package WorkFlows;

import Extensions.uiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class electronFlow extends CommonOps
{
    @Step("Get Screen Info (Resolution)")
            public static void getScreenInfo()
    {
        uiActions.click(electronMain.btn_windows);
        uiActions.click(electronMain.btn_info);
        uiActions.click(electronMain.btn_demo_tuggle);
        uiActions.click(electronMain.btn_demo_tuggle);
        uiActions.click(electronMain.btn_screen_info);
    }
}

