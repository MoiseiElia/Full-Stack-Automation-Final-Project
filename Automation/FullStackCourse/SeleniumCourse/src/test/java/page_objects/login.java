package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class login
{
    @FindBy(how = How.NAME, using = "username2")
    public WebElement userName;

    @FindBy(how = How.NAME, using = "password2")
    public WebElement Password;

    @FindBy(how = How.ID, using = "submit")
    public WebElement submit ;

    public void loginAction(String sUserName, String sPassword)
    {
        userName.sendKeys(sUserName);
        Password.sendKeys(sPassword);
        submit.click();
    }
}
