package PageObjects.orangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPageMenu
{
    @FindBy(how = How.XPATH, using = "//a[@class='firstLevelMenu']")
    public WebElement btn_MainMenu;
}
