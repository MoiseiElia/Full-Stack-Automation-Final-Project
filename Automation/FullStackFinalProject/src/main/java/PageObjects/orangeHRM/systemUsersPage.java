package PageObjects.orangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.List;

public class systemUsersPage
{
    @FindAll({
            @FindBy(how = How.CLASS_NAME, using = "odd"),
            @FindBy(how = How.CLASS_NAME, using = "even")
             })
    public List<WebElement> rows;

    @FindBy(how = How.ID, using = "btnAdd")
    public WebElement btn_newUser;

    @FindBy(how = How.XPATH, using = "//td[@class = 'left']/a")
    public List<WebElement> usersTable;

    @FindBy(how = How.XPATH, using = "//input[@name = 'chkSelectRow[]']")
    public List<WebElement> chkBoxList;

    @FindBy(how = How.XPATH, using = "//input[@id = 'btnDelete']")
    public WebElement btnDelete;

    @FindBy(how = How.XPATH, using = "//input[@id = 'dialogDeleteBtn']")
    public WebElement btnDeleteOk;
}
