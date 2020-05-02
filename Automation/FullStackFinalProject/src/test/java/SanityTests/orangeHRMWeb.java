package SanityTests;

import Extensions.uiActions;
import Extensions.verifications;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Extensions.verifications;

@Listeners(Utilities.listeners.class)

public class orangeHRMWeb extends CommonOps
{
    @Test(description = "Test01: Login to orangeHRM")
    @Description("Test Description: Login to orangeHRM Demo web site")
    public void test01_login()
    {
        WebFlows.login(getData("LoginUser"), getData("LoginPassword"));
        verifications.textInElement(orangeHRMMainPage.txt_dashboard,"Dashboard");
    }

    @Test(description = "Test02: Add and Verify Row Created")
    @Description("Test Description: Add new User and verify that new row created")
    public void test02_addAndVerifyNewRowCreated()
    {
        uiActions.mouseHoverElements(orangeHRMMainMenu.btn_MainMenu,orangeHRMMainPageAdminMenu.link_userManagement,orangeHRMUserManagementMenu.link_userManagementMenu);
        int rowsBefore = verifications.rows(orangeHRMSystemUsersPage.rows);
        WebFlows.createUser(getData("UserName"), getData("User"), getData("Password"), getData("ConfirmPassword"));
        verifications.isNewRowCreated(rowsBefore);

    }
    @Test(description = "Test03: Verify New User Created")
    @Description("Test Description: Verify New User Name existence in the table")
    public void test03_verifyNewUserCreated()
    {

        uiActions.mouseHoverElements(orangeHRMMainMenu.btn_MainMenu,orangeHRMMainPageAdminMenu.link_userManagement,orangeHRMUserManagementMenu.link_userManagementMenu);
        verifications.isUserExist(getData("User"));
    }
   @Test(description = "Test04: Delete User")
   @Description("Test Description: Delete User by User")
    public void test04_deleteUser()
    {
        uiActions.mouseHoverElements(orangeHRMMainMenu.btn_MainMenu,orangeHRMMainPageAdminMenu.link_userManagement,orangeHRMUserManagementMenu.link_userManagementMenu);
        verifications.deleteRow(getData("User"));


    }
    @Test(description = "Test05: Verify that User Deleted")
    @Description("Test Description: Verify that User Name does not Exist in the Table ")
    public void test05_verifyDeleteUser()
    {
        uiActions.mouseHoverElements(orangeHRMMainMenu.btn_MainMenu,orangeHRMMainPageAdminMenu.link_userManagement,orangeHRMUserManagementMenu.link_userManagementMenu);
        verifications.isUserDeleted(getData("User"));
    }


    @Test(description = "Test06: Verify Site Logo")
    @Description("Test Description: Verify orangeHRM site Logo ")
    public void test06_verifySiteLogo()
    {

        verifications.visualElement(orangeHRMMainPage.imageLogo, "siteLogo");
    }
}
