package PageObjects.orangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class mainPage
{
    @FindBy(how = How.XPATH, using = "//div[@class='head']/h1")
    public WebElement txt_dashboard;

    @FindBy(how = How.XPATH, using = "//img[@src='/webres_5e7b15c4882d04.47780062/themes/default/images/logo.png']")
    public WebElement imageLogo;
}

