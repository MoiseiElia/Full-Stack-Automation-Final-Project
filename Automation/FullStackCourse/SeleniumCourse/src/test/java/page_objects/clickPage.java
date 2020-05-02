package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class clickPage
{
    @FindBy(how = How.CSS, using = "button[type='button']")
    public WebElement button;
}
