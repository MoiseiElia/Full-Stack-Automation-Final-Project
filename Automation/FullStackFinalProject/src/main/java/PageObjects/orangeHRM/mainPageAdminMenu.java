package PageObjects.orangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPageAdminMenu
{
    @FindBy(how = How.XPATH, using = "//a[@id='menu_admin_UserManagement']")
    public WebElement link_userManagement;

    @FindBy(how = How.XPATH, using = "//a[@id='menu_admin_Job']")
    public WebElement link_userJob;

    @FindBy(how = How.XPATH, using = "//a[@id='menu_admin_Organization']")
    public WebElement link_Organization;

    @FindBy(how = How.XPATH, using = "//a[@id='menu_admin_Qualifications']")
    public WebElement link_Qualifications;

    @FindBy(how = How.XPATH, using = "//a[@id='menu_admin_nationality']")
    public WebElement link_Nationality;

    @FindBy(how = How.XPATH, using = "//a[@id='menu_admin_Configuration']")
    public WebElement link_Configuration;
}
