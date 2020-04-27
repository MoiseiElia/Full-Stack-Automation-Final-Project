package Utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends base
{
    public static void init()
    {
        orangeHRMLogin = PageFactory.initElements(driver,PageObjects.orangeHRM.logInPage.class);
        orangeHRMMainPage = PageFactory.initElements(driver,PageObjects.orangeHRM.mainPage.class);
        orangeHRMMainMenu = PageFactory.initElements(driver,PageObjects.orangeHRM.mainPageMenu.class);
        orangeHRMMainPageAdminMenu = PageFactory.initElements(driver,PageObjects.orangeHRM.mainPageAdminMenu.class);
        orangeHRMUserManagementMenu = PageFactory.initElements(driver,PageObjects.orangeHRM.userManagementMenu.class);
        orangeHRMSystemUsersPage = PageFactory.initElements(driver,PageObjects.orangeHRM.systemUsersPage.class);
        orangeHRMUserListPage = PageFactory.initElements(driver,PageObjects.orangeHRM.userListPage.class);

        mortgageMain = PageFactory.initElements(driver,PageObjects.Mortgage.mainPage.class);
        electronMain = PageFactory.initElements(driver,PageObjects.ElectronDemo.mainPage.class);
        calcMain = PageFactory.initElements(driver,PageObjects.Calculator.mainPage.class);
    }

}
