package WorkFlows;

import Extensions.dbActions;
import Extensions.uiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;
//import net.sourceforge.htmlunit.corejs.javascript.tools.shell.QuitAction;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class WebFlows extends CommonOps
{
    @Step("Login orangeHRM Flow")
    public static void login (String user, String pass)
    {
        uiActions.updateText(orangeHRMLogin.txt_userName, user);
        uiActions.updateText(orangeHRMLogin.txt_password, pass);
        uiActions.click(orangeHRMLogin.btn_login);
    }

    @Step("Login orangeHRM Flow with DB Credentials")
    public static void loginDB ()
    {
       List<String> cred=  dbActions.getCredentials("SELECT user_name, password from Credentials WHERE id = 2");
        uiActions.updateText(orangeHRMLogin.txt_userName, cred.get(0));
        uiActions.updateText(orangeHRMLogin.txt_password, cred.get(1));
        uiActions.click(orangeHRMLogin.btn_login);
    }
    @Step("Create a New User")
    public static void createUser(String name, String userName, String password, String confirmPassword)
    {
        uiActions.click(orangeHRMSystemUsersPage.btn_newUser);
        uiActions.updateText(orangeHRMUserListPage.txt_employeeName, name);
        uiActions.updateText(orangeHRMUserListPage.txt_userName, userName);
        uiActions.updateText(orangeHRMUserListPage.txt_password, password);
        uiActions.updateText(orangeHRMUserListPage.txt_confirmPassword, confirmPassword);
        uiActions.click(orangeHRMUserListPage.btn_saveUser);

    }


}
