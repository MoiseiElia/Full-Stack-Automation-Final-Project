package PageObjects.orangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class userManagementMenu
{
    @FindBy(how = How.XPATH, using = "//a[@id='menu_admin_viewSystemUsers']")
    public WebElement link_userManagementMenu;
}
