package WorkFlows;

import Extensions.uiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class calcFlow extends CommonOps
{
    @Step("Get Screen Info (Calculate Addition")
    public static void calculateAddition()
    {
        uiActions.click(calcMain.btn_clear);
        uiActions.click(calcMain.btn_one);
        uiActions.click(calcMain.btn_plus);
        uiActions.click(calcMain.btn_seven);
        uiActions.click(calcMain.btn_equals);


    }
}
