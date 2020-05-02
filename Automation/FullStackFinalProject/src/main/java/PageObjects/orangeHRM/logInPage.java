package PageObjects.orangeHRM;

import org.omg.PortableInterceptor.HOLDING;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class logInPage
{
    @FindBy(how = How.NAME, using = "txtUsername")
    public WebElement txt_userName;

    @FindBy(how = How.NAME, using = "txtPassword")
    public WebElement txt_password;

    @FindBy(how = How.NAME, using = "Submit")
    public WebElement btn_login;

}
