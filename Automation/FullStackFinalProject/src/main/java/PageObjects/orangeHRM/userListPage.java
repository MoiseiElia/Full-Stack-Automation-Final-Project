package PageObjects.orangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class userListPage
{
    @FindBy(how = How.XPATH, using = "//input[@class='formInputText inputFormatHint ac_input']")
    public WebElement txt_employeeName;

    @FindBy(how = How.XPATH, using = "//input[@class='formInputText']")
    public WebElement txt_userName;

    @FindBy(how = How.XPATH, using = "//input[@id='systemUser_password']")
    public WebElement txt_password;

    @FindBy(how = How.XPATH, using = "//input[@id='systemUser_confirmPassword']")
    public WebElement txt_confirmPassword;

    @FindBy(how = How.XPATH, using = "//input[@class='addbutton']")
    public WebElement btn_saveUser;
}
